package it.patrick.demo.log4j2Demo;

import it.patrick.demo.pippo.TestLOgger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "it.patrick.demo")
@RestController
public class Log4j2DemoApplication {
    
    @Autowired
    private TestLOgger testLOgger;

    private static final Logger log = Logger.getLogger(Log4j2DemoApplication.class.getName());
   private transient final org.apache.logging.log4j.Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        SpringApplication.run(Log4j2DemoApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String hiLog() {
        for (int i = 0; i < 10000; i++) {
            //
        log.info("java.util.logging.Logger info");
        log.warning("java.util.logging.Logger warning");
        //
        log.log(Level.WARNING, "java.util.logging.Logger warning with level");
        log.log(Level.SEVERE, "cxvxcvx");
        
        logger.info("org.apache.logging.log4j.Logger info");
        logger.debug("org.apache.logging.log4j.Logger debug");
        logger.warn("org.apache.logging.log4j.Logger warn");
        logger.error("org.apache.logging.log4j.Logger error");
        
        testLOgger.log();
            try {
                int a = 1/0;
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
        
        
        
        
        return "Hi logs";
    }
}
