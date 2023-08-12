package app.config;

import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Time;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean
    public Timer getTimer() {
        return new Timer();
    }
}
