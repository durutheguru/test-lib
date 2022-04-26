package com.julianduru.testlib;


import com.github.javafaker.Faker;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * created by julian
 */
@ExtendWith({SpringExtension.class})
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public abstract class BaseServiceIntegrationTest {


    protected Faker faker = new Faker();


}

