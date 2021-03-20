package br.com.markdev.springsamples.service.impl;

import br.com.markdev.springsamples.service.ServiceExample;
import br.com.markdev.springsamples.annotations.ExampleTypeSvc;
import br.com.markdev.springsamples.service.model.enums.FlowType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("testEnv")
@Component
public class ExecuteExampleTestEnvImpl {

    private Logger logger = LoggerFactory.getLogger(ExecuteExampleTestEnvImpl.class);

    private ServiceExample serviceExample;

    public ExecuteExampleTestEnvImpl(@ExampleTypeSvc(FlowType.FLOW_A) ServiceExample serviceExample) {
        this.serviceExample = serviceExample;
        logger.info("Startup using testEnv profile");
    }
}
