/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.pippo;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Component;

/**
 *
 * @author patrickn
 */
@Component
public class TestLOgger {
     private transient final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
    public void log(){
        
        logger.info("TestLOgger org.apache.logging.log4j.Logger info");
        logger.debug("TestLOgger org.apache.logging.log4j.Logger debug");
        logger.warn("TestLOgger org.apache.logging.log4j.Logger warn");
        logger.error("TestLOgger org.apache.logging.log4j.Logger error");
    }
    
}
