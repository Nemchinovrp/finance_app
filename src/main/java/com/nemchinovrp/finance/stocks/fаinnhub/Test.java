package com.nemchinovrp.finance.stocks.fаinnhub;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://finnhub.io/api/v1/stock/symbol?exchange=US&token=c02kckn48v6vhdkh1tog";
        ResponseEntity<Object> response
                = restTemplate.getForEntity(fooResourceUrl, Object.class);

        System.out.println(response);
    }
}
