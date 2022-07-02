package cn.epiphany.user.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Justin Chen
 * @date 2022/7/2 9:55 PM
 * @desription 用户 controller
 */
@RestController
@RequestMapping
public class UserController {

    @GetMapping("/test")
    public String test() {
        System.out.println("test");
        return "test";
    }

}
