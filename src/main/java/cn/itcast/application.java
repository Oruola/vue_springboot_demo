package cn.itcast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 该类的作用:
 */
@SpringBootApplication
@MapperScan("cn.itcast.dao")
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
