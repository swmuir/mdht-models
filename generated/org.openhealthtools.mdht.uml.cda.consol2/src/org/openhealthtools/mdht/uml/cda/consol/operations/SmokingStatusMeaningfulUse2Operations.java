/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Smoking Status Meaningful Use2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmokingStatusMeaningfulUse2Operations extends SmokingStatusObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmokingStatusMeaningfulUse2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusMeaningfulUse2EffectiveTimeLow(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2EffectiveTimeLow(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusMeaningfulUse2EffectiveTimeLow(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2EffectiveTimeLow(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusMeaningfulUse2EffectiveTimeLow(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_MEANINGFUL_USE2_EFFECTIVE_TIME_LOW,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"SmokingStatusMeaningfulUse2EffectiveTimeLow",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									smokingStatusMeaningfulUse2, context) }),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2Id(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusMeaningfulUse2Id(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_MEANINGFUL_USE2_ID,
					ConsolPlugin.INSTANCE.getString("SmokingStatusMeaningfulUse2Id"),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusMeaningfulUse2AuthorParticipation(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2AuthorParticipation(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusMeaningfulUse2AuthorParticipation(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusMeaningfulUse2AuthorParticipation(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusMeaningfulUse2AuthorParticipation(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("SmokingStatusMeaningfulUse2AuthorParticipation"),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseTemplateId(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseTemplateId(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.78' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseTemplateId(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseTemplateId(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseTemplateId(SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__TOBACCO_USE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("TobaccoUseTemplateId"),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationCodeP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationCodeP(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("SmokingStatusObservationCodeP"),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP", passToken);
				}
				passToken.add(smokingStatusMeaningfulUse2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '72166-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationCode(SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(smokingStatusMeaningfulUse2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("SmokingStatusObservationCode"),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationEffectiveTime(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationEffectiveTime(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationEffectiveTime(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationEffectiveTime(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationEffectiveTime(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("SmokingStatusObservationEffectiveTime"),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationValueP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationValueP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationValueP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationValueP(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationValueP(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_VALUE_P,
					ConsolPlugin.INSTANCE.getString("SmokingStatusObservationValueP"),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP", passToken);
				}
				passToken.add(smokingStatusMeaningfulUse2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '449868002' or value.code = '428041000124106' or value.code = '8517006' or value.code = '266919005' or value.code = '77176002' or value.code = '266927001' or value.code = '428071000124103' or value.code = '428061000124105')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSmokingStatusObservationValue(SmokingStatusMeaningfulUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param smokingStatusMeaningfulUse2 The receiving '<em><b>Smoking Status Meaningful Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSmokingStatusObservationValue(
			SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(smokingStatusMeaningfulUse2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SMOKING_STATUS_MEANINGFUL_USE2);
			try {
				VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			smokingStatusMeaningfulUse2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SMOKING_STATUS_MEANINGFUL_USE2__SMOKING_STATUS_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("SmokingStatusObservationValue"),
					new Object[] { smokingStatusMeaningfulUse2 }));
			}

			return false;
		}
		return true;
	}

} // SmokingStatusMeaningfulUse2Operations
