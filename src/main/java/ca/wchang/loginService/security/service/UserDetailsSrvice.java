package ca.wchang.loginService.security.service;

import ca.wchang.loginService.dao.EmployeeMapper;
import ca.wchang.loginService.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsSrvice  implements UserDetailsService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public UserDetails loadUserByUsername( String username) throws UsernameNotFoundException {

        Employee employee = employeeMapper.findEmployeeByEmail(username);
        if(employee == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        }
        else {
            return new User(employee);
        }
    }
}
