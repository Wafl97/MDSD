/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ex.setLang.impl;

import dk.sdu.mmmi.mdsd.ex.setLang.Expression;
import dk.sdu.mmmi.mdsd.ex.setLang.ExternalDef;
import dk.sdu.mmmi.mdsd.ex.setLang.Filter;
import dk.sdu.mmmi.mdsd.ex.setLang.SetLangPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.ex.setLang.impl.FilterImpl#getOp <em>Op</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.ex.setLang.impl.FilterImpl#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends ExpressionImpl implements Filter
{
  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected Expression op;

  /**
   * The cached value of the '{@link #getExternal() <em>External</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternal()
   * @generated
   * @ordered
   */
  protected ExternalDef external;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SetLangPackage.Literals.FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp(Expression newOp, NotificationChain msgs)
  {
    Expression oldOp = op;
    op = newOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetLangPackage.FILTER__OP, oldOp, newOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(Expression newOp)
  {
    if (newOp != op)
    {
      NotificationChain msgs = null;
      if (op != null)
        msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetLangPackage.FILTER__OP, null, msgs);
      if (newOp != null)
        msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetLangPackage.FILTER__OP, null, msgs);
      msgs = basicSetOp(newOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SetLangPackage.FILTER__OP, newOp, newOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalDef getExternal()
  {
    if (external != null && external.eIsProxy())
    {
      InternalEObject oldExternal = (InternalEObject)external;
      external = (ExternalDef)eResolveProxy(oldExternal);
      if (external != oldExternal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SetLangPackage.FILTER__EXTERNAL, oldExternal, external));
      }
    }
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDef basicGetExternal()
  {
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExternal(ExternalDef newExternal)
  {
    ExternalDef oldExternal = external;
    external = newExternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SetLangPackage.FILTER__EXTERNAL, oldExternal, external));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SetLangPackage.FILTER__OP:
        return basicSetOp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SetLangPackage.FILTER__OP:
        return getOp();
      case SetLangPackage.FILTER__EXTERNAL:
        if (resolve) return getExternal();
        return basicGetExternal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SetLangPackage.FILTER__OP:
        setOp((Expression)newValue);
        return;
      case SetLangPackage.FILTER__EXTERNAL:
        setExternal((ExternalDef)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SetLangPackage.FILTER__OP:
        setOp((Expression)null);
        return;
      case SetLangPackage.FILTER__EXTERNAL:
        setExternal((ExternalDef)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SetLangPackage.FILTER__OP:
        return op != null;
      case SetLangPackage.FILTER__EXTERNAL:
        return external != null;
    }
    return super.eIsSet(featureID);
  }

} //FilterImpl