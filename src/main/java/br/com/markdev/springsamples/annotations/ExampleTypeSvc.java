package br.com.markdev.springsamples.annotations;


import br.com.markdev.springsamples.service.model.enums.FlowType;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface ExampleTypeSvc {
    FlowType value();
}
