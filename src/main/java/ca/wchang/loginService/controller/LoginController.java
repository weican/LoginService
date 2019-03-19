package ca.wchang.loginService.controller;

import ca.wchang.loginService.model.Employee;
import ca.wchang.loginService.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @CrossOrigin
    @PostMapping("/getUser")
    public ResponseEntity<?> getUser(@RequestHeader("Authorization") String auth) {

        //Get header and decode email form base64
        String decodeAuth = new String( Base64.getDecoder()
                .decode(auth.replace("Basic ","")), StandardCharsets.UTF_8);
        String email = decodeAuth.substring(0, decodeAuth.indexOf(":"));
        return new ResponseEntity<>(
                loginService.getUserInformationByEmail(email)
                ,HttpStatus.OK );
    }

}
