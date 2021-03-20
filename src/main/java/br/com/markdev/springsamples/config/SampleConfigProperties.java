package br.com.markdev.springsamples.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("sample.directives")
public class SampleConfigProperties {

    private Integer multiplier = 1;

    private String messageSample = "Default message";

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

    public String getMessageSample() {
        return messageSample;
    }

    public void setMessageSample(String messageSample) {
        this.messageSample = messageSample;
    }
}
