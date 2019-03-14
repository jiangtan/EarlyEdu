package com.huahan.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("earlyedu")
public class HomeController {
 
	@RequestMapping(value = "index")
    public String index(Map<String,Object> map){
        map.put("admin","123456");
        return "index";
	}
	

}
