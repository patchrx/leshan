/*******************************************************************************
 * Copyright (c) 2013-2018 Sierra Wireless and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *     Daniel Persson (Husqvarna Group) - Attribute support
 *******************************************************************************/
package org.eclipse.leshan.core.link.lwm2m.attributes;

/**
 * operation allowed on a {@link LwM2mAttribute} by the LwM2M Server
 */
public enum AccessMode {
    /**
     * READ
     */
    R,
    /**
     * WRITE
     */
    W,
    /**
     * READ/WRITE
     */
    RW;

    public boolean isWritable() {
        return this == W || this == RW;
    }
}
