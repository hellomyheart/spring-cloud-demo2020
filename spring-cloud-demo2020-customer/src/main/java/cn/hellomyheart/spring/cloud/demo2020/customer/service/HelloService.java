package cn.hellomyheart.spring.cloud.demo2020.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description
 * @className: HelloService
 * @package: cn.hellomyheart.spring.cloud.demo2020.customer.service
 * @author: Stephen Shen
 * @date: 2020/10/29 下午5:31
 */
@FeignClient("DemoHelloProvider")
public interface HelloService {
    @GetMapping("/provider/hello/hi")
    String hello();

    @GetMapping("/provider/hello/hi2")
    String hi2(@RequestParam String num);

    @GetMapping("/provider/hello/hi3")
    List h3(@RequestParam int count);
}
