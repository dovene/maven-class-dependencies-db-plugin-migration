package com.example;

import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LoggerFactory.getLogger("root").info("message from slf4j");
    }
}
