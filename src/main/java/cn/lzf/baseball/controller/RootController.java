package cn.lzf.baseball.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String root() {
        return index();
    }

    @GetMapping("/index")
    public String index() {
        return "OK";
    }
}
