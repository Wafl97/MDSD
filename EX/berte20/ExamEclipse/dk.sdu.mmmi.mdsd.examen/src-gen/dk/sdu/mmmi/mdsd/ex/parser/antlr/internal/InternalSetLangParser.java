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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSetLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'('", "')'", "'record'", "':'", "','", "'{'", "'}'", "'Int'", "'Tuple'", "'Set'", "'compute'", "'U'", "'&'", "'*'", "'#'", "'<'", "'>'", "'['", "']'", "'!'", "'->'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSetLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSetLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSetLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSetLang.g"; }



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




    // $ANTLR start "entryRuleProgram"
    // InternalSetLang.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalSetLang.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalSetLang.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSetLang.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDefs_2_0= ruleExternalDef ) )* ( (lv_records_3_0= ruleRecord ) )* ( (lv_computes_4_0= ruleCompute ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externalDefs_2_0 = null;

        EObject lv_records_3_0 = null;

        EObject lv_computes_4_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDefs_2_0= ruleExternalDef ) )* ( (lv_records_3_0= ruleRecord ) )* ( (lv_computes_4_0= ruleCompute ) )* ) )
            // InternalSetLang.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDefs_2_0= ruleExternalDef ) )* ( (lv_records_3_0= ruleRecord ) )* ( (lv_computes_4_0= ruleCompute ) )* )
            {
            // InternalSetLang.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDefs_2_0= ruleExternalDef ) )* ( (lv_records_3_0= ruleRecord ) )* ( (lv_computes_4_0= ruleCompute ) )* )
            // InternalSetLang.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalDefs_2_0= ruleExternalDef ) )* ( (lv_records_3_0= ruleRecord ) )* ( (lv_computes_4_0= ruleCompute ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalSetLang.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSetLang.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSetLang.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSetLang.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSetLang.g:101:3: ( (lv_externalDefs_2_0= ruleExternalDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSetLang.g:102:4: (lv_externalDefs_2_0= ruleExternalDef )
            	    {
            	    // InternalSetLang.g:102:4: (lv_externalDefs_2_0= ruleExternalDef )
            	    // InternalSetLang.g:103:5: lv_externalDefs_2_0= ruleExternalDef
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExternalDefsExternalDefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externalDefs_2_0=ruleExternalDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externalDefs",
            	    						lv_externalDefs_2_0,
            	    						"dk.sdu.mmmi.mdsd.ex.SetLang.ExternalDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSetLang.g:120:3: ( (lv_records_3_0= ruleRecord ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSetLang.g:121:4: (lv_records_3_0= ruleRecord )
            	    {
            	    // InternalSetLang.g:121:4: (lv_records_3_0= ruleRecord )
            	    // InternalSetLang.g:122:5: lv_records_3_0= ruleRecord
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getRecordsRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_records_3_0=ruleRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"dk.sdu.mmmi.mdsd.ex.SetLang.Record");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSetLang.g:139:3: ( (lv_computes_4_0= ruleCompute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSetLang.g:140:4: (lv_computes_4_0= ruleCompute )
            	    {
            	    // InternalSetLang.g:140:4: (lv_computes_4_0= ruleCompute )
            	    // InternalSetLang.g:141:5: lv_computes_4_0= ruleCompute
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getComputesComputeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_computes_4_0=ruleCompute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"computes",
            	    						lv_computes_4_0,
            	    						"dk.sdu.mmmi.mdsd.ex.SetLang.Compute");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExternalDef"
    // InternalSetLang.g:162:1: entryRuleExternalDef returns [EObject current=null] : iv_ruleExternalDef= ruleExternalDef EOF ;
    public final EObject entryRuleExternalDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDef = null;


        try {
            // InternalSetLang.g:162:52: (iv_ruleExternalDef= ruleExternalDef EOF )
            // InternalSetLang.g:163:2: iv_ruleExternalDef= ruleExternalDef EOF
            {
             newCompositeNode(grammarAccess.getExternalDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDef=ruleExternalDef();

            state._fsp--;

             current =iv_ruleExternalDef; 
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
    // $ANTLR end "entryRuleExternalDef"


    // $ANTLR start "ruleExternalDef"
    // InternalSetLang.g:169:1: ruleExternalDef returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:175:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' ) )
            // InternalSetLang.g:176:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' )
            {
            // InternalSetLang.g:176:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' )
            // InternalSetLang.g:177:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalDefAccess().getExternalKeyword_0());
            		
            // InternalSetLang.g:181:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSetLang.g:182:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSetLang.g:182:4: (lv_name_1_0= RULE_ID )
            // InternalSetLang.g:183:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalDefAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSetLang.g:203:3: ( (lv_type_3_0= ruleType ) )
            // InternalSetLang.g:204:4: (lv_type_3_0= ruleType )
            {
            // InternalSetLang.g:204:4: (lv_type_3_0= ruleType )
            // InternalSetLang.g:205:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getExternalDefAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"dk.sdu.mmmi.mdsd.ex.SetLang.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalDefAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRuleRecord"
    // InternalSetLang.g:230:1: entryRuleRecord returns [EObject current=null] : iv_ruleRecord= ruleRecord EOF ;
    public final EObject entryRuleRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecord = null;


        try {
            // InternalSetLang.g:230:47: (iv_ruleRecord= ruleRecord EOF )
            // InternalSetLang.g:231:2: iv_ruleRecord= ruleRecord EOF
            {
             newCompositeNode(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecord=ruleRecord();

            state._fsp--;

             current =iv_ruleRecord; 
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
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // InternalSetLang.g:237:1: ruleRecord returns [EObject current=null] : (otherlv_0= 'record' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ;
    public final EObject ruleRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_members_10_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:243:2: ( (otherlv_0= 'record' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) )
            // InternalSetLang.g:244:2: (otherlv_0= 'record' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
            {
            // InternalSetLang.g:244:2: (otherlv_0= 'record' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
            // InternalSetLang.g:245:3: otherlv_0= 'record' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordAccess().getRecordKeyword_0());
            		
            // InternalSetLang.g:249:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSetLang.g:250:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSetLang.g:250:4: (lv_name_1_0= RULE_ID )
            // InternalSetLang.g:251:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSetLang.g:267:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSetLang.g:268:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRecordAccess().getColonKeyword_2_0());
                    			
                    // InternalSetLang.g:272:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSetLang.g:273:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSetLang.g:273:5: (otherlv_3= RULE_ID )
                    // InternalSetLang.g:274:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getRecordAccess().getParentRecordCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSetLang.g:286:3: (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSetLang.g:287:4: otherlv_4= '(' ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRecordAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalSetLang.g:291:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalSetLang.g:292:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalSetLang.g:292:5: (lv_parameters_5_0= ruleParameter )
                    // InternalSetLang.g:293:6: lv_parameters_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getRecordAccess().getParametersParameterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parameters_5_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecordRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_5_0,
                    							"dk.sdu.mmmi.mdsd.ex.SetLang.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSetLang.g:310:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSetLang.g:311:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRecordAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSetLang.g:315:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalSetLang.g:316:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalSetLang.g:316:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalSetLang.g:317:7: lv_parameters_7_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecordAccess().getParametersParameterParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parameters_7_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecordRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_7_0,
                    	    								"dk.sdu.mmmi.mdsd.ex.SetLang.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecordAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getRecordAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSetLang.g:344:3: ( (lv_members_10_0= ruleMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSetLang.g:345:4: (lv_members_10_0= ruleMember )
            	    {
            	    // InternalSetLang.g:345:4: (lv_members_10_0= ruleMember )
            	    // InternalSetLang.g:346:5: lv_members_10_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getRecordAccess().getMembersMemberParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_members_10_0=ruleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_10_0,
            	    						"dk.sdu.mmmi.mdsd.ex.SetLang.Member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRecordAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRecord"


    // $ANTLR start "entryRuleParameter"
    // InternalSetLang.g:371:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSetLang.g:371:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSetLang.g:372:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSetLang.g:378:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:384:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalSetLang.g:385:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalSetLang.g:385:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalSetLang.g:386:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalSetLang.g:386:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSetLang.g:387:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSetLang.g:387:4: (lv_name_0_0= RULE_ID )
            // InternalSetLang.g:388:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalSetLang.g:408:3: ( (lv_type_2_0= ruleType ) )
            // InternalSetLang.g:409:4: (lv_type_2_0= ruleType )
            {
            // InternalSetLang.g:409:4: (lv_type_2_0= ruleType )
            // InternalSetLang.g:410:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"dk.sdu.mmmi.mdsd.ex.SetLang.Type");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalSetLang.g:431:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalSetLang.g:431:44: (iv_ruleType= ruleType EOF )
            // InternalSetLang.g:432:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSetLang.g:438:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Int' | kw= 'Tuple' | (kw= 'Set' kw= '(' this_Type_4= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_4 = null;



        	enterRule();

        try {
            // InternalSetLang.g:444:2: ( (kw= 'Int' | kw= 'Tuple' | (kw= 'Set' kw= '(' this_Type_4= ruleType kw= ')' ) ) )
            // InternalSetLang.g:445:2: (kw= 'Int' | kw= 'Tuple' | (kw= 'Set' kw= '(' this_Type_4= ruleType kw= ')' ) )
            {
            // InternalSetLang.g:445:2: (kw= 'Int' | kw= 'Tuple' | (kw= 'Set' kw= '(' this_Type_4= ruleType kw= ')' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSetLang.g:446:3: kw= 'Int'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSetLang.g:452:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTupleKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSetLang.g:458:3: (kw= 'Set' kw= '(' this_Type_4= ruleType kw= ')' )
                    {
                    // InternalSetLang.g:458:3: (kw= 'Set' kw= '(' this_Type_4= ruleType kw= ')' )
                    // InternalSetLang.g:459:4: kw= 'Set' kw= '(' this_Type_4= ruleType kw= ')'
                    {
                    kw=(Token)match(input,22,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getSetKeyword_2_0());
                    			
                    kw=(Token)match(input,13,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_1());
                    			

                    				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_9);
                    this_Type_4=ruleType();

                    state._fsp--;


                    				current.merge(this_Type_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMember"
    // InternalSetLang.g:489:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalSetLang.g:489:47: (iv_ruleMember= ruleMember EOF )
            // InternalSetLang.g:490:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalSetLang.g:496:1: ruleMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleUnionIntersection ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:502:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleUnionIntersection ) ) ) )
            // InternalSetLang.g:503:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleUnionIntersection ) ) )
            {
            // InternalSetLang.g:503:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleUnionIntersection ) ) )
            // InternalSetLang.g:504:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_exp_2_0= ruleUnionIntersection ) )
            {
            // InternalSetLang.g:504:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSetLang.g:505:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSetLang.g:505:4: (lv_name_0_0= RULE_ID )
            // InternalSetLang.g:506:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getColonKeyword_1());
            		
            // InternalSetLang.g:526:3: ( (lv_exp_2_0= ruleUnionIntersection ) )
            // InternalSetLang.g:527:4: (lv_exp_2_0= ruleUnionIntersection )
            {
            // InternalSetLang.g:527:4: (lv_exp_2_0= ruleUnionIntersection )
            // InternalSetLang.g:528:5: lv_exp_2_0= ruleUnionIntersection
            {

            					newCompositeNode(grammarAccess.getMemberAccess().getExpUnionIntersectionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleUnionIntersection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemberRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleCompute"
    // InternalSetLang.g:549:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalSetLang.g:549:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalSetLang.g:550:2: iv_ruleCompute= ruleCompute EOF
            {
             newCompositeNode(grammarAccess.getComputeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompute=ruleCompute();

            state._fsp--;

             current =iv_ruleCompute; 
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
    // $ANTLR end "entryRuleCompute"


    // $ANTLR start "ruleCompute"
    // InternalSetLang.g:556:1: ruleCompute returns [EObject current=null] : (otherlv_0= 'compute' ( (lv_exp_1_0= ruleUnionIntersection ) ) ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:562:2: ( (otherlv_0= 'compute' ( (lv_exp_1_0= ruleUnionIntersection ) ) ) )
            // InternalSetLang.g:563:2: (otherlv_0= 'compute' ( (lv_exp_1_0= ruleUnionIntersection ) ) )
            {
            // InternalSetLang.g:563:2: (otherlv_0= 'compute' ( (lv_exp_1_0= ruleUnionIntersection ) ) )
            // InternalSetLang.g:564:3: otherlv_0= 'compute' ( (lv_exp_1_0= ruleUnionIntersection ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getComputeAccess().getComputeKeyword_0());
            		
            // InternalSetLang.g:568:3: ( (lv_exp_1_0= ruleUnionIntersection ) )
            // InternalSetLang.g:569:4: (lv_exp_1_0= ruleUnionIntersection )
            {
            // InternalSetLang.g:569:4: (lv_exp_1_0= ruleUnionIntersection )
            // InternalSetLang.g:570:5: lv_exp_1_0= ruleUnionIntersection
            {

            					newCompositeNode(grammarAccess.getComputeAccess().getExpUnionIntersectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_1_0=ruleUnionIntersection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputeRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
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
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleUnionIntersection"
    // InternalSetLang.g:591:1: entryRuleUnionIntersection returns [EObject current=null] : iv_ruleUnionIntersection= ruleUnionIntersection EOF ;
    public final EObject entryRuleUnionIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionIntersection = null;


        try {
            // InternalSetLang.g:591:58: (iv_ruleUnionIntersection= ruleUnionIntersection EOF )
            // InternalSetLang.g:592:2: iv_ruleUnionIntersection= ruleUnionIntersection EOF
            {
             newCompositeNode(grammarAccess.getUnionIntersectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionIntersection=ruleUnionIntersection();

            state._fsp--;

             current =iv_ruleUnionIntersection; 
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
    // $ANTLR end "entryRuleUnionIntersection"


    // $ANTLR start "ruleUnionIntersection"
    // InternalSetLang.g:598:1: ruleUnionIntersection returns [EObject current=null] : (this_Product_0= ruleProduct ( ( ( () otherlv_2= 'U' ) | ( () otherlv_4= '&' ) ) ( (lv_right_5_0= ruleProduct ) ) )* ) ;
    public final EObject ruleUnionIntersection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Product_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:604:2: ( (this_Product_0= ruleProduct ( ( ( () otherlv_2= 'U' ) | ( () otherlv_4= '&' ) ) ( (lv_right_5_0= ruleProduct ) ) )* ) )
            // InternalSetLang.g:605:2: (this_Product_0= ruleProduct ( ( ( () otherlv_2= 'U' ) | ( () otherlv_4= '&' ) ) ( (lv_right_5_0= ruleProduct ) ) )* )
            {
            // InternalSetLang.g:605:2: (this_Product_0= ruleProduct ( ( ( () otherlv_2= 'U' ) | ( () otherlv_4= '&' ) ) ( (lv_right_5_0= ruleProduct ) ) )* )
            // InternalSetLang.g:606:3: this_Product_0= ruleProduct ( ( ( () otherlv_2= 'U' ) | ( () otherlv_4= '&' ) ) ( (lv_right_5_0= ruleProduct ) ) )*
            {

            			newCompositeNode(grammarAccess.getUnionIntersectionAccess().getProductParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Product_0=ruleProduct();

            state._fsp--;


            			current = this_Product_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSetLang.g:614:3: ( ( ( () otherlv_2= 'U' ) | ( () otherlv_4= '&' ) ) ( (lv_right_5_0= ruleProduct ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSetLang.g:615:4: ( ( () otherlv_2= 'U' ) | ( () otherlv_4= '&' ) ) ( (lv_right_5_0= ruleProduct ) )
            	    {
            	    // InternalSetLang.g:615:4: ( ( () otherlv_2= 'U' ) | ( () otherlv_4= '&' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==24) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==25) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalSetLang.g:616:5: ( () otherlv_2= 'U' )
            	            {
            	            // InternalSetLang.g:616:5: ( () otherlv_2= 'U' )
            	            // InternalSetLang.g:617:6: () otherlv_2= 'U'
            	            {
            	            // InternalSetLang.g:617:6: ()
            	            // InternalSetLang.g:618:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getUnionIntersectionAccess().getUnionLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            	            						newLeafNode(otherlv_2, grammarAccess.getUnionIntersectionAccess().getUKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSetLang.g:630:5: ( () otherlv_4= '&' )
            	            {
            	            // InternalSetLang.g:630:5: ( () otherlv_4= '&' )
            	            // InternalSetLang.g:631:6: () otherlv_4= '&'
            	            {
            	            // InternalSetLang.g:631:6: ()
            	            // InternalSetLang.g:632:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getUnionIntersectionAccess().getIntersectionLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,25,FOLLOW_16); 

            	            						newLeafNode(otherlv_4, grammarAccess.getUnionIntersectionAccess().getAmpersandKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSetLang.g:644:4: ( (lv_right_5_0= ruleProduct ) )
            	    // InternalSetLang.g:645:5: (lv_right_5_0= ruleProduct )
            	    {
            	    // InternalSetLang.g:645:5: (lv_right_5_0= ruleProduct )
            	    // InternalSetLang.g:646:6: lv_right_5_0= ruleProduct
            	    {

            	    						newCompositeNode(grammarAccess.getUnionIntersectionAccess().getRightProductParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_5_0=ruleProduct();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnionIntersectionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.ex.SetLang.Product");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleUnionIntersection"


    // $ANTLR start "entryRuleProduct"
    // InternalSetLang.g:668:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalSetLang.g:668:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalSetLang.g:669:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalSetLang.g:675:1: ruleProduct returns [EObject current=null] : (this_ProjectionFilter_0= ruleProjectionFilter ( ( () otherlv_2= '*' ) ( (lv_right_3_0= ruleProjectionFilter ) ) )* ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ProjectionFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:681:2: ( (this_ProjectionFilter_0= ruleProjectionFilter ( ( () otherlv_2= '*' ) ( (lv_right_3_0= ruleProjectionFilter ) ) )* ) )
            // InternalSetLang.g:682:2: (this_ProjectionFilter_0= ruleProjectionFilter ( ( () otherlv_2= '*' ) ( (lv_right_3_0= ruleProjectionFilter ) ) )* )
            {
            // InternalSetLang.g:682:2: (this_ProjectionFilter_0= ruleProjectionFilter ( ( () otherlv_2= '*' ) ( (lv_right_3_0= ruleProjectionFilter ) ) )* )
            // InternalSetLang.g:683:3: this_ProjectionFilter_0= ruleProjectionFilter ( ( () otherlv_2= '*' ) ( (lv_right_3_0= ruleProjectionFilter ) ) )*
            {

            			newCompositeNode(grammarAccess.getProductAccess().getProjectionFilterParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_ProjectionFilter_0=ruleProjectionFilter();

            state._fsp--;


            			current = this_ProjectionFilter_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSetLang.g:691:3: ( ( () otherlv_2= '*' ) ( (lv_right_3_0= ruleProjectionFilter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSetLang.g:692:4: ( () otherlv_2= '*' ) ( (lv_right_3_0= ruleProjectionFilter ) )
            	    {
            	    // InternalSetLang.g:692:4: ( () otherlv_2= '*' )
            	    // InternalSetLang.g:693:5: () otherlv_2= '*'
            	    {
            	    // InternalSetLang.g:693:5: ()
            	    // InternalSetLang.g:694:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getProductAccess().getProductLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_16); 

            	    					newLeafNode(otherlv_2, grammarAccess.getProductAccess().getAsteriskKeyword_1_0_1());
            	    				

            	    }

            	    // InternalSetLang.g:705:4: ( (lv_right_3_0= ruleProjectionFilter ) )
            	    // InternalSetLang.g:706:5: (lv_right_3_0= ruleProjectionFilter )
            	    {
            	    // InternalSetLang.g:706:5: (lv_right_3_0= ruleProjectionFilter )
            	    // InternalSetLang.g:707:6: lv_right_3_0= ruleProjectionFilter
            	    {

            	    						newCompositeNode(grammarAccess.getProductAccess().getRightProjectionFilterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleProjectionFilter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProductRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mmmi.mdsd.ex.SetLang.ProjectionFilter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleProjectionFilter"
    // InternalSetLang.g:729:1: entryRuleProjectionFilter returns [EObject current=null] : iv_ruleProjectionFilter= ruleProjectionFilter EOF ;
    public final EObject entryRuleProjectionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectionFilter = null;


        try {
            // InternalSetLang.g:729:57: (iv_ruleProjectionFilter= ruleProjectionFilter EOF )
            // InternalSetLang.g:730:2: iv_ruleProjectionFilter= ruleProjectionFilter EOF
            {
             newCompositeNode(grammarAccess.getProjectionFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectionFilter=ruleProjectionFilter();

            state._fsp--;

             current =iv_ruleProjectionFilter; 
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
    // $ANTLR end "entryRuleProjectionFilter"


    // $ANTLR start "ruleProjectionFilter"
    // InternalSetLang.g:736:1: ruleProjectionFilter returns [EObject current=null] : (this_Primitive_0= rulePrimitive (otherlv_1= '#' ( ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' ) | ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' ) ) )? ) ;
    public final EObject ruleProjectionFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_indices_4_0=null;
        Token otherlv_5=null;
        Token lv_indices_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject this_Primitive_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:742:2: ( (this_Primitive_0= rulePrimitive (otherlv_1= '#' ( ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' ) | ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' ) ) )? ) )
            // InternalSetLang.g:743:2: (this_Primitive_0= rulePrimitive (otherlv_1= '#' ( ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' ) | ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' ) ) )? )
            {
            // InternalSetLang.g:743:2: (this_Primitive_0= rulePrimitive (otherlv_1= '#' ( ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' ) | ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' ) ) )? )
            // InternalSetLang.g:744:3: this_Primitive_0= rulePrimitive (otherlv_1= '#' ( ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' ) | ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getProjectionFilterAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSetLang.g:752:3: (otherlv_1= '#' ( ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' ) | ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSetLang.g:753:4: otherlv_1= '#' ( ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' ) | ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getProjectionFilterAccess().getNumberSignKeyword_1_0());
                    			
                    // InternalSetLang.g:757:4: ( ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' ) | ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==28) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==30) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSetLang.g:758:5: ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' )
                            {
                            // InternalSetLang.g:758:5: ( () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>' )
                            // InternalSetLang.g:759:6: () otherlv_3= '<' ( (lv_indices_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )* otherlv_7= '>'
                            {
                            // InternalSetLang.g:759:6: ()
                            // InternalSetLang.g:760:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getProjectionFilterAccess().getProjectionOpAction_1_1_0_0(),
                            								current);
                            						

                            }

                            otherlv_3=(Token)match(input,28,FOLLOW_21); 

                            						newLeafNode(otherlv_3, grammarAccess.getProjectionFilterAccess().getLessThanSignKeyword_1_1_0_1());
                            					
                            // InternalSetLang.g:770:6: ( (lv_indices_4_0= RULE_INT ) )
                            // InternalSetLang.g:771:7: (lv_indices_4_0= RULE_INT )
                            {
                            // InternalSetLang.g:771:7: (lv_indices_4_0= RULE_INT )
                            // InternalSetLang.g:772:8: lv_indices_4_0= RULE_INT
                            {
                            lv_indices_4_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                            								newLeafNode(lv_indices_4_0, grammarAccess.getProjectionFilterAccess().getIndicesINTTerminalRuleCall_1_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProjectionFilterRule());
                            								}
                            								addWithLastConsumed(
                            									current,
                            									"indices",
                            									lv_indices_4_0,
                            									"org.eclipse.xtext.common.Terminals.INT");
                            							

                            }


                            }

                            // InternalSetLang.g:788:6: (otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==17) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalSetLang.g:789:7: otherlv_5= ',' ( (lv_indices_6_0= RULE_INT ) )
                            	    {
                            	    otherlv_5=(Token)match(input,17,FOLLOW_21); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getProjectionFilterAccess().getCommaKeyword_1_1_0_3_0());
                            	    						
                            	    // InternalSetLang.g:793:7: ( (lv_indices_6_0= RULE_INT ) )
                            	    // InternalSetLang.g:794:8: (lv_indices_6_0= RULE_INT )
                            	    {
                            	    // InternalSetLang.g:794:8: (lv_indices_6_0= RULE_INT )
                            	    // InternalSetLang.g:795:9: lv_indices_6_0= RULE_INT
                            	    {
                            	    lv_indices_6_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                            	    									newLeafNode(lv_indices_6_0, grammarAccess.getProjectionFilterAccess().getIndicesINTTerminalRuleCall_1_1_0_3_1_0());
                            	    								

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getProjectionFilterRule());
                            	    									}
                            	    									addWithLastConsumed(
                            	    										current,
                            	    										"indices",
                            	    										lv_indices_6_0,
                            	    										"org.eclipse.xtext.common.Terminals.INT");
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,29,FOLLOW_2); 

                            						newLeafNode(otherlv_7, grammarAccess.getProjectionFilterAccess().getGreaterThanSignKeyword_1_1_0_4());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalSetLang.g:818:5: ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' )
                            {
                            // InternalSetLang.g:818:5: ( () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']' )
                            // InternalSetLang.g:819:6: () otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) otherlv_11= ']'
                            {
                            // InternalSetLang.g:819:6: ()
                            // InternalSetLang.g:820:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getProjectionFilterAccess().getFilterOpAction_1_1_1_0(),
                            								current);
                            						

                            }

                            otherlv_9=(Token)match(input,30,FOLLOW_3); 

                            						newLeafNode(otherlv_9, grammarAccess.getProjectionFilterAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalSetLang.g:830:6: ( (otherlv_10= RULE_ID ) )
                            // InternalSetLang.g:831:7: (otherlv_10= RULE_ID )
                            {
                            // InternalSetLang.g:831:7: (otherlv_10= RULE_ID )
                            // InternalSetLang.g:832:8: otherlv_10= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getProjectionFilterRule());
                            								}
                            							
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_23); 

                            								newLeafNode(otherlv_10, grammarAccess.getProjectionFilterAccess().getExternalExternalDefCrossReference_1_1_1_2_0());
                            							

                            }


                            }

                            otherlv_11=(Token)match(input,31,FOLLOW_2); 

                            						newLeafNode(otherlv_11, grammarAccess.getProjectionFilterAccess().getRightSquareBracketKeyword_1_1_1_3());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleProjectionFilter"


    // $ANTLR start "entryRulePrimitive"
    // InternalSetLang.g:854:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalSetLang.g:854:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalSetLang.g:855:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalSetLang.g:861:1: rulePrimitive returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_Set_1= ruleSet | this_Tuple_2= ruleTuple | this_RecordAccess_3= ruleRecordAccess | this_Ref_4= ruleRef | this_Parenthesis_5= ruleParenthesis ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_Set_1 = null;

        EObject this_Tuple_2 = null;

        EObject this_RecordAccess_3 = null;

        EObject this_Ref_4 = null;

        EObject this_Parenthesis_5 = null;



        	enterRule();

        try {
            // InternalSetLang.g:867:2: ( (this_IntValue_0= ruleIntValue | this_Set_1= ruleSet | this_Tuple_2= ruleTuple | this_RecordAccess_3= ruleRecordAccess | this_Ref_4= ruleRef | this_Parenthesis_5= ruleParenthesis ) )
            // InternalSetLang.g:868:2: (this_IntValue_0= ruleIntValue | this_Set_1= ruleSet | this_Tuple_2= ruleTuple | this_RecordAccess_3= ruleRecordAccess | this_Ref_4= ruleRef | this_Parenthesis_5= ruleParenthesis )
            {
            // InternalSetLang.g:868:2: (this_IntValue_0= ruleIntValue | this_Set_1= ruleSet | this_Tuple_2= ruleTuple | this_RecordAccess_3= ruleRecordAccess | this_Ref_4= ruleRef | this_Parenthesis_5= ruleParenthesis )
            int alt15=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case 18:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            case RULE_ID:
                {
                alt15=5;
                }
                break;
            case 13:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSetLang.g:869:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSetLang.g:878:3: this_Set_1= ruleSet
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Set_1=ruleSet();

                    state._fsp--;


                    			current = this_Set_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSetLang.g:887:3: this_Tuple_2= ruleTuple
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getTupleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tuple_2=ruleTuple();

                    state._fsp--;


                    			current = this_Tuple_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSetLang.g:896:3: this_RecordAccess_3= ruleRecordAccess
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getRecordAccessParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RecordAccess_3=ruleRecordAccess();

                    state._fsp--;


                    			current = this_RecordAccess_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSetLang.g:905:3: this_Ref_4= ruleRef
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getRefParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ref_4=ruleRef();

                    state._fsp--;


                    			current = this_Ref_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSetLang.g:914:3: this_Parenthesis_5= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getParenthesisParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_5=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_5;
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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleRef"
    // InternalSetLang.g:926:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // InternalSetLang.g:926:44: (iv_ruleRef= ruleRef EOF )
            // InternalSetLang.g:927:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
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
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalSetLang.g:933:1: ruleRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSetLang.g:939:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSetLang.g:940:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSetLang.g:940:2: ( (otherlv_0= RULE_ID ) )
            // InternalSetLang.g:941:3: (otherlv_0= RULE_ID )
            {
            // InternalSetLang.g:941:3: (otherlv_0= RULE_ID )
            // InternalSetLang.g:942:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefBindingCrossReference_0());
            			

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
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleIntValue"
    // InternalSetLang.g:956:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalSetLang.g:956:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSetLang.g:957:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSetLang.g:963:1: ruleIntValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalSetLang.g:969:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalSetLang.g:970:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalSetLang.g:970:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalSetLang.g:971:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalSetLang.g:971:3: ()
            // InternalSetLang.g:972:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntValueAccess().getIntValueAction_0(),
            					current);
            			

            }

            // InternalSetLang.g:978:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalSetLang.g:979:4: (lv_value_1_0= RULE_INT )
            {
            // InternalSetLang.g:979:4: (lv_value_1_0= RULE_INT )
            // InternalSetLang.g:980:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntValueRule());
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleSet"
    // InternalSetLang.g:1000:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalSetLang.g:1000:44: (iv_ruleSet= ruleSet EOF )
            // InternalSetLang.g:1001:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalSetLang.g:1007:1: ruleSet returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:1013:2: ( ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) ) )* )? otherlv_5= '}' ) )
            // InternalSetLang.g:1014:2: ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) ) )* )? otherlv_5= '}' )
            {
            // InternalSetLang.g:1014:2: ( () otherlv_1= '{' ( ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) ) )* )? otherlv_5= '}' )
            // InternalSetLang.g:1015:3: () otherlv_1= '{' ( ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) ) )* )? otherlv_5= '}'
            {
            // InternalSetLang.g:1015:3: ()
            // InternalSetLang.g:1016:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetAccess().getSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSetLang.g:1026:3: ( ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==13||LA17_0==18||LA17_0==30||LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSetLang.g:1027:4: ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) ) )*
                    {
                    // InternalSetLang.g:1027:4: ( (lv_values_2_0= ruleUnionIntersection ) )
                    // InternalSetLang.g:1028:5: (lv_values_2_0= ruleUnionIntersection )
                    {
                    // InternalSetLang.g:1028:5: (lv_values_2_0= ruleUnionIntersection )
                    // InternalSetLang.g:1029:6: lv_values_2_0= ruleUnionIntersection
                    {

                    						newCompositeNode(grammarAccess.getSetAccess().getValuesUnionIntersectionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_values_2_0=ruleUnionIntersection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSetLang.g:1046:4: (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==17) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSetLang.g:1047:5: otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_16); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSetAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSetLang.g:1051:5: ( (lv_values_4_0= ruleUnionIntersection ) )
                    	    // InternalSetLang.g:1052:6: (lv_values_4_0= ruleUnionIntersection )
                    	    {
                    	    // InternalSetLang.g:1052:6: (lv_values_4_0= ruleUnionIntersection )
                    	    // InternalSetLang.g:1053:7: lv_values_4_0= ruleUnionIntersection
                    	    {

                    	    							newCompositeNode(grammarAccess.getSetAccess().getValuesUnionIntersectionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_values_4_0=ruleUnionIntersection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleTuple"
    // InternalSetLang.g:1080:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalSetLang.g:1080:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalSetLang.g:1081:2: iv_ruleTuple= ruleTuple EOF
            {
             newCompositeNode(grammarAccess.getTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTuple=ruleTuple();

            state._fsp--;

             current =iv_ruleTuple; 
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
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // InternalSetLang.g:1087:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) )* )* otherlv_5= ']' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:1093:2: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) )* )* otherlv_5= ']' ) )
            // InternalSetLang.g:1094:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) )* )* otherlv_5= ']' )
            {
            // InternalSetLang.g:1094:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) )* )* otherlv_5= ']' )
            // InternalSetLang.g:1095:3: () otherlv_1= '[' ( (lv_values_2_0= ruleUnionIntersection ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) )* )* otherlv_5= ']'
            {
            // InternalSetLang.g:1095:3: ()
            // InternalSetLang.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTupleAccess().getTupleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSetLang.g:1106:3: ( (lv_values_2_0= ruleUnionIntersection ) )
            // InternalSetLang.g:1107:4: (lv_values_2_0= ruleUnionIntersection )
            {
            // InternalSetLang.g:1107:4: (lv_values_2_0= ruleUnionIntersection )
            // InternalSetLang.g:1108:5: lv_values_2_0= ruleUnionIntersection
            {

            					newCompositeNode(grammarAccess.getTupleAccess().getValuesUnionIntersectionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_values_2_0=ruleUnionIntersection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTupleRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_2_0,
            						"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSetLang.g:1125:3: (otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) )* )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSetLang.g:1126:4: otherlv_3= ',' ( (lv_values_4_0= ruleUnionIntersection ) )*
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSetLang.g:1130:4: ( (lv_values_4_0= ruleUnionIntersection ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||LA18_0==13||LA18_0==18||LA18_0==30||LA18_0==32) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalSetLang.g:1131:5: (lv_values_4_0= ruleUnionIntersection )
            	    	    {
            	    	    // InternalSetLang.g:1131:5: (lv_values_4_0= ruleUnionIntersection )
            	    	    // InternalSetLang.g:1132:6: lv_values_4_0= ruleUnionIntersection
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getTupleAccess().getValuesUnionIntersectionParserRuleCall_3_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_values_4_0=ruleUnionIntersection();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getTupleRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"values",
            	    	    							lv_values_4_0,
            	    	    							"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTupleAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleParenthesis"
    // InternalSetLang.g:1158:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalSetLang.g:1158:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalSetLang.g:1159:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalSetLang.g:1165:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_exp_2_0= ruleUnionIntersection ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:1171:2: ( ( () otherlv_1= '(' ( (lv_exp_2_0= ruleUnionIntersection ) ) otherlv_3= ')' ) )
            // InternalSetLang.g:1172:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleUnionIntersection ) ) otherlv_3= ')' )
            {
            // InternalSetLang.g:1172:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleUnionIntersection ) ) otherlv_3= ')' )
            // InternalSetLang.g:1173:3: () otherlv_1= '(' ( (lv_exp_2_0= ruleUnionIntersection ) ) otherlv_3= ')'
            {
            // InternalSetLang.g:1173:3: ()
            // InternalSetLang.g:1174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSetLang.g:1184:3: ( (lv_exp_2_0= ruleUnionIntersection ) )
            // InternalSetLang.g:1185:4: (lv_exp_2_0= ruleUnionIntersection )
            {
            // InternalSetLang.g:1185:4: (lv_exp_2_0= ruleUnionIntersection )
            // InternalSetLang.g:1186:5: lv_exp_2_0= ruleUnionIntersection
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpUnionIntersectionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp_2_0=ruleUnionIntersection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRecordAccess"
    // InternalSetLang.g:1211:1: entryRuleRecordAccess returns [EObject current=null] : iv_ruleRecordAccess= ruleRecordAccess EOF ;
    public final EObject entryRuleRecordAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordAccess = null;


        try {
            // InternalSetLang.g:1211:53: (iv_ruleRecordAccess= ruleRecordAccess EOF )
            // InternalSetLang.g:1212:2: iv_ruleRecordAccess= ruleRecordAccess EOF
            {
             newCompositeNode(grammarAccess.getRecordAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordAccess=ruleRecordAccess();

            state._fsp--;

             current =iv_ruleRecordAccess; 
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
    // $ANTLR end "entryRuleRecordAccess"


    // $ANTLR start "ruleRecordAccess"
    // InternalSetLang.g:1218:1: ruleRecordAccess returns [EObject current=null] : ( () otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleUnionIntersection ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) ) )* otherlv_7= ')' )? otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) ;
    public final EObject ruleRecordAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalSetLang.g:1224:2: ( ( () otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleUnionIntersection ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) ) )* otherlv_7= ')' )? otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalSetLang.g:1225:2: ( () otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleUnionIntersection ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) ) )* otherlv_7= ')' )? otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalSetLang.g:1225:2: ( () otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleUnionIntersection ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) ) )* otherlv_7= ')' )? otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) )
            // InternalSetLang.g:1226:3: () otherlv_1= '!' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleUnionIntersection ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) ) )* otherlv_7= ')' )? otherlv_8= '->' ( (otherlv_9= RULE_ID ) )
            {
            // InternalSetLang.g:1226:3: ()
            // InternalSetLang.g:1227:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecordAccessAccess().getRecordAccessAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordAccessAccess().getExclamationMarkKeyword_1());
            		
            // InternalSetLang.g:1237:3: ( (otherlv_2= RULE_ID ) )
            // InternalSetLang.g:1238:4: (otherlv_2= RULE_ID )
            {
            // InternalSetLang.g:1238:4: (otherlv_2= RULE_ID )
            // InternalSetLang.g:1239:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecordAccessRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_2, grammarAccess.getRecordAccessAccess().getRecordRecordCrossReference_2_0());
            				

            }


            }

            // InternalSetLang.g:1250:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleUnionIntersection ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) ) )* otherlv_7= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSetLang.g:1251:4: otherlv_3= '(' ( (lv_parameters_4_0= ruleUnionIntersection ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getRecordAccessAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalSetLang.g:1255:4: ( (lv_parameters_4_0= ruleUnionIntersection ) )
                    // InternalSetLang.g:1256:5: (lv_parameters_4_0= ruleUnionIntersection )
                    {
                    // InternalSetLang.g:1256:5: (lv_parameters_4_0= ruleUnionIntersection )
                    // InternalSetLang.g:1257:6: lv_parameters_4_0= ruleUnionIntersection
                    {

                    						newCompositeNode(grammarAccess.getRecordAccessAccess().getParametersUnionIntersectionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parameters_4_0=ruleUnionIntersection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecordAccessRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSetLang.g:1274:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSetLang.g:1275:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleUnionIntersection ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_16); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRecordAccessAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSetLang.g:1279:5: ( (lv_parameters_6_0= ruleUnionIntersection ) )
                    	    // InternalSetLang.g:1280:6: (lv_parameters_6_0= ruleUnionIntersection )
                    	    {
                    	    // InternalSetLang.g:1280:6: (lv_parameters_6_0= ruleUnionIntersection )
                    	    // InternalSetLang.g:1281:7: lv_parameters_6_0= ruleUnionIntersection
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecordAccessAccess().getParametersUnionIntersectionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parameters_6_0=ruleUnionIntersection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecordAccessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"dk.sdu.mmmi.mdsd.ex.SetLang.UnionIntersection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getRecordAccessAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getRecordAccessAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalSetLang.g:1308:3: ( (otherlv_9= RULE_ID ) )
            // InternalSetLang.g:1309:4: (otherlv_9= RULE_ID )
            {
            // InternalSetLang.g:1309:4: (otherlv_9= RULE_ID )
            // InternalSetLang.g:1310:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecordAccessRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getRecordAccessAccess().getMemberMemberCrossReference_5_0());
            				

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
    // $ANTLR end "ruleRecordAccess"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000809002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000808002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000052000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000140042030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001400C2030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000001C0062030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});

}