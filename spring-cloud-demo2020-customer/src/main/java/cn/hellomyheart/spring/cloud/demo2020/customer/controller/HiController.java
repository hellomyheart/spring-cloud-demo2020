package cn.hellomyheart.spring.cloud.demo2020.customer.controller;

import cn.hellomyheart.spring.cloud.demo2020.customer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: HiController
 * @package: cn.hellomyheart.spring.cloud.demo2020.customer.controller
 * @author: Stephen Shen
 * @date: 2020/10/29 下午5:29
 */
@RestController
@RequestMapping("/api/hello")
public class HiController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/hi")
    public String hi(){
        return helloService.hello();
    }
}
