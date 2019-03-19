package ca.wchang.loginService.service;

import ca.wchang.loginService.dao.EmployeeMapper;
import ca.wchang.loginService.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getUserInformationByEmail(String email) {

        Employee employee = employeeMapper.findEmployeeByEmail(email);
        employee.setPassword("");  //User can't get password
        return  employee;
    }
}
