package cloud.pay;

import cloud.pay.web.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableZuulProxy
@Controller
public class AppWeb
{
//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private RestTemplate loadBalancedRestTemplate;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/tt")
    @ResponseBody
//    @FeignClient("cloudpay-core")
    public Object test(@RequestParam(value="servicename")String serviceName,@RequestParam(value="name") String message){
//        List<ServiceInstance> list = discoveryClient.getInstances(serviceName);
//        ServiceInstance serviceInstance = list.get(0);
//        String result = restTemplate.getForObject("http://" + serviceName + "/hello?name=" + message, String.class);
//        String result = restTemplate.getForObject(serviceInstance.getUri() + "/hello?name=" + message, String.class);
//        String result = loadBalancedRestTemplate.getForObject("http://"+serviceName + "/hello?name=" + message, String.class);
        String result = helloService.sayHello(message);
        return result;

    }


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @LoadBalanced
    @Bean
    public RestTemplate loadBalancedRestTemplate() {
        return new RestTemplate();
    }


    public static void main( String[] args )
    {
        SpringApplication.run(AppWeb.class,args);
        System.out.println( "Hello World!" );
    }
}
