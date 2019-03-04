package cloud.pay;


//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("cloud.pay.dao")
public class AppDb
{
    public static void main( String[] args ) {
        SpringApplication.run(AppDb.class,args);
        System.out.println( "Hello World!" );



//        Jedis jedis = new Jedis("127.0.0.1",6379);
//
//        String key = "abc";
//        String value = "123";
//        String expiretime = "600";
//        List<String> valuelist = new ArrayList();
//        valuelist.add(value);
//        valuelist.add(expiretime);
//
//
//        Reader reader = new InputStreamReader(new FileInputStream("e:\\setStr.lua"));
//
//        jedis.eval(CharStreams.toString(reader), Collections.singletonList(key),valuelist);
//        String str = jedis.get(key);
//        System.out.println(str);
    }



}
