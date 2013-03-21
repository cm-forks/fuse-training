package org.redhat.fuse.training.camel;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class SpringMainApp {

    private static Logger logger = LoggerFactory.getLogger(SpringMainApp.class);

    private Main main;

    public static void main(String[] args) throws Exception {
        SpringMainApp app = new SpringMainApp();
        app.boot();
    }

    public void boot() throws Exception {
        // create a Main instance
        main = new Main();

        // enable hangup support so you can press ctrl + c to terminate the JVM
        main.enableHangupSupport();

        // set Spring application context
        main.setApplicationContextUri("META-INF/spring/spring-context.xml");

        // run until you terminate the JVM
        logger.info("Starting Spring Camel. Use ctrl + c to terminate the JVM.\n");

        main.run();
    }

}