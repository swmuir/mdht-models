/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Severity Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getSeverityObservation()
 * @generated
 */
public interface ISeverityObservation {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Observation)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getSeverityObservation_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Observation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * self.value.oclAsType(datatypes::ANY)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ANY getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Severity Observation SHALL contain exactly one [1..1] value (CONF-295).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ANY withValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Severity Observation SHALL contain exactly one [1..1] value (CONF-295).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverityObservation setValue(ANY value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverityObservation init();
} // ISeverityObservation
