package com.dddmarket.mono.configs;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@Configuration
//@EnableMongoRepositories(basePackages = "com.dddmarket.mono.entity")
//public class DatabaseMongoConfig {
//
//    @Bean
//    public MongoClient mongo() {
//        return new MongoClient("localhost", 27017);
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() throws Exception {
//        return new MongoTemplate(mongo(), "evolution");
//    }
//}
