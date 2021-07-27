package toy.weddingmanager.apigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@RequestMapping("/api")
public class ApiGatewayController {

    @Autowired
    private ExpenditureClient expenditureClient;

    @RequestMapping("/expenditure/test")
    public void test() {
        String result = expenditureClient.test();
        System.out.println("result : "+result);
    }
}
