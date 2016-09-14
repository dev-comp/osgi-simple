package com.bftcom.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class HelloWorld implements BundleActivator{
  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

  public void start(BundleContext context) throws Exception {
    System.out.println("started");
    Files.createFile(Paths.get("D:/tmp/" + System.currentTimeMillis()));
    logger.info("started");
  }

  public void stop(BundleContext context) throws Exception {
    System.out.println("stopped");
  }

  //temp
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

}
