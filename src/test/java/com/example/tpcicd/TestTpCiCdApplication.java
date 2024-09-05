package com.example.tpcicd;

import org.springframework.boot.SpringApplication;

public class TestTpCiCdApplication {

    public static void main(String[] args) {
        SpringApplication.from(TpCiCdApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
