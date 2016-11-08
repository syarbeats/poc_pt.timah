package com.mitratex.vst;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class QueryProcessor implements Processor {
	 
	@Override
	public void process(Exchange exchange) throws Exception {
		
		String buffer = exchange.getIn().getBody().toString().trim();
		String[] body = buffer.split(",");
		String query = "INSERT INTO TBL_RESCENT VALUES('"+body[0]+"', '"+body[1]+"')";
		exchange.getIn().setBody(query);
		
	}
	
}