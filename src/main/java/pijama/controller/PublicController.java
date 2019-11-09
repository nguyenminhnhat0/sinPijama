package pijama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

    @RequestMapping({"/", "/index"})
    public String index() {
        
        return "index";
    }
    
    @RequestMapping({"/blog_detail", "/blog_detail1"})
    public String blog_detail() {
        
        return "blog_detail";
    }
}
