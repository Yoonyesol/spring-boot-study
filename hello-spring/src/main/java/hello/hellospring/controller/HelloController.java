package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")    //http Get 메서드, hello url과 매칭
    public String hello(Model model){ //스프링이 만들어준 model이 넘어옴
        model.addAttribute("data", "hello!!");  //data(이름)에 hello(값)을 매칭
        return "hello"; //resources/templates/hello.html 찾아서 렌더링
    }
}
