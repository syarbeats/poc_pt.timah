package com.mitratex.timah.poc.processor;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.mitratex.timah.poc.domain.RescentSap;


public class QueryProcessor implements Processor {
	 
	@Override
	public void process(Exchange exchange) throws Exception {
		

		String query = "SELECT * FROM TBL_RESCENT ";
		exchange.getIn().setHeader("CamelJmsRequestTimeout", "1000000");
		exchange.getIn().setBody(query);
		
		
		/*Map<String, Object> row = exchange.getIn().getBody(Map.class);
		RescentSap rescentSap = new RescentSap();
		rescentSap.setPosition((String) row.get("position"));
		rescentSap.setRescent((String) row.get("rescent"));
		exchange.getOut().setBody(rescentSap);*/
	
		
	}
	
}