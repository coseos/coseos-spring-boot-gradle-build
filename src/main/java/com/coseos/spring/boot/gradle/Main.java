/**
 * coseos-spring-boot-gradle-build
 * 
 * Copyright (c) 2021 <a href="https://coseos.com/">coseos</a>
 * 
 * All righs reserved.
 * 
 */
package com.coseos.spring.boot.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Main class
 * 
 */
@SpringBootApplication
public class Main {

	/**
	 * The main method for this Spring Boot Java program
	 * 
	 * @param args  Command line args
	 * 
	 */
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
