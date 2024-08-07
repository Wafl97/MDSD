/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.mdsd.math.MathFactory
 * @model kind="package"
 * @generated
 */
public interface MathPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "math";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/mdsd/Math";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "math";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MathPackage eINSTANCE = dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MathExpImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathExp()
   * @generated
   */
  int MATH_EXP = 0;

  /**
   * The feature id for the '<em><b>Exps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__EXPS = 0;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.VarBindingImpl <em>Var Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.VarBindingImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVarBinding()
   * @generated
   */
  int VAR_BINDING = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BINDING__NAME = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BINDING__EXP = 1;

  /**
   * The number of structural features of the '<em>Var Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExperssionImpl <em>Experssion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ExperssionImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExperssion()
   * @generated
   */
  int EXPERSSION = 3;

  /**
   * The number of structural features of the '<em>Experssion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERSSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.AddImpl <em>Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.AddImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getAdd()
   * @generated
   */
  int ADD = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.SubImpl <em>Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.SubImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getSub()
   * @generated
   */
  int SUB = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MulImpl <em>Mul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MulImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMul()
   * @generated
   */
  int MUL = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.DivImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getDiv()
   * @generated
   */
  int DIV = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getParenthesis()
   * @generated
   */
  int PARENTHESIS = 8;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS__EXP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ConstantImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl <em>Variable Use</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVariableUse()
   * @generated
   */
  int VARIABLE_USE = 10;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_USE__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Use</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_USE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl <em>Let Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLetBinding()
   * @generated
   */
  int LET_BINDING = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING__NAME = EXPERSSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING__BINDING = EXPERSSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING__BODY = EXPERSSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Let Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_BINDING_FEATURE_COUNT = EXPERSSION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.MathExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp
   * @generated
   */
  EClass getMathExp();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.math.MathExp#getExps <em>Exps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exps</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp#getExps()
   * @see #getMathExp()
   * @generated
   */
  EReference getMathExp_Exps();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.VarBinding <em>Var Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Binding</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VarBinding
   * @generated
   */
  EClass getVarBinding();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.VarBinding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VarBinding#getName()
   * @see #getVarBinding()
   * @generated
   */
  EAttribute getVarBinding_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.VarBinding#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VarBinding#getExp()
   * @see #getVarBinding()
   * @generated
   */
  EReference getVarBinding_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Experssion <em>Experssion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experssion</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Experssion
   * @generated
   */
  EClass getExperssion();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Add
   * @generated
   */
  EClass getAdd();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Add#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Add#getLeft()
   * @see #getAdd()
   * @generated
   */
  EReference getAdd_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Add#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Add#getRight()
   * @see #getAdd()
   * @generated
   */
  EReference getAdd_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Sub
   * @generated
   */
  EClass getSub();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Sub#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Sub#getLeft()
   * @see #getSub()
   * @generated
   */
  EReference getSub_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Sub#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Sub#getRight()
   * @see #getSub()
   * @generated
   */
  EReference getSub_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Mul <em>Mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Mul
   * @generated
   */
  EClass getMul();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Mul#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Mul#getLeft()
   * @see #getMul()
   * @generated
   */
  EReference getMul_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Mul#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Mul#getRight()
   * @see #getMul()
   * @generated
   */
  EReference getMul_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Parenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesis</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Parenthesis
   * @generated
   */
  EClass getParenthesis();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Parenthesis#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Parenthesis#getExp()
   * @see #getParenthesis()
   * @generated
   */
  EReference getParenthesis_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Value();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.VariableUse <em>Variable Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Use</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VariableUse
   * @generated
   */
  EClass getVariableUse();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.VariableUse#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VariableUse#getRef()
   * @see #getVariableUse()
   * @generated
   */
  EAttribute getVariableUse_Ref();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.LetBinding <em>Let Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let Binding</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetBinding
   * @generated
   */
  EClass getLetBinding();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.LetBinding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetBinding#getName()
   * @see #getLetBinding()
   * @generated
   */
  EAttribute getLetBinding_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.LetBinding#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetBinding#getBinding()
   * @see #getLetBinding()
   * @generated
   */
  EReference getLetBinding_Binding();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.LetBinding#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetBinding#getBody()
   * @see #getLetBinding()
   * @generated
   */
  EReference getLetBinding_Body();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MathFactory getMathFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MathExpImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathExp()
     * @generated
     */
    EClass MATH_EXP = eINSTANCE.getMathExp();

    /**
     * The meta object literal for the '<em><b>Exps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_EXP__EXPS = eINSTANCE.getMathExp_Exps();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.VarBindingImpl <em>Var Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.VarBindingImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVarBinding()
     * @generated
     */
    EClass VAR_BINDING = eINSTANCE.getVarBinding();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_BINDING__NAME = eINSTANCE.getVarBinding_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_BINDING__EXP = eINSTANCE.getVarBinding_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ExpressionImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExperssionImpl <em>Experssion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ExperssionImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExperssion()
     * @generated
     */
    EClass EXPERSSION = eINSTANCE.getExperssion();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.AddImpl <em>Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.AddImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getAdd()
     * @generated
     */
    EClass ADD = eINSTANCE.getAdd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD__LEFT = eINSTANCE.getAdd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD__RIGHT = eINSTANCE.getAdd_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.SubImpl <em>Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.SubImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getSub()
     * @generated
     */
    EClass SUB = eINSTANCE.getSub();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB__LEFT = eINSTANCE.getSub_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB__RIGHT = eINSTANCE.getSub_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MulImpl <em>Mul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MulImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMul()
     * @generated
     */
    EClass MUL = eINSTANCE.getMul();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL__LEFT = eINSTANCE.getMul_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL__RIGHT = eINSTANCE.getMul_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.DivImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getParenthesis()
     * @generated
     */
    EClass PARENTHESIS = eINSTANCE.getParenthesis();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIS__EXP = eINSTANCE.getParenthesis_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ConstantImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl <em>Variable Use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVariableUse()
     * @generated
     */
    EClass VARIABLE_USE = eINSTANCE.getVariableUse();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_USE__REF = eINSTANCE.getVariableUse_Ref();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl <em>Let Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.LetBindingImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLetBinding()
     * @generated
     */
    EClass LET_BINDING = eINSTANCE.getLetBinding();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LET_BINDING__NAME = eINSTANCE.getLetBinding_Name();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_BINDING__BINDING = eINSTANCE.getLetBinding_Binding();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_BINDING__BODY = eINSTANCE.getLetBinding_Body();

  }

} //MathPackage
