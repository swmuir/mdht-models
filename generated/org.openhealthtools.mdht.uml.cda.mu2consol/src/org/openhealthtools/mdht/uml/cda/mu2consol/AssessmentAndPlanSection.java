/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assessment And Plan Section</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getAssessmentAndPlanSection()
 * @model annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolAssessmentAndPlanSectionTemplateId' templateId.root='2.16.840.1.113883.10.20.22.2.9'"
 * @generated
 */
public interface AssessmentAndPlanSection extends
		org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not
	 * procedure.oclIsUndefined() and
	 * procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure
	 * ))->asSequence()-
	 * >any(true).oclAsType(consol::PlanOfCareActivityProcedure) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlanOfCareActivityProcedure))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivityProcedure)'"
	 * @generated
	 */
	PlanOfCareActivityProcedure getPlanOfCareActivityProcedure();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration :
	 * cda::SubstanceAdministration | not
	 * substanceAdministration.oclIsUndefined() and
	 * substanceAdministration.oclIsKindOf
	 * (consol::PlanOfCareActivitySubstanceAdministration
	 * ))->asSequence()->any(true
	 * ).oclAsType(consol::PlanOfCareActivitySubstanceAdministration) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlanOfCareActivitySubstanceAdministration))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySubstanceAdministration)'"
	 * @generated
	 */
	PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not
	 * supply.oclIsUndefined() and
	 * supply.oclIsKindOf(consol::PlanOfCareActivitySupply
	 * ))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySupply)
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlanOfCareActivitySupply))->asSequence()->any(true).oclAsType(consol::PlanOfCareActivitySupply)'"
	 * @generated
	 */
	PlanOfCareActivitySupply getPlanOfCareActivitySupply();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::ProblemObservation
	 * ))->asSequence()->any(true).oclAsType(consol::ProblemObservation) <!--
	 * end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation))->asSequence()->any(true).oclAsType(consol::ProblemObservation)'"
	 * @generated
	 */
	ProblemObservation getProblemObservation();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection init();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // AssessmentAndPlanSection
