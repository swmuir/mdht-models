/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem List Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#getTitle() <em>Get Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#setTitle(org.openhealthtools.mdht.uml.hl7.datatypes.ST) <em>Set Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#getText() <em>Get Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#setText(org.openhealthtools.mdht.uml.cda.StrucDocText) <em>Set Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#getConditions() <em>Get Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection#addCondition(org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition) <em>Add Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ProblemListSection#validateProblemListSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ProblemListSection#validateProblemListSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ProblemListSection#validateProblemListSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ProblemListSection#validateProblemListSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemListSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemListSectionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Section toCDAType(ProblemListSection problemListSection) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::title.
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ST getTitle(ProblemListSection problemListSection) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>title</b></tt> (CONF-143).
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setTitle(ProblemListSection problemListSection, ST value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Section::text.
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  StrucDocText getText(ProblemListSection problemListSection) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>text</b></tt> (CONF-140).
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  void setText(ProblemListSection problemListSection, StrucDocText value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getConditions(ProblemListSection) <em>Get Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions(ProblemListSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(apitest::Condition)).oclAsType(apitest::Condition)";

	/**
	 * The cached OCL query for the '{@link #getConditions(ProblemListSection) <em>Get Conditions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions(ProblemListSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ProblemListSection::condition.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(apitest::Condition)).oclAsType(apitest::Condition)
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ICondition> getConditions(ProblemListSection problemListSection) {
		if (GET_CONDITIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.IPROBLEM_LIST_SECTION, DomainPackage.Literals.IPROBLEM_LIST_SECTION.getEAllOperations().get(5));
			try {
				GET_CONDITIONS__EOCL_QRY = helper.createQuery(GET_CONDITIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ICondition> result = (Collection<ICondition>) query.evaluate(problemListSection);
		return new BasicEList.UnmodifiableEList<ICondition>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains at least one [1..*] <tt><b>entry</b></tt>, such that.
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemListSection addCondition(ProblemListSection problemListSection, ICondition value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListSectionTemplateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionTemplateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.103')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListSectionTemplateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionTemplateId(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.103')
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListSectionTemplateId(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.PROBLEM_LIST_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEMPLATE_ID,
						 APITestPlugin.INSTANCE.getString("ProblemListSectionTemplateId"),
						 new Object [] { problemListSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListSectionCode(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionCode(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListSectionCode(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionCode(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '11450-4' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListSectionCode(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.PROBLEM_LIST_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_CODE,
						 APITestPlugin.INSTANCE.getString("ProblemListSectionCode"),
						 new Object [] { problemListSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListSectionTitle(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionTitle(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListSectionTitle(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionTitle(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListSectionTitle(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.PROBLEM_LIST_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TITLE,
						 APITestPlugin.INSTANCE.getString("ProblemListSectionTitle"),
						 new Object [] { problemListSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemListSectionText(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionText(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_LIST_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemListSectionText(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem List Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemListSectionText(ProblemListSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_LIST_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param problemListSection The receiving '<em><b>Problem List Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemListSectionText(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_LIST_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.PROBLEM_LIST_SECTION);
			try {
				VALIDATE_PROBLEM_LIST_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_LIST_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_LIST_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemListSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEXT,
						 APITestPlugin.INSTANCE.getString("ProblemListSectionText"),
						 new Object [] { problemListSection }));
			}
			return false;
		}
		return true;
	}

} // ProblemListSectionOperations