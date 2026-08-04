package com.example.p_63_260804;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Spring컨테이너에 빈으로 등록 + web환경에서 접근할 수 있도록 추가구현을 해줌
@Controller //브라우저를 통해 해당 클래스 함수를 호출할 수 있다.
public class MainController {

    @GetMapping("/")
    public void index() {
        System.out.println("index() 메서드 호출됨!");
    }

    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello() 메서드 호출됨!");
    }


}