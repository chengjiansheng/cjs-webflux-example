package com.cjs.example.restservice.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

/**
 * @author ChengJianSheng
 * @date 2020-03-25
 */
@Configuration
public class GreetingRouter {

    /**
     * The router listens for traffic on the /hello path and returns the value provided by our reactive handler class.
     */
    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), greetingHandler::hello);
    }
}
