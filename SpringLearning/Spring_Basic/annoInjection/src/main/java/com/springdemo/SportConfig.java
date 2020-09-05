package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com/springdemo")
@PropertySource("application.properties")
public class SportConfig {
    // define bean for sad coach service
    @Bean
    public CoachServices sadCoachService2() {
        return new SadCoachService2();
    }

    // define bean for swim coach and inject dependency
    @Bean // gameCoach here is the bean id
    public Coach gameCoach() {
        return new GameCoach(sadCoachService2());
    }
}
