package cloud.pay.controller;

import cloud.pay.Service.EmployeeServicec;
import cloud.pay.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * @Author:wangsl
 * @Description: 说明，要加说明!!!!!!
 * @Date:19:312019/3/1
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServicec employeeService;

    @RequestMapping("/addEmployee")
    @ResponseBody
    public String addEmployee(HttpServletRequest request) throws Exception {
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        String phonenum = request.getParameter("phone");
        Integer agei = Integer.valueOf(age);
        employeeService.saveEmployee(username,phonenum,agei);
        return "success";
    }

    @RequestMapping("/getEmployee/{id}")
    @ResponseBody
    public Employee addEmployee(@PathVariable Long id) throws Exception {
        Employee employee = employeeService.getEmployee(id);
        if(employee == null){
            employee = new Employee();
            employee.setEmployeeid(0L);
        }
        return employee;
    }
}
