package yoon.toy.schedule;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("expenditure-service")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
