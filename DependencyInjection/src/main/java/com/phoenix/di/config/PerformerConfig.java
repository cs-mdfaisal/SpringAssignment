package com.phoenix.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.phoenix.di.instruments","com.phoenix.di.performers"})
public class PerformerConfig {

	

}
