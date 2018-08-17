package com.monsanto.interview.FortuneCookieGenerator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.web-application-type=reactive")
public class SmokeTest {

    @Autowired
    FortuneCookieController controller;


    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

}
