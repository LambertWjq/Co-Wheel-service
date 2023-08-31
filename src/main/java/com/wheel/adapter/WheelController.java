package com.wheel.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WheelController {
    @RequestMapping("/wheel")
    @ResponseBody
    public String test() {
        return "hello wheel";
    }
}
