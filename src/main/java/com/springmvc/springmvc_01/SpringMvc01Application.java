package com.springmvc.springmvc_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿 자동등록, 자동으로 하위 패키지 뒤져서 자동으로 서블릿 실행
@SpringBootApplication
public class SpringMvc01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvc01Application.class, args);
    }

}
