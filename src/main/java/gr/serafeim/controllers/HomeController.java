package gr.serafeim.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import java.util.Map;
import java.util.HashMap;

@RestController
public class HomeController {

    @Value("${config.value}")
    private String value;
    
    @Value("${spring.profiles.active}")
    private String activeProfiles;

    @RequestMapping("/")
    public Map<String, String> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Map<String, String> res = new HashMap<>();
        res.put("value", value);
        res.put("activeProfiles", activeProfiles);
        return res;
    }
}