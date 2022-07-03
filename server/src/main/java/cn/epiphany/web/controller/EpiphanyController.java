package cn.epiphany.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Justin Chen
 * @date 2022/7/3 11:16 AM
 * @desription Epiphany controller
 */
@RestController
@RequestMapping
public class EpiphanyController {

    @GetMapping("/qi")
    public String qi() {
        System.out.println("qi");
        return "琪琪小活跃💕";
    }

}
