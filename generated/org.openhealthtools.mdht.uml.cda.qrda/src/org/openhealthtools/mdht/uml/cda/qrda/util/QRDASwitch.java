/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage
 * @generated
 */
public class QRDASwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static QRDAPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public QRDASwitch() {
    if (modelPackage == null)
    {
      modelPackage = QRDAPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case QRDAPackage.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT:
      {
        QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument = (QualityReportingDocumentArchitectureDocument)theEObject;
        T result = caseQualityReportingDocumentArchitectureDocument(qualityReportingDocumentArchitectureDocument);
        if (result == null) result = caseClinicalDocument(qualityReportingDocumentArchitectureDocument);
        if (result == null) result = caseAct(qualityReportingDocumentArchitectureDocument);
        if (result == null) result = caseInfrastructureRoot(qualityReportingDocumentArchitectureDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QRDAPackage.MEASURE_SECTION:
      {
        MeasureSection measureSection = (MeasureSection)theEObject;
        T result = caseMeasureSection(measureSection);
        if (result == null) result = caseSection(measureSection);
        if (result == null) result = caseAct(measureSection);
        if (result == null) result = caseInfrastructureRoot(measureSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Quality Reporting Document Architecture Document</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quality Reporting Document Architecture Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseQualityReportingDocumentArchitectureDocument(QualityReportingDocumentArchitectureDocument object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Measure Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measure Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMeasureSection(MeasureSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAct(Act object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClinicalDocument(ClinicalDocument object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSection(Section object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
  public T defaultCase(EObject object) {
    return null;
  }

} //QRDASwitch
