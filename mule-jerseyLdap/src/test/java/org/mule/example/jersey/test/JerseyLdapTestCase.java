package org.mule.example.jersey.test;

import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.FunctionalTestCase;
import org.mule.transport.http.HttpConnector;
import org.mule.transport.http.HttpConstants;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class JerseyLdapTestCase extends FunctionalTestCase
{

   

    public void testGoodAuthenticationBadAuthorisation() throws Exception {
    	 HttpClient client = new HttpClient();
         Credentials credentials = new UsernamePasswordCredentials("jdoe", "123");
         client.getState().setCredentials(AuthScope.ANY, credentials);
         client.getParams().setAuthenticationPreemptive(true);
         GetMethod method = new GetMethod("http://localhost:65069/helloworld/Jaskirat");
         //PostMethod method = new PostMethod("http://localhost:65069/helloworld/Jaskirat");
         method.setDoAuthentication(true);
         int result = client.executeMethod(method);
         assertEquals(500, result);
        // assertEquals("Hello Mr. Jaskirat",method.getResponseBodyAsString());
         System.out.println(method.getResponseBodyAsString());


    }
    
    public void testGoodAuthenticationGoodAuthorisation() throws Exception {
   	 HttpClient client = new HttpClient();
        Credentials credentials = new UsernamePasswordCredentials("kmoe", "test");
        client.getState().setCredentials(AuthScope.ANY, credentials);
        client.getParams().setAuthenticationPreemptive(true);
        GetMethod method = new GetMethod("http://localhost:65069/helloworld/Jaskirat");
        //PostMethod method = new PostMethod("http://localhost:65069/helloworld/Jaskirat");
        method.setDoAuthentication(true);
        int result = client.executeMethod(method);
        assertEquals(200, result);
        assertEquals("Hello Mr. Jaskirat",method.getResponseBodyAsString());
        System.out.println(method.getResponseBodyAsString());


   }
    
    public void testBadAuthenticationBadAuthorisation() throws Exception {
      	 HttpClient client = new HttpClient();
           Credentials credentials = new UsernamePasswordCredentials("kmoe", "test2");
           client.getState().setCredentials(AuthScope.ANY, credentials);
           client.getParams().setAuthenticationPreemptive(true);
           GetMethod method = new GetMethod("http://localhost:65069/helloworld/Jaskirat");
           //PostMethod method = new PostMethod("http://localhost:65069/helloworld/Jaskirat");
           method.setDoAuthentication(true);
           int result = client.executeMethod(method);
           assertEquals(401, result);
          // assertEquals("Hello Mr. Jaskirat",method.getResponseBodyAsString());
           System.out.println(method.getResponseBodyAsString());


      }
    
    @Override
    protected String getConfigResources()
    {
        return "mule-config.xml";
    }


}
