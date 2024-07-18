/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ex.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.ex.services.SetLangGrammarAccess;
import dk.sdu.mmmi.mdsd.ex.setLang.Compute;
import dk.sdu.mmmi.mdsd.ex.setLang.ExternalDef;
import dk.sdu.mmmi.mdsd.ex.setLang.Filter;
import dk.sdu.mmmi.mdsd.ex.setLang.IntValue;
import dk.sdu.mmmi.mdsd.ex.setLang.Intersection;
import dk.sdu.mmmi.mdsd.ex.setLang.Member;
import dk.sdu.mmmi.mdsd.ex.setLang.Parenthesis;
import dk.sdu.mmmi.mdsd.ex.setLang.Product;
import dk.sdu.mmmi.mdsd.ex.setLang.Program;
import dk.sdu.mmmi.mdsd.ex.setLang.Projection;
import dk.sdu.mmmi.mdsd.ex.setLang.Record;
import dk.sdu.mmmi.mdsd.ex.setLang.RecordAccess;
import dk.sdu.mmmi.mdsd.ex.setLang.Ref;
import dk.sdu.mmmi.mdsd.ex.setLang.SetLangPackage;
import dk.sdu.mmmi.mdsd.ex.setLang.Tuple;
import dk.sdu.mmmi.mdsd.ex.setLang.Union;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SetLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SetLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SetLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SetLangPackage.COMPUTE:
				sequence_Compute(context, (Compute) semanticObject); 
				return; 
			case SetLangPackage.EXTERNAL_DEF:
				sequence_ExternalDef(context, (ExternalDef) semanticObject); 
				return; 
			case SetLangPackage.FILTER:
				sequence_ProjectionFilter(context, (Filter) semanticObject); 
				return; 
			case SetLangPackage.INT_VALUE:
				sequence_IntValue(context, (IntValue) semanticObject); 
				return; 
			case SetLangPackage.INTERSECTION:
				sequence_UnionIntersection(context, (Intersection) semanticObject); 
				return; 
			case SetLangPackage.MEMBER:
				sequence_Member(context, (Member) semanticObject); 
				return; 
			case SetLangPackage.PARAMETER:
				sequence_Parameter(context, (dk.sdu.mmmi.mdsd.ex.setLang.Parameter) semanticObject); 
				return; 
			case SetLangPackage.PARENTHESIS:
				sequence_Parenthesis(context, (Parenthesis) semanticObject); 
				return; 
			case SetLangPackage.PRODUCT:
				sequence_Product(context, (Product) semanticObject); 
				return; 
			case SetLangPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case SetLangPackage.PROJECTION:
				sequence_ProjectionFilter(context, (Projection) semanticObject); 
				return; 
			case SetLangPackage.RECORD:
				sequence_Record(context, (Record) semanticObject); 
				return; 
			case SetLangPackage.RECORD_ACCESS:
				sequence_RecordAccess(context, (RecordAccess) semanticObject); 
				return; 
			case SetLangPackage.REF:
				sequence_Ref(context, (Ref) semanticObject); 
				return; 
			case SetLangPackage.SET:
				sequence_Set(context, (dk.sdu.mmmi.mdsd.ex.setLang.Set) semanticObject); 
				return; 
			case SetLangPackage.TUPLE:
				sequence_Tuple(context, (Tuple) semanticObject); 
				return; 
			case SetLangPackage.UNION:
				sequence_UnionIntersection(context, (Union) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Compute returns Compute
	 *
	 * Constraint:
	 *     exp=UnionIntersection
	 * </pre>
	 */
	protected void sequence_Compute(ISerializationContext context, Compute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.COMPUTE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.COMPUTE__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComputeAccess().getExpUnionIntersectionParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ExternalDef returns ExternalDef
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 * </pre>
	 */
	protected void sequence_ExternalDef(ISerializationContext context, ExternalDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.EXTERNAL_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.EXTERNAL_DEF__NAME));
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.EXTERNAL_DEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.EXTERNAL_DEF__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExternalDefAccess().getTypeTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns IntValue
	 *     UnionIntersection.Union_1_0_0_0 returns IntValue
	 *     UnionIntersection.Intersection_1_0_1_0 returns IntValue
	 *     Product returns IntValue
	 *     Product.Product_1_0_0 returns IntValue
	 *     ProjectionFilter returns IntValue
	 *     ProjectionFilter.Projection_1_1_0_0 returns IntValue
	 *     ProjectionFilter.Filter_1_1_1_0 returns IntValue
	 *     Primitive returns IntValue
	 *     IntValue returns IntValue
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_IntValue(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.INT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Member returns Member
	 *     Binding returns Member
	 *
	 * Constraint:
	 *     (name=ID exp=UnionIntersection)
	 * </pre>
	 */
	protected void sequence_Member(ISerializationContext context, Member semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.MEMBER__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.MEMBER__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMemberAccess().getExpUnionIntersectionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameter returns Parameter
	 *     Binding returns Parameter
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 * </pre>
	 */
	protected void sequence_Parameter(ISerializationContext context, dk.sdu.mmmi.mdsd.ex.setLang.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Parenthesis
	 *     UnionIntersection.Union_1_0_0_0 returns Parenthesis
	 *     UnionIntersection.Intersection_1_0_1_0 returns Parenthesis
	 *     Product returns Parenthesis
	 *     Product.Product_1_0_0 returns Parenthesis
	 *     ProjectionFilter returns Parenthesis
	 *     ProjectionFilter.Projection_1_1_0_0 returns Parenthesis
	 *     ProjectionFilter.Filter_1_1_1_0 returns Parenthesis
	 *     Primitive returns Parenthesis
	 *     Parenthesis returns Parenthesis
	 *
	 * Constraint:
	 *     exp=UnionIntersection
	 * </pre>
	 */
	protected void sequence_Parenthesis(ISerializationContext context, Parenthesis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.PARENTHESIS__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.PARENTHESIS__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParenthesisAccess().getExpUnionIntersectionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Product
	 *     UnionIntersection.Union_1_0_0_0 returns Product
	 *     UnionIntersection.Intersection_1_0_1_0 returns Product
	 *     Product returns Product
	 *     Product.Product_1_0_0 returns Product
	 *
	 * Constraint:
	 *     (left=Product_Product_1_0_0 right=ProjectionFilter)
	 * </pre>
	 */
	protected void sequence_Product(ISerializationContext context, Product semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.PRODUCT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.PRODUCT__LEFT));
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.PRODUCT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.PRODUCT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductAccess().getProductLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getProductAccess().getRightProjectionFilterParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (name=ID externalDefs+=ExternalDef* records+=Record* computes+=Compute*)
	 * </pre>
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Filter
	 *     UnionIntersection.Union_1_0_0_0 returns Filter
	 *     UnionIntersection.Intersection_1_0_1_0 returns Filter
	 *     Product returns Filter
	 *     Product.Product_1_0_0 returns Filter
	 *     ProjectionFilter returns Filter
	 *
	 * Constraint:
	 *     (op=ProjectionFilter_Filter_1_1_1_0 external=[ExternalDef|ID])
	 * </pre>
	 */
	protected void sequence_ProjectionFilter(ISerializationContext context, Filter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.FILTER__EXTERNAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.FILTER__EXTERNAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProjectionFilterAccess().getFilterOpAction_1_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getProjectionFilterAccess().getExternalExternalDefIDTerminalRuleCall_1_1_1_2_0_1(), semanticObject.eGet(SetLangPackage.Literals.FILTER__EXTERNAL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Projection
	 *     UnionIntersection.Union_1_0_0_0 returns Projection
	 *     UnionIntersection.Intersection_1_0_1_0 returns Projection
	 *     Product returns Projection
	 *     Product.Product_1_0_0 returns Projection
	 *     ProjectionFilter returns Projection
	 *
	 * Constraint:
	 *     (op=ProjectionFilter_Projection_1_1_0_0 indices+=INT indices+=INT*)
	 * </pre>
	 */
	protected void sequence_ProjectionFilter(ISerializationContext context, Projection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns RecordAccess
	 *     UnionIntersection.Union_1_0_0_0 returns RecordAccess
	 *     UnionIntersection.Intersection_1_0_1_0 returns RecordAccess
	 *     Product returns RecordAccess
	 *     Product.Product_1_0_0 returns RecordAccess
	 *     ProjectionFilter returns RecordAccess
	 *     ProjectionFilter.Projection_1_1_0_0 returns RecordAccess
	 *     ProjectionFilter.Filter_1_1_1_0 returns RecordAccess
	 *     Primitive returns RecordAccess
	 *     RecordAccess returns RecordAccess
	 *
	 * Constraint:
	 *     (record=[Record|ID] (parameters+=UnionIntersection parameters+=UnionIntersection*)? member=[Member|ID])
	 * </pre>
	 */
	protected void sequence_RecordAccess(ISerializationContext context, RecordAccess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Record returns Record
	 *
	 * Constraint:
	 *     (name=ID parent=[Record|ID]? (parameters+=Parameter parameters+=Parameter*)? members+=Member*)
	 * </pre>
	 */
	protected void sequence_Record(ISerializationContext context, Record semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Ref
	 *     UnionIntersection.Union_1_0_0_0 returns Ref
	 *     UnionIntersection.Intersection_1_0_1_0 returns Ref
	 *     Product returns Ref
	 *     Product.Product_1_0_0 returns Ref
	 *     ProjectionFilter returns Ref
	 *     ProjectionFilter.Projection_1_1_0_0 returns Ref
	 *     ProjectionFilter.Filter_1_1_1_0 returns Ref
	 *     Primitive returns Ref
	 *     Ref returns Ref
	 *
	 * Constraint:
	 *     ref=[Binding|ID]
	 * </pre>
	 */
	protected void sequence_Ref(ISerializationContext context, Ref semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.REF__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRefAccess().getRefBindingIDTerminalRuleCall_0_1(), semanticObject.eGet(SetLangPackage.Literals.REF__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Set
	 *     UnionIntersection.Union_1_0_0_0 returns Set
	 *     UnionIntersection.Intersection_1_0_1_0 returns Set
	 *     Product returns Set
	 *     Product.Product_1_0_0 returns Set
	 *     ProjectionFilter returns Set
	 *     ProjectionFilter.Projection_1_1_0_0 returns Set
	 *     ProjectionFilter.Filter_1_1_1_0 returns Set
	 *     Primitive returns Set
	 *     Set returns Set
	 *
	 * Constraint:
	 *     (values+=UnionIntersection values+=UnionIntersection*)?
	 * </pre>
	 */
	protected void sequence_Set(ISerializationContext context, dk.sdu.mmmi.mdsd.ex.setLang.Set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Tuple
	 *     UnionIntersection.Union_1_0_0_0 returns Tuple
	 *     UnionIntersection.Intersection_1_0_1_0 returns Tuple
	 *     Product returns Tuple
	 *     Product.Product_1_0_0 returns Tuple
	 *     ProjectionFilter returns Tuple
	 *     ProjectionFilter.Projection_1_1_0_0 returns Tuple
	 *     ProjectionFilter.Filter_1_1_1_0 returns Tuple
	 *     Primitive returns Tuple
	 *     Tuple returns Tuple
	 *
	 * Constraint:
	 *     (values+=UnionIntersection values+=UnionIntersection*)
	 * </pre>
	 */
	protected void sequence_Tuple(ISerializationContext context, Tuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Intersection
	 *     UnionIntersection.Union_1_0_0_0 returns Intersection
	 *     UnionIntersection.Intersection_1_0_1_0 returns Intersection
	 *
	 * Constraint:
	 *     (left=UnionIntersection_Intersection_1_0_1_0 right=Product)
	 * </pre>
	 */
	protected void sequence_UnionIntersection(ISerializationContext context, Intersection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.INTERSECTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.INTERSECTION__LEFT));
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.INTERSECTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.INTERSECTION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnionIntersectionAccess().getIntersectionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUnionIntersectionAccess().getRightProductParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UnionIntersection returns Union
	 *     UnionIntersection.Union_1_0_0_0 returns Union
	 *     UnionIntersection.Intersection_1_0_1_0 returns Union
	 *
	 * Constraint:
	 *     (left=UnionIntersection_Union_1_0_0_0 right=Product)
	 * </pre>
	 */
	protected void sequence_UnionIntersection(ISerializationContext context, Union semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.UNION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.UNION__LEFT));
			if (transientValues.isValueTransient(semanticObject, SetLangPackage.Literals.UNION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetLangPackage.Literals.UNION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnionIntersectionAccess().getUnionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUnionIntersectionAccess().getRightProductParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
}
