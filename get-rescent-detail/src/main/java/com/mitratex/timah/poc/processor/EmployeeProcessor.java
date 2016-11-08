package com.mitratex.timah.poc.processor;

import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MultivaluedMap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.jaxrs.utils.JAXRSUtils;



public class EmployeeProcessor implements Processor {
	 
	@Override
	public void process(Exchange exchange) throws Exception {
		
		
		String queryString = exchange.getIn().getHeader(Exchange.HTTP_QUERY, String.class);
   	    String decoded = URLDecoder.decode(queryString, "UTF-8");
        MultivaluedMap<String, String> queryMap = JAXRSUtils.getStructuredParams(decoded, "&", false, false);
        for (Map.Entry<String, List<String>> eachQueryParam : queryMap.entrySet()) {
            exchange.setProperty(eachQueryParam.getKey(), eachQueryParam.getValue());
        }
        
        
        
        String position=getFirstEntrySafelyFromList(exchange.getProperty("position", List.class));
        String rescent=getFirstEntrySafelyFromList(exchange.getProperty("rescent", List.class));

		String query = "SELECT NIK,Nama,JabBaru FROM TBL_KARYAWAN WHERE JabBaru='"+position.trim()+"'";
		exchange.getIn().setHeader("CamelJmsRequestTimeout", "1000000");
		exchange.getIn().setBody(query);
		
		
		/*Map<String, Object> row = exchange.getIn().getBody(Map.class);
		RescentSap rescentSap = new RescentSap();
		rescentSap.setPosition((String) row.get("position"));
		rescentSap.setRescent((String) row.get("rescent"));
		exchange.getOut().setBody(rescentSap);*/
	
		
	}
	
	private String getFirstEntrySafelyFromList(List<String> list){
        if (list!=null && !list.isEmpty()){
        	  //return list.get(0);
              return list.get(0).replaceAll("_", "&");
        }
        return null;
    }
	
}