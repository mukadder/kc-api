/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 Kuali, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kuali.coeus.sys.api.model;

import java.util.Date;

/**
 * This interface can be used to identify a user and timestamp regarding when the object was last
 * modified (usually in regards to object persistence).
 *
 * If the object has just be persisted, then these fields will record the initial creator of the
 * object otherwise it records information about the last update.
 */
public interface RecordedUpdate {

    /**
     * The date and time of when the object was last inserted or updated
     * @return the date or null if the object is new
     */
    Date getUpdateTimestamp();

    /**
     * The user who last inserted or updated the object
     * @return the user or null if the object is new
     */
    String getUpdateUser();

}
