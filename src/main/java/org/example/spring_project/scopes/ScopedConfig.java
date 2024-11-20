package org.example.spring_project.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopedConfig {
    @Bean
    @Scope("singleton")
    public SingletonScopedBean singletonScopedBean(){
        return new SingletonScopedBean();
    }

    @Bean
    @Scope("prototype")
    public PrototypeScopedBean prototypeScopedBean(){
        return new PrototypeScopedBean();
    }
}
