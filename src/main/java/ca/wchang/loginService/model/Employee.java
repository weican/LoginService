package ca.wchang.loginService.model;


import org.springframework.boot.jdbc.DataSourceBuilder;

import java.util.Date;

public class Employee {

    String userName;
    String email;
    String password;
    String role;
    boolean enabled;
    Date last_password_reset_date;

    public Date getLastPasswordResetDate() {
        return last_password_reset_date;
    }

    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.last_password_reset_date = lastPasswordResetDate;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
