package cloud.pay.service;

import cloud.pay.properties.PersonProperties;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:11:082019/3/5
 */
public class PersonService {

    private PersonProperties properties;

    public PersonService() {
    }

    public PersonService(PersonProperties properties) {
        this.properties = properties;
    }

    public void sayHello(){
        System.out.println("大家好，我叫: " + properties.getName() + ", 今年" + properties.getAge() + "岁"
                + ", 性别: " + properties.getSex());
    }
}

