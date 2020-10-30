package cn.hellomyheart.spring.cloud.demo2020.provider.controller;

import cn.hellomyheart.spring.cloud.demo2020.common.vo.ResponseResult;
import cn.hellomyheart.spring.cloud.demo2020.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: UserController
 * @package: cn.hellomyheart.spring.cloud.demo2020.provider.controller
 * @author: Stephen Shen
 * @date: 2020/10/30 上午8:39
 */

@RestController
@RequestMapping("/provider/user")
public class UserController {

    @Autowired
    private UserService userService;

    //批量添加
    @GetMapping("/savecount")
    public ResponseResult saveall(@RequestParam int count){
        return userService.saveAll(count);
    }

    //查询所有
    @GetMapping("/all")
    public ResponseResult all(){
        return userService.all();
    }

}
