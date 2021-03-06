package com.cjs.example.restservice.hello;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author ChengJianSheng
 * @date 2020-03-25
 */
public class GreetingWebClient {

    /**
     * For reactive applications, Spring offers the WebClient class, which is non-blocking.
     *
     * WebClient can be used to communicate with non-reactive, blocking services, too.
     */
    private WebClient client = WebClient.create("http://localhost:8080");

    private Mono<ClientResponse> result = client.get()
            .uri("/hello")
            .accept(MediaType.TEXT_PLAIN)
            .exchange();

    public String getResult() {
        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
    }
}
