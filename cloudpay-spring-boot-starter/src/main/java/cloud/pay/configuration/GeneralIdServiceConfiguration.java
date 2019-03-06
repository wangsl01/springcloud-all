package cloud.pay.configuration;

//import cloud.pay.properties.GeneralWorkProperties;
import cloud.pay.service.GeneralIdService;
import cloud.pay.service.IdWorker;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:21:452019/3/5
 */

@Configuration//配置容器注解，生成对应的bean
//@EnableConfigurationProperties(GeneralWorkProperties.class)
@ConditionalOnClass({GeneralIdService.class, IdWorker.class})
//@ConditionalOnProperty(prefix = "id-worker-map", value = "enabled", matchIfMissing = true)//此处prefix不能应用大写字母
public class GeneralIdServiceConfiguration {

//    @Autowired
//    private GeneralWorkProperties generalWorkProperties;


    @Bean
    @ConditionalOnMissingBean(GeneralIdService.class)
    public GeneralIdService generalIdService(){
        GeneralIdService generalIdService = new GeneralIdService();
//        generalIdService.setGeneralWorkProperties(generalWorkProperties);
        return generalIdService;
    }
}
