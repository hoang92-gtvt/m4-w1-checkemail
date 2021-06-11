package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.EmailService;

@Controller
@RequestMapping("/email")
public class EmailController {

    @GetMapping("/view")
    public String backHome(){
        return "home";
    }

    @PostMapping("/view")
    public ModelAndView checkEmail(String email){
        ModelAndView modelAndView = new ModelAndView("home");
        EmailService emailService = new EmailService();

        if (emailService.checkEmail(email)){
            modelAndView.addObject("email", email);
            modelAndView.addObject("check",true);
            return  modelAndView;
        }else {
            modelAndView.addObject("email", "haluon");
            modelAndView.addObject("check", false);
            return modelAndView;
        }


    }




}
