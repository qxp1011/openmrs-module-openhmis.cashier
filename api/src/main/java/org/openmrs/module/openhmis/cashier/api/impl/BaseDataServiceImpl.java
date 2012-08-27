/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.openhmis.cashier.api.impl;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.api.APIException;
import org.openmrs.module.openhmis.cashier.api.IDataService;
import org.openmrs.module.openhmis.cashier.api.db.IEntityDao;

/**
 * The base type for data entity services.
 * @param <T> The entity data access object type.
 * @param <E> The entity type.
 */
public abstract class BaseDataServiceImpl<T extends IEntityDao, E extends BaseOpenmrsData>
		extends BaseEntityServiceImpl<T, E> implements IDataService<T, E> {

	@Override
	public E voidEncounter(E entity, String reason) {
		return null;
	}

	@Override
	public E unvoidEncounter(E entity) throws APIException {
		return null;
	}
}
