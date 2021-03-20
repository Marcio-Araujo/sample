package br.com.markdev.springsamples.config;

import br.com.markdev.springsamples.service.impl.ServiceExampleBImpl;
import br.com.markdev.springsamples.service.impl.ServiceExampleCImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean(initMethod = "init")
    public ServiceExampleCImpl executeExampleBImpl(){
        return new ServiceExampleCImpl();
    }
}
