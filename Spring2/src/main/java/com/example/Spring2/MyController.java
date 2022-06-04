package com.example.Spring2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/actions")
public class MyController {
    private final MyBean myBean;

    public MyController(MyBean myBean) {
        this.myBean = myBean;
    }
    @GetMapping()
    String sayHello(){return myBean.sayHello();}
    @PostMapping()
    String add(@PathVariable("number")int number){
        System.out.println(("Accepted"+number));
        return String.valueOf(number);
    }
    @GetMapping()
    String add2(@RequestParam("number")int number){
        System.out.println(("Accepted"+number));
        return String.valueOf(number);
    }
}
