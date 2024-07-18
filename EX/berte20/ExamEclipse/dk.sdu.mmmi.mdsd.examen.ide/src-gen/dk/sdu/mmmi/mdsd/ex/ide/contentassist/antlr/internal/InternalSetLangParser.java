package dk.sdu.mmmi.mdsd.ex.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.ex.services.SetLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSetLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Int'", "'Tuple'", "'program'", "'external'", "'('", "')'", "'record'", "'{'", "'}'", "':'", "','", "'Set'", "'compute'", "'U'", "'&'", "'*'", "'#'", "'<'", "'>'", "'['", "']'", "'!'", "'->'"
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

    	public void setGrammarAccess(SetLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalSetLang.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalSetLang.g:54:1: ( ruleProgram EOF )
            // InternalSetLang.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSetLang.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalSetLang.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalSetLang.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalSetLang.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalSetLang.g:69:3: ( rule__Program__Group__0 )
            // InternalSetLang.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExternalDef"
    // InternalSetLang.g:78:1: entryRuleExternalDef : ruleExternalDef EOF ;
    public final void entryRuleExternalDef() throws RecognitionException {
        try {
            // InternalSetLang.g:79:1: ( ruleExternalDef EOF )
            // InternalSetLang.g:80:1: ruleExternalDef EOF
            {
             before(grammarAccess.getExternalDefRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalDef();

            state._fsp--;

             after(grammarAccess.getExternalDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalDef"


    // $ANTLR start "ruleExternalDef"
    // InternalSetLang.g:87:1: ruleExternalDef : ( ( rule__ExternalDef__Group__0 ) ) ;
    public final void ruleExternalDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:91:2: ( ( ( rule__ExternalDef__Group__0 ) ) )
            // InternalSetLang.g:92:2: ( ( rule__ExternalDef__Group__0 ) )
            {
            // InternalSetLang.g:92:2: ( ( rule__ExternalDef__Group__0 ) )
            // InternalSetLang.g:93:3: ( rule__ExternalDef__Group__0 )
            {
             before(grammarAccess.getExternalDefAccess().getGroup()); 
            // InternalSetLang.g:94:3: ( rule__ExternalDef__Group__0 )
            // InternalSetLang.g:94:4: rule__ExternalDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRuleRecord"
    // InternalSetLang.g:103:1: entryRuleRecord : ruleRecord EOF ;
    public final void entryRuleRecord() throws RecognitionException {
        try {
            // InternalSetLang.g:104:1: ( ruleRecord EOF )
            // InternalSetLang.g:105:1: ruleRecord EOF
            {
             before(grammarAccess.getRecordRule()); 
            pushFollow(FOLLOW_1);
            ruleRecord();

            state._fsp--;

             after(grammarAccess.getRecordRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // InternalSetLang.g:112:1: ruleRecord : ( ( rule__Record__Group__0 ) ) ;
    public final void ruleRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:116:2: ( ( ( rule__Record__Group__0 ) ) )
            // InternalSetLang.g:117:2: ( ( rule__Record__Group__0 ) )
            {
            // InternalSetLang.g:117:2: ( ( rule__Record__Group__0 ) )
            // InternalSetLang.g:118:3: ( rule__Record__Group__0 )
            {
             before(grammarAccess.getRecordAccess().getGroup()); 
            // InternalSetLang.g:119:3: ( rule__Record__Group__0 )
            // InternalSetLang.g:119:4: rule__Record__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecord"


    // $ANTLR start "entryRuleParameter"
    // InternalSetLang.g:128:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSetLang.g:129:1: ( ruleParameter EOF )
            // InternalSetLang.g:130:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSetLang.g:137:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:141:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSetLang.g:142:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSetLang.g:142:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSetLang.g:143:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSetLang.g:144:3: ( rule__Parameter__Group__0 )
            // InternalSetLang.g:144:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalSetLang.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSetLang.g:154:1: ( ruleType EOF )
            // InternalSetLang.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSetLang.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSetLang.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSetLang.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalSetLang.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSetLang.g:169:3: ( rule__Type__Alternatives )
            // InternalSetLang.g:169:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMember"
    // InternalSetLang.g:178:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalSetLang.g:179:1: ( ruleMember EOF )
            // InternalSetLang.g:180:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalSetLang.g:187:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:191:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalSetLang.g:192:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalSetLang.g:192:2: ( ( rule__Member__Group__0 ) )
            // InternalSetLang.g:193:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalSetLang.g:194:3: ( rule__Member__Group__0 )
            // InternalSetLang.g:194:4: rule__Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleCompute"
    // InternalSetLang.g:203:1: entryRuleCompute : ruleCompute EOF ;
    public final void entryRuleCompute() throws RecognitionException {
        try {
            // InternalSetLang.g:204:1: ( ruleCompute EOF )
            // InternalSetLang.g:205:1: ruleCompute EOF
            {
             before(grammarAccess.getComputeRule()); 
            pushFollow(FOLLOW_1);
            ruleCompute();

            state._fsp--;

             after(grammarAccess.getComputeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompute"


    // $ANTLR start "ruleCompute"
    // InternalSetLang.g:212:1: ruleCompute : ( ( rule__Compute__Group__0 ) ) ;
    public final void ruleCompute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:216:2: ( ( ( rule__Compute__Group__0 ) ) )
            // InternalSetLang.g:217:2: ( ( rule__Compute__Group__0 ) )
            {
            // InternalSetLang.g:217:2: ( ( rule__Compute__Group__0 ) )
            // InternalSetLang.g:218:3: ( rule__Compute__Group__0 )
            {
             before(grammarAccess.getComputeAccess().getGroup()); 
            // InternalSetLang.g:219:3: ( rule__Compute__Group__0 )
            // InternalSetLang.g:219:4: rule__Compute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleUnionIntersection"
    // InternalSetLang.g:228:1: entryRuleUnionIntersection : ruleUnionIntersection EOF ;
    public final void entryRuleUnionIntersection() throws RecognitionException {
        try {
            // InternalSetLang.g:229:1: ( ruleUnionIntersection EOF )
            // InternalSetLang.g:230:1: ruleUnionIntersection EOF
            {
             before(grammarAccess.getUnionIntersectionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getUnionIntersectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnionIntersection"


    // $ANTLR start "ruleUnionIntersection"
    // InternalSetLang.g:237:1: ruleUnionIntersection : ( ( rule__UnionIntersection__Group__0 ) ) ;
    public final void ruleUnionIntersection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:241:2: ( ( ( rule__UnionIntersection__Group__0 ) ) )
            // InternalSetLang.g:242:2: ( ( rule__UnionIntersection__Group__0 ) )
            {
            // InternalSetLang.g:242:2: ( ( rule__UnionIntersection__Group__0 ) )
            // InternalSetLang.g:243:3: ( rule__UnionIntersection__Group__0 )
            {
             before(grammarAccess.getUnionIntersectionAccess().getGroup()); 
            // InternalSetLang.g:244:3: ( rule__UnionIntersection__Group__0 )
            // InternalSetLang.g:244:4: rule__UnionIntersection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionIntersectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnionIntersection"


    // $ANTLR start "entryRuleProduct"
    // InternalSetLang.g:253:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // InternalSetLang.g:254:1: ( ruleProduct EOF )
            // InternalSetLang.g:255:1: ruleProduct EOF
            {
             before(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getProductRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalSetLang.g:262:1: ruleProduct : ( ( rule__Product__Group__0 ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:266:2: ( ( ( rule__Product__Group__0 ) ) )
            // InternalSetLang.g:267:2: ( ( rule__Product__Group__0 ) )
            {
            // InternalSetLang.g:267:2: ( ( rule__Product__Group__0 ) )
            // InternalSetLang.g:268:3: ( rule__Product__Group__0 )
            {
             before(grammarAccess.getProductAccess().getGroup()); 
            // InternalSetLang.g:269:3: ( rule__Product__Group__0 )
            // InternalSetLang.g:269:4: rule__Product__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Product__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleProjectionFilter"
    // InternalSetLang.g:278:1: entryRuleProjectionFilter : ruleProjectionFilter EOF ;
    public final void entryRuleProjectionFilter() throws RecognitionException {
        try {
            // InternalSetLang.g:279:1: ( ruleProjectionFilter EOF )
            // InternalSetLang.g:280:1: ruleProjectionFilter EOF
            {
             before(grammarAccess.getProjectionFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectionFilter();

            state._fsp--;

             after(grammarAccess.getProjectionFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProjectionFilter"


    // $ANTLR start "ruleProjectionFilter"
    // InternalSetLang.g:287:1: ruleProjectionFilter : ( ( rule__ProjectionFilter__Group__0 ) ) ;
    public final void ruleProjectionFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:291:2: ( ( ( rule__ProjectionFilter__Group__0 ) ) )
            // InternalSetLang.g:292:2: ( ( rule__ProjectionFilter__Group__0 ) )
            {
            // InternalSetLang.g:292:2: ( ( rule__ProjectionFilter__Group__0 ) )
            // InternalSetLang.g:293:3: ( rule__ProjectionFilter__Group__0 )
            {
             before(grammarAccess.getProjectionFilterAccess().getGroup()); 
            // InternalSetLang.g:294:3: ( rule__ProjectionFilter__Group__0 )
            // InternalSetLang.g:294:4: rule__ProjectionFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectionFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectionFilter"


    // $ANTLR start "entryRulePrimitive"
    // InternalSetLang.g:303:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalSetLang.g:304:1: ( rulePrimitive EOF )
            // InternalSetLang.g:305:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalSetLang.g:312:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:316:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalSetLang.g:317:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalSetLang.g:317:2: ( ( rule__Primitive__Alternatives ) )
            // InternalSetLang.g:318:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalSetLang.g:319:3: ( rule__Primitive__Alternatives )
            // InternalSetLang.g:319:4: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleRef"
    // InternalSetLang.g:328:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // InternalSetLang.g:329:1: ( ruleRef EOF )
            // InternalSetLang.g:330:1: ruleRef EOF
            {
             before(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_1);
            ruleRef();

            state._fsp--;

             after(grammarAccess.getRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalSetLang.g:337:1: ruleRef : ( ( rule__Ref__RefAssignment ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:341:2: ( ( ( rule__Ref__RefAssignment ) ) )
            // InternalSetLang.g:342:2: ( ( rule__Ref__RefAssignment ) )
            {
            // InternalSetLang.g:342:2: ( ( rule__Ref__RefAssignment ) )
            // InternalSetLang.g:343:3: ( rule__Ref__RefAssignment )
            {
             before(grammarAccess.getRefAccess().getRefAssignment()); 
            // InternalSetLang.g:344:3: ( rule__Ref__RefAssignment )
            // InternalSetLang.g:344:4: rule__Ref__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Ref__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleIntValue"
    // InternalSetLang.g:353:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalSetLang.g:354:1: ( ruleIntValue EOF )
            // InternalSetLang.g:355:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSetLang.g:362:1: ruleIntValue : ( ( rule__IntValue__Group__0 ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:366:2: ( ( ( rule__IntValue__Group__0 ) ) )
            // InternalSetLang.g:367:2: ( ( rule__IntValue__Group__0 ) )
            {
            // InternalSetLang.g:367:2: ( ( rule__IntValue__Group__0 ) )
            // InternalSetLang.g:368:3: ( rule__IntValue__Group__0 )
            {
             before(grammarAccess.getIntValueAccess().getGroup()); 
            // InternalSetLang.g:369:3: ( rule__IntValue__Group__0 )
            // InternalSetLang.g:369:4: rule__IntValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleSet"
    // InternalSetLang.g:378:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // InternalSetLang.g:379:1: ( ruleSet EOF )
            // InternalSetLang.g:380:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalSetLang.g:387:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:391:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalSetLang.g:392:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalSetLang.g:392:2: ( ( rule__Set__Group__0 ) )
            // InternalSetLang.g:393:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalSetLang.g:394:3: ( rule__Set__Group__0 )
            // InternalSetLang.g:394:4: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleTuple"
    // InternalSetLang.g:403:1: entryRuleTuple : ruleTuple EOF ;
    public final void entryRuleTuple() throws RecognitionException {
        try {
            // InternalSetLang.g:404:1: ( ruleTuple EOF )
            // InternalSetLang.g:405:1: ruleTuple EOF
            {
             before(grammarAccess.getTupleRule()); 
            pushFollow(FOLLOW_1);
            ruleTuple();

            state._fsp--;

             after(grammarAccess.getTupleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // InternalSetLang.g:412:1: ruleTuple : ( ( rule__Tuple__Group__0 ) ) ;
    public final void ruleTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:416:2: ( ( ( rule__Tuple__Group__0 ) ) )
            // InternalSetLang.g:417:2: ( ( rule__Tuple__Group__0 ) )
            {
            // InternalSetLang.g:417:2: ( ( rule__Tuple__Group__0 ) )
            // InternalSetLang.g:418:3: ( rule__Tuple__Group__0 )
            {
             before(grammarAccess.getTupleAccess().getGroup()); 
            // InternalSetLang.g:419:3: ( rule__Tuple__Group__0 )
            // InternalSetLang.g:419:4: rule__Tuple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTupleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleParenthesis"
    // InternalSetLang.g:428:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalSetLang.g:429:1: ( ruleParenthesis EOF )
            // InternalSetLang.g:430:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalSetLang.g:437:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:441:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalSetLang.g:442:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalSetLang.g:442:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalSetLang.g:443:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalSetLang.g:444:3: ( rule__Parenthesis__Group__0 )
            // InternalSetLang.g:444:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleRecordAccess"
    // InternalSetLang.g:453:1: entryRuleRecordAccess : ruleRecordAccess EOF ;
    public final void entryRuleRecordAccess() throws RecognitionException {
        try {
            // InternalSetLang.g:454:1: ( ruleRecordAccess EOF )
            // InternalSetLang.g:455:1: ruleRecordAccess EOF
            {
             before(grammarAccess.getRecordAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordAccess();

            state._fsp--;

             after(grammarAccess.getRecordAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordAccess"


    // $ANTLR start "ruleRecordAccess"
    // InternalSetLang.g:462:1: ruleRecordAccess : ( ( rule__RecordAccess__Group__0 ) ) ;
    public final void ruleRecordAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:466:2: ( ( ( rule__RecordAccess__Group__0 ) ) )
            // InternalSetLang.g:467:2: ( ( rule__RecordAccess__Group__0 ) )
            {
            // InternalSetLang.g:467:2: ( ( rule__RecordAccess__Group__0 ) )
            // InternalSetLang.g:468:3: ( rule__RecordAccess__Group__0 )
            {
             before(grammarAccess.getRecordAccessAccess().getGroup()); 
            // InternalSetLang.g:469:3: ( rule__RecordAccess__Group__0 )
            // InternalSetLang.g:469:4: rule__RecordAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordAccess"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSetLang.g:477:1: rule__Type__Alternatives : ( ( 'Int' ) | ( 'Tuple' ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:481:1: ( ( 'Int' ) | ( 'Tuple' ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSetLang.g:482:2: ( 'Int' )
                    {
                    // InternalSetLang.g:482:2: ( 'Int' )
                    // InternalSetLang.g:483:3: 'Int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSetLang.g:488:2: ( 'Tuple' )
                    {
                    // InternalSetLang.g:488:2: ( 'Tuple' )
                    // InternalSetLang.g:489:3: 'Tuple'
                    {
                     before(grammarAccess.getTypeAccess().getTupleKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getTupleKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSetLang.g:494:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalSetLang.g:494:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalSetLang.g:495:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalSetLang.g:496:3: ( rule__Type__Group_2__0 )
                    // InternalSetLang.g:496:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__UnionIntersection__Alternatives_1_0"
    // InternalSetLang.g:504:1: rule__UnionIntersection__Alternatives_1_0 : ( ( ( rule__UnionIntersection__Group_1_0_0__0 ) ) | ( ( rule__UnionIntersection__Group_1_0_1__0 ) ) );
    public final void rule__UnionIntersection__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:508:1: ( ( ( rule__UnionIntersection__Group_1_0_0__0 ) ) | ( ( rule__UnionIntersection__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSetLang.g:509:2: ( ( rule__UnionIntersection__Group_1_0_0__0 ) )
                    {
                    // InternalSetLang.g:509:2: ( ( rule__UnionIntersection__Group_1_0_0__0 ) )
                    // InternalSetLang.g:510:3: ( rule__UnionIntersection__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getUnionIntersectionAccess().getGroup_1_0_0()); 
                    // InternalSetLang.g:511:3: ( rule__UnionIntersection__Group_1_0_0__0 )
                    // InternalSetLang.g:511:4: rule__UnionIntersection__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnionIntersection__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnionIntersectionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSetLang.g:515:2: ( ( rule__UnionIntersection__Group_1_0_1__0 ) )
                    {
                    // InternalSetLang.g:515:2: ( ( rule__UnionIntersection__Group_1_0_1__0 ) )
                    // InternalSetLang.g:516:3: ( rule__UnionIntersection__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getUnionIntersectionAccess().getGroup_1_0_1()); 
                    // InternalSetLang.g:517:3: ( rule__UnionIntersection__Group_1_0_1__0 )
                    // InternalSetLang.g:517:4: rule__UnionIntersection__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnionIntersection__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnionIntersectionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Alternatives_1_0"


    // $ANTLR start "rule__ProjectionFilter__Alternatives_1_1"
    // InternalSetLang.g:525:1: rule__ProjectionFilter__Alternatives_1_1 : ( ( ( rule__ProjectionFilter__Group_1_1_0__0 ) ) | ( ( rule__ProjectionFilter__Group_1_1_1__0 ) ) );
    public final void rule__ProjectionFilter__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:529:1: ( ( ( rule__ProjectionFilter__Group_1_1_0__0 ) ) | ( ( rule__ProjectionFilter__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSetLang.g:530:2: ( ( rule__ProjectionFilter__Group_1_1_0__0 ) )
                    {
                    // InternalSetLang.g:530:2: ( ( rule__ProjectionFilter__Group_1_1_0__0 ) )
                    // InternalSetLang.g:531:3: ( rule__ProjectionFilter__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getProjectionFilterAccess().getGroup_1_1_0()); 
                    // InternalSetLang.g:532:3: ( rule__ProjectionFilter__Group_1_1_0__0 )
                    // InternalSetLang.g:532:4: rule__ProjectionFilter__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectionFilter__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectionFilterAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSetLang.g:536:2: ( ( rule__ProjectionFilter__Group_1_1_1__0 ) )
                    {
                    // InternalSetLang.g:536:2: ( ( rule__ProjectionFilter__Group_1_1_1__0 ) )
                    // InternalSetLang.g:537:3: ( rule__ProjectionFilter__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getProjectionFilterAccess().getGroup_1_1_1()); 
                    // InternalSetLang.g:538:3: ( rule__ProjectionFilter__Group_1_1_1__0 )
                    // InternalSetLang.g:538:4: rule__ProjectionFilter__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectionFilter__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectionFilterAccess().getGroup_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Alternatives_1_1"


    // $ANTLR start "rule__Primitive__Alternatives"
    // InternalSetLang.g:546:1: rule__Primitive__Alternatives : ( ( ruleIntValue ) | ( ruleSet ) | ( ruleTuple ) | ( ruleRecordAccess ) | ( ruleRef ) | ( ruleParenthesis ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:550:1: ( ( ruleIntValue ) | ( ruleSet ) | ( ruleTuple ) | ( ruleRecordAccess ) | ( ruleRef ) | ( ruleParenthesis ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
                {
                alt4=5;
                }
                break;
            case 15:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSetLang.g:551:2: ( ruleIntValue )
                    {
                    // InternalSetLang.g:551:2: ( ruleIntValue )
                    // InternalSetLang.g:552:3: ruleIntValue
                    {
                     before(grammarAccess.getPrimitiveAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSetLang.g:557:2: ( ruleSet )
                    {
                    // InternalSetLang.g:557:2: ( ruleSet )
                    // InternalSetLang.g:558:3: ruleSet
                    {
                     before(grammarAccess.getPrimitiveAccess().getSetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSet();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getSetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSetLang.g:563:2: ( ruleTuple )
                    {
                    // InternalSetLang.g:563:2: ( ruleTuple )
                    // InternalSetLang.g:564:3: ruleTuple
                    {
                     before(grammarAccess.getPrimitiveAccess().getTupleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTuple();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getTupleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSetLang.g:569:2: ( ruleRecordAccess )
                    {
                    // InternalSetLang.g:569:2: ( ruleRecordAccess )
                    // InternalSetLang.g:570:3: ruleRecordAccess
                    {
                     before(grammarAccess.getPrimitiveAccess().getRecordAccessParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordAccess();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getRecordAccessParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSetLang.g:575:2: ( ruleRef )
                    {
                    // InternalSetLang.g:575:2: ( ruleRef )
                    // InternalSetLang.g:576:3: ruleRef
                    {
                     before(grammarAccess.getPrimitiveAccess().getRefParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRef();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getRefParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSetLang.g:581:2: ( ruleParenthesis )
                    {
                    // InternalSetLang.g:581:2: ( ruleParenthesis )
                    // InternalSetLang.g:582:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimitiveAccess().getParenthesisParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getParenthesisParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalSetLang.g:591:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:595:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSetLang.g:596:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalSetLang.g:603:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:607:1: ( ( 'program' ) )
            // InternalSetLang.g:608:1: ( 'program' )
            {
            // InternalSetLang.g:608:1: ( 'program' )
            // InternalSetLang.g:609:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalSetLang.g:618:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:622:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalSetLang.g:623:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalSetLang.g:630:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:634:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalSetLang.g:635:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalSetLang.g:635:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalSetLang.g:636:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalSetLang.g:637:2: ( rule__Program__NameAssignment_1 )
            // InternalSetLang.g:637:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalSetLang.g:645:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:649:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalSetLang.g:650:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalSetLang.g:657:1: rule__Program__Group__2__Impl : ( ( rule__Program__ExternalDefsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:661:1: ( ( ( rule__Program__ExternalDefsAssignment_2 )* ) )
            // InternalSetLang.g:662:1: ( ( rule__Program__ExternalDefsAssignment_2 )* )
            {
            // InternalSetLang.g:662:1: ( ( rule__Program__ExternalDefsAssignment_2 )* )
            // InternalSetLang.g:663:2: ( rule__Program__ExternalDefsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getExternalDefsAssignment_2()); 
            // InternalSetLang.g:664:2: ( rule__Program__ExternalDefsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSetLang.g:664:3: rule__Program__ExternalDefsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__ExternalDefsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getExternalDefsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalSetLang.g:672:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:676:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalSetLang.g:677:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalSetLang.g:684:1: rule__Program__Group__3__Impl : ( ( rule__Program__RecordsAssignment_3 )* ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:688:1: ( ( ( rule__Program__RecordsAssignment_3 )* ) )
            // InternalSetLang.g:689:1: ( ( rule__Program__RecordsAssignment_3 )* )
            {
            // InternalSetLang.g:689:1: ( ( rule__Program__RecordsAssignment_3 )* )
            // InternalSetLang.g:690:2: ( rule__Program__RecordsAssignment_3 )*
            {
             before(grammarAccess.getProgramAccess().getRecordsAssignment_3()); 
            // InternalSetLang.g:691:2: ( rule__Program__RecordsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSetLang.g:691:3: rule__Program__RecordsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Program__RecordsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getRecordsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalSetLang.g:699:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:703:1: ( rule__Program__Group__4__Impl )
            // InternalSetLang.g:704:2: rule__Program__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalSetLang.g:710:1: rule__Program__Group__4__Impl : ( ( rule__Program__ComputesAssignment_4 )* ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:714:1: ( ( ( rule__Program__ComputesAssignment_4 )* ) )
            // InternalSetLang.g:715:1: ( ( rule__Program__ComputesAssignment_4 )* )
            {
            // InternalSetLang.g:715:1: ( ( rule__Program__ComputesAssignment_4 )* )
            // InternalSetLang.g:716:2: ( rule__Program__ComputesAssignment_4 )*
            {
             before(grammarAccess.getProgramAccess().getComputesAssignment_4()); 
            // InternalSetLang.g:717:2: ( rule__Program__ComputesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSetLang.g:717:3: rule__Program__ComputesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Program__ComputesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getComputesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__ExternalDef__Group__0"
    // InternalSetLang.g:726:1: rule__ExternalDef__Group__0 : rule__ExternalDef__Group__0__Impl rule__ExternalDef__Group__1 ;
    public final void rule__ExternalDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:730:1: ( rule__ExternalDef__Group__0__Impl rule__ExternalDef__Group__1 )
            // InternalSetLang.g:731:2: rule__ExternalDef__Group__0__Impl rule__ExternalDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__0"


    // $ANTLR start "rule__ExternalDef__Group__0__Impl"
    // InternalSetLang.g:738:1: rule__ExternalDef__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:742:1: ( ( 'external' ) )
            // InternalSetLang.g:743:1: ( 'external' )
            {
            // InternalSetLang.g:743:1: ( 'external' )
            // InternalSetLang.g:744:2: 'external'
            {
             before(grammarAccess.getExternalDefAccess().getExternalKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getExternalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__0__Impl"


    // $ANTLR start "rule__ExternalDef__Group__1"
    // InternalSetLang.g:753:1: rule__ExternalDef__Group__1 : rule__ExternalDef__Group__1__Impl rule__ExternalDef__Group__2 ;
    public final void rule__ExternalDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:757:1: ( rule__ExternalDef__Group__1__Impl rule__ExternalDef__Group__2 )
            // InternalSetLang.g:758:2: rule__ExternalDef__Group__1__Impl rule__ExternalDef__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__1"


    // $ANTLR start "rule__ExternalDef__Group__1__Impl"
    // InternalSetLang.g:765:1: rule__ExternalDef__Group__1__Impl : ( ( rule__ExternalDef__NameAssignment_1 ) ) ;
    public final void rule__ExternalDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:769:1: ( ( ( rule__ExternalDef__NameAssignment_1 ) ) )
            // InternalSetLang.g:770:1: ( ( rule__ExternalDef__NameAssignment_1 ) )
            {
            // InternalSetLang.g:770:1: ( ( rule__ExternalDef__NameAssignment_1 ) )
            // InternalSetLang.g:771:2: ( rule__ExternalDef__NameAssignment_1 )
            {
             before(grammarAccess.getExternalDefAccess().getNameAssignment_1()); 
            // InternalSetLang.g:772:2: ( rule__ExternalDef__NameAssignment_1 )
            // InternalSetLang.g:772:3: rule__ExternalDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__1__Impl"


    // $ANTLR start "rule__ExternalDef__Group__2"
    // InternalSetLang.g:780:1: rule__ExternalDef__Group__2 : rule__ExternalDef__Group__2__Impl rule__ExternalDef__Group__3 ;
    public final void rule__ExternalDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:784:1: ( rule__ExternalDef__Group__2__Impl rule__ExternalDef__Group__3 )
            // InternalSetLang.g:785:2: rule__ExternalDef__Group__2__Impl rule__ExternalDef__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ExternalDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__2"


    // $ANTLR start "rule__ExternalDef__Group__2__Impl"
    // InternalSetLang.g:792:1: rule__ExternalDef__Group__2__Impl : ( '(' ) ;
    public final void rule__ExternalDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:796:1: ( ( '(' ) )
            // InternalSetLang.g:797:1: ( '(' )
            {
            // InternalSetLang.g:797:1: ( '(' )
            // InternalSetLang.g:798:2: '('
            {
             before(grammarAccess.getExternalDefAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__2__Impl"


    // $ANTLR start "rule__ExternalDef__Group__3"
    // InternalSetLang.g:807:1: rule__ExternalDef__Group__3 : rule__ExternalDef__Group__3__Impl rule__ExternalDef__Group__4 ;
    public final void rule__ExternalDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:811:1: ( rule__ExternalDef__Group__3__Impl rule__ExternalDef__Group__4 )
            // InternalSetLang.g:812:2: rule__ExternalDef__Group__3__Impl rule__ExternalDef__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ExternalDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__3"


    // $ANTLR start "rule__ExternalDef__Group__3__Impl"
    // InternalSetLang.g:819:1: rule__ExternalDef__Group__3__Impl : ( ( rule__ExternalDef__TypeAssignment_3 ) ) ;
    public final void rule__ExternalDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:823:1: ( ( ( rule__ExternalDef__TypeAssignment_3 ) ) )
            // InternalSetLang.g:824:1: ( ( rule__ExternalDef__TypeAssignment_3 ) )
            {
            // InternalSetLang.g:824:1: ( ( rule__ExternalDef__TypeAssignment_3 ) )
            // InternalSetLang.g:825:2: ( rule__ExternalDef__TypeAssignment_3 )
            {
             before(grammarAccess.getExternalDefAccess().getTypeAssignment_3()); 
            // InternalSetLang.g:826:2: ( rule__ExternalDef__TypeAssignment_3 )
            // InternalSetLang.g:826:3: rule__ExternalDef__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalDefAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__3__Impl"


    // $ANTLR start "rule__ExternalDef__Group__4"
    // InternalSetLang.g:834:1: rule__ExternalDef__Group__4 : rule__ExternalDef__Group__4__Impl ;
    public final void rule__ExternalDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:838:1: ( rule__ExternalDef__Group__4__Impl )
            // InternalSetLang.g:839:2: rule__ExternalDef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__4"


    // $ANTLR start "rule__ExternalDef__Group__4__Impl"
    // InternalSetLang.g:845:1: rule__ExternalDef__Group__4__Impl : ( ')' ) ;
    public final void rule__ExternalDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:849:1: ( ( ')' ) )
            // InternalSetLang.g:850:1: ( ')' )
            {
            // InternalSetLang.g:850:1: ( ')' )
            // InternalSetLang.g:851:2: ')'
            {
             before(grammarAccess.getExternalDefAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__4__Impl"


    // $ANTLR start "rule__Record__Group__0"
    // InternalSetLang.g:861:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:865:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // InternalSetLang.g:866:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Record__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__0"


    // $ANTLR start "rule__Record__Group__0__Impl"
    // InternalSetLang.g:873:1: rule__Record__Group__0__Impl : ( 'record' ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:877:1: ( ( 'record' ) )
            // InternalSetLang.g:878:1: ( 'record' )
            {
            // InternalSetLang.g:878:1: ( 'record' )
            // InternalSetLang.g:879:2: 'record'
            {
             before(grammarAccess.getRecordAccess().getRecordKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getRecordKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__0__Impl"


    // $ANTLR start "rule__Record__Group__1"
    // InternalSetLang.g:888:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:892:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // InternalSetLang.g:893:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Record__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__1"


    // $ANTLR start "rule__Record__Group__1__Impl"
    // InternalSetLang.g:900:1: rule__Record__Group__1__Impl : ( ( rule__Record__NameAssignment_1 ) ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:904:1: ( ( ( rule__Record__NameAssignment_1 ) ) )
            // InternalSetLang.g:905:1: ( ( rule__Record__NameAssignment_1 ) )
            {
            // InternalSetLang.g:905:1: ( ( rule__Record__NameAssignment_1 ) )
            // InternalSetLang.g:906:2: ( rule__Record__NameAssignment_1 )
            {
             before(grammarAccess.getRecordAccess().getNameAssignment_1()); 
            // InternalSetLang.g:907:2: ( rule__Record__NameAssignment_1 )
            // InternalSetLang.g:907:3: rule__Record__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Record__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__1__Impl"


    // $ANTLR start "rule__Record__Group__2"
    // InternalSetLang.g:915:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:919:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // InternalSetLang.g:920:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Record__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__2"


    // $ANTLR start "rule__Record__Group__2__Impl"
    // InternalSetLang.g:927:1: rule__Record__Group__2__Impl : ( ( rule__Record__Group_2__0 )? ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:931:1: ( ( ( rule__Record__Group_2__0 )? ) )
            // InternalSetLang.g:932:1: ( ( rule__Record__Group_2__0 )? )
            {
            // InternalSetLang.g:932:1: ( ( rule__Record__Group_2__0 )? )
            // InternalSetLang.g:933:2: ( rule__Record__Group_2__0 )?
            {
             before(grammarAccess.getRecordAccess().getGroup_2()); 
            // InternalSetLang.g:934:2: ( rule__Record__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSetLang.g:934:3: rule__Record__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Record__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__2__Impl"


    // $ANTLR start "rule__Record__Group__3"
    // InternalSetLang.g:942:1: rule__Record__Group__3 : rule__Record__Group__3__Impl rule__Record__Group__4 ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:946:1: ( rule__Record__Group__3__Impl rule__Record__Group__4 )
            // InternalSetLang.g:947:2: rule__Record__Group__3__Impl rule__Record__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Record__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__3"


    // $ANTLR start "rule__Record__Group__3__Impl"
    // InternalSetLang.g:954:1: rule__Record__Group__3__Impl : ( ( rule__Record__Group_3__0 )? ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:958:1: ( ( ( rule__Record__Group_3__0 )? ) )
            // InternalSetLang.g:959:1: ( ( rule__Record__Group_3__0 )? )
            {
            // InternalSetLang.g:959:1: ( ( rule__Record__Group_3__0 )? )
            // InternalSetLang.g:960:2: ( rule__Record__Group_3__0 )?
            {
             before(grammarAccess.getRecordAccess().getGroup_3()); 
            // InternalSetLang.g:961:2: ( rule__Record__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSetLang.g:961:3: rule__Record__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Record__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__3__Impl"


    // $ANTLR start "rule__Record__Group__4"
    // InternalSetLang.g:969:1: rule__Record__Group__4 : rule__Record__Group__4__Impl rule__Record__Group__5 ;
    public final void rule__Record__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:973:1: ( rule__Record__Group__4__Impl rule__Record__Group__5 )
            // InternalSetLang.g:974:2: rule__Record__Group__4__Impl rule__Record__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Record__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__4"


    // $ANTLR start "rule__Record__Group__4__Impl"
    // InternalSetLang.g:981:1: rule__Record__Group__4__Impl : ( '{' ) ;
    public final void rule__Record__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:985:1: ( ( '{' ) )
            // InternalSetLang.g:986:1: ( '{' )
            {
            // InternalSetLang.g:986:1: ( '{' )
            // InternalSetLang.g:987:2: '{'
            {
             before(grammarAccess.getRecordAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__4__Impl"


    // $ANTLR start "rule__Record__Group__5"
    // InternalSetLang.g:996:1: rule__Record__Group__5 : rule__Record__Group__5__Impl rule__Record__Group__6 ;
    public final void rule__Record__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1000:1: ( rule__Record__Group__5__Impl rule__Record__Group__6 )
            // InternalSetLang.g:1001:2: rule__Record__Group__5__Impl rule__Record__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Record__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__5"


    // $ANTLR start "rule__Record__Group__5__Impl"
    // InternalSetLang.g:1008:1: rule__Record__Group__5__Impl : ( ( rule__Record__MembersAssignment_5 )* ) ;
    public final void rule__Record__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1012:1: ( ( ( rule__Record__MembersAssignment_5 )* ) )
            // InternalSetLang.g:1013:1: ( ( rule__Record__MembersAssignment_5 )* )
            {
            // InternalSetLang.g:1013:1: ( ( rule__Record__MembersAssignment_5 )* )
            // InternalSetLang.g:1014:2: ( rule__Record__MembersAssignment_5 )*
            {
             before(grammarAccess.getRecordAccess().getMembersAssignment_5()); 
            // InternalSetLang.g:1015:2: ( rule__Record__MembersAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSetLang.g:1015:3: rule__Record__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Record__MembersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRecordAccess().getMembersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__5__Impl"


    // $ANTLR start "rule__Record__Group__6"
    // InternalSetLang.g:1023:1: rule__Record__Group__6 : rule__Record__Group__6__Impl ;
    public final void rule__Record__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1027:1: ( rule__Record__Group__6__Impl )
            // InternalSetLang.g:1028:2: rule__Record__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__6"


    // $ANTLR start "rule__Record__Group__6__Impl"
    // InternalSetLang.g:1034:1: rule__Record__Group__6__Impl : ( '}' ) ;
    public final void rule__Record__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1038:1: ( ( '}' ) )
            // InternalSetLang.g:1039:1: ( '}' )
            {
            // InternalSetLang.g:1039:1: ( '}' )
            // InternalSetLang.g:1040:2: '}'
            {
             before(grammarAccess.getRecordAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__6__Impl"


    // $ANTLR start "rule__Record__Group_2__0"
    // InternalSetLang.g:1050:1: rule__Record__Group_2__0 : rule__Record__Group_2__0__Impl rule__Record__Group_2__1 ;
    public final void rule__Record__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1054:1: ( rule__Record__Group_2__0__Impl rule__Record__Group_2__1 )
            // InternalSetLang.g:1055:2: rule__Record__Group_2__0__Impl rule__Record__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Record__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_2__0"


    // $ANTLR start "rule__Record__Group_2__0__Impl"
    // InternalSetLang.g:1062:1: rule__Record__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Record__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1066:1: ( ( ':' ) )
            // InternalSetLang.g:1067:1: ( ':' )
            {
            // InternalSetLang.g:1067:1: ( ':' )
            // InternalSetLang.g:1068:2: ':'
            {
             before(grammarAccess.getRecordAccess().getColonKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_2__0__Impl"


    // $ANTLR start "rule__Record__Group_2__1"
    // InternalSetLang.g:1077:1: rule__Record__Group_2__1 : rule__Record__Group_2__1__Impl ;
    public final void rule__Record__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1081:1: ( rule__Record__Group_2__1__Impl )
            // InternalSetLang.g:1082:2: rule__Record__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_2__1"


    // $ANTLR start "rule__Record__Group_2__1__Impl"
    // InternalSetLang.g:1088:1: rule__Record__Group_2__1__Impl : ( ( rule__Record__ParentAssignment_2_1 ) ) ;
    public final void rule__Record__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1092:1: ( ( ( rule__Record__ParentAssignment_2_1 ) ) )
            // InternalSetLang.g:1093:1: ( ( rule__Record__ParentAssignment_2_1 ) )
            {
            // InternalSetLang.g:1093:1: ( ( rule__Record__ParentAssignment_2_1 ) )
            // InternalSetLang.g:1094:2: ( rule__Record__ParentAssignment_2_1 )
            {
             before(grammarAccess.getRecordAccess().getParentAssignment_2_1()); 
            // InternalSetLang.g:1095:2: ( rule__Record__ParentAssignment_2_1 )
            // InternalSetLang.g:1095:3: rule__Record__ParentAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Record__ParentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getParentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_2__1__Impl"


    // $ANTLR start "rule__Record__Group_3__0"
    // InternalSetLang.g:1104:1: rule__Record__Group_3__0 : rule__Record__Group_3__0__Impl rule__Record__Group_3__1 ;
    public final void rule__Record__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1108:1: ( rule__Record__Group_3__0__Impl rule__Record__Group_3__1 )
            // InternalSetLang.g:1109:2: rule__Record__Group_3__0__Impl rule__Record__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Record__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__0"


    // $ANTLR start "rule__Record__Group_3__0__Impl"
    // InternalSetLang.g:1116:1: rule__Record__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Record__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1120:1: ( ( '(' ) )
            // InternalSetLang.g:1121:1: ( '(' )
            {
            // InternalSetLang.g:1121:1: ( '(' )
            // InternalSetLang.g:1122:2: '('
            {
             before(grammarAccess.getRecordAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__0__Impl"


    // $ANTLR start "rule__Record__Group_3__1"
    // InternalSetLang.g:1131:1: rule__Record__Group_3__1 : rule__Record__Group_3__1__Impl rule__Record__Group_3__2 ;
    public final void rule__Record__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1135:1: ( rule__Record__Group_3__1__Impl rule__Record__Group_3__2 )
            // InternalSetLang.g:1136:2: rule__Record__Group_3__1__Impl rule__Record__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__Record__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__1"


    // $ANTLR start "rule__Record__Group_3__1__Impl"
    // InternalSetLang.g:1143:1: rule__Record__Group_3__1__Impl : ( ( rule__Record__ParametersAssignment_3_1 ) ) ;
    public final void rule__Record__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1147:1: ( ( ( rule__Record__ParametersAssignment_3_1 ) ) )
            // InternalSetLang.g:1148:1: ( ( rule__Record__ParametersAssignment_3_1 ) )
            {
            // InternalSetLang.g:1148:1: ( ( rule__Record__ParametersAssignment_3_1 ) )
            // InternalSetLang.g:1149:2: ( rule__Record__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getRecordAccess().getParametersAssignment_3_1()); 
            // InternalSetLang.g:1150:2: ( rule__Record__ParametersAssignment_3_1 )
            // InternalSetLang.g:1150:3: rule__Record__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Record__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__1__Impl"


    // $ANTLR start "rule__Record__Group_3__2"
    // InternalSetLang.g:1158:1: rule__Record__Group_3__2 : rule__Record__Group_3__2__Impl rule__Record__Group_3__3 ;
    public final void rule__Record__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1162:1: ( rule__Record__Group_3__2__Impl rule__Record__Group_3__3 )
            // InternalSetLang.g:1163:2: rule__Record__Group_3__2__Impl rule__Record__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__Record__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__2"


    // $ANTLR start "rule__Record__Group_3__2__Impl"
    // InternalSetLang.g:1170:1: rule__Record__Group_3__2__Impl : ( ( rule__Record__Group_3_2__0 )* ) ;
    public final void rule__Record__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1174:1: ( ( ( rule__Record__Group_3_2__0 )* ) )
            // InternalSetLang.g:1175:1: ( ( rule__Record__Group_3_2__0 )* )
            {
            // InternalSetLang.g:1175:1: ( ( rule__Record__Group_3_2__0 )* )
            // InternalSetLang.g:1176:2: ( rule__Record__Group_3_2__0 )*
            {
             before(grammarAccess.getRecordAccess().getGroup_3_2()); 
            // InternalSetLang.g:1177:2: ( rule__Record__Group_3_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSetLang.g:1177:3: rule__Record__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Record__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRecordAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__2__Impl"


    // $ANTLR start "rule__Record__Group_3__3"
    // InternalSetLang.g:1185:1: rule__Record__Group_3__3 : rule__Record__Group_3__3__Impl ;
    public final void rule__Record__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1189:1: ( rule__Record__Group_3__3__Impl )
            // InternalSetLang.g:1190:2: rule__Record__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__3"


    // $ANTLR start "rule__Record__Group_3__3__Impl"
    // InternalSetLang.g:1196:1: rule__Record__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Record__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1200:1: ( ( ')' ) )
            // InternalSetLang.g:1201:1: ( ')' )
            {
            // InternalSetLang.g:1201:1: ( ')' )
            // InternalSetLang.g:1202:2: ')'
            {
             before(grammarAccess.getRecordAccess().getRightParenthesisKeyword_3_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3__3__Impl"


    // $ANTLR start "rule__Record__Group_3_2__0"
    // InternalSetLang.g:1212:1: rule__Record__Group_3_2__0 : rule__Record__Group_3_2__0__Impl rule__Record__Group_3_2__1 ;
    public final void rule__Record__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1216:1: ( rule__Record__Group_3_2__0__Impl rule__Record__Group_3_2__1 )
            // InternalSetLang.g:1217:2: rule__Record__Group_3_2__0__Impl rule__Record__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Record__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Record__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3_2__0"


    // $ANTLR start "rule__Record__Group_3_2__0__Impl"
    // InternalSetLang.g:1224:1: rule__Record__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Record__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1228:1: ( ( ',' ) )
            // InternalSetLang.g:1229:1: ( ',' )
            {
            // InternalSetLang.g:1229:1: ( ',' )
            // InternalSetLang.g:1230:2: ','
            {
             before(grammarAccess.getRecordAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3_2__0__Impl"


    // $ANTLR start "rule__Record__Group_3_2__1"
    // InternalSetLang.g:1239:1: rule__Record__Group_3_2__1 : rule__Record__Group_3_2__1__Impl ;
    public final void rule__Record__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1243:1: ( rule__Record__Group_3_2__1__Impl )
            // InternalSetLang.g:1244:2: rule__Record__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3_2__1"


    // $ANTLR start "rule__Record__Group_3_2__1__Impl"
    // InternalSetLang.g:1250:1: rule__Record__Group_3_2__1__Impl : ( ( rule__Record__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__Record__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1254:1: ( ( ( rule__Record__ParametersAssignment_3_2_1 ) ) )
            // InternalSetLang.g:1255:1: ( ( rule__Record__ParametersAssignment_3_2_1 ) )
            {
            // InternalSetLang.g:1255:1: ( ( rule__Record__ParametersAssignment_3_2_1 ) )
            // InternalSetLang.g:1256:2: ( rule__Record__ParametersAssignment_3_2_1 )
            {
             before(grammarAccess.getRecordAccess().getParametersAssignment_3_2_1()); 
            // InternalSetLang.g:1257:2: ( rule__Record__ParametersAssignment_3_2_1 )
            // InternalSetLang.g:1257:3: rule__Record__ParametersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Record__ParametersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccess().getParametersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group_3_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSetLang.g:1266:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1270:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSetLang.g:1271:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalSetLang.g:1278:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1282:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalSetLang.g:1283:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalSetLang.g:1283:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalSetLang.g:1284:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalSetLang.g:1285:2: ( rule__Parameter__NameAssignment_0 )
            // InternalSetLang.g:1285:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalSetLang.g:1293:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1297:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSetLang.g:1298:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalSetLang.g:1305:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1309:1: ( ( ':' ) )
            // InternalSetLang.g:1310:1: ( ':' )
            {
            // InternalSetLang.g:1310:1: ( ':' )
            // InternalSetLang.g:1311:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalSetLang.g:1320:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1324:1: ( rule__Parameter__Group__2__Impl )
            // InternalSetLang.g:1325:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalSetLang.g:1331:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1335:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalSetLang.g:1336:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalSetLang.g:1336:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalSetLang.g:1337:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalSetLang.g:1338:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalSetLang.g:1338:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalSetLang.g:1347:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1351:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalSetLang.g:1352:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalSetLang.g:1359:1: rule__Type__Group_2__0__Impl : ( 'Set' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1363:1: ( ( 'Set' ) )
            // InternalSetLang.g:1364:1: ( 'Set' )
            {
            // InternalSetLang.g:1364:1: ( 'Set' )
            // InternalSetLang.g:1365:2: 'Set'
            {
             before(grammarAccess.getTypeAccess().getSetKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSetKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalSetLang.g:1374:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1378:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalSetLang.g:1379:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Type__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalSetLang.g:1386:1: rule__Type__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1390:1: ( ( '(' ) )
            // InternalSetLang.g:1391:1: ( '(' )
            {
            // InternalSetLang.g:1391:1: ( '(' )
            // InternalSetLang.g:1392:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalSetLang.g:1401:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl rule__Type__Group_2__3 ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1405:1: ( rule__Type__Group_2__2__Impl rule__Type__Group_2__3 )
            // InternalSetLang.g:1406:2: rule__Type__Group_2__2__Impl rule__Type__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalSetLang.g:1413:1: rule__Type__Group_2__2__Impl : ( ruleType ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1417:1: ( ( ruleType ) )
            // InternalSetLang.g:1418:1: ( ruleType )
            {
            // InternalSetLang.g:1418:1: ( ruleType )
            // InternalSetLang.g:1419:2: ruleType
            {
             before(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_2()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group_2__3"
    // InternalSetLang.g:1428:1: rule__Type__Group_2__3 : rule__Type__Group_2__3__Impl ;
    public final void rule__Type__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1432:1: ( rule__Type__Group_2__3__Impl )
            // InternalSetLang.g:1433:2: rule__Type__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3"


    // $ANTLR start "rule__Type__Group_2__3__Impl"
    // InternalSetLang.g:1439:1: rule__Type__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1443:1: ( ( ')' ) )
            // InternalSetLang.g:1444:1: ( ')' )
            {
            // InternalSetLang.g:1444:1: ( ')' )
            // InternalSetLang.g:1445:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__3__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalSetLang.g:1455:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1459:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalSetLang.g:1460:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // InternalSetLang.g:1467:1: rule__Member__Group__0__Impl : ( ( rule__Member__NameAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1471:1: ( ( ( rule__Member__NameAssignment_0 ) ) )
            // InternalSetLang.g:1472:1: ( ( rule__Member__NameAssignment_0 ) )
            {
            // InternalSetLang.g:1472:1: ( ( rule__Member__NameAssignment_0 ) )
            // InternalSetLang.g:1473:2: ( rule__Member__NameAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_0()); 
            // InternalSetLang.g:1474:2: ( rule__Member__NameAssignment_0 )
            // InternalSetLang.g:1474:3: rule__Member__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // InternalSetLang.g:1482:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1486:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalSetLang.g:1487:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // InternalSetLang.g:1494:1: rule__Member__Group__1__Impl : ( ':' ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1498:1: ( ( ':' ) )
            // InternalSetLang.g:1499:1: ( ':' )
            {
            // InternalSetLang.g:1499:1: ( ':' )
            // InternalSetLang.g:1500:2: ':'
            {
             before(grammarAccess.getMemberAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // InternalSetLang.g:1509:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1513:1: ( rule__Member__Group__2__Impl )
            // InternalSetLang.g:1514:2: rule__Member__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // InternalSetLang.g:1520:1: rule__Member__Group__2__Impl : ( ( rule__Member__ExpAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1524:1: ( ( ( rule__Member__ExpAssignment_2 ) ) )
            // InternalSetLang.g:1525:1: ( ( rule__Member__ExpAssignment_2 ) )
            {
            // InternalSetLang.g:1525:1: ( ( rule__Member__ExpAssignment_2 ) )
            // InternalSetLang.g:1526:2: ( rule__Member__ExpAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getExpAssignment_2()); 
            // InternalSetLang.g:1527:2: ( rule__Member__ExpAssignment_2 )
            // InternalSetLang.g:1527:3: rule__Member__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Member__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__Compute__Group__0"
    // InternalSetLang.g:1536:1: rule__Compute__Group__0 : rule__Compute__Group__0__Impl rule__Compute__Group__1 ;
    public final void rule__Compute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1540:1: ( rule__Compute__Group__0__Impl rule__Compute__Group__1 )
            // InternalSetLang.g:1541:2: rule__Compute__Group__0__Impl rule__Compute__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Compute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compute__Group__0"


    // $ANTLR start "rule__Compute__Group__0__Impl"
    // InternalSetLang.g:1548:1: rule__Compute__Group__0__Impl : ( 'compute' ) ;
    public final void rule__Compute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1552:1: ( ( 'compute' ) )
            // InternalSetLang.g:1553:1: ( 'compute' )
            {
            // InternalSetLang.g:1553:1: ( 'compute' )
            // InternalSetLang.g:1554:2: 'compute'
            {
             before(grammarAccess.getComputeAccess().getComputeKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComputeAccess().getComputeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compute__Group__0__Impl"


    // $ANTLR start "rule__Compute__Group__1"
    // InternalSetLang.g:1563:1: rule__Compute__Group__1 : rule__Compute__Group__1__Impl ;
    public final void rule__Compute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1567:1: ( rule__Compute__Group__1__Impl )
            // InternalSetLang.g:1568:2: rule__Compute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compute__Group__1"


    // $ANTLR start "rule__Compute__Group__1__Impl"
    // InternalSetLang.g:1574:1: rule__Compute__Group__1__Impl : ( ( rule__Compute__ExpAssignment_1 ) ) ;
    public final void rule__Compute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1578:1: ( ( ( rule__Compute__ExpAssignment_1 ) ) )
            // InternalSetLang.g:1579:1: ( ( rule__Compute__ExpAssignment_1 ) )
            {
            // InternalSetLang.g:1579:1: ( ( rule__Compute__ExpAssignment_1 ) )
            // InternalSetLang.g:1580:2: ( rule__Compute__ExpAssignment_1 )
            {
             before(grammarAccess.getComputeAccess().getExpAssignment_1()); 
            // InternalSetLang.g:1581:2: ( rule__Compute__ExpAssignment_1 )
            // InternalSetLang.g:1581:3: rule__Compute__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compute__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComputeAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compute__Group__1__Impl"


    // $ANTLR start "rule__UnionIntersection__Group__0"
    // InternalSetLang.g:1590:1: rule__UnionIntersection__Group__0 : rule__UnionIntersection__Group__0__Impl rule__UnionIntersection__Group__1 ;
    public final void rule__UnionIntersection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1594:1: ( rule__UnionIntersection__Group__0__Impl rule__UnionIntersection__Group__1 )
            // InternalSetLang.g:1595:2: rule__UnionIntersection__Group__0__Impl rule__UnionIntersection__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__UnionIntersection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group__0"


    // $ANTLR start "rule__UnionIntersection__Group__0__Impl"
    // InternalSetLang.g:1602:1: rule__UnionIntersection__Group__0__Impl : ( ruleProduct ) ;
    public final void rule__UnionIntersection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1606:1: ( ( ruleProduct ) )
            // InternalSetLang.g:1607:1: ( ruleProduct )
            {
            // InternalSetLang.g:1607:1: ( ruleProduct )
            // InternalSetLang.g:1608:2: ruleProduct
            {
             before(grammarAccess.getUnionIntersectionAccess().getProductParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getUnionIntersectionAccess().getProductParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group__0__Impl"


    // $ANTLR start "rule__UnionIntersection__Group__1"
    // InternalSetLang.g:1617:1: rule__UnionIntersection__Group__1 : rule__UnionIntersection__Group__1__Impl ;
    public final void rule__UnionIntersection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1621:1: ( rule__UnionIntersection__Group__1__Impl )
            // InternalSetLang.g:1622:2: rule__UnionIntersection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group__1"


    // $ANTLR start "rule__UnionIntersection__Group__1__Impl"
    // InternalSetLang.g:1628:1: rule__UnionIntersection__Group__1__Impl : ( ( rule__UnionIntersection__Group_1__0 )* ) ;
    public final void rule__UnionIntersection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1632:1: ( ( ( rule__UnionIntersection__Group_1__0 )* ) )
            // InternalSetLang.g:1633:1: ( ( rule__UnionIntersection__Group_1__0 )* )
            {
            // InternalSetLang.g:1633:1: ( ( rule__UnionIntersection__Group_1__0 )* )
            // InternalSetLang.g:1634:2: ( rule__UnionIntersection__Group_1__0 )*
            {
             before(grammarAccess.getUnionIntersectionAccess().getGroup_1()); 
            // InternalSetLang.g:1635:2: ( rule__UnionIntersection__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSetLang.g:1635:3: rule__UnionIntersection__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UnionIntersection__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getUnionIntersectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group__1__Impl"


    // $ANTLR start "rule__UnionIntersection__Group_1__0"
    // InternalSetLang.g:1644:1: rule__UnionIntersection__Group_1__0 : rule__UnionIntersection__Group_1__0__Impl rule__UnionIntersection__Group_1__1 ;
    public final void rule__UnionIntersection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1648:1: ( rule__UnionIntersection__Group_1__0__Impl rule__UnionIntersection__Group_1__1 )
            // InternalSetLang.g:1649:2: rule__UnionIntersection__Group_1__0__Impl rule__UnionIntersection__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__UnionIntersection__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1__0"


    // $ANTLR start "rule__UnionIntersection__Group_1__0__Impl"
    // InternalSetLang.g:1656:1: rule__UnionIntersection__Group_1__0__Impl : ( ( rule__UnionIntersection__Alternatives_1_0 ) ) ;
    public final void rule__UnionIntersection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1660:1: ( ( ( rule__UnionIntersection__Alternatives_1_0 ) ) )
            // InternalSetLang.g:1661:1: ( ( rule__UnionIntersection__Alternatives_1_0 ) )
            {
            // InternalSetLang.g:1661:1: ( ( rule__UnionIntersection__Alternatives_1_0 ) )
            // InternalSetLang.g:1662:2: ( rule__UnionIntersection__Alternatives_1_0 )
            {
             before(grammarAccess.getUnionIntersectionAccess().getAlternatives_1_0()); 
            // InternalSetLang.g:1663:2: ( rule__UnionIntersection__Alternatives_1_0 )
            // InternalSetLang.g:1663:3: rule__UnionIntersection__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnionIntersectionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1__0__Impl"


    // $ANTLR start "rule__UnionIntersection__Group_1__1"
    // InternalSetLang.g:1671:1: rule__UnionIntersection__Group_1__1 : rule__UnionIntersection__Group_1__1__Impl ;
    public final void rule__UnionIntersection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1675:1: ( rule__UnionIntersection__Group_1__1__Impl )
            // InternalSetLang.g:1676:2: rule__UnionIntersection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1__1"


    // $ANTLR start "rule__UnionIntersection__Group_1__1__Impl"
    // InternalSetLang.g:1682:1: rule__UnionIntersection__Group_1__1__Impl : ( ( rule__UnionIntersection__RightAssignment_1_1 ) ) ;
    public final void rule__UnionIntersection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1686:1: ( ( ( rule__UnionIntersection__RightAssignment_1_1 ) ) )
            // InternalSetLang.g:1687:1: ( ( rule__UnionIntersection__RightAssignment_1_1 ) )
            {
            // InternalSetLang.g:1687:1: ( ( rule__UnionIntersection__RightAssignment_1_1 ) )
            // InternalSetLang.g:1688:2: ( rule__UnionIntersection__RightAssignment_1_1 )
            {
             before(grammarAccess.getUnionIntersectionAccess().getRightAssignment_1_1()); 
            // InternalSetLang.g:1689:2: ( rule__UnionIntersection__RightAssignment_1_1 )
            // InternalSetLang.g:1689:3: rule__UnionIntersection__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionIntersection__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionIntersectionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1__1__Impl"


    // $ANTLR start "rule__UnionIntersection__Group_1_0_0__0"
    // InternalSetLang.g:1698:1: rule__UnionIntersection__Group_1_0_0__0 : rule__UnionIntersection__Group_1_0_0__0__Impl rule__UnionIntersection__Group_1_0_0__1 ;
    public final void rule__UnionIntersection__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1702:1: ( rule__UnionIntersection__Group_1_0_0__0__Impl rule__UnionIntersection__Group_1_0_0__1 )
            // InternalSetLang.g:1703:2: rule__UnionIntersection__Group_1_0_0__0__Impl rule__UnionIntersection__Group_1_0_0__1
            {
            pushFollow(FOLLOW_20);
            rule__UnionIntersection__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1_0_0__0"


    // $ANTLR start "rule__UnionIntersection__Group_1_0_0__0__Impl"
    // InternalSetLang.g:1710:1: rule__UnionIntersection__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__UnionIntersection__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1714:1: ( ( () ) )
            // InternalSetLang.g:1715:1: ( () )
            {
            // InternalSetLang.g:1715:1: ( () )
            // InternalSetLang.g:1716:2: ()
            {
             before(grammarAccess.getUnionIntersectionAccess().getUnionLeftAction_1_0_0_0()); 
            // InternalSetLang.g:1717:2: ()
            // InternalSetLang.g:1717:3: 
            {
            }

             after(grammarAccess.getUnionIntersectionAccess().getUnionLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__UnionIntersection__Group_1_0_0__1"
    // InternalSetLang.g:1725:1: rule__UnionIntersection__Group_1_0_0__1 : rule__UnionIntersection__Group_1_0_0__1__Impl ;
    public final void rule__UnionIntersection__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1729:1: ( rule__UnionIntersection__Group_1_0_0__1__Impl )
            // InternalSetLang.g:1730:2: rule__UnionIntersection__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1_0_0__1"


    // $ANTLR start "rule__UnionIntersection__Group_1_0_0__1__Impl"
    // InternalSetLang.g:1736:1: rule__UnionIntersection__Group_1_0_0__1__Impl : ( 'U' ) ;
    public final void rule__UnionIntersection__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1740:1: ( ( 'U' ) )
            // InternalSetLang.g:1741:1: ( 'U' )
            {
            // InternalSetLang.g:1741:1: ( 'U' )
            // InternalSetLang.g:1742:2: 'U'
            {
             before(grammarAccess.getUnionIntersectionAccess().getUKeyword_1_0_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUnionIntersectionAccess().getUKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__UnionIntersection__Group_1_0_1__0"
    // InternalSetLang.g:1752:1: rule__UnionIntersection__Group_1_0_1__0 : rule__UnionIntersection__Group_1_0_1__0__Impl rule__UnionIntersection__Group_1_0_1__1 ;
    public final void rule__UnionIntersection__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1756:1: ( rule__UnionIntersection__Group_1_0_1__0__Impl rule__UnionIntersection__Group_1_0_1__1 )
            // InternalSetLang.g:1757:2: rule__UnionIntersection__Group_1_0_1__0__Impl rule__UnionIntersection__Group_1_0_1__1
            {
            pushFollow(FOLLOW_18);
            rule__UnionIntersection__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1_0_1__0"


    // $ANTLR start "rule__UnionIntersection__Group_1_0_1__0__Impl"
    // InternalSetLang.g:1764:1: rule__UnionIntersection__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__UnionIntersection__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1768:1: ( ( () ) )
            // InternalSetLang.g:1769:1: ( () )
            {
            // InternalSetLang.g:1769:1: ( () )
            // InternalSetLang.g:1770:2: ()
            {
             before(grammarAccess.getUnionIntersectionAccess().getIntersectionLeftAction_1_0_1_0()); 
            // InternalSetLang.g:1771:2: ()
            // InternalSetLang.g:1771:3: 
            {
            }

             after(grammarAccess.getUnionIntersectionAccess().getIntersectionLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__UnionIntersection__Group_1_0_1__1"
    // InternalSetLang.g:1779:1: rule__UnionIntersection__Group_1_0_1__1 : rule__UnionIntersection__Group_1_0_1__1__Impl ;
    public final void rule__UnionIntersection__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1783:1: ( rule__UnionIntersection__Group_1_0_1__1__Impl )
            // InternalSetLang.g:1784:2: rule__UnionIntersection__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionIntersection__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1_0_1__1"


    // $ANTLR start "rule__UnionIntersection__Group_1_0_1__1__Impl"
    // InternalSetLang.g:1790:1: rule__UnionIntersection__Group_1_0_1__1__Impl : ( '&' ) ;
    public final void rule__UnionIntersection__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1794:1: ( ( '&' ) )
            // InternalSetLang.g:1795:1: ( '&' )
            {
            // InternalSetLang.g:1795:1: ( '&' )
            // InternalSetLang.g:1796:2: '&'
            {
             before(grammarAccess.getUnionIntersectionAccess().getAmpersandKeyword_1_0_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUnionIntersectionAccess().getAmpersandKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Product__Group__0"
    // InternalSetLang.g:1806:1: rule__Product__Group__0 : rule__Product__Group__0__Impl rule__Product__Group__1 ;
    public final void rule__Product__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1810:1: ( rule__Product__Group__0__Impl rule__Product__Group__1 )
            // InternalSetLang.g:1811:2: rule__Product__Group__0__Impl rule__Product__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Product__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Product__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__0"


    // $ANTLR start "rule__Product__Group__0__Impl"
    // InternalSetLang.g:1818:1: rule__Product__Group__0__Impl : ( ruleProjectionFilter ) ;
    public final void rule__Product__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1822:1: ( ( ruleProjectionFilter ) )
            // InternalSetLang.g:1823:1: ( ruleProjectionFilter )
            {
            // InternalSetLang.g:1823:1: ( ruleProjectionFilter )
            // InternalSetLang.g:1824:2: ruleProjectionFilter
            {
             before(grammarAccess.getProductAccess().getProjectionFilterParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectionFilter();

            state._fsp--;

             after(grammarAccess.getProductAccess().getProjectionFilterParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__0__Impl"


    // $ANTLR start "rule__Product__Group__1"
    // InternalSetLang.g:1833:1: rule__Product__Group__1 : rule__Product__Group__1__Impl ;
    public final void rule__Product__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1837:1: ( rule__Product__Group__1__Impl )
            // InternalSetLang.g:1838:2: rule__Product__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Product__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__1"


    // $ANTLR start "rule__Product__Group__1__Impl"
    // InternalSetLang.g:1844:1: rule__Product__Group__1__Impl : ( ( rule__Product__Group_1__0 )* ) ;
    public final void rule__Product__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1848:1: ( ( ( rule__Product__Group_1__0 )* ) )
            // InternalSetLang.g:1849:1: ( ( rule__Product__Group_1__0 )* )
            {
            // InternalSetLang.g:1849:1: ( ( rule__Product__Group_1__0 )* )
            // InternalSetLang.g:1850:2: ( rule__Product__Group_1__0 )*
            {
             before(grammarAccess.getProductAccess().getGroup_1()); 
            // InternalSetLang.g:1851:2: ( rule__Product__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSetLang.g:1851:3: rule__Product__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Product__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProductAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__1__Impl"


    // $ANTLR start "rule__Product__Group_1__0"
    // InternalSetLang.g:1860:1: rule__Product__Group_1__0 : rule__Product__Group_1__0__Impl rule__Product__Group_1__1 ;
    public final void rule__Product__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1864:1: ( rule__Product__Group_1__0__Impl rule__Product__Group_1__1 )
            // InternalSetLang.g:1865:2: rule__Product__Group_1__0__Impl rule__Product__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Product__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Product__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group_1__0"


    // $ANTLR start "rule__Product__Group_1__0__Impl"
    // InternalSetLang.g:1872:1: rule__Product__Group_1__0__Impl : ( ( rule__Product__Group_1_0__0 ) ) ;
    public final void rule__Product__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1876:1: ( ( ( rule__Product__Group_1_0__0 ) ) )
            // InternalSetLang.g:1877:1: ( ( rule__Product__Group_1_0__0 ) )
            {
            // InternalSetLang.g:1877:1: ( ( rule__Product__Group_1_0__0 ) )
            // InternalSetLang.g:1878:2: ( rule__Product__Group_1_0__0 )
            {
             before(grammarAccess.getProductAccess().getGroup_1_0()); 
            // InternalSetLang.g:1879:2: ( rule__Product__Group_1_0__0 )
            // InternalSetLang.g:1879:3: rule__Product__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Product__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group_1__0__Impl"


    // $ANTLR start "rule__Product__Group_1__1"
    // InternalSetLang.g:1887:1: rule__Product__Group_1__1 : rule__Product__Group_1__1__Impl ;
    public final void rule__Product__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1891:1: ( rule__Product__Group_1__1__Impl )
            // InternalSetLang.g:1892:2: rule__Product__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Product__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group_1__1"


    // $ANTLR start "rule__Product__Group_1__1__Impl"
    // InternalSetLang.g:1898:1: rule__Product__Group_1__1__Impl : ( ( rule__Product__RightAssignment_1_1 ) ) ;
    public final void rule__Product__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1902:1: ( ( ( rule__Product__RightAssignment_1_1 ) ) )
            // InternalSetLang.g:1903:1: ( ( rule__Product__RightAssignment_1_1 ) )
            {
            // InternalSetLang.g:1903:1: ( ( rule__Product__RightAssignment_1_1 ) )
            // InternalSetLang.g:1904:2: ( rule__Product__RightAssignment_1_1 )
            {
             before(grammarAccess.getProductAccess().getRightAssignment_1_1()); 
            // InternalSetLang.g:1905:2: ( rule__Product__RightAssignment_1_1 )
            // InternalSetLang.g:1905:3: rule__Product__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Product__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group_1__1__Impl"


    // $ANTLR start "rule__Product__Group_1_0__0"
    // InternalSetLang.g:1914:1: rule__Product__Group_1_0__0 : rule__Product__Group_1_0__0__Impl rule__Product__Group_1_0__1 ;
    public final void rule__Product__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1918:1: ( rule__Product__Group_1_0__0__Impl rule__Product__Group_1_0__1 )
            // InternalSetLang.g:1919:2: rule__Product__Group_1_0__0__Impl rule__Product__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Product__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Product__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group_1_0__0"


    // $ANTLR start "rule__Product__Group_1_0__0__Impl"
    // InternalSetLang.g:1926:1: rule__Product__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Product__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1930:1: ( ( () ) )
            // InternalSetLang.g:1931:1: ( () )
            {
            // InternalSetLang.g:1931:1: ( () )
            // InternalSetLang.g:1932:2: ()
            {
             before(grammarAccess.getProductAccess().getProductLeftAction_1_0_0()); 
            // InternalSetLang.g:1933:2: ()
            // InternalSetLang.g:1933:3: 
            {
            }

             after(grammarAccess.getProductAccess().getProductLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group_1_0__0__Impl"


    // $ANTLR start "rule__Product__Group_1_0__1"
    // InternalSetLang.g:1941:1: rule__Product__Group_1_0__1 : rule__Product__Group_1_0__1__Impl ;
    public final void rule__Product__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1945:1: ( rule__Product__Group_1_0__1__Impl )
            // InternalSetLang.g:1946:2: rule__Product__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Product__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group_1_0__1"


    // $ANTLR start "rule__Product__Group_1_0__1__Impl"
    // InternalSetLang.g:1952:1: rule__Product__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Product__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1956:1: ( ( '*' ) )
            // InternalSetLang.g:1957:1: ( '*' )
            {
            // InternalSetLang.g:1957:1: ( '*' )
            // InternalSetLang.g:1958:2: '*'
            {
             before(grammarAccess.getProductAccess().getAsteriskKeyword_1_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProductAccess().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group_1_0__1__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group__0"
    // InternalSetLang.g:1968:1: rule__ProjectionFilter__Group__0 : rule__ProjectionFilter__Group__0__Impl rule__ProjectionFilter__Group__1 ;
    public final void rule__ProjectionFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1972:1: ( rule__ProjectionFilter__Group__0__Impl rule__ProjectionFilter__Group__1 )
            // InternalSetLang.g:1973:2: rule__ProjectionFilter__Group__0__Impl rule__ProjectionFilter__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ProjectionFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group__0"


    // $ANTLR start "rule__ProjectionFilter__Group__0__Impl"
    // InternalSetLang.g:1980:1: rule__ProjectionFilter__Group__0__Impl : ( rulePrimitive ) ;
    public final void rule__ProjectionFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1984:1: ( ( rulePrimitive ) )
            // InternalSetLang.g:1985:1: ( rulePrimitive )
            {
            // InternalSetLang.g:1985:1: ( rulePrimitive )
            // InternalSetLang.g:1986:2: rulePrimitive
            {
             before(grammarAccess.getProjectionFilterAccess().getPrimitiveParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getProjectionFilterAccess().getPrimitiveParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group__0__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group__1"
    // InternalSetLang.g:1995:1: rule__ProjectionFilter__Group__1 : rule__ProjectionFilter__Group__1__Impl ;
    public final void rule__ProjectionFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:1999:1: ( rule__ProjectionFilter__Group__1__Impl )
            // InternalSetLang.g:2000:2: rule__ProjectionFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group__1"


    // $ANTLR start "rule__ProjectionFilter__Group__1__Impl"
    // InternalSetLang.g:2006:1: rule__ProjectionFilter__Group__1__Impl : ( ( rule__ProjectionFilter__Group_1__0 )? ) ;
    public final void rule__ProjectionFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2010:1: ( ( ( rule__ProjectionFilter__Group_1__0 )? ) )
            // InternalSetLang.g:2011:1: ( ( rule__ProjectionFilter__Group_1__0 )? )
            {
            // InternalSetLang.g:2011:1: ( ( rule__ProjectionFilter__Group_1__0 )? )
            // InternalSetLang.g:2012:2: ( rule__ProjectionFilter__Group_1__0 )?
            {
             before(grammarAccess.getProjectionFilterAccess().getGroup_1()); 
            // InternalSetLang.g:2013:2: ( rule__ProjectionFilter__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSetLang.g:2013:3: rule__ProjectionFilter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectionFilter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectionFilterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group__1__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1__0"
    // InternalSetLang.g:2022:1: rule__ProjectionFilter__Group_1__0 : rule__ProjectionFilter__Group_1__0__Impl rule__ProjectionFilter__Group_1__1 ;
    public final void rule__ProjectionFilter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2026:1: ( rule__ProjectionFilter__Group_1__0__Impl rule__ProjectionFilter__Group_1__1 )
            // InternalSetLang.g:2027:2: rule__ProjectionFilter__Group_1__0__Impl rule__ProjectionFilter__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__ProjectionFilter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1__0"


    // $ANTLR start "rule__ProjectionFilter__Group_1__0__Impl"
    // InternalSetLang.g:2034:1: rule__ProjectionFilter__Group_1__0__Impl : ( '#' ) ;
    public final void rule__ProjectionFilter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2038:1: ( ( '#' ) )
            // InternalSetLang.g:2039:1: ( '#' )
            {
            // InternalSetLang.g:2039:1: ( '#' )
            // InternalSetLang.g:2040:2: '#'
            {
             before(grammarAccess.getProjectionFilterAccess().getNumberSignKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getNumberSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1__0__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1__1"
    // InternalSetLang.g:2049:1: rule__ProjectionFilter__Group_1__1 : rule__ProjectionFilter__Group_1__1__Impl ;
    public final void rule__ProjectionFilter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2053:1: ( rule__ProjectionFilter__Group_1__1__Impl )
            // InternalSetLang.g:2054:2: rule__ProjectionFilter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1__1"


    // $ANTLR start "rule__ProjectionFilter__Group_1__1__Impl"
    // InternalSetLang.g:2060:1: rule__ProjectionFilter__Group_1__1__Impl : ( ( rule__ProjectionFilter__Alternatives_1_1 ) ) ;
    public final void rule__ProjectionFilter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2064:1: ( ( ( rule__ProjectionFilter__Alternatives_1_1 ) ) )
            // InternalSetLang.g:2065:1: ( ( rule__ProjectionFilter__Alternatives_1_1 ) )
            {
            // InternalSetLang.g:2065:1: ( ( rule__ProjectionFilter__Alternatives_1_1 ) )
            // InternalSetLang.g:2066:2: ( rule__ProjectionFilter__Alternatives_1_1 )
            {
             before(grammarAccess.getProjectionFilterAccess().getAlternatives_1_1()); 
            // InternalSetLang.g:2067:2: ( rule__ProjectionFilter__Alternatives_1_1 )
            // InternalSetLang.g:2067:3: rule__ProjectionFilter__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectionFilterAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1__1__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__0"
    // InternalSetLang.g:2076:1: rule__ProjectionFilter__Group_1_1_0__0 : rule__ProjectionFilter__Group_1_1_0__0__Impl rule__ProjectionFilter__Group_1_1_0__1 ;
    public final void rule__ProjectionFilter__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2080:1: ( rule__ProjectionFilter__Group_1_1_0__0__Impl rule__ProjectionFilter__Group_1_1_0__1 )
            // InternalSetLang.g:2081:2: rule__ProjectionFilter__Group_1_1_0__0__Impl rule__ProjectionFilter__Group_1_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__ProjectionFilter__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__0"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__0__Impl"
    // InternalSetLang.g:2088:1: rule__ProjectionFilter__Group_1_1_0__0__Impl : ( () ) ;
    public final void rule__ProjectionFilter__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2092:1: ( ( () ) )
            // InternalSetLang.g:2093:1: ( () )
            {
            // InternalSetLang.g:2093:1: ( () )
            // InternalSetLang.g:2094:2: ()
            {
             before(grammarAccess.getProjectionFilterAccess().getProjectionOpAction_1_1_0_0()); 
            // InternalSetLang.g:2095:2: ()
            // InternalSetLang.g:2095:3: 
            {
            }

             after(grammarAccess.getProjectionFilterAccess().getProjectionOpAction_1_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__1"
    // InternalSetLang.g:2103:1: rule__ProjectionFilter__Group_1_1_0__1 : rule__ProjectionFilter__Group_1_1_0__1__Impl rule__ProjectionFilter__Group_1_1_0__2 ;
    public final void rule__ProjectionFilter__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2107:1: ( rule__ProjectionFilter__Group_1_1_0__1__Impl rule__ProjectionFilter__Group_1_1_0__2 )
            // InternalSetLang.g:2108:2: rule__ProjectionFilter__Group_1_1_0__1__Impl rule__ProjectionFilter__Group_1_1_0__2
            {
            pushFollow(FOLLOW_26);
            rule__ProjectionFilter__Group_1_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__1"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__1__Impl"
    // InternalSetLang.g:2115:1: rule__ProjectionFilter__Group_1_1_0__1__Impl : ( '<' ) ;
    public final void rule__ProjectionFilter__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2119:1: ( ( '<' ) )
            // InternalSetLang.g:2120:1: ( '<' )
            {
            // InternalSetLang.g:2120:1: ( '<' )
            // InternalSetLang.g:2121:2: '<'
            {
             before(grammarAccess.getProjectionFilterAccess().getLessThanSignKeyword_1_1_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getLessThanSignKeyword_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__2"
    // InternalSetLang.g:2130:1: rule__ProjectionFilter__Group_1_1_0__2 : rule__ProjectionFilter__Group_1_1_0__2__Impl rule__ProjectionFilter__Group_1_1_0__3 ;
    public final void rule__ProjectionFilter__Group_1_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2134:1: ( rule__ProjectionFilter__Group_1_1_0__2__Impl rule__ProjectionFilter__Group_1_1_0__3 )
            // InternalSetLang.g:2135:2: rule__ProjectionFilter__Group_1_1_0__2__Impl rule__ProjectionFilter__Group_1_1_0__3
            {
            pushFollow(FOLLOW_27);
            rule__ProjectionFilter__Group_1_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__2"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__2__Impl"
    // InternalSetLang.g:2142:1: rule__ProjectionFilter__Group_1_1_0__2__Impl : ( ( rule__ProjectionFilter__IndicesAssignment_1_1_0_2 ) ) ;
    public final void rule__ProjectionFilter__Group_1_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2146:1: ( ( ( rule__ProjectionFilter__IndicesAssignment_1_1_0_2 ) ) )
            // InternalSetLang.g:2147:1: ( ( rule__ProjectionFilter__IndicesAssignment_1_1_0_2 ) )
            {
            // InternalSetLang.g:2147:1: ( ( rule__ProjectionFilter__IndicesAssignment_1_1_0_2 ) )
            // InternalSetLang.g:2148:2: ( rule__ProjectionFilter__IndicesAssignment_1_1_0_2 )
            {
             before(grammarAccess.getProjectionFilterAccess().getIndicesAssignment_1_1_0_2()); 
            // InternalSetLang.g:2149:2: ( rule__ProjectionFilter__IndicesAssignment_1_1_0_2 )
            // InternalSetLang.g:2149:3: rule__ProjectionFilter__IndicesAssignment_1_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__IndicesAssignment_1_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectionFilterAccess().getIndicesAssignment_1_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__2__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__3"
    // InternalSetLang.g:2157:1: rule__ProjectionFilter__Group_1_1_0__3 : rule__ProjectionFilter__Group_1_1_0__3__Impl rule__ProjectionFilter__Group_1_1_0__4 ;
    public final void rule__ProjectionFilter__Group_1_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2161:1: ( rule__ProjectionFilter__Group_1_1_0__3__Impl rule__ProjectionFilter__Group_1_1_0__4 )
            // InternalSetLang.g:2162:2: rule__ProjectionFilter__Group_1_1_0__3__Impl rule__ProjectionFilter__Group_1_1_0__4
            {
            pushFollow(FOLLOW_27);
            rule__ProjectionFilter__Group_1_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__3"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__3__Impl"
    // InternalSetLang.g:2169:1: rule__ProjectionFilter__Group_1_1_0__3__Impl : ( ( rule__ProjectionFilter__Group_1_1_0_3__0 )* ) ;
    public final void rule__ProjectionFilter__Group_1_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2173:1: ( ( ( rule__ProjectionFilter__Group_1_1_0_3__0 )* ) )
            // InternalSetLang.g:2174:1: ( ( rule__ProjectionFilter__Group_1_1_0_3__0 )* )
            {
            // InternalSetLang.g:2174:1: ( ( rule__ProjectionFilter__Group_1_1_0_3__0 )* )
            // InternalSetLang.g:2175:2: ( rule__ProjectionFilter__Group_1_1_0_3__0 )*
            {
             before(grammarAccess.getProjectionFilterAccess().getGroup_1_1_0_3()); 
            // InternalSetLang.g:2176:2: ( rule__ProjectionFilter__Group_1_1_0_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSetLang.g:2176:3: rule__ProjectionFilter__Group_1_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ProjectionFilter__Group_1_1_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProjectionFilterAccess().getGroup_1_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__3__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__4"
    // InternalSetLang.g:2184:1: rule__ProjectionFilter__Group_1_1_0__4 : rule__ProjectionFilter__Group_1_1_0__4__Impl ;
    public final void rule__ProjectionFilter__Group_1_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2188:1: ( rule__ProjectionFilter__Group_1_1_0__4__Impl )
            // InternalSetLang.g:2189:2: rule__ProjectionFilter__Group_1_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__4"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0__4__Impl"
    // InternalSetLang.g:2195:1: rule__ProjectionFilter__Group_1_1_0__4__Impl : ( '>' ) ;
    public final void rule__ProjectionFilter__Group_1_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2199:1: ( ( '>' ) )
            // InternalSetLang.g:2200:1: ( '>' )
            {
            // InternalSetLang.g:2200:1: ( '>' )
            // InternalSetLang.g:2201:2: '>'
            {
             before(grammarAccess.getProjectionFilterAccess().getGreaterThanSignKeyword_1_1_0_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getGreaterThanSignKeyword_1_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0__4__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0_3__0"
    // InternalSetLang.g:2211:1: rule__ProjectionFilter__Group_1_1_0_3__0 : rule__ProjectionFilter__Group_1_1_0_3__0__Impl rule__ProjectionFilter__Group_1_1_0_3__1 ;
    public final void rule__ProjectionFilter__Group_1_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2215:1: ( rule__ProjectionFilter__Group_1_1_0_3__0__Impl rule__ProjectionFilter__Group_1_1_0_3__1 )
            // InternalSetLang.g:2216:2: rule__ProjectionFilter__Group_1_1_0_3__0__Impl rule__ProjectionFilter__Group_1_1_0_3__1
            {
            pushFollow(FOLLOW_26);
            rule__ProjectionFilter__Group_1_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0_3__0"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0_3__0__Impl"
    // InternalSetLang.g:2223:1: rule__ProjectionFilter__Group_1_1_0_3__0__Impl : ( ',' ) ;
    public final void rule__ProjectionFilter__Group_1_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2227:1: ( ( ',' ) )
            // InternalSetLang.g:2228:1: ( ',' )
            {
            // InternalSetLang.g:2228:1: ( ',' )
            // InternalSetLang.g:2229:2: ','
            {
             before(grammarAccess.getProjectionFilterAccess().getCommaKeyword_1_1_0_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getCommaKeyword_1_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0_3__0__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0_3__1"
    // InternalSetLang.g:2238:1: rule__ProjectionFilter__Group_1_1_0_3__1 : rule__ProjectionFilter__Group_1_1_0_3__1__Impl ;
    public final void rule__ProjectionFilter__Group_1_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2242:1: ( rule__ProjectionFilter__Group_1_1_0_3__1__Impl )
            // InternalSetLang.g:2243:2: rule__ProjectionFilter__Group_1_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0_3__1"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_0_3__1__Impl"
    // InternalSetLang.g:2249:1: rule__ProjectionFilter__Group_1_1_0_3__1__Impl : ( ( rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1 ) ) ;
    public final void rule__ProjectionFilter__Group_1_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2253:1: ( ( ( rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1 ) ) )
            // InternalSetLang.g:2254:1: ( ( rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1 ) )
            {
            // InternalSetLang.g:2254:1: ( ( rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1 ) )
            // InternalSetLang.g:2255:2: ( rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1 )
            {
             before(grammarAccess.getProjectionFilterAccess().getIndicesAssignment_1_1_0_3_1()); 
            // InternalSetLang.g:2256:2: ( rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1 )
            // InternalSetLang.g:2256:3: rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectionFilterAccess().getIndicesAssignment_1_1_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_0_3__1__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_1__0"
    // InternalSetLang.g:2265:1: rule__ProjectionFilter__Group_1_1_1__0 : rule__ProjectionFilter__Group_1_1_1__0__Impl rule__ProjectionFilter__Group_1_1_1__1 ;
    public final void rule__ProjectionFilter__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2269:1: ( rule__ProjectionFilter__Group_1_1_1__0__Impl rule__ProjectionFilter__Group_1_1_1__1 )
            // InternalSetLang.g:2270:2: rule__ProjectionFilter__Group_1_1_1__0__Impl rule__ProjectionFilter__Group_1_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__ProjectionFilter__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_1__0"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_1__0__Impl"
    // InternalSetLang.g:2277:1: rule__ProjectionFilter__Group_1_1_1__0__Impl : ( () ) ;
    public final void rule__ProjectionFilter__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2281:1: ( ( () ) )
            // InternalSetLang.g:2282:1: ( () )
            {
            // InternalSetLang.g:2282:1: ( () )
            // InternalSetLang.g:2283:2: ()
            {
             before(grammarAccess.getProjectionFilterAccess().getFilterOpAction_1_1_1_0()); 
            // InternalSetLang.g:2284:2: ()
            // InternalSetLang.g:2284:3: 
            {
            }

             after(grammarAccess.getProjectionFilterAccess().getFilterOpAction_1_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_1__1"
    // InternalSetLang.g:2292:1: rule__ProjectionFilter__Group_1_1_1__1 : rule__ProjectionFilter__Group_1_1_1__1__Impl rule__ProjectionFilter__Group_1_1_1__2 ;
    public final void rule__ProjectionFilter__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2296:1: ( rule__ProjectionFilter__Group_1_1_1__1__Impl rule__ProjectionFilter__Group_1_1_1__2 )
            // InternalSetLang.g:2297:2: rule__ProjectionFilter__Group_1_1_1__1__Impl rule__ProjectionFilter__Group_1_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__ProjectionFilter__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_1__1"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_1__1__Impl"
    // InternalSetLang.g:2304:1: rule__ProjectionFilter__Group_1_1_1__1__Impl : ( '[' ) ;
    public final void rule__ProjectionFilter__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2308:1: ( ( '[' ) )
            // InternalSetLang.g:2309:1: ( '[' )
            {
            // InternalSetLang.g:2309:1: ( '[' )
            // InternalSetLang.g:2310:2: '['
            {
             before(grammarAccess.getProjectionFilterAccess().getLeftSquareBracketKeyword_1_1_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getLeftSquareBracketKeyword_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_1__2"
    // InternalSetLang.g:2319:1: rule__ProjectionFilter__Group_1_1_1__2 : rule__ProjectionFilter__Group_1_1_1__2__Impl rule__ProjectionFilter__Group_1_1_1__3 ;
    public final void rule__ProjectionFilter__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2323:1: ( rule__ProjectionFilter__Group_1_1_1__2__Impl rule__ProjectionFilter__Group_1_1_1__3 )
            // InternalSetLang.g:2324:2: rule__ProjectionFilter__Group_1_1_1__2__Impl rule__ProjectionFilter__Group_1_1_1__3
            {
            pushFollow(FOLLOW_28);
            rule__ProjectionFilter__Group_1_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_1__2"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_1__2__Impl"
    // InternalSetLang.g:2331:1: rule__ProjectionFilter__Group_1_1_1__2__Impl : ( ( rule__ProjectionFilter__ExternalAssignment_1_1_1_2 ) ) ;
    public final void rule__ProjectionFilter__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2335:1: ( ( ( rule__ProjectionFilter__ExternalAssignment_1_1_1_2 ) ) )
            // InternalSetLang.g:2336:1: ( ( rule__ProjectionFilter__ExternalAssignment_1_1_1_2 ) )
            {
            // InternalSetLang.g:2336:1: ( ( rule__ProjectionFilter__ExternalAssignment_1_1_1_2 ) )
            // InternalSetLang.g:2337:2: ( rule__ProjectionFilter__ExternalAssignment_1_1_1_2 )
            {
             before(grammarAccess.getProjectionFilterAccess().getExternalAssignment_1_1_1_2()); 
            // InternalSetLang.g:2338:2: ( rule__ProjectionFilter__ExternalAssignment_1_1_1_2 )
            // InternalSetLang.g:2338:3: rule__ProjectionFilter__ExternalAssignment_1_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__ExternalAssignment_1_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectionFilterAccess().getExternalAssignment_1_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_1__3"
    // InternalSetLang.g:2346:1: rule__ProjectionFilter__Group_1_1_1__3 : rule__ProjectionFilter__Group_1_1_1__3__Impl ;
    public final void rule__ProjectionFilter__Group_1_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2350:1: ( rule__ProjectionFilter__Group_1_1_1__3__Impl )
            // InternalSetLang.g:2351:2: rule__ProjectionFilter__Group_1_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionFilter__Group_1_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_1__3"


    // $ANTLR start "rule__ProjectionFilter__Group_1_1_1__3__Impl"
    // InternalSetLang.g:2357:1: rule__ProjectionFilter__Group_1_1_1__3__Impl : ( ']' ) ;
    public final void rule__ProjectionFilter__Group_1_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2361:1: ( ( ']' ) )
            // InternalSetLang.g:2362:1: ( ']' )
            {
            // InternalSetLang.g:2362:1: ( ']' )
            // InternalSetLang.g:2363:2: ']'
            {
             before(grammarAccess.getProjectionFilterAccess().getRightSquareBracketKeyword_1_1_1_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getRightSquareBracketKeyword_1_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__Group_1_1_1__3__Impl"


    // $ANTLR start "rule__IntValue__Group__0"
    // InternalSetLang.g:2373:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2377:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalSetLang.g:2378:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__IntValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__0"


    // $ANTLR start "rule__IntValue__Group__0__Impl"
    // InternalSetLang.g:2385:1: rule__IntValue__Group__0__Impl : ( () ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2389:1: ( ( () ) )
            // InternalSetLang.g:2390:1: ( () )
            {
            // InternalSetLang.g:2390:1: ( () )
            // InternalSetLang.g:2391:2: ()
            {
             before(grammarAccess.getIntValueAccess().getIntValueAction_0()); 
            // InternalSetLang.g:2392:2: ()
            // InternalSetLang.g:2392:3: 
            {
            }

             after(grammarAccess.getIntValueAccess().getIntValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__0__Impl"


    // $ANTLR start "rule__IntValue__Group__1"
    // InternalSetLang.g:2400:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2404:1: ( rule__IntValue__Group__1__Impl )
            // InternalSetLang.g:2405:2: rule__IntValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__1"


    // $ANTLR start "rule__IntValue__Group__1__Impl"
    // InternalSetLang.g:2411:1: rule__IntValue__Group__1__Impl : ( ( rule__IntValue__ValueAssignment_1 ) ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2415:1: ( ( ( rule__IntValue__ValueAssignment_1 ) ) )
            // InternalSetLang.g:2416:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            {
            // InternalSetLang.g:2416:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            // InternalSetLang.g:2417:2: ( rule__IntValue__ValueAssignment_1 )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment_1()); 
            // InternalSetLang.g:2418:2: ( rule__IntValue__ValueAssignment_1 )
            // InternalSetLang.g:2418:3: rule__IntValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalSetLang.g:2427:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2431:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalSetLang.g:2432:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // InternalSetLang.g:2439:1: rule__Set__Group__0__Impl : ( () ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2443:1: ( ( () ) )
            // InternalSetLang.g:2444:1: ( () )
            {
            // InternalSetLang.g:2444:1: ( () )
            // InternalSetLang.g:2445:2: ()
            {
             before(grammarAccess.getSetAccess().getSetAction_0()); 
            // InternalSetLang.g:2446:2: ()
            // InternalSetLang.g:2446:3: 
            {
            }

             after(grammarAccess.getSetAccess().getSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalSetLang.g:2454:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2458:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalSetLang.g:2459:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // InternalSetLang.g:2466:1: rule__Set__Group__1__Impl : ( '{' ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2470:1: ( ( '{' ) )
            // InternalSetLang.g:2471:1: ( '{' )
            {
            // InternalSetLang.g:2471:1: ( '{' )
            // InternalSetLang.g:2472:2: '{'
            {
             before(grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // InternalSetLang.g:2481:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2485:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // InternalSetLang.g:2486:2: rule__Set__Group__2__Impl rule__Set__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Set__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // InternalSetLang.g:2493:1: rule__Set__Group__2__Impl : ( ( rule__Set__Group_2__0 )? ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2497:1: ( ( ( rule__Set__Group_2__0 )? ) )
            // InternalSetLang.g:2498:1: ( ( rule__Set__Group_2__0 )? )
            {
            // InternalSetLang.g:2498:1: ( ( rule__Set__Group_2__0 )? )
            // InternalSetLang.g:2499:2: ( rule__Set__Group_2__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_2()); 
            // InternalSetLang.g:2500:2: ( rule__Set__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==15||LA16_0==18||LA16_0==30||LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSetLang.g:2500:3: rule__Set__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Set__Group__3"
    // InternalSetLang.g:2508:1: rule__Set__Group__3 : rule__Set__Group__3__Impl ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2512:1: ( rule__Set__Group__3__Impl )
            // InternalSetLang.g:2513:2: rule__Set__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3"


    // $ANTLR start "rule__Set__Group__3__Impl"
    // InternalSetLang.g:2519:1: rule__Set__Group__3__Impl : ( '}' ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2523:1: ( ( '}' ) )
            // InternalSetLang.g:2524:1: ( '}' )
            {
            // InternalSetLang.g:2524:1: ( '}' )
            // InternalSetLang.g:2525:2: '}'
            {
             before(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3__Impl"


    // $ANTLR start "rule__Set__Group_2__0"
    // InternalSetLang.g:2535:1: rule__Set__Group_2__0 : rule__Set__Group_2__0__Impl rule__Set__Group_2__1 ;
    public final void rule__Set__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2539:1: ( rule__Set__Group_2__0__Impl rule__Set__Group_2__1 )
            // InternalSetLang.g:2540:2: rule__Set__Group_2__0__Impl rule__Set__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Set__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__0"


    // $ANTLR start "rule__Set__Group_2__0__Impl"
    // InternalSetLang.g:2547:1: rule__Set__Group_2__0__Impl : ( ( rule__Set__ValuesAssignment_2_0 ) ) ;
    public final void rule__Set__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2551:1: ( ( ( rule__Set__ValuesAssignment_2_0 ) ) )
            // InternalSetLang.g:2552:1: ( ( rule__Set__ValuesAssignment_2_0 ) )
            {
            // InternalSetLang.g:2552:1: ( ( rule__Set__ValuesAssignment_2_0 ) )
            // InternalSetLang.g:2553:2: ( rule__Set__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getSetAccess().getValuesAssignment_2_0()); 
            // InternalSetLang.g:2554:2: ( rule__Set__ValuesAssignment_2_0 )
            // InternalSetLang.g:2554:3: rule__Set__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Set__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getValuesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__0__Impl"


    // $ANTLR start "rule__Set__Group_2__1"
    // InternalSetLang.g:2562:1: rule__Set__Group_2__1 : rule__Set__Group_2__1__Impl ;
    public final void rule__Set__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2566:1: ( rule__Set__Group_2__1__Impl )
            // InternalSetLang.g:2567:2: rule__Set__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__1"


    // $ANTLR start "rule__Set__Group_2__1__Impl"
    // InternalSetLang.g:2573:1: rule__Set__Group_2__1__Impl : ( ( rule__Set__Group_2_1__0 )* ) ;
    public final void rule__Set__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2577:1: ( ( ( rule__Set__Group_2_1__0 )* ) )
            // InternalSetLang.g:2578:1: ( ( rule__Set__Group_2_1__0 )* )
            {
            // InternalSetLang.g:2578:1: ( ( rule__Set__Group_2_1__0 )* )
            // InternalSetLang.g:2579:2: ( rule__Set__Group_2_1__0 )*
            {
             before(grammarAccess.getSetAccess().getGroup_2_1()); 
            // InternalSetLang.g:2580:2: ( rule__Set__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSetLang.g:2580:3: rule__Set__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Set__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSetAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__1__Impl"


    // $ANTLR start "rule__Set__Group_2_1__0"
    // InternalSetLang.g:2589:1: rule__Set__Group_2_1__0 : rule__Set__Group_2_1__0__Impl rule__Set__Group_2_1__1 ;
    public final void rule__Set__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2593:1: ( rule__Set__Group_2_1__0__Impl rule__Set__Group_2_1__1 )
            // InternalSetLang.g:2594:2: rule__Set__Group_2_1__0__Impl rule__Set__Group_2_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Set__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_1__0"


    // $ANTLR start "rule__Set__Group_2_1__0__Impl"
    // InternalSetLang.g:2601:1: rule__Set__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2605:1: ( ( ',' ) )
            // InternalSetLang.g:2606:1: ( ',' )
            {
            // InternalSetLang.g:2606:1: ( ',' )
            // InternalSetLang.g:2607:2: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_1__0__Impl"


    // $ANTLR start "rule__Set__Group_2_1__1"
    // InternalSetLang.g:2616:1: rule__Set__Group_2_1__1 : rule__Set__Group_2_1__1__Impl ;
    public final void rule__Set__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2620:1: ( rule__Set__Group_2_1__1__Impl )
            // InternalSetLang.g:2621:2: rule__Set__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_1__1"


    // $ANTLR start "rule__Set__Group_2_1__1__Impl"
    // InternalSetLang.g:2627:1: rule__Set__Group_2_1__1__Impl : ( ( rule__Set__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__Set__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2631:1: ( ( ( rule__Set__ValuesAssignment_2_1_1 ) ) )
            // InternalSetLang.g:2632:1: ( ( rule__Set__ValuesAssignment_2_1_1 ) )
            {
            // InternalSetLang.g:2632:1: ( ( rule__Set__ValuesAssignment_2_1_1 ) )
            // InternalSetLang.g:2633:2: ( rule__Set__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getSetAccess().getValuesAssignment_2_1_1()); 
            // InternalSetLang.g:2634:2: ( rule__Set__ValuesAssignment_2_1_1 )
            // InternalSetLang.g:2634:3: rule__Set__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getValuesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_1__1__Impl"


    // $ANTLR start "rule__Tuple__Group__0"
    // InternalSetLang.g:2643:1: rule__Tuple__Group__0 : rule__Tuple__Group__0__Impl rule__Tuple__Group__1 ;
    public final void rule__Tuple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2647:1: ( rule__Tuple__Group__0__Impl rule__Tuple__Group__1 )
            // InternalSetLang.g:2648:2: rule__Tuple__Group__0__Impl rule__Tuple__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Tuple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__0"


    // $ANTLR start "rule__Tuple__Group__0__Impl"
    // InternalSetLang.g:2655:1: rule__Tuple__Group__0__Impl : ( () ) ;
    public final void rule__Tuple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2659:1: ( ( () ) )
            // InternalSetLang.g:2660:1: ( () )
            {
            // InternalSetLang.g:2660:1: ( () )
            // InternalSetLang.g:2661:2: ()
            {
             before(grammarAccess.getTupleAccess().getTupleAction_0()); 
            // InternalSetLang.g:2662:2: ()
            // InternalSetLang.g:2662:3: 
            {
            }

             after(grammarAccess.getTupleAccess().getTupleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__0__Impl"


    // $ANTLR start "rule__Tuple__Group__1"
    // InternalSetLang.g:2670:1: rule__Tuple__Group__1 : rule__Tuple__Group__1__Impl rule__Tuple__Group__2 ;
    public final void rule__Tuple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2674:1: ( rule__Tuple__Group__1__Impl rule__Tuple__Group__2 )
            // InternalSetLang.g:2675:2: rule__Tuple__Group__1__Impl rule__Tuple__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Tuple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__1"


    // $ANTLR start "rule__Tuple__Group__1__Impl"
    // InternalSetLang.g:2682:1: rule__Tuple__Group__1__Impl : ( '[' ) ;
    public final void rule__Tuple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2686:1: ( ( '[' ) )
            // InternalSetLang.g:2687:1: ( '[' )
            {
            // InternalSetLang.g:2687:1: ( '[' )
            // InternalSetLang.g:2688:2: '['
            {
             before(grammarAccess.getTupleAccess().getLeftSquareBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTupleAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__1__Impl"


    // $ANTLR start "rule__Tuple__Group__2"
    // InternalSetLang.g:2697:1: rule__Tuple__Group__2 : rule__Tuple__Group__2__Impl rule__Tuple__Group__3 ;
    public final void rule__Tuple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2701:1: ( rule__Tuple__Group__2__Impl rule__Tuple__Group__3 )
            // InternalSetLang.g:2702:2: rule__Tuple__Group__2__Impl rule__Tuple__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Tuple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__2"


    // $ANTLR start "rule__Tuple__Group__2__Impl"
    // InternalSetLang.g:2709:1: rule__Tuple__Group__2__Impl : ( ( rule__Tuple__ValuesAssignment_2 ) ) ;
    public final void rule__Tuple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2713:1: ( ( ( rule__Tuple__ValuesAssignment_2 ) ) )
            // InternalSetLang.g:2714:1: ( ( rule__Tuple__ValuesAssignment_2 ) )
            {
            // InternalSetLang.g:2714:1: ( ( rule__Tuple__ValuesAssignment_2 ) )
            // InternalSetLang.g:2715:2: ( rule__Tuple__ValuesAssignment_2 )
            {
             before(grammarAccess.getTupleAccess().getValuesAssignment_2()); 
            // InternalSetLang.g:2716:2: ( rule__Tuple__ValuesAssignment_2 )
            // InternalSetLang.g:2716:3: rule__Tuple__ValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTupleAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__2__Impl"


    // $ANTLR start "rule__Tuple__Group__3"
    // InternalSetLang.g:2724:1: rule__Tuple__Group__3 : rule__Tuple__Group__3__Impl rule__Tuple__Group__4 ;
    public final void rule__Tuple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2728:1: ( rule__Tuple__Group__3__Impl rule__Tuple__Group__4 )
            // InternalSetLang.g:2729:2: rule__Tuple__Group__3__Impl rule__Tuple__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Tuple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__3"


    // $ANTLR start "rule__Tuple__Group__3__Impl"
    // InternalSetLang.g:2736:1: rule__Tuple__Group__3__Impl : ( ( rule__Tuple__Group_3__0 )* ) ;
    public final void rule__Tuple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2740:1: ( ( ( rule__Tuple__Group_3__0 )* ) )
            // InternalSetLang.g:2741:1: ( ( rule__Tuple__Group_3__0 )* )
            {
            // InternalSetLang.g:2741:1: ( ( rule__Tuple__Group_3__0 )* )
            // InternalSetLang.g:2742:2: ( rule__Tuple__Group_3__0 )*
            {
             before(grammarAccess.getTupleAccess().getGroup_3()); 
            // InternalSetLang.g:2743:2: ( rule__Tuple__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSetLang.g:2743:3: rule__Tuple__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Tuple__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTupleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__3__Impl"


    // $ANTLR start "rule__Tuple__Group__4"
    // InternalSetLang.g:2751:1: rule__Tuple__Group__4 : rule__Tuple__Group__4__Impl ;
    public final void rule__Tuple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2755:1: ( rule__Tuple__Group__4__Impl )
            // InternalSetLang.g:2756:2: rule__Tuple__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__4"


    // $ANTLR start "rule__Tuple__Group__4__Impl"
    // InternalSetLang.g:2762:1: rule__Tuple__Group__4__Impl : ( ']' ) ;
    public final void rule__Tuple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2766:1: ( ( ']' ) )
            // InternalSetLang.g:2767:1: ( ']' )
            {
            // InternalSetLang.g:2767:1: ( ']' )
            // InternalSetLang.g:2768:2: ']'
            {
             before(grammarAccess.getTupleAccess().getRightSquareBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTupleAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group__4__Impl"


    // $ANTLR start "rule__Tuple__Group_3__0"
    // InternalSetLang.g:2778:1: rule__Tuple__Group_3__0 : rule__Tuple__Group_3__0__Impl rule__Tuple__Group_3__1 ;
    public final void rule__Tuple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2782:1: ( rule__Tuple__Group_3__0__Impl rule__Tuple__Group_3__1 )
            // InternalSetLang.g:2783:2: rule__Tuple__Group_3__0__Impl rule__Tuple__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Tuple__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group_3__0"


    // $ANTLR start "rule__Tuple__Group_3__0__Impl"
    // InternalSetLang.g:2790:1: rule__Tuple__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Tuple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2794:1: ( ( ',' ) )
            // InternalSetLang.g:2795:1: ( ',' )
            {
            // InternalSetLang.g:2795:1: ( ',' )
            // InternalSetLang.g:2796:2: ','
            {
             before(grammarAccess.getTupleAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTupleAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group_3__0__Impl"


    // $ANTLR start "rule__Tuple__Group_3__1"
    // InternalSetLang.g:2805:1: rule__Tuple__Group_3__1 : rule__Tuple__Group_3__1__Impl ;
    public final void rule__Tuple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2809:1: ( rule__Tuple__Group_3__1__Impl )
            // InternalSetLang.g:2810:2: rule__Tuple__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group_3__1"


    // $ANTLR start "rule__Tuple__Group_3__1__Impl"
    // InternalSetLang.g:2816:1: rule__Tuple__Group_3__1__Impl : ( ( rule__Tuple__ValuesAssignment_3_1 )* ) ;
    public final void rule__Tuple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2820:1: ( ( ( rule__Tuple__ValuesAssignment_3_1 )* ) )
            // InternalSetLang.g:2821:1: ( ( rule__Tuple__ValuesAssignment_3_1 )* )
            {
            // InternalSetLang.g:2821:1: ( ( rule__Tuple__ValuesAssignment_3_1 )* )
            // InternalSetLang.g:2822:2: ( rule__Tuple__ValuesAssignment_3_1 )*
            {
             before(grammarAccess.getTupleAccess().getValuesAssignment_3_1()); 
            // InternalSetLang.g:2823:2: ( rule__Tuple__ValuesAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==15||LA19_0==18||LA19_0==30||LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSetLang.g:2823:3: rule__Tuple__ValuesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Tuple__ValuesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTupleAccess().getValuesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Group_3__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalSetLang.g:2832:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2836:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalSetLang.g:2837:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalSetLang.g:2844:1: rule__Parenthesis__Group__0__Impl : ( () ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2848:1: ( ( () ) )
            // InternalSetLang.g:2849:1: ( () )
            {
            // InternalSetLang.g:2849:1: ( () )
            // InternalSetLang.g:2850:2: ()
            {
             before(grammarAccess.getParenthesisAccess().getParenthesisAction_0()); 
            // InternalSetLang.g:2851:2: ()
            // InternalSetLang.g:2851:3: 
            {
            }

             after(grammarAccess.getParenthesisAccess().getParenthesisAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalSetLang.g:2859:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2863:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalSetLang.g:2864:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalSetLang.g:2871:1: rule__Parenthesis__Group__1__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2875:1: ( ( '(' ) )
            // InternalSetLang.g:2876:1: ( '(' )
            {
            // InternalSetLang.g:2876:1: ( '(' )
            // InternalSetLang.g:2877:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalSetLang.g:2886:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3 ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2890:1: ( rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3 )
            // InternalSetLang.g:2891:2: rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalSetLang.g:2898:1: rule__Parenthesis__Group__2__Impl : ( ( rule__Parenthesis__ExpAssignment_2 ) ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2902:1: ( ( ( rule__Parenthesis__ExpAssignment_2 ) ) )
            // InternalSetLang.g:2903:1: ( ( rule__Parenthesis__ExpAssignment_2 ) )
            {
            // InternalSetLang.g:2903:1: ( ( rule__Parenthesis__ExpAssignment_2 ) )
            // InternalSetLang.g:2904:2: ( rule__Parenthesis__ExpAssignment_2 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_2()); 
            // InternalSetLang.g:2905:2: ( rule__Parenthesis__ExpAssignment_2 )
            // InternalSetLang.g:2905:3: rule__Parenthesis__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__Parenthesis__Group__3"
    // InternalSetLang.g:2913:1: rule__Parenthesis__Group__3 : rule__Parenthesis__Group__3__Impl ;
    public final void rule__Parenthesis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2917:1: ( rule__Parenthesis__Group__3__Impl )
            // InternalSetLang.g:2918:2: rule__Parenthesis__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__3"


    // $ANTLR start "rule__Parenthesis__Group__3__Impl"
    // InternalSetLang.g:2924:1: rule__Parenthesis__Group__3__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2928:1: ( ( ')' ) )
            // InternalSetLang.g:2929:1: ( ')' )
            {
            // InternalSetLang.g:2929:1: ( ')' )
            // InternalSetLang.g:2930:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__3__Impl"


    // $ANTLR start "rule__RecordAccess__Group__0"
    // InternalSetLang.g:2940:1: rule__RecordAccess__Group__0 : rule__RecordAccess__Group__0__Impl rule__RecordAccess__Group__1 ;
    public final void rule__RecordAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2944:1: ( rule__RecordAccess__Group__0__Impl rule__RecordAccess__Group__1 )
            // InternalSetLang.g:2945:2: rule__RecordAccess__Group__0__Impl rule__RecordAccess__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__RecordAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__0"


    // $ANTLR start "rule__RecordAccess__Group__0__Impl"
    // InternalSetLang.g:2952:1: rule__RecordAccess__Group__0__Impl : ( () ) ;
    public final void rule__RecordAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2956:1: ( ( () ) )
            // InternalSetLang.g:2957:1: ( () )
            {
            // InternalSetLang.g:2957:1: ( () )
            // InternalSetLang.g:2958:2: ()
            {
             before(grammarAccess.getRecordAccessAccess().getRecordAccessAction_0()); 
            // InternalSetLang.g:2959:2: ()
            // InternalSetLang.g:2959:3: 
            {
            }

             after(grammarAccess.getRecordAccessAccess().getRecordAccessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__0__Impl"


    // $ANTLR start "rule__RecordAccess__Group__1"
    // InternalSetLang.g:2967:1: rule__RecordAccess__Group__1 : rule__RecordAccess__Group__1__Impl rule__RecordAccess__Group__2 ;
    public final void rule__RecordAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2971:1: ( rule__RecordAccess__Group__1__Impl rule__RecordAccess__Group__2 )
            // InternalSetLang.g:2972:2: rule__RecordAccess__Group__1__Impl rule__RecordAccess__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RecordAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__1"


    // $ANTLR start "rule__RecordAccess__Group__1__Impl"
    // InternalSetLang.g:2979:1: rule__RecordAccess__Group__1__Impl : ( '!' ) ;
    public final void rule__RecordAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2983:1: ( ( '!' ) )
            // InternalSetLang.g:2984:1: ( '!' )
            {
            // InternalSetLang.g:2984:1: ( '!' )
            // InternalSetLang.g:2985:2: '!'
            {
             before(grammarAccess.getRecordAccessAccess().getExclamationMarkKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRecordAccessAccess().getExclamationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__1__Impl"


    // $ANTLR start "rule__RecordAccess__Group__2"
    // InternalSetLang.g:2994:1: rule__RecordAccess__Group__2 : rule__RecordAccess__Group__2__Impl rule__RecordAccess__Group__3 ;
    public final void rule__RecordAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:2998:1: ( rule__RecordAccess__Group__2__Impl rule__RecordAccess__Group__3 )
            // InternalSetLang.g:2999:2: rule__RecordAccess__Group__2__Impl rule__RecordAccess__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__RecordAccess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__2"


    // $ANTLR start "rule__RecordAccess__Group__2__Impl"
    // InternalSetLang.g:3006:1: rule__RecordAccess__Group__2__Impl : ( ( rule__RecordAccess__RecordAssignment_2 ) ) ;
    public final void rule__RecordAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3010:1: ( ( ( rule__RecordAccess__RecordAssignment_2 ) ) )
            // InternalSetLang.g:3011:1: ( ( rule__RecordAccess__RecordAssignment_2 ) )
            {
            // InternalSetLang.g:3011:1: ( ( rule__RecordAccess__RecordAssignment_2 ) )
            // InternalSetLang.g:3012:2: ( rule__RecordAccess__RecordAssignment_2 )
            {
             before(grammarAccess.getRecordAccessAccess().getRecordAssignment_2()); 
            // InternalSetLang.g:3013:2: ( rule__RecordAccess__RecordAssignment_2 )
            // InternalSetLang.g:3013:3: rule__RecordAccess__RecordAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RecordAccess__RecordAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccessAccess().getRecordAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__2__Impl"


    // $ANTLR start "rule__RecordAccess__Group__3"
    // InternalSetLang.g:3021:1: rule__RecordAccess__Group__3 : rule__RecordAccess__Group__3__Impl rule__RecordAccess__Group__4 ;
    public final void rule__RecordAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3025:1: ( rule__RecordAccess__Group__3__Impl rule__RecordAccess__Group__4 )
            // InternalSetLang.g:3026:2: rule__RecordAccess__Group__3__Impl rule__RecordAccess__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__RecordAccess__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__3"


    // $ANTLR start "rule__RecordAccess__Group__3__Impl"
    // InternalSetLang.g:3033:1: rule__RecordAccess__Group__3__Impl : ( ( rule__RecordAccess__Group_3__0 )? ) ;
    public final void rule__RecordAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3037:1: ( ( ( rule__RecordAccess__Group_3__0 )? ) )
            // InternalSetLang.g:3038:1: ( ( rule__RecordAccess__Group_3__0 )? )
            {
            // InternalSetLang.g:3038:1: ( ( rule__RecordAccess__Group_3__0 )? )
            // InternalSetLang.g:3039:2: ( rule__RecordAccess__Group_3__0 )?
            {
             before(grammarAccess.getRecordAccessAccess().getGroup_3()); 
            // InternalSetLang.g:3040:2: ( rule__RecordAccess__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSetLang.g:3040:3: rule__RecordAccess__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordAccess__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordAccessAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__3__Impl"


    // $ANTLR start "rule__RecordAccess__Group__4"
    // InternalSetLang.g:3048:1: rule__RecordAccess__Group__4 : rule__RecordAccess__Group__4__Impl rule__RecordAccess__Group__5 ;
    public final void rule__RecordAccess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3052:1: ( rule__RecordAccess__Group__4__Impl rule__RecordAccess__Group__5 )
            // InternalSetLang.g:3053:2: rule__RecordAccess__Group__4__Impl rule__RecordAccess__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__RecordAccess__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__4"


    // $ANTLR start "rule__RecordAccess__Group__4__Impl"
    // InternalSetLang.g:3060:1: rule__RecordAccess__Group__4__Impl : ( '->' ) ;
    public final void rule__RecordAccess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3064:1: ( ( '->' ) )
            // InternalSetLang.g:3065:1: ( '->' )
            {
            // InternalSetLang.g:3065:1: ( '->' )
            // InternalSetLang.g:3066:2: '->'
            {
             before(grammarAccess.getRecordAccessAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecordAccessAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__4__Impl"


    // $ANTLR start "rule__RecordAccess__Group__5"
    // InternalSetLang.g:3075:1: rule__RecordAccess__Group__5 : rule__RecordAccess__Group__5__Impl ;
    public final void rule__RecordAccess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3079:1: ( rule__RecordAccess__Group__5__Impl )
            // InternalSetLang.g:3080:2: rule__RecordAccess__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__5"


    // $ANTLR start "rule__RecordAccess__Group__5__Impl"
    // InternalSetLang.g:3086:1: rule__RecordAccess__Group__5__Impl : ( ( rule__RecordAccess__MemberAssignment_5 ) ) ;
    public final void rule__RecordAccess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3090:1: ( ( ( rule__RecordAccess__MemberAssignment_5 ) ) )
            // InternalSetLang.g:3091:1: ( ( rule__RecordAccess__MemberAssignment_5 ) )
            {
            // InternalSetLang.g:3091:1: ( ( rule__RecordAccess__MemberAssignment_5 ) )
            // InternalSetLang.g:3092:2: ( rule__RecordAccess__MemberAssignment_5 )
            {
             before(grammarAccess.getRecordAccessAccess().getMemberAssignment_5()); 
            // InternalSetLang.g:3093:2: ( rule__RecordAccess__MemberAssignment_5 )
            // InternalSetLang.g:3093:3: rule__RecordAccess__MemberAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RecordAccess__MemberAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccessAccess().getMemberAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group__5__Impl"


    // $ANTLR start "rule__RecordAccess__Group_3__0"
    // InternalSetLang.g:3102:1: rule__RecordAccess__Group_3__0 : rule__RecordAccess__Group_3__0__Impl rule__RecordAccess__Group_3__1 ;
    public final void rule__RecordAccess__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3106:1: ( rule__RecordAccess__Group_3__0__Impl rule__RecordAccess__Group_3__1 )
            // InternalSetLang.g:3107:2: rule__RecordAccess__Group_3__0__Impl rule__RecordAccess__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__RecordAccess__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3__0"


    // $ANTLR start "rule__RecordAccess__Group_3__0__Impl"
    // InternalSetLang.g:3114:1: rule__RecordAccess__Group_3__0__Impl : ( '(' ) ;
    public final void rule__RecordAccess__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3118:1: ( ( '(' ) )
            // InternalSetLang.g:3119:1: ( '(' )
            {
            // InternalSetLang.g:3119:1: ( '(' )
            // InternalSetLang.g:3120:2: '('
            {
             before(grammarAccess.getRecordAccessAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRecordAccessAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3__0__Impl"


    // $ANTLR start "rule__RecordAccess__Group_3__1"
    // InternalSetLang.g:3129:1: rule__RecordAccess__Group_3__1 : rule__RecordAccess__Group_3__1__Impl rule__RecordAccess__Group_3__2 ;
    public final void rule__RecordAccess__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3133:1: ( rule__RecordAccess__Group_3__1__Impl rule__RecordAccess__Group_3__2 )
            // InternalSetLang.g:3134:2: rule__RecordAccess__Group_3__1__Impl rule__RecordAccess__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__RecordAccess__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3__1"


    // $ANTLR start "rule__RecordAccess__Group_3__1__Impl"
    // InternalSetLang.g:3141:1: rule__RecordAccess__Group_3__1__Impl : ( ( rule__RecordAccess__ParametersAssignment_3_1 ) ) ;
    public final void rule__RecordAccess__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3145:1: ( ( ( rule__RecordAccess__ParametersAssignment_3_1 ) ) )
            // InternalSetLang.g:3146:1: ( ( rule__RecordAccess__ParametersAssignment_3_1 ) )
            {
            // InternalSetLang.g:3146:1: ( ( rule__RecordAccess__ParametersAssignment_3_1 ) )
            // InternalSetLang.g:3147:2: ( rule__RecordAccess__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getRecordAccessAccess().getParametersAssignment_3_1()); 
            // InternalSetLang.g:3148:2: ( rule__RecordAccess__ParametersAssignment_3_1 )
            // InternalSetLang.g:3148:3: rule__RecordAccess__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordAccess__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccessAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3__1__Impl"


    // $ANTLR start "rule__RecordAccess__Group_3__2"
    // InternalSetLang.g:3156:1: rule__RecordAccess__Group_3__2 : rule__RecordAccess__Group_3__2__Impl rule__RecordAccess__Group_3__3 ;
    public final void rule__RecordAccess__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3160:1: ( rule__RecordAccess__Group_3__2__Impl rule__RecordAccess__Group_3__3 )
            // InternalSetLang.g:3161:2: rule__RecordAccess__Group_3__2__Impl rule__RecordAccess__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__RecordAccess__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3__2"


    // $ANTLR start "rule__RecordAccess__Group_3__2__Impl"
    // InternalSetLang.g:3168:1: rule__RecordAccess__Group_3__2__Impl : ( ( rule__RecordAccess__Group_3_2__0 )* ) ;
    public final void rule__RecordAccess__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3172:1: ( ( ( rule__RecordAccess__Group_3_2__0 )* ) )
            // InternalSetLang.g:3173:1: ( ( rule__RecordAccess__Group_3_2__0 )* )
            {
            // InternalSetLang.g:3173:1: ( ( rule__RecordAccess__Group_3_2__0 )* )
            // InternalSetLang.g:3174:2: ( rule__RecordAccess__Group_3_2__0 )*
            {
             before(grammarAccess.getRecordAccessAccess().getGroup_3_2()); 
            // InternalSetLang.g:3175:2: ( rule__RecordAccess__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSetLang.g:3175:3: rule__RecordAccess__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RecordAccess__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRecordAccessAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3__2__Impl"


    // $ANTLR start "rule__RecordAccess__Group_3__3"
    // InternalSetLang.g:3183:1: rule__RecordAccess__Group_3__3 : rule__RecordAccess__Group_3__3__Impl ;
    public final void rule__RecordAccess__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3187:1: ( rule__RecordAccess__Group_3__3__Impl )
            // InternalSetLang.g:3188:2: rule__RecordAccess__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3__3"


    // $ANTLR start "rule__RecordAccess__Group_3__3__Impl"
    // InternalSetLang.g:3194:1: rule__RecordAccess__Group_3__3__Impl : ( ')' ) ;
    public final void rule__RecordAccess__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3198:1: ( ( ')' ) )
            // InternalSetLang.g:3199:1: ( ')' )
            {
            // InternalSetLang.g:3199:1: ( ')' )
            // InternalSetLang.g:3200:2: ')'
            {
             before(grammarAccess.getRecordAccessAccess().getRightParenthesisKeyword_3_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRecordAccessAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3__3__Impl"


    // $ANTLR start "rule__RecordAccess__Group_3_2__0"
    // InternalSetLang.g:3210:1: rule__RecordAccess__Group_3_2__0 : rule__RecordAccess__Group_3_2__0__Impl rule__RecordAccess__Group_3_2__1 ;
    public final void rule__RecordAccess__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3214:1: ( rule__RecordAccess__Group_3_2__0__Impl rule__RecordAccess__Group_3_2__1 )
            // InternalSetLang.g:3215:2: rule__RecordAccess__Group_3_2__0__Impl rule__RecordAccess__Group_3_2__1
            {
            pushFollow(FOLLOW_17);
            rule__RecordAccess__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3_2__0"


    // $ANTLR start "rule__RecordAccess__Group_3_2__0__Impl"
    // InternalSetLang.g:3222:1: rule__RecordAccess__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__RecordAccess__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3226:1: ( ( ',' ) )
            // InternalSetLang.g:3227:1: ( ',' )
            {
            // InternalSetLang.g:3227:1: ( ',' )
            // InternalSetLang.g:3228:2: ','
            {
             before(grammarAccess.getRecordAccessAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecordAccessAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3_2__0__Impl"


    // $ANTLR start "rule__RecordAccess__Group_3_2__1"
    // InternalSetLang.g:3237:1: rule__RecordAccess__Group_3_2__1 : rule__RecordAccess__Group_3_2__1__Impl ;
    public final void rule__RecordAccess__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3241:1: ( rule__RecordAccess__Group_3_2__1__Impl )
            // InternalSetLang.g:3242:2: rule__RecordAccess__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordAccess__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3_2__1"


    // $ANTLR start "rule__RecordAccess__Group_3_2__1__Impl"
    // InternalSetLang.g:3248:1: rule__RecordAccess__Group_3_2__1__Impl : ( ( rule__RecordAccess__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__RecordAccess__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3252:1: ( ( ( rule__RecordAccess__ParametersAssignment_3_2_1 ) ) )
            // InternalSetLang.g:3253:1: ( ( rule__RecordAccess__ParametersAssignment_3_2_1 ) )
            {
            // InternalSetLang.g:3253:1: ( ( rule__RecordAccess__ParametersAssignment_3_2_1 ) )
            // InternalSetLang.g:3254:2: ( rule__RecordAccess__ParametersAssignment_3_2_1 )
            {
             before(grammarAccess.getRecordAccessAccess().getParametersAssignment_3_2_1()); 
            // InternalSetLang.g:3255:2: ( rule__RecordAccess__ParametersAssignment_3_2_1 )
            // InternalSetLang.g:3255:3: rule__RecordAccess__ParametersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordAccess__ParametersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordAccessAccess().getParametersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__Group_3_2__1__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalSetLang.g:3264:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3268:1: ( ( RULE_ID ) )
            // InternalSetLang.g:3269:2: ( RULE_ID )
            {
            // InternalSetLang.g:3269:2: ( RULE_ID )
            // InternalSetLang.g:3270:3: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__ExternalDefsAssignment_2"
    // InternalSetLang.g:3279:1: rule__Program__ExternalDefsAssignment_2 : ( ruleExternalDef ) ;
    public final void rule__Program__ExternalDefsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3283:1: ( ( ruleExternalDef ) )
            // InternalSetLang.g:3284:2: ( ruleExternalDef )
            {
            // InternalSetLang.g:3284:2: ( ruleExternalDef )
            // InternalSetLang.g:3285:3: ruleExternalDef
            {
             before(grammarAccess.getProgramAccess().getExternalDefsExternalDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalDef();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExternalDefsExternalDefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ExternalDefsAssignment_2"


    // $ANTLR start "rule__Program__RecordsAssignment_3"
    // InternalSetLang.g:3294:1: rule__Program__RecordsAssignment_3 : ( ruleRecord ) ;
    public final void rule__Program__RecordsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3298:1: ( ( ruleRecord ) )
            // InternalSetLang.g:3299:2: ( ruleRecord )
            {
            // InternalSetLang.g:3299:2: ( ruleRecord )
            // InternalSetLang.g:3300:3: ruleRecord
            {
             before(grammarAccess.getProgramAccess().getRecordsRecordParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRecord();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getRecordsRecordParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__RecordsAssignment_3"


    // $ANTLR start "rule__Program__ComputesAssignment_4"
    // InternalSetLang.g:3309:1: rule__Program__ComputesAssignment_4 : ( ruleCompute ) ;
    public final void rule__Program__ComputesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3313:1: ( ( ruleCompute ) )
            // InternalSetLang.g:3314:2: ( ruleCompute )
            {
            // InternalSetLang.g:3314:2: ( ruleCompute )
            // InternalSetLang.g:3315:3: ruleCompute
            {
             before(grammarAccess.getProgramAccess().getComputesComputeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCompute();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getComputesComputeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ComputesAssignment_4"


    // $ANTLR start "rule__ExternalDef__NameAssignment_1"
    // InternalSetLang.g:3324:1: rule__ExternalDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3328:1: ( ( RULE_ID ) )
            // InternalSetLang.g:3329:2: ( RULE_ID )
            {
            // InternalSetLang.g:3329:2: ( RULE_ID )
            // InternalSetLang.g:3330:3: RULE_ID
            {
             before(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__NameAssignment_1"


    // $ANTLR start "rule__ExternalDef__TypeAssignment_3"
    // InternalSetLang.g:3339:1: rule__ExternalDef__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__ExternalDef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3343:1: ( ( ruleType ) )
            // InternalSetLang.g:3344:2: ( ruleType )
            {
            // InternalSetLang.g:3344:2: ( ruleType )
            // InternalSetLang.g:3345:3: ruleType
            {
             before(grammarAccess.getExternalDefAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExternalDefAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__TypeAssignment_3"


    // $ANTLR start "rule__Record__NameAssignment_1"
    // InternalSetLang.g:3354:1: rule__Record__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Record__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3358:1: ( ( RULE_ID ) )
            // InternalSetLang.g:3359:2: ( RULE_ID )
            {
            // InternalSetLang.g:3359:2: ( RULE_ID )
            // InternalSetLang.g:3360:3: RULE_ID
            {
             before(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__NameAssignment_1"


    // $ANTLR start "rule__Record__ParentAssignment_2_1"
    // InternalSetLang.g:3369:1: rule__Record__ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Record__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3373:1: ( ( ( RULE_ID ) ) )
            // InternalSetLang.g:3374:2: ( ( RULE_ID ) )
            {
            // InternalSetLang.g:3374:2: ( ( RULE_ID ) )
            // InternalSetLang.g:3375:3: ( RULE_ID )
            {
             before(grammarAccess.getRecordAccess().getParentRecordCrossReference_2_1_0()); 
            // InternalSetLang.g:3376:3: ( RULE_ID )
            // InternalSetLang.g:3377:4: RULE_ID
            {
             before(grammarAccess.getRecordAccess().getParentRecordIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordAccess().getParentRecordIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRecordAccess().getParentRecordCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__ParentAssignment_2_1"


    // $ANTLR start "rule__Record__ParametersAssignment_3_1"
    // InternalSetLang.g:3388:1: rule__Record__ParametersAssignment_3_1 : ( ruleParameter ) ;
    public final void rule__Record__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3392:1: ( ( ruleParameter ) )
            // InternalSetLang.g:3393:2: ( ruleParameter )
            {
            // InternalSetLang.g:3393:2: ( ruleParameter )
            // InternalSetLang.g:3394:3: ruleParameter
            {
             before(grammarAccess.getRecordAccess().getParametersParameterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRecordAccess().getParametersParameterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__ParametersAssignment_3_1"


    // $ANTLR start "rule__Record__ParametersAssignment_3_2_1"
    // InternalSetLang.g:3403:1: rule__Record__ParametersAssignment_3_2_1 : ( ruleParameter ) ;
    public final void rule__Record__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3407:1: ( ( ruleParameter ) )
            // InternalSetLang.g:3408:2: ( ruleParameter )
            {
            // InternalSetLang.g:3408:2: ( ruleParameter )
            // InternalSetLang.g:3409:3: ruleParameter
            {
             before(grammarAccess.getRecordAccess().getParametersParameterParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRecordAccess().getParametersParameterParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__ParametersAssignment_3_2_1"


    // $ANTLR start "rule__Record__MembersAssignment_5"
    // InternalSetLang.g:3418:1: rule__Record__MembersAssignment_5 : ( ruleMember ) ;
    public final void rule__Record__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3422:1: ( ( ruleMember ) )
            // InternalSetLang.g:3423:2: ( ruleMember )
            {
            // InternalSetLang.g:3423:2: ( ruleMember )
            // InternalSetLang.g:3424:3: ruleMember
            {
             before(grammarAccess.getRecordAccess().getMembersMemberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getRecordAccess().getMembersMemberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__MembersAssignment_5"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalSetLang.g:3433:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3437:1: ( ( RULE_ID ) )
            // InternalSetLang.g:3438:2: ( RULE_ID )
            {
            // InternalSetLang.g:3438:2: ( RULE_ID )
            // InternalSetLang.g:3439:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalSetLang.g:3448:1: rule__Parameter__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3452:1: ( ( ruleType ) )
            // InternalSetLang.g:3453:2: ( ruleType )
            {
            // InternalSetLang.g:3453:2: ( ruleType )
            // InternalSetLang.g:3454:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Member__NameAssignment_0"
    // InternalSetLang.g:3463:1: rule__Member__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3467:1: ( ( RULE_ID ) )
            // InternalSetLang.g:3468:2: ( RULE_ID )
            {
            // InternalSetLang.g:3468:2: ( RULE_ID )
            // InternalSetLang.g:3469:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NameAssignment_0"


    // $ANTLR start "rule__Member__ExpAssignment_2"
    // InternalSetLang.g:3478:1: rule__Member__ExpAssignment_2 : ( ruleUnionIntersection ) ;
    public final void rule__Member__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3482:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3483:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3483:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3484:3: ruleUnionIntersection
            {
             before(grammarAccess.getMemberAccess().getExpUnionIntersectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getExpUnionIntersectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__ExpAssignment_2"


    // $ANTLR start "rule__Compute__ExpAssignment_1"
    // InternalSetLang.g:3493:1: rule__Compute__ExpAssignment_1 : ( ruleUnionIntersection ) ;
    public final void rule__Compute__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3497:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3498:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3498:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3499:3: ruleUnionIntersection
            {
             before(grammarAccess.getComputeAccess().getExpUnionIntersectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getComputeAccess().getExpUnionIntersectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compute__ExpAssignment_1"


    // $ANTLR start "rule__UnionIntersection__RightAssignment_1_1"
    // InternalSetLang.g:3508:1: rule__UnionIntersection__RightAssignment_1_1 : ( ruleProduct ) ;
    public final void rule__UnionIntersection__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3512:1: ( ( ruleProduct ) )
            // InternalSetLang.g:3513:2: ( ruleProduct )
            {
            // InternalSetLang.g:3513:2: ( ruleProduct )
            // InternalSetLang.g:3514:3: ruleProduct
            {
             before(grammarAccess.getUnionIntersectionAccess().getRightProductParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getUnionIntersectionAccess().getRightProductParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnionIntersection__RightAssignment_1_1"


    // $ANTLR start "rule__Product__RightAssignment_1_1"
    // InternalSetLang.g:3523:1: rule__Product__RightAssignment_1_1 : ( ruleProjectionFilter ) ;
    public final void rule__Product__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3527:1: ( ( ruleProjectionFilter ) )
            // InternalSetLang.g:3528:2: ( ruleProjectionFilter )
            {
            // InternalSetLang.g:3528:2: ( ruleProjectionFilter )
            // InternalSetLang.g:3529:3: ruleProjectionFilter
            {
             before(grammarAccess.getProductAccess().getRightProjectionFilterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectionFilter();

            state._fsp--;

             after(grammarAccess.getProductAccess().getRightProjectionFilterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__RightAssignment_1_1"


    // $ANTLR start "rule__ProjectionFilter__IndicesAssignment_1_1_0_2"
    // InternalSetLang.g:3538:1: rule__ProjectionFilter__IndicesAssignment_1_1_0_2 : ( RULE_INT ) ;
    public final void rule__ProjectionFilter__IndicesAssignment_1_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3542:1: ( ( RULE_INT ) )
            // InternalSetLang.g:3543:2: ( RULE_INT )
            {
            // InternalSetLang.g:3543:2: ( RULE_INT )
            // InternalSetLang.g:3544:3: RULE_INT
            {
             before(grammarAccess.getProjectionFilterAccess().getIndicesINTTerminalRuleCall_1_1_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getIndicesINTTerminalRuleCall_1_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__IndicesAssignment_1_1_0_2"


    // $ANTLR start "rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1"
    // InternalSetLang.g:3553:1: rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1 : ( RULE_INT ) ;
    public final void rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3557:1: ( ( RULE_INT ) )
            // InternalSetLang.g:3558:2: ( RULE_INT )
            {
            // InternalSetLang.g:3558:2: ( RULE_INT )
            // InternalSetLang.g:3559:3: RULE_INT
            {
             before(grammarAccess.getProjectionFilterAccess().getIndicesINTTerminalRuleCall_1_1_0_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getIndicesINTTerminalRuleCall_1_1_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__IndicesAssignment_1_1_0_3_1"


    // $ANTLR start "rule__ProjectionFilter__ExternalAssignment_1_1_1_2"
    // InternalSetLang.g:3568:1: rule__ProjectionFilter__ExternalAssignment_1_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ProjectionFilter__ExternalAssignment_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3572:1: ( ( ( RULE_ID ) ) )
            // InternalSetLang.g:3573:2: ( ( RULE_ID ) )
            {
            // InternalSetLang.g:3573:2: ( ( RULE_ID ) )
            // InternalSetLang.g:3574:3: ( RULE_ID )
            {
             before(grammarAccess.getProjectionFilterAccess().getExternalExternalDefCrossReference_1_1_1_2_0()); 
            // InternalSetLang.g:3575:3: ( RULE_ID )
            // InternalSetLang.g:3576:4: RULE_ID
            {
             before(grammarAccess.getProjectionFilterAccess().getExternalExternalDefIDTerminalRuleCall_1_1_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectionFilterAccess().getExternalExternalDefIDTerminalRuleCall_1_1_1_2_0_1()); 

            }

             after(grammarAccess.getProjectionFilterAccess().getExternalExternalDefCrossReference_1_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectionFilter__ExternalAssignment_1_1_1_2"


    // $ANTLR start "rule__Ref__RefAssignment"
    // InternalSetLang.g:3587:1: rule__Ref__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3591:1: ( ( ( RULE_ID ) ) )
            // InternalSetLang.g:3592:2: ( ( RULE_ID ) )
            {
            // InternalSetLang.g:3592:2: ( ( RULE_ID ) )
            // InternalSetLang.g:3593:3: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefBindingCrossReference_0()); 
            // InternalSetLang.g:3594:3: ( RULE_ID )
            // InternalSetLang.g:3595:4: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefBindingIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefAccess().getRefBindingIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRefAccess().getRefBindingCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__RefAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment_1"
    // InternalSetLang.g:3606:1: rule__IntValue__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3610:1: ( ( RULE_INT ) )
            // InternalSetLang.g:3611:2: ( RULE_INT )
            {
            // InternalSetLang.g:3611:2: ( RULE_INT )
            // InternalSetLang.g:3612:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValueAssignment_1"


    // $ANTLR start "rule__Set__ValuesAssignment_2_0"
    // InternalSetLang.g:3621:1: rule__Set__ValuesAssignment_2_0 : ( ruleUnionIntersection ) ;
    public final void rule__Set__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3625:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3626:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3626:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3627:3: ruleUnionIntersection
            {
             before(grammarAccess.getSetAccess().getValuesUnionIntersectionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getSetAccess().getValuesUnionIntersectionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__ValuesAssignment_2_0"


    // $ANTLR start "rule__Set__ValuesAssignment_2_1_1"
    // InternalSetLang.g:3636:1: rule__Set__ValuesAssignment_2_1_1 : ( ruleUnionIntersection ) ;
    public final void rule__Set__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3640:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3641:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3641:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3642:3: ruleUnionIntersection
            {
             before(grammarAccess.getSetAccess().getValuesUnionIntersectionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getSetAccess().getValuesUnionIntersectionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__Tuple__ValuesAssignment_2"
    // InternalSetLang.g:3651:1: rule__Tuple__ValuesAssignment_2 : ( ruleUnionIntersection ) ;
    public final void rule__Tuple__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3655:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3656:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3656:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3657:3: ruleUnionIntersection
            {
             before(grammarAccess.getTupleAccess().getValuesUnionIntersectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getTupleAccess().getValuesUnionIntersectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__ValuesAssignment_2"


    // $ANTLR start "rule__Tuple__ValuesAssignment_3_1"
    // InternalSetLang.g:3666:1: rule__Tuple__ValuesAssignment_3_1 : ( ruleUnionIntersection ) ;
    public final void rule__Tuple__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3670:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3671:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3671:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3672:3: ruleUnionIntersection
            {
             before(grammarAccess.getTupleAccess().getValuesUnionIntersectionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getTupleAccess().getValuesUnionIntersectionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__ValuesAssignment_3_1"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_2"
    // InternalSetLang.g:3681:1: rule__Parenthesis__ExpAssignment_2 : ( ruleUnionIntersection ) ;
    public final void rule__Parenthesis__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3685:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3686:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3686:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3687:3: ruleUnionIntersection
            {
             before(grammarAccess.getParenthesisAccess().getExpUnionIntersectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpUnionIntersectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__ExpAssignment_2"


    // $ANTLR start "rule__RecordAccess__RecordAssignment_2"
    // InternalSetLang.g:3696:1: rule__RecordAccess__RecordAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RecordAccess__RecordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3700:1: ( ( ( RULE_ID ) ) )
            // InternalSetLang.g:3701:2: ( ( RULE_ID ) )
            {
            // InternalSetLang.g:3701:2: ( ( RULE_ID ) )
            // InternalSetLang.g:3702:3: ( RULE_ID )
            {
             before(grammarAccess.getRecordAccessAccess().getRecordRecordCrossReference_2_0()); 
            // InternalSetLang.g:3703:3: ( RULE_ID )
            // InternalSetLang.g:3704:4: RULE_ID
            {
             before(grammarAccess.getRecordAccessAccess().getRecordRecordIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordAccessAccess().getRecordRecordIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRecordAccessAccess().getRecordRecordCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__RecordAssignment_2"


    // $ANTLR start "rule__RecordAccess__ParametersAssignment_3_1"
    // InternalSetLang.g:3715:1: rule__RecordAccess__ParametersAssignment_3_1 : ( ruleUnionIntersection ) ;
    public final void rule__RecordAccess__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3719:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3720:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3720:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3721:3: ruleUnionIntersection
            {
             before(grammarAccess.getRecordAccessAccess().getParametersUnionIntersectionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getRecordAccessAccess().getParametersUnionIntersectionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__ParametersAssignment_3_1"


    // $ANTLR start "rule__RecordAccess__ParametersAssignment_3_2_1"
    // InternalSetLang.g:3730:1: rule__RecordAccess__ParametersAssignment_3_2_1 : ( ruleUnionIntersection ) ;
    public final void rule__RecordAccess__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3734:1: ( ( ruleUnionIntersection ) )
            // InternalSetLang.g:3735:2: ( ruleUnionIntersection )
            {
            // InternalSetLang.g:3735:2: ( ruleUnionIntersection )
            // InternalSetLang.g:3736:3: ruleUnionIntersection
            {
             before(grammarAccess.getRecordAccessAccess().getParametersUnionIntersectionParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionIntersection();

            state._fsp--;

             after(grammarAccess.getRecordAccessAccess().getParametersUnionIntersectionParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__ParametersAssignment_3_2_1"


    // $ANTLR start "rule__RecordAccess__MemberAssignment_5"
    // InternalSetLang.g:3745:1: rule__RecordAccess__MemberAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RecordAccess__MemberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSetLang.g:3749:1: ( ( ( RULE_ID ) ) )
            // InternalSetLang.g:3750:2: ( ( RULE_ID ) )
            {
            // InternalSetLang.g:3750:2: ( ( RULE_ID ) )
            // InternalSetLang.g:3751:3: ( RULE_ID )
            {
             before(grammarAccess.getRecordAccessAccess().getMemberMemberCrossReference_5_0()); 
            // InternalSetLang.g:3752:3: ( RULE_ID )
            // InternalSetLang.g:3753:4: RULE_ID
            {
             before(grammarAccess.getRecordAccessAccess().getMemberMemberIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordAccessAccess().getMemberMemberIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRecordAccessAccess().getMemberMemberCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordAccess__MemberAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000824000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000401800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000148000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000140048030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000001400C8030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000140048032L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200008000L});

}