/**
 * Copyright 2007-2010 非也
 * All rights reserved. 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation。
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses. *
 */
package org.fireflow.engine.entity.repository;


/**
 * 
 * 
 * @author 非也
 * @version 2.0
 * @deprecated
 */
public interface ResourceDescriptor extends RepositoryDescriptor{

    /**
     * 资源Id
     * @return
     */
    public String getResourceId();

    /**
     * 资源类别
     * @return
     */
    public String getResourceType();

}
