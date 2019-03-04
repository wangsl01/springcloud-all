package cloud.pay.dao;

import cloud.pay.domain.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer employeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long employeeid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}