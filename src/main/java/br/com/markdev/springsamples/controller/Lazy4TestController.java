package br.com.markdev.springsamples.controller;

import br.com.markdev.springsamples.service.ExecuteExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lazy4TestController {


    private ExecuteExampleService executeExampleService;

    public Lazy4TestController(ExecuteExampleService executeExampleService) {
        this.executeExampleService = executeExampleService;
    }

    @GetMapping("/test")
    public String lazy2Test(){
        executeExampleService.executeExample("wah");
        return "done!";
    }

}
