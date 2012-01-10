/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Order;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;

import org.openhealthtools.mdht.uml.cda.consol.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.Entity;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

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
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public class ConsolSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConsolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolSwitch() {
		if (modelPackage == null) {
			modelPackage = ConsolPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
					? defaultCase(theEObject)
					: doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS: {
				GeneralHeaderConstraints generalHeaderConstraints = (GeneralHeaderConstraints) theEObject;
				T result = caseGeneralHeaderConstraints(generalHeaderConstraints);
				if (result == null) {
					result = caseClinicalDocument(generalHeaderConstraints);
				}
				if (result == null) {
					result = caseAct(generalHeaderConstraints);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET: {
				GeneralHeaderConstraints_RecordTarget generalHeaderConstraints_RecordTarget = (GeneralHeaderConstraints_RecordTarget) theEObject;
				T result = caseGeneralHeaderConstraints_RecordTarget(generalHeaderConstraints_RecordTarget);
				if (result == null) {
					result = caseRecordTarget(generalHeaderConstraints_RecordTarget);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_RecordTarget);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_RecordTarget);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RECORD_TARGET_PATIENT_ROLE: {
				RecordTarget_PatientRole recordTarget_PatientRole = (RecordTarget_PatientRole) theEObject;
				T result = caseRecordTarget_PatientRole(recordTarget_PatientRole);
				if (result == null) {
					result = casePatientRole(recordTarget_PatientRole);
				}
				if (result == null) {
					result = caseRole(recordTarget_PatientRole);
				}
				if (result == null) {
					result = caseInfrastructureRoot(recordTarget_PatientRole);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PATIENT_ROLE_PATIENT: {
				PatientRole_Patient patientRole_Patient = (PatientRole_Patient) theEObject;
				T result = casePatientRole_Patient(patientRole_Patient);
				if (result == null) {
					result = casePatient(patientRole_Patient);
				}
				if (result == null) {
					result = caseEntity(patientRole_Patient);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patientRole_Patient);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PATIENT_GUARDIAN: {
				Patient_Guardian patient_Guardian = (Patient_Guardian) theEObject;
				T result = casePatient_Guardian(patient_Guardian);
				if (result == null) {
					result = caseGuardian(patient_Guardian);
				}
				if (result == null) {
					result = caseRole(patient_Guardian);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patient_Guardian);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PATIENT_LANGUAGE_COMMUNICATION: {
				Patient_LanguageCommunication patient_LanguageCommunication = (Patient_LanguageCommunication) theEObject;
				T result = casePatient_LanguageCommunication(patient_LanguageCommunication);
				if (result == null) {
					result = caseLanguageCommunication(patient_LanguageCommunication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PATIENT_BIRTHPLACE: {
				Patient_Birthplace patient_Birthplace = (Patient_Birthplace) theEObject;
				T result = casePatient_Birthplace(patient_Birthplace);
				if (result == null) {
					result = caseBirthplace(patient_Birthplace);
				}
				if (result == null) {
					result = caseRole(patient_Birthplace);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patient_Birthplace);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.BIRTHPLACE_PLACE: {
				Birthplace_Place birthplace_Place = (Birthplace_Place) theEObject;
				T result = caseBirthplace_Place(birthplace_Place);
				if (result == null) {
					result = casePlace(birthplace_Place);
				}
				if (result == null) {
					result = caseEntity(birthplace_Place);
				}
				if (result == null) {
					result = caseInfrastructureRoot(birthplace_Place);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PATIENT_ROLE_PROVIDER_ORGANIZATION: {
				PatientRole_ProviderOrganization patientRole_ProviderOrganization = (PatientRole_ProviderOrganization) theEObject;
				T result = casePatientRole_ProviderOrganization(patientRole_ProviderOrganization);
				if (result == null) {
					result = caseOrganization(patientRole_ProviderOrganization);
				}
				if (result == null) {
					result = caseEntity(patientRole_ProviderOrganization);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patientRole_ProviderOrganization);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF: {
				GeneralHeaderConstraints_ComponentOf generalHeaderConstraints_ComponentOf = (GeneralHeaderConstraints_ComponentOf) theEObject;
				T result = caseGeneralHeaderConstraints_ComponentOf(generalHeaderConstraints_ComponentOf);
				if (result == null) {
					result = caseComponent1(generalHeaderConstraints_ComponentOf);
				}
				if (result == null) {
					result = caseActRelationship(generalHeaderConstraints_ComponentOf);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_ComponentOf);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER: {
				ComponentOf_EncompassingEncounter componentOf_EncompassingEncounter = (ComponentOf_EncompassingEncounter) theEObject;
				T result = caseComponentOf_EncompassingEncounter(componentOf_EncompassingEncounter);
				if (result == null) {
					result = caseEncompassingEncounter(componentOf_EncompassingEncounter);
				}
				if (result == null) {
					result = caseAct(componentOf_EncompassingEncounter);
				}
				if (result == null) {
					result = caseInfrastructureRoot(componentOf_EncompassingEncounter);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_AUTHOR: {
				GeneralHeaderConstraints_Author generalHeaderConstraints_Author = (GeneralHeaderConstraints_Author) theEObject;
				T result = caseGeneralHeaderConstraints_Author(generalHeaderConstraints_Author);
				if (result == null) {
					result = caseAuthor(generalHeaderConstraints_Author);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_Author);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_Author);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.AUTHOR_ASSIGNED_AUTHOR: {
				Author_AssignedAuthor author_AssignedAuthor = (Author_AssignedAuthor) theEObject;
				T result = caseAuthor_AssignedAuthor(author_AssignedAuthor);
				if (result == null) {
					result = caseAssignedAuthor(author_AssignedAuthor);
				}
				if (result == null) {
					result = caseRole(author_AssignedAuthor);
				}
				if (result == null) {
					result = caseInfrastructureRoot(author_AssignedAuthor);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ASSIGNED_AUTHOR_AUTHORING_DEVICE: {
				AssignedAuthor_AuthoringDevice assignedAuthor_AuthoringDevice = (AssignedAuthor_AuthoringDevice) theEObject;
				T result = caseAssignedAuthor_AuthoringDevice(assignedAuthor_AuthoringDevice);
				if (result == null) {
					result = caseAuthoringDevice(assignedAuthor_AuthoringDevice);
				}
				if (result == null) {
					result = caseEntity(assignedAuthor_AuthoringDevice);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assignedAuthor_AuthoringDevice);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_PERSON: {
				GeneralHeaderConstraints_Person generalHeaderConstraints_Person = (GeneralHeaderConstraints_Person) theEObject;
				T result = caseGeneralHeaderConstraints_Person(generalHeaderConstraints_Person);
				if (result == null) {
					result = casePerson(generalHeaderConstraints_Person);
				}
				if (result == null) {
					result = caseEntity(generalHeaderConstraints_Person);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_Person);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER: {
				GeneralHeaderConstraints_DataEnterer generalHeaderConstraints_DataEnterer = (GeneralHeaderConstraints_DataEnterer) theEObject;
				T result = caseGeneralHeaderConstraints_DataEnterer(generalHeaderConstraints_DataEnterer);
				if (result == null) {
					result = caseDataEnterer(generalHeaderConstraints_DataEnterer);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_DataEnterer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_DataEnterer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DATA_ENTERER_ASSIGNED_ENTITY: {
				DataEnterer_AssignedEntity dataEnterer_AssignedEntity = (DataEnterer_AssignedEntity) theEObject;
				T result = caseDataEnterer_AssignedEntity(dataEnterer_AssignedEntity);
				if (result == null) {
					result = caseAssignedEntity(dataEnterer_AssignedEntity);
				}
				if (result == null) {
					result = caseRole(dataEnterer_AssignedEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dataEnterer_AssignedEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_CUSTODIAN: {
				GeneralHeaderConstraints_Custodian generalHeaderConstraints_Custodian = (GeneralHeaderConstraints_Custodian) theEObject;
				T result = caseGeneralHeaderConstraints_Custodian(generalHeaderConstraints_Custodian);
				if (result == null) {
					result = caseCustodian(generalHeaderConstraints_Custodian);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_Custodian);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_Custodian);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CUSTODIAN_ASSIGNED_CUSTODIAN: {
				Custodian_AssignedCustodian custodian_AssignedCustodian = (Custodian_AssignedCustodian) theEObject;
				T result = caseCustodian_AssignedCustodian(custodian_AssignedCustodian);
				if (result == null) {
					result = caseAssignedCustodian(custodian_AssignedCustodian);
				}
				if (result == null) {
					result = caseRole(custodian_AssignedCustodian);
				}
				if (result == null) {
					result = caseInfrastructureRoot(custodian_AssignedCustodian);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION: {
				AssignedCustodian_CustodianOrganization assignedCustodian_CustodianOrganization = (AssignedCustodian_CustodianOrganization) theEObject;
				T result = caseAssignedCustodian_CustodianOrganization(assignedCustodian_CustodianOrganization);
				if (result == null) {
					result = caseCustodianOrganization(assignedCustodian_CustodianOrganization);
				}
				if (result == null) {
					result = caseEntity(assignedCustodian_CustodianOrganization);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assignedCustodian_CustodianOrganization);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT: {
				GeneralHeaderConstraints_InformationRecipient generalHeaderConstraints_InformationRecipient = (GeneralHeaderConstraints_InformationRecipient) theEObject;
				T result = caseGeneralHeaderConstraints_InformationRecipient(generalHeaderConstraints_InformationRecipient);
				if (result == null) {
					result = caseInformationRecipient(generalHeaderConstraints_InformationRecipient);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_InformationRecipient);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_InformationRecipient);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INFORMATION_RECIPIENT_INTENDED_RECIPIENT: {
				InformationRecipient_IntendedRecipient informationRecipient_IntendedRecipient = (InformationRecipient_IntendedRecipient) theEObject;
				T result = caseInformationRecipient_IntendedRecipient(informationRecipient_IntendedRecipient);
				if (result == null) {
					result = caseIntendedRecipient(informationRecipient_IntendedRecipient);
				}
				if (result == null) {
					result = caseRole(informationRecipient_IntendedRecipient);
				}
				if (result == null) {
					result = caseInfrastructureRoot(informationRecipient_IntendedRecipient);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INTENDED_RECIPIENT_ORGANIZATION: {
				IntendedRecipient_Organization intendedRecipient_Organization = (IntendedRecipient_Organization) theEObject;
				T result = caseIntendedRecipient_Organization(intendedRecipient_Organization);
				if (result == null) {
					result = caseOrganization(intendedRecipient_Organization);
				}
				if (result == null) {
					result = caseEntity(intendedRecipient_Organization);
				}
				if (result == null) {
					result = caseInfrastructureRoot(intendedRecipient_Organization);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR: {
				GeneralHeaderConstraints_LegalAuthenticator generalHeaderConstraints_LegalAuthenticator = (GeneralHeaderConstraints_LegalAuthenticator) theEObject;
				T result = caseGeneralHeaderConstraints_LegalAuthenticator(generalHeaderConstraints_LegalAuthenticator);
				if (result == null) {
					result = caseLegalAuthenticator(generalHeaderConstraints_LegalAuthenticator);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_LegalAuthenticator);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_LegalAuthenticator);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY: {
				LegalAuthenticator_AssignedEntity legalAuthenticator_AssignedEntity = (LegalAuthenticator_AssignedEntity) theEObject;
				T result = caseLegalAuthenticator_AssignedEntity(legalAuthenticator_AssignedEntity);
				if (result == null) {
					result = caseAssignedEntity(legalAuthenticator_AssignedEntity);
				}
				if (result == null) {
					result = caseRole(legalAuthenticator_AssignedEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(legalAuthenticator_AssignedEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR: {
				GeneralHeaderConstraints_Authenticator generalHeaderConstraints_Authenticator = (GeneralHeaderConstraints_Authenticator) theEObject;
				T result = caseGeneralHeaderConstraints_Authenticator(generalHeaderConstraints_Authenticator);
				if (result == null) {
					result = caseAuthenticator(generalHeaderConstraints_Authenticator);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_Authenticator);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_Authenticator);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.AUTHENTICATOR_ASSIGNED_ENTITY: {
				Authenticator_AssignedEntity authenticator_AssignedEntity = (Authenticator_AssignedEntity) theEObject;
				T result = caseAuthenticator_AssignedEntity(authenticator_AssignedEntity);
				if (result == null) {
					result = caseAssignedEntity(authenticator_AssignedEntity);
				}
				if (result == null) {
					result = caseRole(authenticator_AssignedEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(authenticator_AssignedEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_INFORMANT: {
				GeneralHeaderConstraints_Informant generalHeaderConstraints_Informant = (GeneralHeaderConstraints_Informant) theEObject;
				T result = caseGeneralHeaderConstraints_Informant(generalHeaderConstraints_Informant);
				if (result == null) {
					result = caseInformant12(generalHeaderConstraints_Informant);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_Informant);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_Informant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INFORMANT_ASSIGNED_ENTITY: {
				Informant_AssignedEntity informant_AssignedEntity = (Informant_AssignedEntity) theEObject;
				T result = caseInformant_AssignedEntity(informant_AssignedEntity);
				if (result == null) {
					result = caseAssignedEntity(informant_AssignedEntity);
				}
				if (result == null) {
					result = caseRole(informant_AssignedEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(informant_AssignedEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INFORMANT_RELATED_ENTITY: {
				Informant_RelatedEntity informant_RelatedEntity = (Informant_RelatedEntity) theEObject;
				T result = caseInformant_RelatedEntity(informant_RelatedEntity);
				if (result == null) {
					result = caseRelatedEntity(informant_RelatedEntity);
				}
				if (result == null) {
					result = caseRole(informant_RelatedEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(informant_RelatedEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT: {
				GeneralHeaderConstraints_ParticipantSupport generalHeaderConstraints_ParticipantSupport = (GeneralHeaderConstraints_ParticipantSupport) theEObject;
				T result = caseGeneralHeaderConstraints_ParticipantSupport(generalHeaderConstraints_ParticipantSupport);
				if (result == null) {
					result = caseParticipant1(generalHeaderConstraints_ParticipantSupport);
				}
				if (result == null) {
					result = caseParticipation(generalHeaderConstraints_ParticipantSupport);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_ParticipantSupport);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF: {
				GeneralHeaderConstraints_InFulfillmentOf generalHeaderConstraints_InFulfillmentOf = (GeneralHeaderConstraints_InFulfillmentOf) theEObject;
				T result = caseGeneralHeaderConstraints_InFulfillmentOf(generalHeaderConstraints_InFulfillmentOf);
				if (result == null) {
					result = caseInFulfillmentOf(generalHeaderConstraints_InFulfillmentOf);
				}
				if (result == null) {
					result = caseActRelationship(generalHeaderConstraints_InFulfillmentOf);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints_InFulfillmentOf);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IN_FULFILLMENT_OF_ORDER: {
				InFulfillmentOf_Order inFulfillmentOf_Order = (InFulfillmentOf_Order) theEObject;
				T result = caseInFulfillmentOf_Order(inFulfillmentOf_Order);
				if (result == null) {
					result = caseOrder(inFulfillmentOf_Order);
				}
				if (result == null) {
					result = caseAct(inFulfillmentOf_Order);
				}
				if (result == null) {
					result = caseInfrastructureRoot(inFulfillmentOf_Order);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_PROBLEM_ACT: {
				AllergyProblemAct allergyProblemAct = (AllergyProblemAct) theEObject;
				T result = caseAllergyProblemAct(allergyProblemAct);
				if (result == null) {
					result = caseCDA_Act(allergyProblemAct);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyProblemAct);
				}
				if (result == null) {
					result = caseAct(allergyProblemAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyProblemAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION: {
				AllergyObservation allergyObservation = (AllergyObservation) theEObject;
				T result = caseAllergyObservation(allergyObservation);
				if (result == null) {
					result = caseObservation(allergyObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyObservation);
				}
				if (result == null) {
					result = caseAct(allergyObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REACTION_OBSERVATION: {
				ReactionObservation reactionObservation = (ReactionObservation) theEObject;
				T result = caseReactionObservation(reactionObservation);
				if (result == null) {
					result = caseObservation(reactionObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(reactionObservation);
				}
				if (result == null) {
					result = caseAct(reactionObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reactionObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SEVERITY_OBSERVATION: {
				SeverityObservation severityObservation = (SeverityObservation) theEObject;
				T result = caseSeverityObservation(severityObservation);
				if (result == null) {
					result = caseObservation(severityObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(severityObservation);
				}
				if (result == null) {
					result = caseAct(severityObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(severityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE: {
				ProcedureActivityProcedure procedureActivityProcedure = (ProcedureActivityProcedure) theEObject;
				T result = caseProcedureActivityProcedure(procedureActivityProcedure);
				if (result == null) {
					result = caseProcedure(procedureActivityProcedure);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityProcedure);
				}
				if (result == null) {
					result = caseAct(procedureActivityProcedure);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INDICATION: {
				Indication indication = (Indication) theEObject;
				T result = caseIndication(indication);
				if (result == null) {
					result = caseObservation(indication);
				}
				if (result == null) {
					result = caseClinicalStatement(indication);
				}
				if (result == null) {
					result = caseAct(indication);
				}
				if (result == null) {
					result = caseInfrastructureRoot(indication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SERVICE_DELIVERY_LOCATION: {
				ServiceDeliveryLocation serviceDeliveryLocation = (ServiceDeliveryLocation) theEObject;
				T result = caseServiceDeliveryLocation(serviceDeliveryLocation);
				if (result == null) {
					result = caseParticipantRole(serviceDeliveryLocation);
				}
				if (result == null) {
					result = caseRole(serviceDeliveryLocation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(serviceDeliveryLocation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_ACTIVITY: {
				MedicationActivity medicationActivity = (MedicationActivity) theEObject;
				T result = caseMedicationActivity(medicationActivity);
				if (result == null) {
					result = caseSubstanceAdministration(medicationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationActivity);
				}
				if (result == null) {
					result = caseAct(medicationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_SUPPLY_ORDER: {
				MedicationSupplyOrder medicationSupplyOrder = (MedicationSupplyOrder) theEObject;
				T result = caseMedicationSupplyOrder(medicationSupplyOrder);
				if (result == null) {
					result = caseSupply(medicationSupplyOrder);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationSupplyOrder);
				}
				if (result == null) {
					result = caseAct(medicationSupplyOrder);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationSupplyOrder);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INSTRUCTIONS: {
				Instructions instructions = (Instructions) theEObject;
				T result = caseInstructions(instructions);
				if (result == null) {
					result = caseCDA_Act(instructions);
				}
				if (result == null) {
					result = caseClinicalStatement(instructions);
				}
				if (result == null) {
					result = caseAct(instructions);
				}
				if (result == null) {
					result = caseInfrastructureRoot(instructions);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_DISPENSE: {
				MedicationDispense medicationDispense = (MedicationDispense) theEObject;
				T result = caseMedicationDispense(medicationDispense);
				if (result == null) {
					result = caseSupply(medicationDispense);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationDispense);
				}
				if (result == null) {
					result = caseAct(medicationDispense);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationDispense);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DRUG_VEHICLE: {
				DrugVehicle drugVehicle = (DrugVehicle) theEObject;
				T result = caseDrugVehicle(drugVehicle);
				if (result == null) {
					result = caseParticipantRole(drugVehicle);
				}
				if (result == null) {
					result = caseRole(drugVehicle);
				}
				if (result == null) {
					result = caseInfrastructureRoot(drugVehicle);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PRODUCT_INSTANCE: {
				ProductInstance productInstance = (ProductInstance) theEObject;
				T result = caseProductInstance(productInstance);
				if (result == null) {
					result = caseParticipantRole(productInstance);
				}
				if (result == null) {
					result = caseRole(productInstance);
				}
				if (result == null) {
					result = caseInfrastructureRoot(productInstance);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_STATUS_OBSERVATION: {
				AllergyStatusObservation allergyStatusObservation = (AllergyStatusObservation) theEObject;
				T result = caseAllergyStatusObservation(allergyStatusObservation);
				if (result == null) {
					result = caseObservation(allergyStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyStatusObservation);
				}
				if (result == null) {
					result = caseAct(allergyStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.AGE_OBSERVATION: {
				AgeObservation ageObservation = (AgeObservation) theEObject;
				T result = caseAgeObservation(ageObservation);
				if (result == null) {
					result = caseObservation(ageObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(ageObservation);
				}
				if (result == null) {
					result = caseAct(ageObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(ageObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HEALTH_STATUS_OBSERVATION: {
				HealthStatusObservation healthStatusObservation = (HealthStatusObservation) theEObject;
				T result = caseHealthStatusObservation(healthStatusObservation);
				if (result == null) {
					result = caseObservation(healthStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(healthStatusObservation);
				}
				if (result == null) {
					result = caseAct(healthStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COMMENT: {
				Comment comment = (Comment) theEObject;
				T result = caseComment(comment);
				if (result == null) {
					result = caseCDA_Act(comment);
				}
				if (result == null) {
					result = caseClinicalStatement(comment);
				}
				if (result == null) {
					result = caseAct(comment);
				}
				if (result == null) {
					result = caseInfrastructureRoot(comment);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_SERIES_NUMBER_OBSERVATION: {
				MedicationSeriesNumberObservation medicationSeriesNumberObservation = (MedicationSeriesNumberObservation) theEObject;
				T result = caseMedicationSeriesNumberObservation(medicationSeriesNumberObservation);
				if (result == null) {
					result = caseObservation(medicationSeriesNumberObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationSeriesNumberObservation);
				}
				if (result == null) {
					result = caseAct(medicationSeriesNumberObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationSeriesNumberObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_STATUS_OBSERVATION: {
				MedicationStatusObservation medicationStatusObservation = (MedicationStatusObservation) theEObject;
				T result = caseMedicationStatusObservation(medicationStatusObservation);
				if (result == null) {
					result = caseObservation(medicationStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationStatusObservation);
				}
				if (result == null) {
					result = caseAct(medicationStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INTERNAL_REFERENCE: {
				InternalReference internalReference = (InternalReference) theEObject;
				T result = caseInternalReference(internalReference);
				if (result == null) {
					result = caseCDA_Act(internalReference);
				}
				if (result == null) {
					result = caseClinicalStatement(internalReference);
				}
				if (result == null) {
					result = caseAct(internalReference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(internalReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_TYPE: {
				MedicationType medicationType = (MedicationType) theEObject;
				T result = caseMedicationType(medicationType);
				if (result == null) {
					result = caseObservation(medicationType);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationType);
				}
				if (result == null) {
					result = caseAct(medicationType);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationType);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NON_MEDICINAL_SUPPLY_ACTIVITY: {
				NonMedicinalSupplyActivity nonMedicinalSupplyActivity = (NonMedicinalSupplyActivity) theEObject;
				T result = caseNonMedicinalSupplyActivity(nonMedicinalSupplyActivity);
				if (result == null) {
					result = caseSupply(nonMedicinalSupplyActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(nonMedicinalSupplyActivity);
				}
				if (result == null) {
					result = caseAct(nonMedicinalSupplyActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(nonMedicinalSupplyActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS: {
				MedicationFullfillmentInstructions medicationFullfillmentInstructions = (MedicationFullfillmentInstructions) theEObject;
				T result = caseMedicationFullfillmentInstructions(medicationFullfillmentInstructions);
				if (result == null) {
					result = caseCDA_Act(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = caseAct(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_CONCERN_ACT: {
				ProblemConcernAct problemConcernAct = (ProblemConcernAct) theEObject;
				T result = caseProblemConcernAct(problemConcernAct);
				if (result == null) {
					result = caseCDA_Act(problemConcernAct);
				}
				if (result == null) {
					result = caseClinicalStatement(problemConcernAct);
				}
				if (result == null) {
					result = caseAct(problemConcernAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemConcernAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_OBSERVATION: {
				ProblemObservation problemObservation = (ProblemObservation) theEObject;
				T result = caseProblemObservation(problemObservation);
				if (result == null) {
					result = caseObservation(problemObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(problemObservation);
				}
				if (result == null) {
					result = caseAct(problemObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_STATUS: {
				ProblemStatus problemStatus = (ProblemStatus) theEObject;
				T result = caseProblemStatus(problemStatus);
				if (result == null) {
					result = caseObservation(problemStatus);
				}
				if (result == null) {
					result = caseClinicalStatement(problemStatus);
				}
				if (result == null) {
					result = caseAct(problemStatus);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemStatus);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT: {
				ContinuityOfCareDocument continuityOfCareDocument = (ContinuityOfCareDocument) theEObject;
				T result = caseContinuityOfCareDocument(continuityOfCareDocument);
				if (result == null) {
					result = caseGeneralHeaderConstraints(continuityOfCareDocument);
				}
				if (result == null) {
					result = caseClinicalDocument(continuityOfCareDocument);
				}
				if (result == null) {
					result = caseAct(continuityOfCareDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(continuityOfCareDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL: {
				AdvanceDirectivesSectionEntriesOptional advanceDirectivesSectionEntriesOptional = (AdvanceDirectivesSectionEntriesOptional) theEObject;
				T result = caseAdvanceDirectivesSectionEntriesOptional(advanceDirectivesSectionEntriesOptional);
				if (result == null) {
					result = caseSection(advanceDirectivesSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(advanceDirectivesSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectivesSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION: {
				AdvanceDirectiveObservation advanceDirectiveObservation = (AdvanceDirectiveObservation) theEObject;
				T result = caseAdvanceDirectiveObservation(advanceDirectiveObservation);
				if (result == null) {
					result = caseObservation(advanceDirectiveObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(advanceDirectiveObservation);
				}
				if (result == null) {
					result = caseAct(advanceDirectiveObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE: {
				AdvanceDirectiveObservation_Reference advanceDirectiveObservation_Reference = (AdvanceDirectiveObservation_Reference) theEObject;
				T result = caseAdvanceDirectiveObservation_Reference(advanceDirectiveObservation_Reference);
				if (result == null) {
					result = caseReference(advanceDirectiveObservation_Reference);
				}
				if (result == null) {
					result = caseActRelationship(advanceDirectiveObservation_Reference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveObservation_Reference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REFERENCE_EXTERNAL_DOCUMENT: {
				Reference_ExternalDocument reference_ExternalDocument = (Reference_ExternalDocument) theEObject;
				T result = caseReference_ExternalDocument(reference_ExternalDocument);
				if (result == null) {
					result = caseExternalDocument(reference_ExternalDocument);
				}
				if (result == null) {
					result = caseAct(reference_ExternalDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reference_ExternalDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN: {
				AdvanceDirectiveObservation_Custodian advanceDirectiveObservation_Custodian = (AdvanceDirectiveObservation_Custodian) theEObject;
				T result = caseAdvanceDirectiveObservation_Custodian(advanceDirectiveObservation_Custodian);
				if (result == null) {
					result = caseParticipant2(advanceDirectiveObservation_Custodian);
				}
				if (result == null) {
					result = caseParticipation(advanceDirectiveObservation_Custodian);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveObservation_Custodian);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CUSTODIAN_CUSTODIAN_ROLE: {
				Custodian_CustodianRole custodian_CustodianRole = (Custodian_CustodianRole) theEObject;
				T result = caseCustodian_CustodianRole(custodian_CustodianRole);
				if (result == null) {
					result = caseParticipantRole(custodian_CustodianRole);
				}
				if (result == null) {
					result = caseRole(custodian_CustodianRole);
				}
				if (result == null) {
					result = caseInfrastructureRoot(custodian_CustodianRole);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CUSTODIAN_ROLE_CUSTODIAN_ENTITY: {
				CustodianRole_CustodianEntity custodianRole_CustodianEntity = (CustodianRole_CustodianEntity) theEObject;
				T result = caseCustodianRole_CustodianEntity(custodianRole_CustodianEntity);
				if (result == null) {
					result = casePlayingEntity(custodianRole_CustodianEntity);
				}
				if (result == null) {
					result = caseEntity(custodianRole_CustodianEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(custodianRole_CustodianEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER: {
				AdvanceDirectiveObservation_Verifier advanceDirectiveObservation_Verifier = (AdvanceDirectiveObservation_Verifier) theEObject;
				T result = caseAdvanceDirectiveObservation_Verifier(advanceDirectiveObservation_Verifier);
				if (result == null) {
					result = caseParticipant2(advanceDirectiveObservation_Verifier);
				}
				if (result == null) {
					result = caseParticipation(advanceDirectiveObservation_Verifier);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveObservation_Verifier);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGIES_SECTION: {
				AllergiesSection allergiesSection = (AllergiesSection) theEObject;
				T result = caseAllergiesSection(allergiesSection);
				if (result == null) {
					result = caseAllergiesSectionEntriesOptional(allergiesSection);
				}
				if (result == null) {
					result = caseSection(allergiesSection);
				}
				if (result == null) {
					result = caseAct(allergiesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergiesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL: {
				AllergiesSectionEntriesOptional allergiesSectionEntriesOptional = (AllergiesSectionEntriesOptional) theEObject;
				T result = caseAllergiesSectionEntriesOptional(allergiesSectionEntriesOptional);
				if (result == null) {
					result = caseSection(allergiesSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(allergiesSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergiesSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL: {
				EncountersSectionEntriesOptional encountersSectionEntriesOptional = (EncountersSectionEntriesOptional) theEObject;
				T result = caseEncountersSectionEntriesOptional(encountersSectionEntriesOptional);
				if (result == null) {
					result = caseSection(encountersSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(encountersSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encountersSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER_ACTIVITIES: {
				EncounterActivities encounterActivities = (EncounterActivities) theEObject;
				T result = caseEncounterActivities(encounterActivities);
				if (result == null) {
					result = caseCDA_Encounter(encounterActivities);
				}
				if (result == null) {
					result = caseClinicalStatement(encounterActivities);
				}
				if (result == null) {
					result = caseAct(encounterActivities);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterActivities);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL: {
				ImmunizationsSectionEntriesOptional immunizationsSectionEntriesOptional = (ImmunizationsSectionEntriesOptional) theEObject;
				T result = caseImmunizationsSectionEntriesOptional(immunizationsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(immunizationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(immunizationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATION_ACTIVITY: {
				ImmunizationActivity immunizationActivity = (ImmunizationActivity) theEObject;
				T result = caseImmunizationActivity(immunizationActivity);
				if (result == null) {
					result = caseSubstanceAdministration(immunizationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(immunizationActivity);
				}
				if (result == null) {
					result = caseAct(immunizationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATION_REFUSAL_REASON: {
				ImmunizationRefusalReason immunizationRefusalReason = (ImmunizationRefusalReason) theEObject;
				T result = caseImmunizationRefusalReason(immunizationRefusalReason);
				if (result == null) {
					result = caseObservation(immunizationRefusalReason);
				}
				if (result == null) {
					result = caseClinicalStatement(immunizationRefusalReason);
				}
				if (result == null) {
					result = caseAct(immunizationRefusalReason);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationRefusalReason);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PAYERS_SECTION: {
				PayersSection payersSection = (PayersSection) theEObject;
				T result = casePayersSection(payersSection);
				if (result == null) {
					result = caseSection(payersSection);
				}
				if (result == null) {
					result = caseAct(payersSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(payersSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COVERAGE_ACTIVITY: {
				CoverageActivity coverageActivity = (CoverageActivity) theEObject;
				T result = caseCoverageActivity(coverageActivity);
				if (result == null) {
					result = caseCDA_Act(coverageActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(coverageActivity);
				}
				if (result == null) {
					result = caseAct(coverageActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(coverageActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POLICY_ACTIVITY: {
				PolicyActivity policyActivity = (PolicyActivity) theEObject;
				T result = casePolicyActivity(policyActivity);
				if (result == null) {
					result = caseCDA_Act(policyActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(policyActivity);
				}
				if (result == null) {
					result = caseAct(policyActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(policyActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.AUTHORIZATION_ACTIVITY: {
				AuthorizationActivity authorizationActivity = (AuthorizationActivity) theEObject;
				T result = caseAuthorizationActivity(authorizationActivity);
				if (result == null) {
					result = caseCDA_Act(authorizationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(authorizationActivity);
				}
				if (result == null) {
					result = caseAct(authorizationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(authorizationActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATIONS_SECTION: {
				MedicationsSection medicationsSection = (MedicationsSection) theEObject;
				T result = caseMedicationsSection(medicationsSection);
				if (result == null) {
					result = caseMedicationsSectionEntriesOptional(medicationsSection);
				}
				if (result == null) {
					result = caseSection(medicationsSection);
				}
				if (result == null) {
					result = caseAct(medicationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				MedicationsSectionEntriesOptional medicationsSectionEntriesOptional = (MedicationsSectionEntriesOptional) theEObject;
				T result = caseMedicationsSectionEntriesOptional(medicationsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(medicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(medicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_SECTION: {
				PlanOfCareSection planOfCareSection = (PlanOfCareSection) theEObject;
				T result = casePlanOfCareSection(planOfCareSection);
				if (result == null) {
					result = caseSection(planOfCareSection);
				}
				if (result == null) {
					result = caseAct(planOfCareSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT: {
				PlanOfCareActivityAct planOfCareActivityAct = (PlanOfCareActivityAct) theEObject;
				T result = casePlanOfCareActivityAct(planOfCareActivityAct);
				if (result == null) {
					result = caseCDA_Act(planOfCareActivityAct);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivityAct);
				}
				if (result == null) {
					result = caseAct(planOfCareActivityAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivityAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER: {
				PlanOfCareActivityEncounter planOfCareActivityEncounter = (PlanOfCareActivityEncounter) theEObject;
				T result = casePlanOfCareActivityEncounter(planOfCareActivityEncounter);
				if (result == null) {
					result = caseCDA_Encounter(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = caseAct(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION: {
				PlanOfCareActivityObservation planOfCareActivityObservation = (PlanOfCareActivityObservation) theEObject;
				T result = casePlanOfCareActivityObservation(planOfCareActivityObservation);
				if (result == null) {
					result = caseObservation(planOfCareActivityObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivityObservation);
				}
				if (result == null) {
					result = caseAct(planOfCareActivityObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE: {
				PlanOfCareActivityProcedure planOfCareActivityProcedure = (PlanOfCareActivityProcedure) theEObject;
				T result = casePlanOfCareActivityProcedure(planOfCareActivityProcedure);
				if (result == null) {
					result = caseProcedure(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseAct(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: {
				PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration = (PlanOfCareActivitySubstanceAdministration) theEObject;
				T result = casePlanOfCareActivitySubstanceAdministration(planOfCareActivitySubstanceAdministration);
				if (result == null) {
					result = caseSubstanceAdministration(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = caseAct(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY: {
				PlanOfCareActivitySupply planOfCareActivitySupply = (PlanOfCareActivitySupply) theEObject;
				T result = casePlanOfCareActivitySupply(planOfCareActivitySupply);
				if (result == null) {
					result = caseSupply(planOfCareActivitySupply);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivitySupply);
				}
				if (result == null) {
					result = caseAct(planOfCareActivitySupply);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivitySupply);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURES_SECTION: {
				ProceduresSection proceduresSection = (ProceduresSection) theEObject;
				T result = caseProceduresSection(proceduresSection);
				if (result == null) {
					result = caseProceduresSectionEntriesOptional(proceduresSection);
				}
				if (result == null) {
					result = caseSection(proceduresSection);
				}
				if (result == null) {
					result = caseAct(proceduresSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(proceduresSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURES_SECTION_ENTRIES_OPTIONAL: {
				ProceduresSectionEntriesOptional proceduresSectionEntriesOptional = (ProceduresSectionEntriesOptional) theEObject;
				T result = caseProceduresSectionEntriesOptional(proceduresSectionEntriesOptional);
				if (result == null) {
					result = caseSection(proceduresSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(proceduresSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(proceduresSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION: {
				ProcedureActivityObservation procedureActivityObservation = (ProcedureActivityObservation) theEObject;
				T result = caseProcedureActivityObservation(procedureActivityObservation);
				if (result == null) {
					result = caseObservation(procedureActivityObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityObservation);
				}
				if (result == null) {
					result = caseAct(procedureActivityObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT: {
				ProcedureActivityAct procedureActivityAct = (ProcedureActivityAct) theEObject;
				T result = caseProcedureActivityAct(procedureActivityAct);
				if (result == null) {
					result = caseCDA_Act(procedureActivityAct);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityAct);
				}
				if (result == null) {
					result = caseAct(procedureActivityAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL: {
				VitalSignsSectionEntriesOptional vitalSignsSectionEntriesOptional = (VitalSignsSectionEntriesOptional) theEObject;
				T result = caseVitalSignsSectionEntriesOptional(vitalSignsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(vitalSignsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(vitalSignsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_ORGANIZER: {
				VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer) theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) {
					result = caseOrganizer(vitalSignsOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(vitalSignsOrganizer);
				}
				if (result == null) {
					result = caseAct(vitalSignsOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGN_OBSERVATION: {
				VitalSignObservation vitalSignObservation = (VitalSignObservation) theEObject;
				T result = caseVitalSignObservation(vitalSignObservation);
				if (result == null) {
					result = caseObservation(vitalSignObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(vitalSignObservation);
				}
				if (result == null) {
					result = caseAct(vitalSignObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_SECTION: {
				FamilyHistorySection familyHistorySection = (FamilyHistorySection) theEObject;
				T result = caseFamilyHistorySection(familyHistorySection);
				if (result == null) {
					result = caseSection(familyHistorySection);
				}
				if (result == null) {
					result = caseAct(familyHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_ORGANIZER: {
				FamilyHistoryOrganizer familyHistoryOrganizer = (FamilyHistoryOrganizer) theEObject;
				T result = caseFamilyHistoryOrganizer(familyHistoryOrganizer);
				if (result == null) {
					result = caseOrganizer(familyHistoryOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryOrganizer);
				}
				if (result == null) {
					result = caseAct(familyHistoryOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION: {
				FamilyHistoryObservation familyHistoryObservation = (FamilyHistoryObservation) theEObject;
				T result = caseFamilyHistoryObservation(familyHistoryObservation);
				if (result == null) {
					result = caseObservation(familyHistoryObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryObservation);
				}
				if (result == null) {
					result = caseAct(familyHistoryObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_DEATH_OBSERVATION: {
				FamilyHistoryDeathObservation familyHistoryDeathObservation = (FamilyHistoryDeathObservation) theEObject;
				T result = caseFamilyHistoryDeathObservation(familyHistoryDeathObservation);
				if (result == null) {
					result = caseObservation(familyHistoryDeathObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryDeathObservation);
				}
				if (result == null) {
					result = caseAct(familyHistoryDeathObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryDeathObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_SECTION: {
				SocialHistorySection socialHistorySection = (SocialHistorySection) theEObject;
				T result = caseSocialHistorySection(socialHistorySection);
				if (result == null) {
					result = caseSection(socialHistorySection);
				}
				if (result == null) {
					result = caseAct(socialHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(socialHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_OBSERVATION: {
				SocialHistoryObservation socialHistoryObservation = (SocialHistoryObservation) theEObject;
				T result = caseSocialHistoryObservation(socialHistoryObservation);
				if (result == null) {
					result = caseObservation(socialHistoryObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(socialHistoryObservation);
				}
				if (result == null) {
					result = caseAct(socialHistoryObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(socialHistoryObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PREGNANCY_OBSERVATION: {
				PregnancyObservation pregnancyObservation = (PregnancyObservation) theEObject;
				T result = casePregnancyObservation(pregnancyObservation);
				if (result == null) {
					result = caseObservation(pregnancyObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(pregnancyObservation);
				}
				if (result == null) {
					result = caseAct(pregnancyObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(pregnancyObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ESTIMATED_DATE_OF_DELIVERY: {
				EstimatedDateOfDelivery estimatedDateOfDelivery = (EstimatedDateOfDelivery) theEObject;
				T result = caseEstimatedDateOfDelivery(estimatedDateOfDelivery);
				if (result == null) {
					result = caseObservation(estimatedDateOfDelivery);
				}
				if (result == null) {
					result = caseClinicalStatement(estimatedDateOfDelivery);
				}
				if (result == null) {
					result = caseAct(estimatedDateOfDelivery);
				}
				if (result == null) {
					result = caseInfrastructureRoot(estimatedDateOfDelivery);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULTS_SECTION: {
				ResultsSection resultsSection = (ResultsSection) theEObject;
				T result = caseResultsSection(resultsSection);
				if (result == null) {
					result = caseResultsSectionEntriesOptional(resultsSection);
				}
				if (result == null) {
					result = caseSection(resultsSection);
				}
				if (result == null) {
					result = caseAct(resultsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULTS_SECTION_ENTRIES_OPTIONAL: {
				ResultsSectionEntriesOptional resultsSectionEntriesOptional = (ResultsSectionEntriesOptional) theEObject;
				T result = caseResultsSectionEntriesOptional(resultsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(resultsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(resultsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULT_ORGANIZER: {
				ResultOrganizer resultOrganizer = (ResultOrganizer) theEObject;
				T result = caseResultOrganizer(resultOrganizer);
				if (result == null) {
					result = caseOrganizer(resultOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(resultOrganizer);
				}
				if (result == null) {
					result = caseAct(resultOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULT_OBSERVATION: {
				ResultObservation resultObservation = (ResultObservation) theEObject;
				T result = caseResultObservation(resultObservation);
				if (result == null) {
					result = caseObservation(resultObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(resultObservation);
				}
				if (result == null) {
					result = caseAct(resultObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION: {
				MedicalEquipmentSection medicalEquipmentSection = (MedicalEquipmentSection) theEObject;
				T result = caseMedicalEquipmentSection(medicalEquipmentSection);
				if (result == null) {
					result = caseSection(medicalEquipmentSection);
				}
				if (result == null) {
					result = caseAct(medicalEquipmentSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalEquipmentSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION: {
				FunctionalStatusSection functionalStatusSection = (FunctionalStatusSection) theEObject;
				T result = caseFunctionalStatusSection(functionalStatusSection);
				if (result == null) {
					result = caseSection(functionalStatusSection);
				}
				if (result == null) {
					result = caseAct(functionalStatusSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_SECTION: {
				ProblemSection problemSection = (ProblemSection) theEObject;
				T result = caseProblemSection(problemSection);
				if (result == null) {
					result = caseProblemSectionEntriesOptional(problemSection);
				}
				if (result == null) {
					result = caseSection(problemSection);
				}
				if (result == null) {
					result = caseAct(problemSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_SECTION_ENTRIES_OPTIONAL: {
				ProblemSectionEntriesOptional problemSectionEntriesOptional = (ProblemSectionEntriesOptional) theEObject;
				T result = caseProblemSectionEntriesOptional(problemSectionEntriesOptional);
				if (result == null) {
					result = caseSection(problemSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(problemSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_STATUS_OBSERVATION: {
				SocialHistoryStatusObservation socialHistoryStatusObservation = (SocialHistoryStatusObservation) theEObject;
				T result = caseSocialHistoryStatusObservation(socialHistoryStatusObservation);
				if (result == null) {
					result = caseObservation(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = caseAct(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PURPOSE_SECTION: {
				PurposeSection purposeSection = (PurposeSection) theEObject;
				T result = casePurposeSection(purposeSection);
				if (result == null) {
					result = caseSection(purposeSection);
				}
				if (result == null) {
					result = caseAct(purposeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(purposeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PURPOSE_ACTIVITY: {
				PurposeActivity purposeActivity = (PurposeActivity) theEObject;
				T result = casePurposeActivity(purposeActivity);
				if (result == null) {
					result = caseCDA_Act(purposeActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(purposeActivity);
				}
				if (result == null) {
					result = caseAct(purposeActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(purposeActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION: {
				AdvanceDirectivesSection advanceDirectivesSection = (AdvanceDirectivesSection) theEObject;
				T result = caseAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) {
					result = caseAdvanceDirectivesSectionEntriesOptional(advanceDirectivesSection);
				}
				if (result == null) {
					result = caseSection(advanceDirectivesSection);
				}
				if (result == null) {
					result = caseAct(advanceDirectivesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectivesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_VERIFICATION: {
				AdvanceDirectiveVerification advanceDirectiveVerification = (AdvanceDirectiveVerification) theEObject;
				T result = caseAdvanceDirectiveVerification(advanceDirectiveVerification);
				if (result == null) {
					result = caseParticipant2(advanceDirectiveVerification);
				}
				if (result == null) {
					result = caseParticipation(advanceDirectiveVerification);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveVerification);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION: {
				AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation = (AdvanceDirectiveStatusObservation) theEObject;
				T result = caseAdvanceDirectiveStatusObservation(advanceDirectiveStatusObservation);
				if (result == null) {
					result = caseObservation(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = caseAct(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTERS_SECTION: {
				EncountersSection encountersSection = (EncountersSection) theEObject;
				T result = caseEncountersSection(encountersSection);
				if (result == null) {
					result = caseEncountersSectionEntriesOptional(encountersSection);
				}
				if (result == null) {
					result = caseSection(encountersSection);
				}
				if (result == null) {
					result = caseAct(encountersSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encountersSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER: {
				Encounter encounter = (Encounter) theEObject;
				T result = caseEncounter(encounter);
				if (result == null) {
					result = caseCDA_Encounter(encounter);
				}
				if (result == null) {
					result = caseClinicalStatement(encounter);
				}
				if (result == null) {
					result = caseAct(encounter);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounter);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATIONS_SECTION: {
				ImmunizationsSection immunizationsSection = (ImmunizationsSection) theEObject;
				T result = caseImmunizationsSection(immunizationsSection);
				if (result == null) {
					result = caseImmunizationsSectionEntriesOptional(immunizationsSection);
				}
				if (result == null) {
					result = caseSection(immunizationsSection);
				}
				if (result == null) {
					result = caseAct(immunizationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INSURANCE_PROVIDER: {
				InsuranceProvider insuranceProvider = (InsuranceProvider) theEObject;
				T result = caseInsuranceProvider(insuranceProvider);
				if (result == null) {
					result = caseCDA_Act(insuranceProvider);
				}
				if (result == null) {
					result = caseClinicalStatement(insuranceProvider);
				}
				if (result == null) {
					result = caseAct(insuranceProvider);
				}
				if (result == null) {
					result = caseInfrastructureRoot(insuranceProvider);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PAYER_ENTRY: {
				PayerEntry payerEntry = (PayerEntry) theEObject;
				T result = casePayerEntry(payerEntry);
				if (result == null) {
					result = caseCDA_Act(payerEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(payerEntry);
				}
				if (result == null) {
					result = caseAct(payerEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(payerEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COVERED_PARTY: {
				CoveredParty coveredParty = (CoveredParty) theEObject;
				T result = caseCoveredParty(coveredParty);
				if (result == null) {
					result = caseParticipantRole(coveredParty);
				}
				if (result == null) {
					result = caseRole(coveredParty);
				}
				if (result == null) {
					result = caseInfrastructureRoot(coveredParty);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POLICY_SUBSCRIBER: {
				PolicySubscriber policySubscriber = (PolicySubscriber) theEObject;
				T result = casePolicySubscriber(policySubscriber);
				if (result == null) {
					result = caseParticipantRole(policySubscriber);
				}
				if (result == null) {
					result = caseRole(policySubscriber);
				}
				if (result == null) {
					result = caseInfrastructureRoot(policySubscriber);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.EXTERNAL_REFERENCE: {
				ExternalReference externalReference = (ExternalReference) theEObject;
				T result = caseExternalReference(externalReference);
				if (result == null) {
					result = caseCDA_Act(externalReference);
				}
				if (result == null) {
					result = caseClinicalStatement(externalReference);
				}
				if (result == null) {
					result = caseAct(externalReference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(externalReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SUPPORT: {
				Support support = (Support) theEObject;
				T result = caseSupport(support);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection) theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) {
					result = caseVitalSignsSectionEntriesOptional(vitalSignsSection);
				}
				if (result == null) {
					result = caseSection(vitalSignsSection);
				}
				if (result == null) {
					result = caseAct(vitalSignsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HISTORY_OF_PAST_ILLNESS_SECTION: {
				HistoryOfPastIllnessSection historyOfPastIllnessSection = (HistoryOfPastIllnessSection) theEObject;
				T result = caseHistoryOfPastIllnessSection(historyOfPastIllnessSection);
				if (result == null) {
					result = caseSection(historyOfPastIllnessSection);
				}
				if (result == null) {
					result = caseAct(historyOfPastIllnessSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(historyOfPastIllnessSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CHIEF_COMPLAINT_SECTION: {
				ChiefComplaintSection chiefComplaintSection = (ChiefComplaintSection) theEObject;
				T result = caseChiefComplaintSection(chiefComplaintSection);
				if (result == null) {
					result = caseSection(chiefComplaintSection);
				}
				if (result == null) {
					result = caseAct(chiefComplaintSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chiefComplaintSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REASON_FOR_REFERRAL_SECTION: {
				ReasonForReferralSection reasonForReferralSection = (ReasonForReferralSection) theEObject;
				T result = caseReasonForReferralSection(reasonForReferralSection);
				if (result == null) {
					result = caseSection(reasonForReferralSection);
				}
				if (result == null) {
					result = caseAct(reasonForReferralSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reasonForReferralSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HISTORY_OF_PRESENT_ILLNESS: {
				HistoryOfPresentIllness historyOfPresentIllness = (HistoryOfPresentIllness) theEObject;
				T result = caseHistoryOfPresentIllness(historyOfPresentIllness);
				if (result == null) {
					result = caseSection(historyOfPresentIllness);
				}
				if (result == null) {
					result = caseAct(historyOfPresentIllness);
				}
				if (result == null) {
					result = caseInfrastructureRoot(historyOfPresentIllness);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: {
				HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection = (HospitalAdmissionDiagnosisSection) theEObject;
				T result = caseHospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
				if (result == null) {
					result = caseSection(hospitalAdmissionDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(hospitalAdmissionDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalAdmissionDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional = (HospitalAdmissionMedicationsSectionEntriesOptional) theEObject;
				T result = caseHospitalAdmissionMedicationsSectionEntriesOptional(hospitalAdmissionMedicationsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(hospitalAdmissionMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(hospitalAdmissionMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalAdmissionMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION: {
				MedicationsAdministeredSection medicationsAdministeredSection = (MedicationsAdministeredSection) theEObject;
				T result = caseMedicationsAdministeredSection(medicationsAdministeredSection);
				if (result == null) {
					result = caseSection(medicationsAdministeredSection);
				}
				if (result == null) {
					result = caseAct(medicationsAdministeredSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsAdministeredSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PHYSICAL_EXAM_SECTION: {
				PhysicalExamSection physicalExamSection = (PhysicalExamSection) theEObject;
				T result = casePhysicalExamSection(physicalExamSection);
				if (result == null) {
					result = caseSection(physicalExamSection);
				}
				if (result == null) {
					result = caseAct(physicalExamSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicalExamSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_STATUS_SECTION: {
				GeneralStatusSection generalStatusSection = (GeneralStatusSection) theEObject;
				T result = caseGeneralStatusSection(generalStatusSection);
				if (result == null) {
					result = caseSection(generalStatusSection);
				}
				if (result == null) {
					result = caseAct(generalStatusSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalStatusSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REVIEW_OF_SYSTEMS_SECTION: {
				ReviewOfSystemsSection reviewOfSystemsSection = (ReviewOfSystemsSection) theEObject;
				T result = caseReviewOfSystemsSection(reviewOfSystemsSection);
				if (result == null) {
					result = caseSection(reviewOfSystemsSection);
				}
				if (result == null) {
					result = caseAct(reviewOfSystemsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reviewOfSystemsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION: {
				AssessmentAndPlanSection assessmentAndPlanSection = (AssessmentAndPlanSection) theEObject;
				T result = caseAssessmentAndPlanSection(assessmentAndPlanSection);
				if (result == null) {
					result = caseSection(assessmentAndPlanSection);
				}
				if (result == null) {
					result = caseAct(assessmentAndPlanSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assessmentAndPlanSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.LANGUAGE_SPOKEN: {
				LanguageSpoken languageSpoken = (LanguageSpoken) theEObject;
				T result = caseLanguageSpoken(languageSpoken);
				if (result == null) {
					result = caseLanguageCommunication(languageSpoken);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HEALTHCARE_PROVIDER: {
				HealthcareProvider healthcareProvider = (HealthcareProvider) theEObject;
				T result = caseHealthcareProvider(healthcareProvider);
				if (result == null) {
					result = casePerformer1(healthcareProvider);
				}
				if (result == null) {
					result = caseParticipation(healthcareProvider);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthcareProvider);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SUPPORT_GUARDIAN: {
				SupportGuardian supportGuardian = (SupportGuardian) theEObject;
				T result = caseSupportGuardian(supportGuardian);
				if (result == null) {
					result = caseSupport(supportGuardian);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SUPPORT_PARTICIPANT: {
				SupportParticipant supportParticipant = (SupportParticipant) theEObject;
				T result = caseSupportParticipant(supportParticipant);
				if (result == null) {
					result = caseSupport(supportParticipant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SURGICAL_DRAINS_SECTION: {
				SurgicalDrainsSection surgicalDrainsSection = (SurgicalDrainsSection) theEObject;
				T result = caseSurgicalDrainsSection(surgicalDrainsSection);
				if (result == null) {
					result = caseSection(surgicalDrainsSection);
				}
				if (result == null) {
					result = caseAct(surgicalDrainsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(surgicalDrainsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_DOCUMENT: {
				UnstructuredDocument unstructuredDocument = (UnstructuredDocument) theEObject;
				T result = caseUnstructuredDocument(unstructuredDocument);
				if (result == null) {
					result = caseGeneralHeaderConstraints(unstructuredDocument);
				}
				if (result == null) {
					result = caseClinicalDocument(unstructuredDocument);
				}
				if (result == null) {
					result = caseAct(unstructuredDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(unstructuredDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SCAN_ORIGINAL_AUTHOR: {
				ScanOriginalAuthor scanOriginalAuthor = (ScanOriginalAuthor) theEObject;
				T result = caseScanOriginalAuthor(scanOriginalAuthor);
				if (result == null) {
					result = caseAuthor(scanOriginalAuthor);
				}
				if (result == null) {
					result = caseParticipation(scanOriginalAuthor);
				}
				if (result == null) {
					result = caseInfrastructureRoot(scanOriginalAuthor);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SCANNING_DEVICE: {
				ScanningDevice scanningDevice = (ScanningDevice) theEObject;
				T result = caseScanningDevice(scanningDevice);
				if (result == null) {
					result = caseAuthor(scanningDevice);
				}
				if (result == null) {
					result = caseParticipation(scanningDevice);
				}
				if (result == null) {
					result = caseInfrastructureRoot(scanningDevice);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SCAN_DATA_ENTERER: {
				ScanDataEnterer scanDataEnterer = (ScanDataEnterer) theEObject;
				T result = caseScanDataEnterer(scanDataEnterer);
				if (result == null) {
					result = caseDataEnterer(scanDataEnterer);
				}
				if (result == null) {
					result = caseParticipation(scanDataEnterer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(scanDataEnterer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_INFORMATION: {
				MedicationInformation medicationInformation = (MedicationInformation) theEObject;
				T result = caseMedicationInformation(medicationInformation);
				if (result == null) {
					result = caseManufacturedProduct(medicationInformation);
				}
				if (result == null) {
					result = caseRole(medicationInformation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationInformation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_OR_SCANNED_DOCUMENT: {
				UnstructuredOrScannedDocument unstructuredOrScannedDocument = (UnstructuredOrScannedDocument) theEObject;
				T result = caseUnstructuredOrScannedDocument(unstructuredOrScannedDocument);
				if (result == null) {
					result = caseGeneralHeaderConstraints(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = caseClinicalDocument(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = caseAct(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REFERRAL_SUMMARY: {
				ReferralSummary referralSummary = (ReferralSummary) theEObject;
				T result = caseReferralSummary(referralSummary);
				if (result == null) {
					result = caseGeneralHeaderConstraints(referralSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(referralSummary);
				}
				if (result == null) {
					result = caseAct(referralSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(referralSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_SUMMARY: {
				DischargeSummary dischargeSummary = (DischargeSummary) theEObject;
				T result = caseDischargeSummary(dischargeSummary);
				if (result == null) {
					result = caseGeneralHeaderConstraints(dischargeSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(dischargeSummary);
				}
				if (result == null) {
					result = caseAct(dischargeSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION: {
				HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection = (HospitalDischargeDiagnosisSection) theEObject;
				T result = caseHospitalDischargeDiagnosisSection(hospitalDischargeDiagnosisSection);
				if (result == null) {
					result = caseSection(hospitalDischargeDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS: {
				HospitalDischargeDiagnosis hospitalDischargeDiagnosis = (HospitalDischargeDiagnosis) theEObject;
				T result = caseHospitalDischargeDiagnosis(hospitalDischargeDiagnosis);
				if (result == null) {
					result = caseCDA_Act(hospitalDischargeDiagnosis);
				}
				if (result == null) {
					result = caseClinicalStatement(hospitalDischargeDiagnosis);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeDiagnosis);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeDiagnosis);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_DIET_SECTION: {
				DischargeDietSection dischargeDietSection = (DischargeDietSection) theEObject;
				T result = caseDischargeDietSection(dischargeDietSection);
				if (result == null) {
					result = caseSection(dischargeDietSection);
				}
				if (result == null) {
					result = caseAct(dischargeDietSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeDietSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				HospitalDischargeMedicationsSectionEntriesOptional hospitalDischargeMedicationsSectionEntriesOptional = (HospitalDischargeMedicationsSectionEntriesOptional) theEObject;
				T result = caseHospitalDischargeMedicationsSectionEntriesOptional(hospitalDischargeMedicationsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(hospitalDischargeMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_MEDICATION: {
				DischargeMedication dischargeMedication = (DischargeMedication) theEObject;
				T result = caseDischargeMedication(dischargeMedication);
				if (result == null) {
					result = caseCDA_Act(dischargeMedication);
				}
				if (result == null) {
					result = caseClinicalStatement(dischargeMedication);
				}
				if (result == null) {
					result = caseAct(dischargeMedication);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeMedication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_COURSE_SECTION: {
				HospitalCourseSection hospitalCourseSection = (HospitalCourseSection) theEObject;
				T result = caseHospitalCourseSection(hospitalCourseSection);
				if (result == null) {
					result = caseSection(hospitalCourseSection);
				}
				if (result == null) {
					result = caseAct(hospitalCourseSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalCourseSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION: {
				PreconditionForSubstanceAdministration preconditionForSubstanceAdministration = (PreconditionForSubstanceAdministration) theEObject;
				T result = casePreconditionForSubstanceAdministration(preconditionForSubstanceAdministration);
				if (result == null) {
					result = casePrecondition(preconditionForSubstanceAdministration);
				}
				if (result == null) {
					result = caseActRelationship(preconditionForSubstanceAdministration);
				}
				if (result == null) {
					result = caseInfrastructureRoot(preconditionForSubstanceAdministration);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION: {
				ImmunizationMedicationInformation immunizationMedicationInformation = (ImmunizationMedicationInformation) theEObject;
				T result = caseImmunizationMedicationInformation(immunizationMedicationInformation);
				if (result == null) {
					result = caseManufacturedProduct(immunizationMedicationInformation);
				}
				if (result == null) {
					result = caseRole(immunizationMedicationInformation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationMedicationInformation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_SPECIMEN: {
				ProcedureSpecimen procedureSpecimen = (ProcedureSpecimen) theEObject;
				T result = caseProcedureSpecimen(procedureSpecimen);
				if (result == null) {
					result = caseSpecimen(procedureSpecimen);
				}
				if (result == null) {
					result = caseParticipation(procedureSpecimen);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureSpecimen);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_PERFORMER: {
				ProcedurePerformer procedurePerformer = (ProcedurePerformer) theEObject;
				T result = caseProcedurePerformer(procedurePerformer);
				if (result == null) {
					result = casePerformer2(procedurePerformer);
				}
				if (result == null) {
					result = caseParticipation(procedurePerformer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedurePerformer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ENCOUNTER: {
				ProcedureEncounter procedureEncounter = (ProcedureEncounter) theEObject;
				T result = caseProcedureEncounter(procedureEncounter);
				if (result == null) {
					result = caseCDA_Encounter(procedureEncounter);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureEncounter);
				}
				if (result == null) {
					result = caseAct(procedureEncounter);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureEncounter);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_INFORMATION_MANUFACTURED_MATERIAL: {
				MedicationInformationManufacturedMaterial medicationInformationManufacturedMaterial = (MedicationInformationManufacturedMaterial) theEObject;
				T result = caseMedicationInformationManufacturedMaterial(medicationInformationManufacturedMaterial);
				if (result == null) {
					result = caseMaterial(medicationInformationManufacturedMaterial);
				}
				if (result == null) {
					result = caseEntity(medicationInformationManufacturedMaterial);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationInformationManufacturedMaterial);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_SUBJECT: {
				FamilyHistorySubject familyHistorySubject = (FamilyHistorySubject) theEObject;
				T result = caseFamilyHistorySubject(familyHistorySubject);
				if (result == null) {
					result = caseSubject(familyHistorySubject);
				}
				if (result == null) {
					result = caseParticipation(familyHistorySubject);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistorySubject);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION: {
				HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection = (HospitalDischargeStudiesSummarySection) theEObject;
				T result = caseHospitalDischargeStudiesSummarySection(hospitalDischargeStudiesSummarySection);
				if (result == null) {
					result = caseSection(hospitalDischargeStudiesSummarySection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeStudiesSummarySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeStudiesSummarySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION: {
				HospitalDischargeInstructionsSection hospitalDischargeInstructionsSection = (HospitalDischargeInstructionsSection) theEObject;
				T result = caseHospitalDischargeInstructionsSection(hospitalDischargeInstructionsSection);
				if (result == null) {
					result = caseSection(hospitalDischargeInstructionsSection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeInstructionsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeInstructionsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
				HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection = (HospitalDischargeMedicationsSection) theEObject;
				T result = caseHospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
				if (result == null) {
					result = caseHospitalDischargeMedicationsSectionEntriesOptional(hospitalDischargeMedicationsSection);
				}
				if (result == null) {
					result = caseSection(hospitalDischargeMedicationsSection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeMedicationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeMedicationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_PHYSICAL_SECTION: {
				HospitalDischargePhysicalSection hospitalDischargePhysicalSection = (HospitalDischargePhysicalSection) theEObject;
				T result = caseHospitalDischargePhysicalSection(hospitalDischargePhysicalSection);
				if (result == null) {
					result = caseSection(hospitalDischargePhysicalSection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargePhysicalSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargePhysicalSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION: {
				ChiefComplaintAndReasonForVisitSection chiefComplaintAndReasonForVisitSection = (ChiefComplaintAndReasonForVisitSection) theEObject;
				T result = caseChiefComplaintAndReasonForVisitSection(chiefComplaintAndReasonForVisitSection);
				if (result == null) {
					result = caseSection(chiefComplaintAndReasonForVisitSection);
				}
				if (result == null) {
					result = caseAct(chiefComplaintAndReasonForVisitSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chiefComplaintAndReasonForVisitSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REASON_FOR_VISIT_SECTION: {
				ReasonForVisitSection reasonForVisitSection = (ReasonForVisitSection) theEObject;
				T result = caseReasonForVisitSection(reasonForVisitSection);
				if (result == null) {
					result = caseSection(reasonForVisitSection);
				}
				if (result == null) {
					result = caseAct(reasonForVisitSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reasonForVisitSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RELATED_INFORMANT: {
				RelatedInformant relatedInformant = (RelatedInformant) theEObject;
				T result = caseRelatedInformant(relatedInformant);
				if (result == null) {
					result = caseRelatedEntity(relatedInformant);
				}
				if (result == null) {
					result = caseRole(relatedInformant);
				}
				if (result == null) {
					result = caseInfrastructureRoot(relatedInformant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER_PERFORMER: {
				EncounterPerformer encounterPerformer = (EncounterPerformer) theEObject;
				T result = caseEncounterPerformer(encounterPerformer);
				if (result == null) {
					result = casePerformer2(encounterPerformer);
				}
				if (result == null) {
					result = caseParticipation(encounterPerformer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterPerformer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER_PERFORMER_ASSIGNED_ENTITY: {
				EncounterPerformerAssignedEntity encounterPerformerAssignedEntity = (EncounterPerformerAssignedEntity) theEObject;
				T result = caseEncounterPerformerAssignedEntity(encounterPerformerAssignedEntity);
				if (result == null) {
					result = caseAssignedEntity(encounterPerformerAssignedEntity);
				}
				if (result == null) {
					result = caseRole(encounterPerformerAssignedEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterPerformerAssignedEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION_PARTICIPANT: {
				AllergyObservationParticipant allergyObservationParticipant = (AllergyObservationParticipant) theEObject;
				T result = caseAllergyObservationParticipant(allergyObservationParticipant);
				if (result == null) {
					result = caseParticipant2(allergyObservationParticipant);
				}
				if (result == null) {
					result = caseParticipation(allergyObservationParticipant);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyObservationParticipant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION_PARTICIPANT_ROLE: {
				AllergyObservationParticipantRole allergyObservationParticipantRole = (AllergyObservationParticipantRole) theEObject;
				T result = caseAllergyObservationParticipantRole(allergyObservationParticipantRole);
				if (result == null) {
					result = caseParticipantRole(allergyObservationParticipantRole);
				}
				if (result == null) {
					result = caseRole(allergyObservationParticipantRole);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyObservationParticipantRole);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION_PLAYING_ENTITY: {
				AllergyObservationPlayingEntity allergyObservationPlayingEntity = (AllergyObservationPlayingEntity) theEObject;
				T result = caseAllergyObservationPlayingEntity(allergyObservationPlayingEntity);
				if (result == null) {
					result = casePlayingEntity(allergyObservationPlayingEntity);
				}
				if (result == null) {
					result = caseEntity(allergyObservationPlayingEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyObservationPlayingEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ANESTHESIA_SECTION: {
				AnesthesiaSection anesthesiaSection = (AnesthesiaSection) theEObject;
				T result = caseAnesthesiaSection(anesthesiaSection);
				if (result == null) {
					result = caseSection(anesthesiaSection);
				}
				if (result == null) {
					result = caseAct(anesthesiaSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(anesthesiaSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COMPLICATIONS_SECTION: {
				ComplicationsSection complicationsSection = (ComplicationsSection) theEObject;
				T result = caseComplicationsSection(complicationsSection);
				if (result == null) {
					result = caseSection(complicationsSection);
				}
				if (result == null) {
					result = caseAct(complicationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(complicationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DICOM_OBJECT_CATALOG_SECTION: {
				DICOMObjectCatalogSection dicomObjectCatalogSection = (DICOMObjectCatalogSection) theEObject;
				T result = caseDICOMObjectCatalogSection(dicomObjectCatalogSection);
				if (result == null) {
					result = caseSection(dicomObjectCatalogSection);
				}
				if (result == null) {
					result = caseAct(dicomObjectCatalogSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dicomObjectCatalogSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FINDINGS_SECTION: {
				FindingsSection findingsSection = (FindingsSection) theEObject;
				T result = caseFindingsSection(findingsSection);
				if (result == null) {
					result = caseSection(findingsSection);
				}
				if (result == null) {
					result = caseAct(findingsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(findingsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_CONSULTATIONS_SECTION: {
				HospitalConsultationsSection hospitalConsultationsSection = (HospitalConsultationsSection) theEObject;
				T result = caseHospitalConsultationsSection(hospitalConsultationsSection);
				if (result == null) {
					result = caseSection(hospitalConsultationsSection);
				}
				if (result == null) {
					result = caseAct(hospitalConsultationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalConsultationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INTERVENTIONS_SECTION: {
				InterventionsSection interventionsSection = (InterventionsSection) theEObject;
				T result = caseInterventionsSection(interventionsSection);
				if (result == null) {
					result = caseSection(interventionsSection);
				}
				if (result == null) {
					result = caseAct(interventionsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(interventionsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICAL_HISTORY_SECTION: {
				MedicalHistorySection medicalHistorySection = (MedicalHistorySection) theEObject;
				T result = caseMedicalHistorySection(medicalHistorySection);
				if (result == null) {
					result = caseSection(medicalHistorySection);
				}
				if (result == null) {
					result = caseAct(medicalHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OBJECTIVE_SECTION: {
				ObjectiveSection objectiveSection = (ObjectiveSection) theEObject;
				T result = caseObjectiveSection(objectiveSection);
				if (result == null) {
					result = caseSection(objectiveSection);
				}
				if (result == null) {
					result = caseAct(objectiveSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(objectiveSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE_FLUID_SECTION: {
				OperativeNoteFluidSection operativeNoteFluidSection = (OperativeNoteFluidSection) theEObject;
				T result = caseOperativeNoteFluidSection(operativeNoteFluidSection);
				if (result == null) {
					result = caseSection(operativeNoteFluidSection);
				}
				if (result == null) {
					result = caseAct(operativeNoteFluidSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(operativeNoteFluidSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION: {
				OperativeNoteSurgicalProcedureSection operativeNoteSurgicalProcedureSection = (OperativeNoteSurgicalProcedureSection) theEObject;
				T result = caseOperativeNoteSurgicalProcedureSection(operativeNoteSurgicalProcedureSection);
				if (result == null) {
					result = caseSection(operativeNoteSurgicalProcedureSection);
				}
				if (result == null) {
					result = caseAct(operativeNoteSurgicalProcedureSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(operativeNoteSurgicalProcedureSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_PROCEDURE_SECTION: {
				PlannedProcedureSection plannedProcedureSection = (PlannedProcedureSection) theEObject;
				T result = casePlannedProcedureSection(plannedProcedureSection);
				if (result == null) {
					result = caseSection(plannedProcedureSection);
				}
				if (result == null) {
					result = caseAct(plannedProcedureSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedProcedureSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION: {
				PostoperativeDiagnosisSection postoperativeDiagnosisSection = (PostoperativeDiagnosisSection) theEObject;
				T result = casePostoperativeDiagnosisSection(postoperativeDiagnosisSection);
				if (result == null) {
					result = caseSection(postoperativeDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(postoperativeDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(postoperativeDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION: {
				PostprocedureDiagnosisSection postprocedureDiagnosisSection = (PostprocedureDiagnosisSection) theEObject;
				T result = casePostprocedureDiagnosisSection(postprocedureDiagnosisSection);
				if (result == null) {
					result = caseSection(postprocedureDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(postprocedureDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(postprocedureDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS_SECTION: {
				PreoperativeDiagnosisSection preoperativeDiagnosisSection = (PreoperativeDiagnosisSection) theEObject;
				T result = casePreoperativeDiagnosisSection(preoperativeDiagnosisSection);
				if (result == null) {
					result = caseSection(preoperativeDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(preoperativeDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(preoperativeDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_DESCRIPTION_SECTION: {
				ProcedureDescriptionSection procedureDescriptionSection = (ProcedureDescriptionSection) theEObject;
				T result = caseProcedureDescriptionSection(procedureDescriptionSection);
				if (result == null) {
					result = caseSection(procedureDescriptionSection);
				}
				if (result == null) {
					result = caseAct(procedureDescriptionSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureDescriptionSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_DISPOSITION_SECTION: {
				ProcedureDispositionSection procedureDispositionSection = (ProcedureDispositionSection) theEObject;
				T result = caseProcedureDispositionSection(procedureDispositionSection);
				if (result == null) {
					result = caseSection(procedureDispositionSection);
				}
				if (result == null) {
					result = caseAct(procedureDispositionSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureDispositionSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION: {
				ProcedureEstimatedBloodLossSection procedureEstimatedBloodLossSection = (ProcedureEstimatedBloodLossSection) theEObject;
				T result = caseProcedureEstimatedBloodLossSection(procedureEstimatedBloodLossSection);
				if (result == null) {
					result = caseSection(procedureEstimatedBloodLossSection);
				}
				if (result == null) {
					result = caseAct(procedureEstimatedBloodLossSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureEstimatedBloodLossSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_FINDINGS_SECTION: {
				ProcedureFindingsSection procedureFindingsSection = (ProcedureFindingsSection) theEObject;
				T result = caseProcedureFindingsSection(procedureFindingsSection);
				if (result == null) {
					result = caseSection(procedureFindingsSection);
				}
				if (result == null) {
					result = caseAct(procedureFindingsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureFindingsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_IMPLANTS_SECTION: {
				ProcedureImplantsSection procedureImplantsSection = (ProcedureImplantsSection) theEObject;
				T result = caseProcedureImplantsSection(procedureImplantsSection);
				if (result == null) {
					result = caseSection(procedureImplantsSection);
				}
				if (result == null) {
					result = caseAct(procedureImplantsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureImplantsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_INDICATIONS_SECTION: {
				ProcedureIndicationsSection procedureIndicationsSection = (ProcedureIndicationsSection) theEObject;
				T result = caseProcedureIndicationsSection(procedureIndicationsSection);
				if (result == null) {
					result = caseSection(procedureIndicationsSection);
				}
				if (result == null) {
					result = caseAct(procedureIndicationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureIndicationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_SPECIMENS_TAKEN_SECTION: {
				ProcedureSpecimensTakenSection procedureSpecimensTakenSection = (ProcedureSpecimensTakenSection) theEObject;
				T result = caseProcedureSpecimensTakenSection(procedureSpecimensTakenSection);
				if (result == null) {
					result = caseSection(procedureSpecimensTakenSection);
				}
				if (result == null) {
					result = caseAct(procedureSpecimensTakenSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureSpecimensTakenSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SUBJECTIVE_SECTION: {
				SubjectiveSection subjectiveSection = (SubjectiveSection) theEObject;
				T result = caseSubjectiveSection(subjectiveSection);
				if (result == null) {
					result = caseSection(subjectiveSection);
				}
				if (result == null) {
					result = caseAct(subjectiveSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(subjectiveSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONSULTATION_NOTE: {
				ConsultationNote consultationNote = (ConsultationNote) theEObject;
				T result = caseConsultationNote(consultationNote);
				if (result == null) {
					result = caseGeneralHeaderConstraints(consultationNote);
				}
				if (result == null) {
					result = caseClinicalDocument(consultationNote);
				}
				if (result == null) {
					result = caseAct(consultationNote);
				}
				if (result == null) {
					result = caseInfrastructureRoot(consultationNote);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONSULTATION_NOTE_COMPONENT_OF: {
				ConsultationNote_ComponentOf consultationNote_ComponentOf = (ConsultationNote_ComponentOf) theEObject;
				T result = caseConsultationNote_ComponentOf(consultationNote_ComponentOf);
				if (result == null) {
					result = caseComponent1(consultationNote_ComponentOf);
				}
				if (result == null) {
					result = caseActRelationship(consultationNote_ComponentOf);
				}
				if (result == null) {
					result = caseInfrastructureRoot(consultationNote_ComponentOf);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COMPONENT_OF_ENCOMPASSING_ENCOUNTER2: {
				ComponentOf_EncompassingEncounter2 componentOf_EncompassingEncounter2 = (ComponentOf_EncompassingEncounter2) theEObject;
				T result = caseComponentOf_EncompassingEncounter2(componentOf_EncompassingEncounter2);
				if (result == null) {
					result = caseEncompassingEncounter(componentOf_EncompassingEncounter2);
				}
				if (result == null) {
					result = caseAct(componentOf_EncompassingEncounter2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(componentOf_EncompassingEncounter2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY: {
				EncompassingEncounter2_ResponsibleParty encompassingEncounter2_ResponsibleParty = (EncompassingEncounter2_ResponsibleParty) theEObject;
				T result = caseEncompassingEncounter2_ResponsibleParty(encompassingEncounter2_ResponsibleParty);
				if (result == null) {
					result = caseResponsibleParty(encompassingEncounter2_ResponsibleParty);
				}
				if (result == null) {
					result = caseParticipation(encompassingEncounter2_ResponsibleParty);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encompassingEncounter2_ResponsibleParty);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT: {
				EncompassingEncounter2_EncounterParticipant encompassingEncounter2_EncounterParticipant = (EncompassingEncounter2_EncounterParticipant) theEObject;
				T result = caseEncompassingEncounter2_EncounterParticipant(encompassingEncounter2_EncounterParticipant);
				if (result == null) {
					result = caseEncounterParticipant(encompassingEncounter2_EncounterParticipant);
				}
				if (result == null) {
					result = caseParticipation(encompassingEncounter2_EncounterParticipant);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encompassingEncounter2_EncounterParticipant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ASSESSMENT_SECTION: {
				AssessmentSection assessmentSection = (AssessmentSection) theEObject;
				T result = caseAssessmentSection(assessmentSection);
				if (result == null) {
					result = caseSection(assessmentSection);
				}
				if (result == null) {
					result = caseAct(assessmentSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assessmentSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Record Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_RecordTarget(GeneralHeaderConstraints_RecordTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Target Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Target Patient Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTarget_PatientRole(RecordTarget_PatientRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Role Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Role Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientRole_Patient(PatientRole_Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient_Guardian(Patient_Guardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Language Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient_LanguageCommunication(Patient_LanguageCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Birthplace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Birthplace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient_Birthplace(Patient_Birthplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Birthplace Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Birthplace Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirthplace_Place(Birthplace_Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Role Provider Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Role Provider Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientRole_ProviderOrganization(PatientRole_ProviderOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_ComponentOf(GeneralHeaderConstraints_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter(ComponentOf_EncompassingEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Author(GeneralHeaderConstraints_Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Assigned Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor_AssignedAuthor(Author_AssignedAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Author Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Author Authoring Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedAuthor_AuthoringDevice(AssignedAuthor_AuthoringDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Person(GeneralHeaderConstraints_Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Data Enterer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_DataEnterer(GeneralHeaderConstraints_DataEnterer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Enterer Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Enterer Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEnterer_AssignedEntity(DataEnterer_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Custodian(GeneralHeaderConstraints_Custodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Assigned Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Assigned Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodian_AssignedCustodian(Custodian_AssignedCustodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Custodian Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Custodian Custodian Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedCustodian_CustodianOrganization(AssignedCustodian_CustodianOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Information Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Information Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_InformationRecipient(GeneralHeaderConstraints_InformationRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Recipient Intended Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Recipient Intended Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationRecipient_IntendedRecipient(InformationRecipient_IntendedRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intended Recipient Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intended Recipient Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntendedRecipient_Organization(IntendedRecipient_Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Legal Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_LegalAuthenticator(GeneralHeaderConstraints_LegalAuthenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Authenticator Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Authenticator Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalAuthenticator_AssignedEntity(LegalAuthenticator_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Authenticator(GeneralHeaderConstraints_Authenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authenticator Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authenticator Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticator_AssignedEntity(Authenticator_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Informant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Informant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_Informant(GeneralHeaderConstraints_Informant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informant Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informant Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformant_AssignedEntity(Informant_AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informant Related Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informant Related Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformant_RelatedEntity(Informant_RelatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints Participant Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints Participant Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_ParticipantSupport(GeneralHeaderConstraints_ParticipantSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints In Fulfillment Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints_InFulfillmentOf(GeneralHeaderConstraints_InFulfillmentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Fulfillment Of Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Fulfillment Of Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInFulfillmentOf_Order(InFulfillmentOf_Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Problem Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyProblemAct(AllergyProblemAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservation(AllergyObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactionObservation(ReactionObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Severity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeverityObservation(SeverityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyStatusObservation(AllergyStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgeObservation(AgeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthStatusObservation(HealthStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationActivity(MedicationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Medicinal Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Medicinal Supply Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonMedicinalSupplyActivity(NonMedicinalSupplyActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance(ProductInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructions(Instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndication(Indication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispense(MedicationDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Supply Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Supply Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSupplyOrder(MedicationSupplyOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drug Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drug Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrugVehicle(DrugVehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Series Number Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSeriesNumberObservation(MedicationSeriesNumberObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatusObservation(MedicationStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalReference(InternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationType(MedicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Fullfillment Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationFullfillmentInstructions(MedicationFullfillmentInstructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Concern Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemConcernAct(ProblemConcernAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemObservation(ProblemObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemStatus(ProblemStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Of Care Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityOfCareDocument(ContinuityOfCareDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directives Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directives Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectivesSectionEntriesOptional(AdvanceDirectivesSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSection(AllergiesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSectionEntriesOptional(AllergiesSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSectionEntriesOptional(EncountersSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSectionEntriesOptional(ImmunizationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayersSection(PayersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageActivity(CoverageActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyActivity(PolicyActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationActivity(AuthorizationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSection(MedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareSection(PlanOfCareSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityEncounter(PlanOfCareActivityEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityObservation(PlanOfCareActivityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityProcedure(PlanOfCareActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySupply(PlanOfCareActivitySupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSection(ProceduresSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityObservation(ProcedureActivityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityAct(ProcedureActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistorySection(FamilyHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryOrganizer(FamilyHistoryOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryObservation(FamilyHistoryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Death Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryDeathObservation(FamilyHistoryDeathObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistorySection(SocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistoryObservation(SocialHistoryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregnancy Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePregnancyObservation(PregnancyObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estimated Date Of Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estimated Date Of Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstimatedDateOfDelivery(EstimatedDateOfDelivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSection(ResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultOrganizer(ResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultObservation(ResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalEquipmentSection(MedicalEquipmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusSection(FunctionalStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSection(ProblemSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistoryStatusObservation(SocialHistoryStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeSection(PurposeSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeActivity(PurposeActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation_Reference(AdvanceDirectiveObservation_Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference External Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference External Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference_ExternalDocument(Reference_ExternalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation_Custodian(AdvanceDirectiveObservation_Custodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Custodian Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Custodian Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodian_CustodianRole(Custodian_CustodianRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Role Custodian Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Role Custodian Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodianRole_CustodianEntity(CustodianRole_CustodianEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation Verifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation Verifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation_Verifier(AdvanceDirectiveObservation_Verifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveVerification(AdvanceDirectiveVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveStatusObservation(AdvanceDirectiveStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSection(EncountersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterActivities(EncounterActivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Delivery Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Delivery Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDeliveryLocation(ServiceDeliveryLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSection(ImmunizationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationActivity(ImmunizationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Refusal Reason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Refusal Reason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRefusalReason(ImmunizationRefusalReason object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsuranceProvider(InsuranceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payer Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payer Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayerEntry(PayerEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Covered Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoveredParty(CoveredParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicySubscriber(PolicySubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Specimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureSpecimen(ProcedureSpecimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePerformer(ProcedurePerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureEncounter(ProcedureEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Information Manufactured Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Information Manufactured Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationInformationManufacturedMaterial(MedicationInformationManufacturedMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistorySubject(FamilyHistorySubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Studies Summary Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Studies Summary Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeStudiesSummarySection(HospitalDischargeStudiesSummarySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeMedication(DischargeMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeDiagnosis(HospitalDischargeDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Instructions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeInstructionsSection(HospitalDischargeInstructionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReference(ExternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupport(Support object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSection(VitalSignsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsOrganizer(VitalSignsOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignObservation(VitalSignObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChiefComplaintSection(ChiefComplaintSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForReferralSection(ReasonForReferralSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPresentIllness(HistoryOfPresentIllness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeDiagnosisSection(HospitalDischargeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionMedicationsSectionEntriesOptional(
			HospitalAdmissionMedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Physical Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Physical Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargePhysicalSection(HospitalDischargePhysicalSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChiefComplaintAndReasonForVisitSection(ChiefComplaintAndReasonForVisitSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Visit Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForVisitSection(ReasonForVisitSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Informant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Informant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedInformant(RelatedInformant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterPerformer(EncounterPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Performer Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Performer Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterPerformerAssignedEntity(EncounterPerformerAssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExamSection(PhysicalExamSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralStatusSection(GeneralStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalCourseSection(HospitalCourseSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Spoken</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageSpoken(LanguageSpoken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareProvider(HealthcareProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportGuardian(SupportGuardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportParticipant(SupportParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surgical Drains Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surgical Drains Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgicalDrainsSection(SurgicalDrainsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument(UnstructuredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scan Original Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanOriginalAuthor(ScanOriginalAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scanning Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanningDevice(ScanningDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scan Data Enterer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScanDataEnterer(ScanDataEnterer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationInformation(MedicationInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Or Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Or Scanned Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredOrScannedDocument(UnstructuredOrScannedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralSummary(ReferralSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeSummary(DischargeSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Diet Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Diet Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeDietSection(DischargeDietSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeMedicationsSectionEntriesOptional(
			HospitalDischargeMedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition For Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition For Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreconditionForSubstanceAdministration(PreconditionForSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Medication Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationMedicationInformation(ImmunizationMedicationInformation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
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
	public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAdministration(SubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupply(Supply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRole(ParticipantRole object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDA_Encounter(org.openhealthtools.mdht.uml.cda.Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant2(Participant2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActRelationship(ActRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageCommunication(LanguageCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservationParticipant(AllergyObservationParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation Participant Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservationParticipantRole(AllergyObservationParticipantRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation Playing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation Playing Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservationPlayingEntity(AllergyObservationPlayingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anesthesia Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anesthesia Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnesthesiaSection(AnesthesiaSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplicationsSection(ComplicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICOM Object Catalog Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICOM Object Catalog Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICOMObjectCatalogSection(DICOMObjectCatalogSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Findings Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindingsSection(FindingsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Consultations Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Consultations Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalConsultationsSection(HospitalConsultationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interventions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interventions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterventionsSection(InterventionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalHistorySection(MedicalHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveSection(ObjectiveSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note Fluid Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note Fluid Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNoteFluidSection(OperativeNoteFluidSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note Surgical Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note Surgical Procedure Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNoteSurgicalProcedureSection(OperativeNoteSurgicalProcedureSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Procedure Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedProcedureSection(PlannedProcedureSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostoperativeDiagnosisSection(PostoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostprocedureDiagnosisSection(PostprocedureDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreoperativeDiagnosisSection(PreoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Description Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Description Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDescriptionSection(ProcedureDescriptionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Disposition Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Disposition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDispositionSection(ProcedureDispositionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Estimated Blood Loss Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Estimated Blood Loss Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureEstimatedBloodLossSection(ProcedureEstimatedBloodLossSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Findings Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureFindingsSection(ProcedureFindingsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Implants Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Implants Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureImplantsSection(ProcedureImplantsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Indications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Indications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureIndicationsSection(ProcedureIndicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Specimens Taken Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Specimens Taken Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureSpecimensTakenSection(ProcedureSpecimensTakenSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subjective Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subjective Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectiveSection(SubjectiveSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consultation Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsultationNote(ConsultationNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consultation Note Component Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consultation Note Component Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsultationNote_ComponentOf(ConsultationNote_ComponentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Of Encompassing Encounter2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOf_EncompassingEncounter2(ComponentOf_EncompassingEncounter2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter2 Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter2 Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter2_ResponsibleParty(EncompassingEncounter2_ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter2 Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter2 Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter2_EncounterParticipant(EncompassingEncounter2_EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentSection(AssessmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performer1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer1(Performer1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTarget(RecordTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Enterer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEnterer(DataEnterer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodian(Custodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationRecipient(InformationRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalAuthenticator(LegalAuthenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticator(Authenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Fulfillment Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInFulfillmentOf(InFulfillmentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedAuthor(AssignedAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter(EncompassingEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedCustodian(AssignedCustodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodianOrganization(CustodianOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authoring Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthoringDevice(AuthoringDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intended Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intended Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntendedRecipient(IntendedRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientRole(PatientRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Birthplace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Birthplace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirthplace(Birthplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardian(Guardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturedProduct(ManufacturedProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimen(Specimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer2(Performer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterial(Material object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubject(Subject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleParty(ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterParticipant(EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedEntity(RelatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedEntity(AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informant12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informant12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformant12(Informant12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant1(Participant1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent1(Component1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Playing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Playing Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayingEntity(PlayingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocument(ExternalDocument object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} // ConsolSwitch
