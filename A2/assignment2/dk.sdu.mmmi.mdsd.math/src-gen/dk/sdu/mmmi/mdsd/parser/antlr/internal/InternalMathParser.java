package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : ( (lv_exps_0_0= ruleExp ) )* ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_exps_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_exps_0_0= ruleExp ) )* )
            // InternalMath.g:78:2: ( (lv_exps_0_0= ruleExp ) )*
            {
            // InternalMath.g:78:2: ( (lv_exps_0_0= ruleExp ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:79:3: (lv_exps_0_0= ruleExp )
            	    {
            	    // InternalMath.g:79:3: (lv_exps_0_0= ruleExp )
            	    // InternalMath.g:80:4: lv_exps_0_0= ruleExp
            	    {

            	    				newCompositeNode(grammarAccess.getMathExpAccess().getExpsExpParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_exps_0_0=ruleExp();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    				}
            	    				add(
            	    					current,
            	    					"exps",
            	    					lv_exps_0_0,
            	    					"dk.sdu.mmmi.mdsd.Math.Exp");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:100:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:100:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:101:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:107:1: ruleExp returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSumDiff ) ) ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSumDiff ) ) ) )
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSumDiff ) ) )
            {
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSumDiff ) ) )
            // InternalMath.g:115:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleSumDiff ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpAccess().getVarKeyword_0());
            		
            // InternalMath.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExpAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:141:3: ( (lv_exp_3_0= ruleSumDiff ) )
            // InternalMath.g:142:4: (lv_exp_3_0= ruleSumDiff )
            {
            // InternalMath.g:142:4: (lv_exp_3_0= ruleSumDiff )
            // InternalMath.g:143:5: lv_exp_3_0= ruleSumDiff
            {

            					newCompositeNode(grammarAccess.getExpAccess().getExpSumDiffParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleSumDiff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.SumDiff");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleSumDiff"
    // InternalMath.g:164:1: entryRuleSumDiff returns [EObject current=null] : iv_ruleSumDiff= ruleSumDiff EOF ;
    public final EObject entryRuleSumDiff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumDiff = null;


        try {
            // InternalMath.g:164:48: (iv_ruleSumDiff= ruleSumDiff EOF )
            // InternalMath.g:165:2: iv_ruleSumDiff= ruleSumDiff EOF
            {
             newCompositeNode(grammarAccess.getSumDiffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumDiff=ruleSumDiff();

            state._fsp--;

             current =iv_ruleSumDiff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumDiff"


    // $ANTLR start "ruleSumDiff"
    // InternalMath.g:171:1: ruleSumDiff returns [EObject current=null] : (this_ProdQuot_0= ruleProdQuot ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleProdQuot ) ) )* ) ;
    public final EObject ruleSumDiff() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ProdQuot_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:177:2: ( (this_ProdQuot_0= ruleProdQuot ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleProdQuot ) ) )* ) )
            // InternalMath.g:178:2: (this_ProdQuot_0= ruleProdQuot ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleProdQuot ) ) )* )
            {
            // InternalMath.g:178:2: (this_ProdQuot_0= ruleProdQuot ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleProdQuot ) ) )* )
            // InternalMath.g:179:3: this_ProdQuot_0= ruleProdQuot ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleProdQuot ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumDiffAccess().getProdQuotParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_ProdQuot_0=ruleProdQuot();

            state._fsp--;


            			current = this_ProdQuot_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:187:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleProdQuot ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:188:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleProdQuot ) )
            	    {
            	    // InternalMath.g:188:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==14) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMath.g:189:5: (otherlv_1= '+' () )
            	            {
            	            // InternalMath.g:189:5: (otherlv_1= '+' () )
            	            // InternalMath.g:190:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumDiffAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:194:6: ()
            	            // InternalMath.g:195:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumDiffAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:203:5: (otherlv_3= '-' () )
            	            {
            	            // InternalMath.g:203:5: (otherlv_3= '-' () )
            	            // InternalMath.g:204:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumDiffAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:208:6: ()
            	            // InternalMath.g:209:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumDiffAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:217:4: ( (lv_right_5_0= ruleProdQuot ) )
            	    // InternalMath.g:218:5: (lv_right_5_0= ruleProdQuot )
            	    {
            	    // InternalMath.g:218:5: (lv_right_5_0= ruleProdQuot )
            	    // InternalMath.g:219:6: lv_right_5_0= ruleProdQuot
            	    {

            	    						newCompositeNode(grammarAccess.getSumDiffAccess().getRightProdQuotParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleProdQuot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumDiffRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.ProdQuot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumDiff"


    // $ANTLR start "entryRuleProdQuot"
    // InternalMath.g:241:1: entryRuleProdQuot returns [EObject current=null] : iv_ruleProdQuot= ruleProdQuot EOF ;
    public final EObject entryRuleProdQuot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProdQuot = null;


        try {
            // InternalMath.g:241:49: (iv_ruleProdQuot= ruleProdQuot EOF )
            // InternalMath.g:242:2: iv_ruleProdQuot= ruleProdQuot EOF
            {
             newCompositeNode(grammarAccess.getProdQuotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProdQuot=ruleProdQuot();

            state._fsp--;

             current =iv_ruleProdQuot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProdQuot"


    // $ANTLR start "ruleProdQuot"
    // InternalMath.g:248:1: ruleProdQuot returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleProdQuot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:254:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:255:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:255:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:256:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getProdQuotAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:264:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:265:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:265:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==15) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==16) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMath.g:266:5: (otherlv_1= '*' () )
            	            {
            	            // InternalMath.g:266:5: (otherlv_1= '*' () )
            	            // InternalMath.g:267:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            	            						newLeafNode(otherlv_1, grammarAccess.getProdQuotAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:271:6: ()
            	            // InternalMath.g:272:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getProdQuotAccess().getMulLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:280:5: (otherlv_3= '/' () )
            	            {
            	            // InternalMath.g:280:5: (otherlv_3= '/' () )
            	            // InternalMath.g:281:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            	            						newLeafNode(otherlv_3, grammarAccess.getProdQuotAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:285:6: ()
            	            // InternalMath.g:286:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getProdQuotAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:294:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:295:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:295:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:296:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getProdQuotAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProdQuotRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProdQuot"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:318:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:318:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:319:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:325:1: rulePrimary returns [EObject current=null] : (this_Constant_0= ruleConstant | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_VariableBinding_3= ruleVariableBinding ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_VariableBinding_3 = null;



        	enterRule();

        try {
            // InternalMath.g:331:2: ( (this_Constant_0= ruleConstant | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_VariableBinding_3= ruleVariableBinding ) )
            // InternalMath.g:332:2: (this_Constant_0= ruleConstant | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_VariableBinding_3= ruleVariableBinding )
            {
            // InternalMath.g:332:2: (this_Constant_0= ruleConstant | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_VariableBinding_3= ruleVariableBinding )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMath.g:333:3: this_Constant_0= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_0=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:342:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:351:3: this_VariableUse_2= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_2=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:360:3: this_VariableBinding_3= ruleVariableBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableBinding_3=ruleVariableBinding();

                    state._fsp--;


                    			current = this_VariableBinding_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:372:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:372:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:373:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:379:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_exp_2_0= ruleSumDiff ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:385:2: ( ( () otherlv_1= '(' ( (lv_exp_2_0= ruleSumDiff ) ) otherlv_3= ')' ) )
            // InternalMath.g:386:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleSumDiff ) ) otherlv_3= ')' )
            {
            // InternalMath.g:386:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleSumDiff ) ) otherlv_3= ')' )
            // InternalMath.g:387:3: () otherlv_1= '(' ( (lv_exp_2_0= ruleSumDiff ) ) otherlv_3= ')'
            {
            // InternalMath.g:387:3: ()
            // InternalMath.g:388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:398:3: ( (lv_exp_2_0= ruleSumDiff ) )
            // InternalMath.g:399:4: (lv_exp_2_0= ruleSumDiff )
            {
            // InternalMath.g:399:4: (lv_exp_2_0= ruleSumDiff )
            // InternalMath.g:400:5: lv_exp_2_0= ruleSumDiff
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpSumDiffParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp_2_0=ruleSumDiff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.Math.SumDiff");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleConstant"
    // InternalMath.g:425:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalMath.g:425:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalMath.g:426:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMath.g:432:1: ruleConstant returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:438:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMath.g:439:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:439:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMath.g:440:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMath.g:440:3: ()
            // InternalMath.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            // InternalMath.g:447:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMath.g:448:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMath.g:448:4: (lv_value_1_0= RULE_INT )
            // InternalMath.g:449:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:469:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:469:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:470:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:476:1: ruleVariableUse returns [EObject current=null] : ( () ( (lv_ref_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token lv_ref_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:482:2: ( ( () ( (lv_ref_1_0= RULE_ID ) ) ) )
            // InternalMath.g:483:2: ( () ( (lv_ref_1_0= RULE_ID ) ) )
            {
            // InternalMath.g:483:2: ( () ( (lv_ref_1_0= RULE_ID ) ) )
            // InternalMath.g:484:3: () ( (lv_ref_1_0= RULE_ID ) )
            {
            // InternalMath.g:484:3: ()
            // InternalMath.g:485:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVariableUseAction_0(),
            					current);
            			

            }

            // InternalMath.g:491:3: ( (lv_ref_1_0= RULE_ID ) )
            // InternalMath.g:492:4: (lv_ref_1_0= RULE_ID )
            {
            // InternalMath.g:492:4: (lv_ref_1_0= RULE_ID )
            // InternalMath.g:493:5: lv_ref_1_0= RULE_ID
            {
            lv_ref_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_ref_1_0, grammarAccess.getVariableUseAccess().getRefIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalMath.g:513:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalMath.g:513:56: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalMath.g:514:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalMath.g:520:1: ruleVariableBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleSumDiff ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleSumDiff ) ) otherlv_7= 'end' ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_binding_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:526:2: ( ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleSumDiff ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleSumDiff ) ) otherlv_7= 'end' ) )
            // InternalMath.g:527:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleSumDiff ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleSumDiff ) ) otherlv_7= 'end' )
            {
            // InternalMath.g:527:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleSumDiff ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleSumDiff ) ) otherlv_7= 'end' )
            // InternalMath.g:528:3: () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleSumDiff ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleSumDiff ) ) otherlv_7= 'end'
            {
            // InternalMath.g:528:3: ()
            // InternalMath.g:529:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingAccess().getVariableBindingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
            		
            // InternalMath.g:539:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalMath.g:540:4: (lv_id_2_0= RULE_ID )
            {
            // InternalMath.g:540:4: (lv_id_2_0= RULE_ID )
            // InternalMath.g:541:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_2_0, grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalMath.g:561:3: ( (lv_binding_4_0= ruleSumDiff ) )
            // InternalMath.g:562:4: (lv_binding_4_0= ruleSumDiff )
            {
            // InternalMath.g:562:4: (lv_binding_4_0= ruleSumDiff )
            // InternalMath.g:563:5: lv_binding_4_0= ruleSumDiff
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBindingSumDiffParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_binding_4_0=ruleSumDiff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_4_0,
            						"dk.sdu.mmmi.mdsd.Math.SumDiff");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_5());
            		
            // InternalMath.g:584:3: ( (lv_body_6_0= ruleSumDiff ) )
            // InternalMath.g:585:4: (lv_body_6_0= ruleSumDiff )
            {
            // InternalMath.g:585:4: (lv_body_6_0= ruleSumDiff )
            // InternalMath.g:586:5: lv_body_6_0= ruleSumDiff
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBodySumDiffParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_body_6_0=ruleSumDiff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"dk.sdu.mmmi.mdsd.Math.SumDiff");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableBindingAccess().getEndKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableBinding"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}