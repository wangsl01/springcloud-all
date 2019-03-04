package cloud.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@SpringBootApplication // 标准 Spring Boot 应用
@EnableDiscoveryClient // 激活服务发现客户端
//@RestController
public class AppCore {

//    @GetMapping(value = "hello")
//    public String index(@RequestParam(value = "name") String name) {
//        System.out.println("得到请求:"+name);
//        return "hello:" + name;
//    }

    public static void main(String[] args) {
        SpringApplication.run(AppCore.class, args);
        System.out.println("Hello World!");

    }
}
