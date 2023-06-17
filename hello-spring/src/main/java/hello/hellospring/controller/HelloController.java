package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello")    //http Get 메서드, hello url과 매칭
    public String hello(Model model){ //스프링이 만들어준 model이 넘어옴
        model.addAttribute("data", "hello!!");  //data(이름)에 hello(값)을 매칭
        return "hello"; //resources/templates/hello.html 찾아서 렌더링
    }

    @GetMapping("hello-mvc")
    //외부에서 파라미터를 받아옴
    //model에 담긴 내용을 view에서 용도에 맞게 사용
    public String helloMvc(@RequestParam("name") String name, Model model){
        //"name":key, name:String name
        model.addAttribute("name", name);
        return "hello-template";
        //http://localhost:8080/hello-mvc?name=spring 접속 시, 'hello spring'가 화면에 뜬다.
        //String name이 model로 전달되고 hello-template에서 ${name} 부분에 name 값이 담기게 된다.
        //정적컨텐츠와 달리, viewResolver에서 웹 브라우저로 넘어갈 때 html 변환이 이루어진다.
    }
}

