package com.tandel.bimal.kafka_camel_mq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class LogProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("processing "+ exchange.getIn().getHeader("CamelFilePath"));
		
	}

}
