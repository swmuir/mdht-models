/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payers Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Payers Section contains data on the patient's payers, whether a 'third party' insurance, self-pay,
 *     other payer or guarantor, or some combination. At a minimum, the patient's pertinent current payment sources should be
 *     listed. If no payment sources are supplied, the reason shall be supplied as free text in the narrative block (e.g., Not
 *     Insured, Payer Unknown, Medicare Pending, et cetera). 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getPayersSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HITSPPayersSectionTemplateId HITSPPayersSectionInsuranceProvider' templateId.root='2.16.840.1.113883.3.88.11.83.101'"
 * @generated
 */
public interface PayersSection extends org.openhealthtools.mdht.uml.cda.ihe.PayersSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.101\')'"
	 * @generated
	 */
	boolean validateHITSPPayersSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::InsuranceProvider))'"
	 * @generated
	 */
	boolean validateHITSPPayersSectionInsuranceProvider(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::InsuranceProvider)).oclAsType(hitsp::InsuranceProvider)'"
	 * @generated
	 */
	EList<InsuranceProvider> getInsuranceProviders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PayersSection
