package com.brightmeta;

import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

/**
 * Created by John on 9/6/17.
 */
public class KafkaProducer {

    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("bootstrap.servers", "localhost:9092");
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", StringSerializer.class.getName());
        properties.setProperty("acks", "1");
        properties.setProperty("retries", "3");
    }
}
