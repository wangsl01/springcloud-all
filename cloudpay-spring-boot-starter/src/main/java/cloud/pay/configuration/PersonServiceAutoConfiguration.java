package cloud.pay.configuration;

import cloud.pay.properties.PersonProperties;
import cloud.pay.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:10:482019/3/5
 */
@Configuration
@EnableConfigurationProperties(PersonProperties.class)
@ConditionalOnClass(PersonService.class)
@ConditionalOnProperty(prefix = "spring.person", value = "enabled", matchIfMissing = true)
public class PersonServiceAutoConfiguration {

    @Autowired
    private PersonProperties properties;

    @Bean
    @ConditionalOnMissingBean(PersonService.class)  // 当容器中没有指定Bean的情况下，自动配置PersonService类
    public PersonService personService(){
        PersonService personService = new PersonService(properties);
        return personService;
    }
}

   