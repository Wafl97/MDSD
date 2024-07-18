/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ex.setLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.ex.setLang.Filter#getOp <em>Op</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.ex.setLang.Filter#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.ex.setLang.SetLangPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends Expression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(Expression)
   * @see dk.sdu.mmmi.mdsd.ex.setLang.SetLangPackage#getFilter_Op()
   * @model containment="true"
   * @generated
   */
  Expression getOp();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.ex.setLang.Filter#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(Expression value);

  /**
   * Returns the value of the '<em><b>External</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>External</em>' reference.
   * @see #setExternal(ExternalDef)
   * @see dk.sdu.mmmi.mdsd.ex.setLang.SetLangPackage#getFilter_External()
   * @model
   * @generated
   */
  ExternalDef getExternal();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.ex.setLang.Filter#getExternal <em>External</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External</em>' reference.
   * @see #getExternal()
   * @generated
   */
  void setExternal(ExternalDef value);

} // Filter
