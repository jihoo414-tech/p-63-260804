package com.example.p_63_260804;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Spring컨테이너에 빈으로 등록 + web환경에서 접근할 수 있도록 추가구현을 해줌
@Controller //브라우저를 통해 해당 클래스 함수를 호출할 수 있다.

public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        System.out.println("index() 메서드 호출됨!");
        return "index() 메서드 호출됨";
    }

    @GetMapping("/hello")
    @ResponseBody //액션 메서드의 반환값을 HTTP응답 본문으로 사용하도록 지정하는 애너테이션
    public String hello() {
        System.out.println("hello() 메서드 호출됨!"); // 서버콘솔에 출력
        return "hello() 메서드 호출됨"; //고객(요청한 쪽)의 브라우저에 출력  return
    }



}