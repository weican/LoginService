package ca.wchang.loginService.dao;

import ca.wchang.loginService.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface EmployeeMapper {

    Employee findEmployeeByEmail(String email);
}
