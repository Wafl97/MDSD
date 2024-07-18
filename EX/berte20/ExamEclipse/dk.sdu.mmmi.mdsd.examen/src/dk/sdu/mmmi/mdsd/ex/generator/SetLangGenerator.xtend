/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ex.generator

import java.util.List
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.common.util.EList
import dk.sdu.mmmi.mdsd.ex.setLang.Program
import dk.sdu.mmmi.mdsd.ex.setLang.IntValue
import dk.sdu.mmmi.mdsd.ex.setLang.Set
import dk.sdu.mmmi.mdsd.ex.setLang.Tuple
import dk.sdu.mmmi.mdsd.ex.setLang.Filter
import dk.sdu.mmmi.mdsd.ex.setLang.Projection
import dk.sdu.mmmi.mdsd.ex.setLang.Intersection
import dk.sdu.mmmi.mdsd.ex.setLang.Union
import dk.sdu.mmmi.mdsd.ex.setLang.Product
import dk.sdu.mmmi.mdsd.ex.setLang.RecordAccess
import dk.sdu.mmmi.mdsd.ex.setLang.Parenthesis
import dk.sdu.mmmi.mdsd.ex.setLang.Record
import dk.sdu.mmmi.mdsd.ex.setLang.Compute
import dk.sdu.mmmi.mdsd.ex.setLang.Parameter
import dk.sdu.mmmi.mdsd.ex.setLang.Ref
import dk.sdu.mmmi.mdsd.ex.setLang.ExternalDef

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SetLangGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val program = resource.allContents.filter(Program).next
		
		
		fsa.generateFile('setdsl/' + program.name + '.java', program.generateCode)
	}
	
	def CharSequence generateCode(Program program) '''
	/* generated by SetLang parser */
	
	package setdsl;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import utils.*;
	
	public class «program.name» extends AbstractRecordProgram {
		«IF program.externalDefs !== null && program.externalDefs.size > 0»
		«program.generateConstructor»
		«ENDIF»
		«program.computes.generateComputes»
		«program.records.generateRecords»
		«IF program.externalDefs !== null && program.externalDefs.size > 0»
		«program.externalDefs.generateExternalDefs»
		«ENDIF»
	}
	'''
	
	def CharSequence generateConstructor(Program program) '''
		
	private External external;
	
	public «program.name»(External external) {
		this.external = external;
	}
	'''
	
	def CharSequence generateExternalDefs(EList<ExternalDef> externalDefs) '''
	
	public interface External {
		«FOR e:externalDefs»
		public boolean «e.name»(«e.type.toJava» a);
		«ENDFOR»
	}
	'''
	
	def CharSequence generateComputes(EList<Compute> computes) '''
	
	public List compute() {
		List results = new ArrayList();
		«FOR compute:computes»
		results.add(«compute.exp.generateExp»);
		«ENDFOR»
		return results;
	}
	'''
	
	def CharSequence generateRecords(EList<Record> records) '''
	«FOR p:records»«p.generateRecord»«ENDFOR»'''
	
	def CharSequence generateRecord(Record record) '''
	
	public class «record.name»«IF record.parent !== null» extends «record.parent.name»«ENDIF» {
		«FOR p:record.parameters»
		private «p.type.toJava» «p.name»;
		«ENDFOR»
		«FOR m:record.members»
		public Set «m.name»;
		«ENDFOR»
		
		public «record.name»(«FOR p:record.getOwnAndLineageParameters SEPARATOR ', '»«p.type.toJava» «p.name»«ENDFOR») {
			«IF record.parent !== null»
			super(«FOR p:record.getLineageParameters SEPARATOR ', '»«p.name»«ENDFOR»);
			«ENDIF»
			«FOR p:record.parameters»
			this.«p.name» = «p.name»;
			«ENDFOR»
			«FOR m:record.members»
			this.«m.name» = «m.exp.generateExp»;
			«ENDFOR»
		}
	}
	'''
	
	def List<Parameter> getOwnAndLineageParameters(Record record) {
		val lineage = new ArrayList();
		lineage.addAll(record.getLineageParameters);
		lineage.addAll(record.parameters);
		lineage;
	}
		
	def List<Parameter> getLineageParameters(Record record) {
		val lineage = new ArrayList();
		if (record.parent !== null) {
			record.parent.getParentParameters(lineage);
		}
		lineage;
	}
	
	def void getParentParameters(Record record, List<Parameter> parameters) {
		if (record.parent !== null) {
			record.parent.getParentParameters(parameters)
		}
		parameters.addAll(record.parameters);
	}
	
	def CharSequence toJava(String type) {
		if (type == 'Int')
			return 'int'
		else if (type.startsWith('Set'))
			return 'Set'
		type
	}
			
	def dispatch CharSequence generateExp(IntValue value) '''
	«value.value»'''
	
	def dispatch CharSequence generateExp(Set set) '''
	Set.of(«FOR v:set.values SEPARATOR ', '»«v.generateExp»«ENDFOR»)'''
	
	def dispatch CharSequence generateExp(Tuple tuple) '''
	Tuple.of(«FOR v:tuple.values SEPARATOR ', '»«v.generateExp»«ENDFOR»)'''
	
	def dispatch CharSequence generateExp(Product product) '''
	set_product(«product.left.generateExp», «product.right.generateExp»)'''
	
	def dispatch CharSequence generateExp(RecordAccess recordAccess) '''
	new «recordAccess.record.name»(«FOR p:recordAccess.parameters SEPARATOR ',' »«p.generateExp»«ENDFOR»).«recordAccess.member.name»'''
	
	def dispatch CharSequence generateExp(Filter filter) '''
	set_filter(«filter.op.generateExp», external::«filter.external.name»)'''
	
	def dispatch CharSequence generateExp(Projection projection) '''
	set_projection(«projection.op.generateExp», «FOR i:projection.indices SEPARATOR ', '»«i»«ENDFOR»)'''
	
	def dispatch CharSequence generateExp(Intersection intersection) '''
	set_intersection(«intersection.left.generateExp», «intersection.right.generateExp»)'''
	
	def dispatch CharSequence generateExp(Union union) '''
	set_union(«union.left.generateExp», «union.right.generateExp»)'''
	
	def dispatch CharSequence generateExp(Parenthesis parenthesis) '''
	«parenthesis.exp.generateExp»'''
	
	def dispatch CharSequence generateExp(Ref ref)'''
	this.«ref.ref.name»'''
	
}
