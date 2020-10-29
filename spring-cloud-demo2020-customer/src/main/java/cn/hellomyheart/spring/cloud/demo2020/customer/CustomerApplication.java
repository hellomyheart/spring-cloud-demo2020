package cn.hellomyheart.spring.cloud.demo2020.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description
 * @className: CustomerApplication
 * @package: cn.hellomyheart.spring.cloud.demo2020.customer
 * @author: Stephen Shen
 * @date: 2020/10/29 下午5:27
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }
}
