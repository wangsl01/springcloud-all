package cloud.pay.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:11:082019/3/5
 */
@ConfigurationProperties(prefix = "spring.person")
public class PersonProperties {
    // 姓名
    private String name;
    // 年龄
    private int age;
    // 性别
    private String sex = "M";

    // Getter & Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
