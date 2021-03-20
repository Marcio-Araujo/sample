package br.com.markdev.springsamples.service.impl;

import br.com.markdev.springsamples.service.ServiceExample;
import br.com.markdev.springsamples.annotations.ExampleTypeSvc;
import br.com.markdev.springsamples.service.model.enums.FlowType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@ExampleTypeSvc(FlowType.FLOW_B)
public class ServiceExampleBImpl implements ServiceExample {

    Logger logger = LoggerFactory.getLogger(ServiceExampleBImpl.class);

    @Override
    public void executeSomeAction(String exampleMessage) {
        logger.info(String.format("LOG ON SERVICE B - Message: %s", exampleMessage));

    }

    private void init() {
        logger.info("Bean method initialize called");
    }
}
