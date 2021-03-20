package br.com.markdev.springsamples.listener;

import br.com.markdev.springsamples.annotations.ExampleTypeSvc;
import br.com.markdev.springsamples.service.EventExample;
import br.com.markdev.springsamples.service.ServiceExample;
import br.com.markdev.springsamples.service.model.enums.FlowType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class AnotherEventExampleListener {

    private Logger logger = LoggerFactory.getLogger(AnotherEventExampleListener.class);

    private final ServiceExample serviceExample;

    public AnotherEventExampleListener(@ExampleTypeSvc(FlowType.FLOW_A) ServiceExample serviceExample) {
        this.serviceExample = serviceExample;
    }

    @EventListener
    public void eventExampleListener(EventExample event){
        logger.info("FROM ANOTHER EVENT");
        serviceExample.executeSomeAction(event.getMessage());

    }
}
