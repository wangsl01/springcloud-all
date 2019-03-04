package cloud.pay.web.controller;

import cloud.pay.web.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:14:392019/2/21
 */

@Controller
public class MyZuulController {

//    @Autowired(required = false)
//    private HelloService helloService;
//
//
//    @GetMapping("/zuultest")
//    @ResponseBody
//    public Object testPost(HttpServletRequest request) {
//
//        Map<String, String> map = new HashMap<>();
//
//        Enumeration<String> parameterNames = request.getParameterNames();
//        while (parameterNames != null && parameterNames.hasMoreElements()) {
//            String key = parameterNames.nextElement();
//            String value = request.getParameter(key);
//            map.put(key,value);
//        }
//        return helloService.testPost(map);
//    }
}
