package dev.vrba.gems;

import dev.vrba.gems.configuration.BotConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(BotConfiguration.class)
public class GemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GemsApplication.class, args);
    }

}
