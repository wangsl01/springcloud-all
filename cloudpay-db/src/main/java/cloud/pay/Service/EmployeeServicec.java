package cloud.pay.Service;

import cloud.pay.dao.EmployeeMapper;
import cloud.pay.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Random;

/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:19:252019/3/1
 */

@Service
@Transactional
public class EmployeeServicec {

    @Autowired(required = false)
    private EmployeeMapper employeeMapper;

    public int saveEmployee(String username, String phonenum, Integer age) throws Exception {


        Random r = new Random();
        int id1 = r.nextInt(1000);
        int id2 = r.nextInt(2000);

        long prefix = System.currentTimeMillis() - 1550000000000L;
        long id = Long.valueOf(prefix+""+id1+id2);
        Employee employee = new Employee();
        employee.setEmployeeid(id);
        employee.setAge(age);
        employee.setUsername(username);
        employee.setPhonenum(phonenum);
        employee.setCreatetime(new Date());
        int result = employeeMapper.insert(employee);

        return result;
    }


//    public int getEmployee(String username, String phonenum, Integer age) throws Exception {
//
//
//        Random r = new Random();
//        int id1 = r.nextInt(1000);
//        int id2 = r.nextInt(2000);
//
//        long prefix = System.currentTimeMillis() - 1550000000000L;
//        long id = Long.valueOf(prefix+""+id1+id2);
//        Employee employee = new Employee();
//        employee.setEmployeeid(id);
//        employee.setAge(age);
//        employee.setUsername(username);
//        employee.setPhonenum(phonenum);
//        employee.setCreatetime(new Date());
//        int result = employeeMapper.insert(employee);
//
//        return result;
//    }

    public Employee getEmployee(Long id) throws Exception {
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        return employee;
    }
}
