package com.example.oraclehostapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@RestController
public class AppHostController {
    @GetMapping("/app_host")
    public String app_host() {
        String host_name = null;
        try {
            host_name = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return host_name;
    }
}
