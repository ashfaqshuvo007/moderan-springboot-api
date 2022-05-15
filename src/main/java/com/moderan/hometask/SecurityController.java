package com.moderan.hometask;

import java.util.LinkedHashMap;
import java.util.Map;

import com.moderan.hometask.users.AuthUserDetails;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SecurityController {

    @GetMapping("/")
    public Map<String, Object> index(){
        Map<String, Object> resposnse = new LinkedHashMap<>();
        resposnse.put("status",200);
        resposnse.put("message", "The app is live");
        return resposnse;
    }


    @GetMapping("/auth")
    @ResponseBody
    public Map<String, Object> authenticate(@AuthenticationPrincipal AuthUserDetails user){
        Map<String, Object> result = new LinkedHashMap<>();

        result.put("id", user.getId());
        result.put("email", user.getEmail());
        result.put("name", user.getFull_name());
        result.put("role", user.getAuthorities().get(0).getAuthority());

        return result;
    }
    
}
