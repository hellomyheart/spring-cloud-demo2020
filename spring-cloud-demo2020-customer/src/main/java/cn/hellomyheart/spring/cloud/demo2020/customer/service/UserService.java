package cn.hellomyheart.spring.cloud.demo2020.customer.service;

import cn.hellomyheart.spring.cloud.demo2020.common.vo.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description
 * @className: UserService
 * @package: cn.hellomyheart.spring.cloud.demo2020.customer.service
 * @author: Stephen Shen
 * @date: 2020/10/30 上午8:49
 */
@FeignClient("DemoHelloProvider")
public interface UserService {

    @GetMapping("/provider/user/savecount")
    ResponseResult saveAll(@RequestParam int count);

    @GetMapping("/provider/user/all")
    ResponseResult all();
}
