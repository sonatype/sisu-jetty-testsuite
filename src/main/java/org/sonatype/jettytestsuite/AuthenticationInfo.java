/*
 * Copyright (c) 2007-2012 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.jettytestsuite;

/**
 * The Class AuthenticationInfo.
 * 
 * @author cstamas
 */
public class AuthenticationInfo
{

    /** The auth method. */
    private String authMethod;

    private String credentialsFilePath;

    private String authPathSpec = "/*";

    public String getAuthMethod()
    {
        return authMethod;
    }

    public void setAuthMethod( String authMethod )
    {
        this.authMethod = authMethod;
    }

    public String getCredentialsFilePath()
    {
        return credentialsFilePath;
    }

    public void setCredentialsFilePath( String credentialsFile )
    {
        this.credentialsFilePath = credentialsFile;
    }

    public String getAuthPathSpec()
    {
        return authPathSpec;
    }

    public void setAuthPathSpec( String authPathSpec )
    {
        this.authPathSpec = authPathSpec;
    }
}
