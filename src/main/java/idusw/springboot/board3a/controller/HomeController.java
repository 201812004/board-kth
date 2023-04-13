package idusw.springboot.board3a.controller;

import idusw.springboot.board3a.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    /*
     * Field Injection (필드 주입) : spring Framework 에게 MemoService형 객체 주입(해줄 것을 알림)
    @Autowired
    MemoService memoService;
     */

    // localhost:port로 요청을 하면 getAdmin() 메소드를 호출하여 처리하고, /admin/index view에게 전달
    @GetMapping("/")
    public String getAdmin() {
        System.out.println("getAdmin");
        return "/admin/index";
    }
    /*
    @GetMapping("colors") // 자원을 접근하는 개념
    public String getColor() { return "utilities-color";}

    @GetMapping("borders") // 자원을 접근하는 개념
    public String getBorders() { return "utilities-border";}

    @GetMapping("others") // 자원을 접근하는 개념
    public String getOthers() { return "utilities-other";}

    @GetMapping("animations") // 자원을 접근하는 개념
    public String getAnimations() { return "utilities-animation";}

    @GetMapping("register") // 자원을 접근하는 개념
    public String getRegister() { return "register";}

    @GetMapping("forgot-password") // 자원을 접근하는 개념
    public String getForgotPassword() { return "forgot-password";}

    @GetMapping("404") // 자원을 접근하는 개념
    public String get404() { return "404";}

    @GetMapping("blank") // 자원을 접근하는 개념
    public String getBlank() { return "blank";}
     */
}
