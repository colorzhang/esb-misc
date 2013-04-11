package org.mule.transport.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;

import org.mule.api.MuleEventContext;
import org.mule.component.simple.LogComponent;

@Path("/helloworld")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    @Path("/{name}")
    public String sayHelloWithUri(@PathParam("name") String name) {
        return "Hello Mr. " + name;
    }
    
   

}
