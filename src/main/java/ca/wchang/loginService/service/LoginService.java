package ca.wchang.loginService.service;

import ca.wchang.loginService.model.Employee;

public interface LoginService {

    Employee getUserInformationByEmail(String email);
}
