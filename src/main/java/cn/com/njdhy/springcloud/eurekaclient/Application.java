package cn.com.njdhy.springcloud.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * eureka-client 服务注册与发现 客户端
 *
 * @author jason.hu
 * @date 2018-08-06
 */
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    @RequestMapping("/")
    public String showMe() {
        return "hi,china";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
