/*
 * generated by Xtext 2.33.0
 */
grammar InternalSetLang;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.ex.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.sdu.mmmi.mdsd.ex.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.ex.services.SetLangGrammarAccess;

}

@parser::members {

 	private SetLangGrammarAccess grammarAccess;

    public InternalSetLangParser(TokenStream input, SetLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected SetLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='program'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getExternalDefsExternalDefParserRuleCall_2_0());
				}
				lv_externalDefs_2_0=ruleExternalDef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"externalDefs",
						lv_externalDefs_2_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.ExternalDef");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getRecordsRecordParserRuleCall_3_0());
				}
				lv_records_3_0=ruleRecord
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"records",
						lv_records_3_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.Record");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getComputesComputeParserRuleCall_4_0());
				}
				lv_computes_4_0=ruleCompute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"computes",
						lv_computes_4_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.Compute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleExternalDef
entryRuleExternalDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalDefRule()); }
	iv_ruleExternalDef=ruleExternalDef
	{ $current=$iv_ruleExternalDef.current; }
	EOF;

// Rule ExternalDef
ruleExternalDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='external'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalDefAccess().getExternalKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalDefRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getExternalDefAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalDefAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalDefRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getExternalDefAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleRecord
entryRuleRecord returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecordRule()); }
	iv_ruleRecord=ruleRecord
	{ $current=$iv_ruleRecord.current; }
	EOF;

// Rule Record
ruleRecord returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='record'
		{
			newLeafNode(otherlv_0, grammarAccess.getRecordAccess().getRecordKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRecordRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getRecordAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRecordRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getRecordAccess().getParentRecordCrossReference_2_1_0());
					}
				)
			)
		)?
		(
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getRecordAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRecordAccess().getParametersParameterParserRuleCall_3_1_0());
					}
					lv_parameters_5_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecordRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_5_0,
							"dk.sdu.mmmi.mdsd.ex.SetLang.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getRecordAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRecordAccess().getParametersParameterParserRuleCall_3_2_1_0());
						}
						lv_parameters_7_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRecordRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_7_0,
								"dk.sdu.mmmi.mdsd.ex.SetLang.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getRecordAccess().getRightParenthesisKeyword_3_3());
			}
		)?
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getRecordAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecordAccess().getMembersMemberParserRuleCall_5_0());
				}
				lv_members_10_0=ruleMember
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecordRule());
					}
					add(
						$current,
						"members",
						lv_members_10_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.Member");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getRecordAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Int'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
		}
		    |
		kw='Tuple'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getTupleKeyword_1());
		}
		    |
		(
			kw='Set'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getSetKeyword_2_0());
			}
			kw='('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_1());
			}
			{
				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_2());
			}
			this_Type_4=ruleType
			{
				$current.merge(this_Type_4);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_3());
			}
		)
	)
;

// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	iv_ruleMember=ruleMember
	{ $current=$iv_ruleMember.current; }
	EOF;

// Rule Member
ruleMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMemberRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMemberAccess().getExpUnionIntersectionParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleUnionIntersection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMemberRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCompute
entryRuleCompute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComputeRule()); }
	iv_ruleCompute=ruleCompute
	{ $current=$iv_ruleCompute.current; }
	EOF;

// Rule Compute
ruleCompute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='compute'
		{
			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getComputeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComputeAccess().getExpUnionIntersectionParserRuleCall_1_0());
				}
				lv_exp_1_0=ruleUnionIntersection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComputeRule());
					}
					set(
						$current,
						"exp",
						lv_exp_1_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUnionIntersection
entryRuleUnionIntersection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnionIntersectionRule()); }
	iv_ruleUnionIntersection=ruleUnionIntersection
	{ $current=$iv_ruleUnionIntersection.current; }
	EOF;

// Rule UnionIntersection
ruleUnionIntersection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getUnionIntersectionAccess().getProductParserRuleCall_0());
		}
		this_Product_0=ruleProduct
		{
			$current = $this_Product_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getUnionIntersectionAccess().getUnionLeftAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='U'
					{
						newLeafNode(otherlv_2, grammarAccess.getUnionIntersectionAccess().getUKeyword_1_0_0_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getUnionIntersectionAccess().getIntersectionLeftAction_1_0_1_0(),
								$current);
						}
					)
					otherlv_4='&'
					{
						newLeafNode(otherlv_4, grammarAccess.getUnionIntersectionAccess().getAmpersandKeyword_1_0_1_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getUnionIntersectionAccess().getRightProductParserRuleCall_1_1_0());
					}
					lv_right_5_0=ruleProduct
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnionIntersectionRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"dk.sdu.mmmi.mdsd.ex.SetLang.Product");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleProduct
entryRuleProduct returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductRule()); }
	iv_ruleProduct=ruleProduct
	{ $current=$iv_ruleProduct.current; }
	EOF;

// Rule Product
ruleProduct returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getProductAccess().getProjectionFilterParserRuleCall_0());
		}
		this_ProjectionFilter_0=ruleProjectionFilter
		{
			$current = $this_ProjectionFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getProductAccess().getProductLeftAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='*'
				{
					newLeafNode(otherlv_2, grammarAccess.getProductAccess().getAsteriskKeyword_1_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getProductAccess().getRightProjectionFilterParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleProjectionFilter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProductRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.mmmi.mdsd.ex.SetLang.ProjectionFilter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleProjectionFilter
entryRuleProjectionFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProjectionFilterRule()); }
	iv_ruleProjectionFilter=ruleProjectionFilter
	{ $current=$iv_ruleProjectionFilter.current; }
	EOF;

// Rule ProjectionFilter
ruleProjectionFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getProjectionFilterAccess().getPrimitiveParserRuleCall_0());
		}
		this_Primitive_0=rulePrimitive
		{
			$current = $this_Primitive_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_1='#'
			{
				newLeafNode(otherlv_1, grammarAccess.getProjectionFilterAccess().getNumberSignKeyword_1_0());
			}
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getProjectionFilterAccess().getProjectionOpAction_1_1_0_0(),
								$current);
						}
					)
					otherlv_3='<'
					{
						newLeafNode(otherlv_3, grammarAccess.getProjectionFilterAccess().getLessThanSignKeyword_1_1_0_1());
					}
					(
						(
							lv_indices_4_0=RULE_INT
							{
								newLeafNode(lv_indices_4_0, grammarAccess.getProjectionFilterAccess().getIndicesINTTerminalRuleCall_1_1_0_2_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getProjectionFilterRule());
								}
								addWithLastConsumed(
									$current,
									"indices",
									lv_indices_4_0,
									"org.eclipse.xtext.common.Terminals.INT");
							}
						)
					)
					(
						otherlv_5=','
						{
							newLeafNode(otherlv_5, grammarAccess.getProjectionFilterAccess().getCommaKeyword_1_1_0_3_0());
						}
						(
							(
								lv_indices_6_0=RULE_INT
								{
									newLeafNode(lv_indices_6_0, grammarAccess.getProjectionFilterAccess().getIndicesINTTerminalRuleCall_1_1_0_3_1_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getProjectionFilterRule());
									}
									addWithLastConsumed(
										$current,
										"indices",
										lv_indices_6_0,
										"org.eclipse.xtext.common.Terminals.INT");
								}
							)
						)
					)*
					otherlv_7='>'
					{
						newLeafNode(otherlv_7, grammarAccess.getProjectionFilterAccess().getGreaterThanSignKeyword_1_1_0_4());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getProjectionFilterAccess().getFilterOpAction_1_1_1_0(),
								$current);
						}
					)
					otherlv_9='['
					{
						newLeafNode(otherlv_9, grammarAccess.getProjectionFilterAccess().getLeftSquareBracketKeyword_1_1_1_1());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getProjectionFilterRule());
								}
							}
							otherlv_10=RULE_ID
							{
								newLeafNode(otherlv_10, grammarAccess.getProjectionFilterAccess().getExternalExternalDefCrossReference_1_1_1_2_0());
							}
						)
					)
					otherlv_11=']'
					{
						newLeafNode(otherlv_11, grammarAccess.getProjectionFilterAccess().getRightSquareBracketKeyword_1_1_1_3());
					}
				)
			)
		)?
	)
;

// Entry rule entryRulePrimitive
entryRulePrimitive returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveRule()); }
	iv_rulePrimitive=rulePrimitive
	{ $current=$iv_rulePrimitive.current; }
	EOF;

// Rule Primitive
rulePrimitive returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getIntValueParserRuleCall_0());
		}
		this_IntValue_0=ruleIntValue
		{
			$current = $this_IntValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getSetParserRuleCall_1());
		}
		this_Set_1=ruleSet
		{
			$current = $this_Set_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getTupleParserRuleCall_2());
		}
		this_Tuple_2=ruleTuple
		{
			$current = $this_Tuple_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getRecordAccessParserRuleCall_3());
		}
		this_RecordAccess_3=ruleRecordAccess
		{
			$current = $this_RecordAccess_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getRefParserRuleCall_4());
		}
		this_Ref_4=ruleRef
		{
			$current = $this_Ref_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getParenthesisParserRuleCall_5());
		}
		this_Parenthesis_5=ruleParenthesis
		{
			$current = $this_Parenthesis_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRef
entryRuleRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefRule()); }
	iv_ruleRef=ruleRef
	{ $current=$iv_ruleRef.current; }
	EOF;

// Rule Ref
ruleRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRefRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefBindingCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleIntValue
entryRuleIntValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntValueRule()); }
	iv_ruleIntValue=ruleIntValue
	{ $current=$iv_ruleIntValue.current; }
	EOF;

// Rule IntValue
ruleIntValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIntValueAccess().getIntValueAction_0(),
					$current);
			}
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIntValueRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleSet
entryRuleSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSetRule()); }
	iv_ruleSet=ruleSet
	{ $current=$iv_ruleSet.current; }
	EOF;

// Rule Set
ruleSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSetAccess().getSetAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSetAccess().getValuesUnionIntersectionParserRuleCall_2_0_0());
					}
					lv_values_2_0=ruleUnionIntersection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSetRule());
						}
						add(
							$current,
							"values",
							lv_values_2_0,
							"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getSetAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSetAccess().getValuesUnionIntersectionParserRuleCall_2_1_1_0());
						}
						lv_values_4_0=ruleUnionIntersection
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSetRule());
							}
							add(
								$current,
								"values",
								lv_values_4_0,
								"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleTuple
entryRuleTuple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTupleRule()); }
	iv_ruleTuple=ruleTuple
	{ $current=$iv_ruleTuple.current; }
	EOF;

// Rule Tuple
ruleTuple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTupleAccess().getTupleAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTupleAccess().getValuesUnionIntersectionParserRuleCall_2_0());
				}
				lv_values_2_0=ruleUnionIntersection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTupleRule());
					}
					add(
						$current,
						"values",
						lv_values_2_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTupleAccess().getValuesUnionIntersectionParserRuleCall_3_1_0());
					}
					lv_values_4_0=ruleUnionIntersection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTupleRule());
						}
						add(
							$current,
							"values",
							lv_values_4_0,
							"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)*
		otherlv_5=']'
		{
			newLeafNode(otherlv_5, grammarAccess.getTupleAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleParenthesis
entryRuleParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesisRule()); }
	iv_ruleParenthesis=ruleParenthesis
	{ $current=$iv_ruleParenthesis.current; }
	EOF;

// Rule Parenthesis
ruleParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParenthesisAccess().getExpUnionIntersectionParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleUnionIntersection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParenthesisRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleRecordAccess
entryRuleRecordAccess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecordAccessRule()); }
	iv_ruleRecordAccess=ruleRecordAccess
	{ $current=$iv_ruleRecordAccess.current; }
	EOF;

// Rule RecordAccess
ruleRecordAccess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRecordAccessAccess().getRecordAccessAction_0(),
					$current);
			}
		)
		otherlv_1='!'
		{
			newLeafNode(otherlv_1, grammarAccess.getRecordAccessAccess().getExclamationMarkKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRecordAccessRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getRecordAccessAccess().getRecordRecordCrossReference_2_0());
				}
			)
		)
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getRecordAccessAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRecordAccessAccess().getParametersUnionIntersectionParserRuleCall_3_1_0());
					}
					lv_parameters_4_0=ruleUnionIntersection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecordAccessRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_4_0,
							"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getRecordAccessAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRecordAccessAccess().getParametersUnionIntersectionParserRuleCall_3_2_1_0());
						}
						lv_parameters_6_0=ruleUnionIntersection
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRecordAccessRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_6_0,
								"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_7=')'
			{
				newLeafNode(otherlv_7, grammarAccess.getRecordAccessAccess().getRightParenthesisKeyword_3_3());
			}
		)?
		otherlv_8='->'
		{
			newLeafNode(otherlv_8, grammarAccess.getRecordAccessAccess().getHyphenMinusGreaterThanSignKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRecordAccessRule());
					}
				}
				otherlv_9=RULE_ID
				{
					newLeafNode(otherlv_9, grammarAccess.getRecordAccessAccess().getMemberMemberCrossReference_5_0());
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
