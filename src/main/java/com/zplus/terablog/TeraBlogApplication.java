package com.zplus.terablog;

import com.zplus.terablog.system.init.ConfigApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *   

 */
@SpringBootApplication
@EnableScheduling
public class TeraBlogApplication
{
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(TeraBlogApplication.class);
        springApplication.addInitializers(new ConfigApplicationContextInitializer());
        springApplication.run(args);
    }
}
