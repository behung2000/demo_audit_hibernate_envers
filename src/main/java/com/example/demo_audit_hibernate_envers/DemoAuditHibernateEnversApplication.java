package com.example.demo_audit_hibernate_envers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
public class DemoAuditHibernateEnversApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAuditHibernateEnversApplication.class, args);
    }

}
