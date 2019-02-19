package cloud.pay.core.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:22:082019/2/15
 */

@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String sayHello(String name) {
        System.out.println("得到请求:"+name);
        return "hello:" + name;
    }
}
