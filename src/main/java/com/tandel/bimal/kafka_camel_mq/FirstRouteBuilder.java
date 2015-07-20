package com.tandel.bimal.kafka_camel_mq;
import org.apache.camel.builder.RouteBuilder;

public class FirstRouteBuilder extends RouteBuilder{
	public void configure() throws Exception {
		from("file:/Users/bimal/Documents/camel/input?noop=true")
		.process(new LogProcessor())
		//.bean(new Transformer(),"transformContent")
		.to("kafka:ec2-52-3-163-120.compute-1.amazonaws.com:9092?topic=testtopic&zookeeperHost=ec2-52-3-163-120.compute-1.amazonaws.com&zookeeperPort=2181&serializerClass=kafka.serializer.StringEncoder");
	}
}
