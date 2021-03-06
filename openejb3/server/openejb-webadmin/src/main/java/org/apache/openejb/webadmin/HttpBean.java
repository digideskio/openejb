/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.webadmin;

/** This is ejb interface for the webadmin.  It contains one message which gets
 * executed on each webadmin bean
 * @author <a href="mailto:david.blevins@visi.com">David Blevins</a>
 */
public interface HttpBean extends javax.ejb.SessionBean{
    /** This is the main method for all the web admin beans.  It does all the processing
     * and delegates work as necessary.
     * @param request the HTTP request object
     * @param response the HTTP response object
     * @throws java.io.IOException if an exception is thrown
     */    
    public void onMessage(HttpRequest request, HttpResponse response) throws java.io.IOException;
}
