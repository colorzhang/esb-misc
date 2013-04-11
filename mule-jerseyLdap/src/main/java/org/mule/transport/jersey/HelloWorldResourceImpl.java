/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Path("/helloworld")
public class HelloWorldResourceImpl
{

    /**
     * logger used by this class
     */
    private static final Log logger = LogFactory.getLog(HelloWorldResourceImpl.class);

    static
    {
        logger.error("loading class HelloWorldResource");
    }

    {
        logger.error("initialization block for class HelloWorldResource");
    }

    public HelloWorldResourceImpl()
    {
        logger.error("creating HelloWorldResource");
    }

    /* (non-Javadoc)
     * @see org.mule.transport.jersey.HelloWorldResource#sayHelloWithUri(java.lang.String)
     */
    @GET
    @Produces("text/plain")
    @Path("/{name}")
    public String sayHelloWithUri(@PathParam("name") String name) {
        return "Hello " + name;
    }
}
