/**
 * Copyright (c) 2015 ScientiaMobile Inc.
 *
 * The WURFL Cloud Client is intended to be used in both open-source and
 * commercial environments. To allow its use in as many situations as possible,
 * the WURFL Cloud Client is dual-licensed. You may choose to use the WURFL
 * Cloud Client under either the GNU GENERAL PUBLIC LICENSE, Version 2.0, or
 * the MIT License.
 *
 * Refer to the COPYING.txt file distributed with this package.
 */
package com.scientiamobile.wurflcloud;

/**
 * listener for update, receiving a cloud response.
 * At this moment the CloudClientManager only is listener
 *
 *         $Id$
 */
public interface CloudListener {
	
	/**
	 * Tells the listener when a specific {@link CloudEvent} has been raised.
	 * @param {@link CloudEvent} The raised CloudEvent
	 * 
	 */
    void processEvent(CloudEvent evt);
}