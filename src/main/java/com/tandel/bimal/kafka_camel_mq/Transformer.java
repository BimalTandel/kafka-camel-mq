package com.tandel.bimal.kafka_camel_mq;

public class Transformer {
	public String transformContent(String body) {
		System.out.println("Invoking the transformContent method");
		String upperCaseContent = body.toUpperCase();
		return upperCaseContent;
	}
}
