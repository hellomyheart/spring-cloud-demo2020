package cn.hellomyheart.spring.cloud.demo2020.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description
 * @className: ProviderApplication
 * @package: cn.hellomyheart.spring.cloud.demo2020
 * @author: Stephen Shen
 * @date: 2020/10/29 下午4:39
 */
@SpringBootApplication
@EnableDiscoveryClient //服务发现与注册
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
