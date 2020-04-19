package com.scravlon.springlogindemo.api;

import com.scravlon.springlogindemo.dao.UserRepository;
import com.scravlon.springlogindemo.models.User;
import com.scravlon.springlogindemo.models.newUser;
import com.scravlon.springlogindemo.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@Controller
public class HomeResource {
    @Autowired
    MyUserDetailsService myUserDetailsService;
    /**
     * Home page request function
     * @return home page
     */
    @RequestMapping("/")
    public String home() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return "welcome";
//        return ("<h1>Welcome</h1>" + ((auth==null)?"Please login!":"Welcome "+auth.getName()));
    }

    @RequestMapping("/user")
    public String user(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("name",auth.getName());
        return "userprofile";
    }

    @RequestMapping("/admin")
    public String admin() {
        return ("adminpage");
    }

    @RequestMapping("/updateprofile")
    public String updateprofile(){
        return ("updateprofile");
    }

    @RequestMapping("/registeruser")
    public String registeruser(){
        return "registeruser";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute newUser user, HttpServletResponse response)throws IOException {
        System.out.print(user.getUsername());
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
        if(myUserDetailsService.findUser(user.getUsername())) {out.print("<script language=\"javascript\">alert('Username was already registered！');</script>");    return "registeruser";}
        User u = new User(user.getUsername(),user.getPassword(),true,"ROLE_USER");
        myUserDetailsService.addUser(u);
        return "welcome";
    }
}
