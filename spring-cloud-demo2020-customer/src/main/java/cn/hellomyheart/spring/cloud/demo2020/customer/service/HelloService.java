package cn.hellomyheart.spring.cloud.demo2020.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

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
}
