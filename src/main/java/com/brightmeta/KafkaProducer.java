package com.brightmeta;

import java.util.Properties;

/**
 * Created by John on 9/6/17.
 */
public class KafkaProducer {

    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("bootstrap.servers", "localhost:9092");
    }
}
