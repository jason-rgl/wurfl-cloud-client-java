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

import com.scientiamobile.wurflcloud.utils.Credentials;

/**
 * AuthenticationManager interface
 */
public interface IAuthenticationManager {
    /**
     * Splits the API Key into a username and password
     *
     * @return Credentials A Credentials object containing the username and password
     */
    Credentials splitApiKey();
}
