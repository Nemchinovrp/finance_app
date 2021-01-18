package com.nemchinovrp.finance.stocks.marketstack;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test {
    public static void main(String[] args) {
        String url = "http://api.marketstack.com/v1/eod?access_key=f47436f294de6036a37f5c0273722a73&symbols=BABA";
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Object> response
                = restTemplate.getForEntity(url, Object.class);

        System.out.println(response);
    }
}
