package app1Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String showHome(){
        return "home";
    }
    @RequestMapping("/index")
    public String showIndex(){
        return "index";
    }
}
