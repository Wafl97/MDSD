/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.math;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.VariableBinding#getId <em>Id</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.VariableBinding#getBinding <em>Binding</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.VariableBinding#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getVariableBinding()
 * @model
 * @generated
 */
public interface VariableBinding extends Expression
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getVariableBinding_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.VariableBinding#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference.
   * @see #setBinding(Expression)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getVariableBinding_Binding()
   * @model containment="true"
   * @generated
   */
  Expression getBinding();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.VariableBinding#getBinding <em>Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding</em>' containment reference.
   * @see #getBinding()
   * @generated
   */
  void setBinding(Expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Expression)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getVariableBinding_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.VariableBinding#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // VariableBinding
