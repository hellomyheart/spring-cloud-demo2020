package cn.hellomyheart.spring.cloud.demo2020.customer.controller;

import cn.hellomyheart.spring.cloud.demo2020.common.vo.ResponseResult;
import cn.hellomyheart.spring.cloud.demo2020.customer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: UserController
 * @package: cn.hellomyheart.spring.cloud.demo2020.customer.controller
 * @author: Stephen Shen
 * @date: 2020/10/30 上午8:48
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("saveall")
    public ResponseResult save(int count){
        return userService.saveAll(count);
    }

    @GetMapping("all")
    public ResponseResult all(){
        return userService.all();
    }
}
