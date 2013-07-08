/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Barriers To Patient Care</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getBarriersToPatientCare()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='BarriersToPatientCareTemplateId BarriersToPatientCareCode BarriersToPatientCareCodeP BarriersToPatientCareValue BarriersToPatientCareValueP BarriersToPatientCareMoodCode' templateId.root='2.16.840.1.1133883.17.3.10.1.83' code.code='67523-1' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Barriers to patient care' constraints.validation.dependOn.BarriersToPatientCareCode='BarriersToPatientCareCodeP' value.codeSystem='2.16.840.1.113883.6.1' value.codeSystemName='LOINC' moodCode='EVN'"
 * @generated
 */
public interface BarriersToPatientCare extends Observation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.83\')'"
	* @generated
	*/
	boolean validateBarriersToPatientCareTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	* @generated
	*/
	boolean validateBarriersToPatientCareCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'67523-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	* @generated
	*/
	boolean validateBarriersToPatientCareCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA17306-4\' or value.code = \'LA17307-2\' or value.code = \'LA17308-0\' or value.code = \'LA17309-8\' or value.code = \'LA17310-6\' or value.code = \'LA17311-4\' or value.code = \'LA17312-2\' or value.code = \'LA17313-0\' or value.code = \'LA17314-8\' or value.code = \'LA17315-5\' or value.code = \'LA17316-3\' or value.code = \'LA17317-1\' or value.code = \'LA17318-9\' or value.code = \'LA17711-5\' or value.code = \'LA6301-1\')))'"
	* @generated
	*/
	boolean validateBarriersToPatientCareValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	* @generated
	*/
	boolean validateBarriersToPatientCareValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	* @generated
	*/
	boolean validateBarriersToPatientCareMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public BarriersToPatientCare init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarriersToPatientCare init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // BarriersToPatientCare