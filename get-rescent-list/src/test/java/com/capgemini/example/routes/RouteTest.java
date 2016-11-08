package com.capgemini.example.routes;

import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Dictionary;

import static org.hamcrest.CoreMatchers.containsString;

public class RouteTest extends CamelBlueprintTestSupport {
	
	/*   private static final String BASE_URL = "http://localhost:8181/api/";
       private CloseableHttpClient httpClient;
   	
       @Override
       protected String getBlueprintDescriptor() {
           return "/OSGI-INF/blueprint/blueprint.xml";
       }
   
       @Before
       public void setUpTests() {
           if (httpClient == null) {
               httpClient = HttpClients.createDefault();
           }
       }
   
       @After
       public void closeHttpClient() throws IOException {
           httpClient.close();
           httpClient = null;
       }
   
       @Override
       protected String useOverridePropertiesWithConfigAdmin(Dictionary props) throws Exception {
           props.put("api.root.url", BASE_URL);
           return "com.capgemini.example";
       }
   
       @Test
       public void testRouteReturnsAPostObjectInJson() throws Exception {
           String url = BASE_URL + "/1/blog/post/1";
           HttpGet httpGet = new HttpGet(url);
           CloseableHttpResponse response = httpClient.execute(httpGet);
           String stringResponse = EntityUtils.toString(response.getEntity());
           Post blogPost = new ObjectMapper().readValue(stringResponse, Post.class);
           assertEquals("My Title", blogPost.getTitle());
           assertEquals(1, blogPost.getId());
       }*/
   
     /*  @Test
       public void testRouteReturnsAPostObjectInXML() throws Exception {
           String url = BASE_URL + "/1/blog/post/1";
           HttpGet httpGet = new HttpGet(url);
           httpGet.addHeader("Accept", MediaType.APPLICATION_XML);
           CloseableHttpResponse response = httpClient.execute(httpGet);
           String stringResponse = EntityUtils.toString(response.getEntity());
           JAXBContext jaxbContext = JAXBContext.newInstance(Post.class);
           Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
           Post blogPost = (Post) unmarshaller.unmarshal(new StringReader(stringResponse));
           assertEquals("My Title", blogPost.getTitle());
       }*/

}