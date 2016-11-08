package com.mitratex.timah.poc.processor;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.mitratex.timah.poc.domain.RescentSap;

public class RowProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
  
        Map<String, Object> row = exchange.getIn().getBody(Map.class);
		RescentSap rescentSap = new RescentSap();
		rescentSap.setPosition((String) row.get("position"));
		rescentSap.setRescent((String) row.get("rescent"));
		exchange.getOut().setBody(rescentSap);

    }

}
