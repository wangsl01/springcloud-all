package cloud.pay.core.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:22:082019/2/15
 */

@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String sayHello(String name) {
        System.out.println("得到请求:" + name);
        return "hello:" + name;
    }


    @PostMapping("/zuultest")
    @ResponseBody
    public Object testPost(@RequestBody Map<String, String> map) {
        System.out.println(map);
        return map;
    }


    @GetMapping("/zuulget")
    @ResponseBody
    public Object testPost(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames != null && parameterNames.hasMoreElements()) {
            String key = parameterNames.nextElement();
            String value = request.getParameter(key);
            map.put(key, value);
        }
        return map;
    }
}
