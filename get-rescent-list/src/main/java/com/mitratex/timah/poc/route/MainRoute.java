package com.mitratex.timah.poc.route;

import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.core.MultivaluedMap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.cxf.jaxrs.utils.JAXRSUtils;

import com.mitratex.timah.poc.dao.impl.RescentSapDaoImpl;
import com.mitratex.timah.poc.domain.Employee;
import com.mitratex.timah.poc.domain.RescentSap;

public class MainRoute extends RouteBuilder{
	
	 private String restEndpoint;
	 
	 private RescentSapDaoImpl rescentSapDao = new RescentSapDaoImpl();
	 

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from(restEndpoint)
				.recipientList(simple("direct:${header.operationName}"));
		
		 from("direct:getEmployee")
	        .process(new Processor() {
	            @Override
	            public void process(Exchange exchange) throws Exception {
	            	
	            	String uri = exchange.getIn().getBody().toString();
	            	/*String position = extractParameter(uri, "position");
	            	String rescent = extractParameter(uri, "rescent");*/
	            	
	            	String path = exchange.getIn().getHeader(Exchange.HTTP_URI, String.class);
	            	String path2 = exchange.getIn().getHeader(Exchange.HTTP_URL, String.class);
	            	
	            	
	            	 /*String position = exchange.getIn().getHeader("position", String.class);
	            	 String rescent = exchange.getIn().getHeader("rescent", String.class);*/
	            	 
	            	 String queryString = exchange.getIn().getHeader(Exchange.HTTP_QUERY, String.class);
	            	 String decoded = URLDecoder.decode(queryString, "UTF-8");
	                 MultivaluedMap<String, String> queryMap = JAXRSUtils.getStructuredParams(decoded, "&", false, false);
	                 for (Map.Entry<String, List<String>> eachQueryParam : queryMap.entrySet()) {
	                     exchange.setProperty(eachQueryParam.getKey(), eachQueryParam.getValue());
	                 }
	                 
	                 String position=getFirstEntrySafelyFromList(exchange.getProperty("position", List.class));
	                 String rescent=getFirstEntrySafelyFromList(exchange.getProperty("rescent", List.class));
	            
	            	 
	         
	                //exchange.getIn().setBody(employee);
	                
	            }
	        }).end();
		 
		 from("direct:getRescentSapList")
	        .process(new Processor() {
	            @Override
	            public void process(Exchange exchange) throws Exception {
	            	List<RescentSap> rescentSapList = rescentSapDao.getRescentSapLists();
	                exchange.getIn().setBody(rescentSapList);
	            }
	        }).end();
		
	}
	
	
	public void setRestEndpoint(String restEndpoint) {
	        this.restEndpoint = restEndpoint;
	}
	
	
	private static String extractParameter(String uri, String parameterName) {
	    Matcher m = Pattern.compile(parameterName + "=([^&]+)").matcher(uri);
	    return m.find() ? m.group(1) : null;
	}
	
	private String getFirstEntrySafelyFromList(List<String> list){
        if (list!=null && !list.isEmpty()){
        	  return list.get(0);
          /*  return list.get(0).replaceAll("%20", " ");*/
        }
        return null;
    }

}
