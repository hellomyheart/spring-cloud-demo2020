package cn.hellomyheart.spring.cloud.demo2020.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/provider/hello/hi2")
    public String hi2(@RequestParam String num){
        return "ok"+ num;
    }

    @GetMapping("/provider/hello/hi3")
    public List hi3(@RequestParam int count){
        List<String> list =new ArrayList<>();
        for(int i=1;i<=count;i++){
            list.add("demo"+i);
        }
        return list;
    }
}
