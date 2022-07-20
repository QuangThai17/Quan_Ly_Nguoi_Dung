package com.example.demo2.registration;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private PasswordEncoder passwordEncoder;

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }


    @GetMapping
    public String showRegistrationForm(Model model){
        model.addAttribute("user",new UserRegistrationDto());
        return "registration";
    }

    @PostMapping()
    public String save(@ModelAttribute("userRegistrationDto") UserRegistrationDto userRegistrationDto){
//      userRegistrationDto.setPassword(passwordEncoder.encode(userRegistrationDto.getPassword()));
        userService.save( userRegistrationDto);
        return "redirect:/registration?success";
    }
}
