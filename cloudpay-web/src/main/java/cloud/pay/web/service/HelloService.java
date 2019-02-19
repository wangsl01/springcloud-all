package cloud.pay.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:15:382019/2/16
 */

@FeignClient(name = "cloudpay-core")
public interface HelloService {

    @GetMapping("/hello")
    String sayHello(@RequestParam(value="name") String name);
}
