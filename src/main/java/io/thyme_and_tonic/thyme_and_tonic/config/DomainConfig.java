package io.thyme_and_tonic.thyme_and_tonic.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("io.thyme_and_tonic.thyme_and_tonic.domain")
@EnableJpaRepositories("io.thyme_and_tonic.thyme_and_tonic.repos")
@EnableTransactionManagement
public class DomainConfig {
}
