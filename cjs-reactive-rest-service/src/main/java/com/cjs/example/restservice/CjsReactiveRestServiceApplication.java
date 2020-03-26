package com.cjs.example.restservice;

import com.cjs.example.restservice.hello.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ChengJianSheng
 * @date 2020-03-25
 */
@SpringBootApplication
public class CjsReactiveRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CjsReactiveRestServiceApplication.class, args);

        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
    }

}
