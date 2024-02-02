package firstthymeleaf.hellothymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class myController {
    @GetMapping("/hello")
    public String WelcomeMes(@RequestParam(name = "name") String name, @RequestParam(name = "age") Integer age,
            Model model) {
                model.addAttribute("name", name);
                model.addAttribute("age", age);
                
        return "first";
        // Return the name of html page!
    }

}
