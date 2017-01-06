package com.subdong.webserver.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Rainbow
 *
 * @author SubDong
 * @version V2.0
 *          Copyright (c)2016 zyx-版权所有
 * @since 2017/1/6
 */
//@ComponentScan("com.subdong.webserver.*")
@ImportResource(value = {"start-spring.xml"})
@SpringBootApplication
public class StartMain {
    private static final int PORT = 8001;

    public static void main(String[] args) {
        SpringApplication.run(StartMain.class, args);
    }
}
