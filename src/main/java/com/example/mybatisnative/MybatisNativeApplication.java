package com.example.mybatisnative;

import com.example.mybatisnative.mybatis.Customer;
import com.example.mybatisnative.mybatis.CustomerMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@Slf4j
public class MybatisNativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisNativeApplication.class, args);
    }

    @Bean
    ApplicationRunner runner(CustomerMapper mapper) {
        return args -> {
            var customer = new Customer(1, "cmauri", "cmauri@email.com");
            mapper.insert(customer);
            var result = mapper.findById(customer.getId());
            log.debug("Customer: {}", customer);
            log.debug("Resulting customer: " + result);
            log.debug("Are equals? {}",(customer.equals(result)));
        };
    }
}

