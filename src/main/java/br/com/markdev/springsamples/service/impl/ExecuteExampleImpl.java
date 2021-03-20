package br.com.markdev.springsamples.service.impl;

import br.com.markdev.springsamples.config.SampleConfigProperties;
import br.com.markdev.springsamples.service.EventExample;
import br.com.markdev.springsamples.service.ExecuteExampleService;
import br.com.markdev.springsamples.service.ServiceExample;
import br.com.markdev.springsamples.annotations.ExampleTypeSvc;
import br.com.markdev.springsamples.service.model.enums.FlowType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ExecuteExampleImpl implements ExecuteExampleService {

    Logger logger = LoggerFactory.getLogger(ExecuteExampleImpl.class);

    private ApplicationEventPublisher eventPublisher;
    private final ServiceExample serviceExample;

    private final SampleConfigProperties properties;

    public ExecuteExampleImpl(@ExampleTypeSvc(FlowType.FLOW_A) ServiceExample serviceExample,
                              SampleConfigProperties properties,
                              ApplicationEventPublisher eventPublisher) {
        this.serviceExample = serviceExample;
        this.eventPublisher = eventPublisher;
        this.properties = properties;
    }

    @Override
    public void executeExample(String example) {

        logger.info("Start listing default message");
        for (int index = 0 ; index < properties.getMultiplier(); index++){
            logger.info(properties.getMessageSample());
        }
        logger.info("Finished listing default message");

        serviceExample.executeSomeAction("Action A");
        eventPublisher.publishEvent(new EventExample("your favorite event consumed into Event listener"));
    }
}
