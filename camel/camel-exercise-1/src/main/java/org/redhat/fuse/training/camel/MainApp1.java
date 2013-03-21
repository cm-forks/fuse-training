package org.redhat.fuse.training.camel;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class MainApp1 {

    private static Logger logger = LoggerFactory.getLogger(MainApp1.class);

    public static void main(String[] args) throws Exception {

        // CamelContext = container where we will register the routes
        DefaultCamelContext camelContext = new DefaultCamelContext();

        RouteBuilder routeBuilder = new RouteBuilder() {

            // A Route sending every x seconds a message
            // to the logger processor

            @Override
            public void configure() throws Exception {
                from("timer://exercise1delay=1000")
                        .log(LoggingLevel.INFO, ">> This is the first Camel exercise")
                        .process(new Processor() {
                            public void process(Exchange exchange) throws Exception {
                                logger.info("Invoked timer at " + new Date());
                            }
                        });
            }
        };


        camelContext.addRoutes(routeBuilder);

        // Start the container
        camelContext.start();

        // give it time to realize it has work to do
        Thread.sleep(10000);

    }
}