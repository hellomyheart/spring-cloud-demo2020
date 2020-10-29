package cn.hellomyheart.spring.cloud.demo2020.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: HelloController
 * @package: cn.hellomyheart.spring.cloud.demo2020.controller
 * @author: Stephen Shen
 * @date: 2020/10/29 下午4:34
 */
@RestController
public class HelloController {
    @GetMapping("/provider/hello/hi")
    public String hi(){
        return "OK-"+System.currentTimeMillis();
    }
}
