Camel Exercise 1
================

Goal : Create a Camel Java standalone project
---------------------------------------------

A. Using Java Main

Steps to do :

    1) Create a Java Main Class (MainApp)
    2) Add a DefaultCamelContext
    3) Register a camel Route
    4) Run locally the camel route

    Run the project : mvn exec:java -Dexec.mainClass="org.redhat.fuse.training.camel.MainApp1"


B. Using Camel Main

Steps to do :

    0) Create a Camel Main Class (http://camel.apache.org/running-camel-standalone-and-have-it-keep-running.html)
    1) Add a DefaultCamelContext
    2) Register a camel Route
    3) Run locally the camel route
    4) Exit the route using ctrl-c

    Run the project : mvn exec:java -Dexec.mainClass="org.redhat.fuse.training.camel.MainApp2"