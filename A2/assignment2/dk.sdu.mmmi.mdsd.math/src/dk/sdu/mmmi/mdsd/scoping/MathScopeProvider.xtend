/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import dk.sdu.mmmi.mdsd.math.MathPackage
import dk.sdu.mmmi.mdsd.math.VariableUse
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.EcoreUtil2

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MathScopeProvider extends AbstractMathScopeProvider {
	
    override getScope(EObject context, EReference ref) {
    	if (context instanceof VariableUse && ref == MathPackage.Literals.VARIABLE_USE__REF) {
    		val root = EcoreUtil2.getRootContainer(context)
    		val elements = EcoreUtil2.getAllContentsOfType(root, VariableUse)
    		return Scopes.scopeFor(elements)
    	}
    	
    	return super.getScope(context, ref)
    }

}
