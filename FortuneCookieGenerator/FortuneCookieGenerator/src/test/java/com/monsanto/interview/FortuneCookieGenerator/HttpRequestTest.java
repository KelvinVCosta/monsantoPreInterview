package com.monsanto.interview.FortuneCookieGenerator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest(properties = "spring.main.web-application-type=reactive")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void sarahCookieReturn() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/generateFortuneCookie?client=Sarah&company=MegaStore",
                String.class)).contains("Sarah");
    }

    @Test
    public void superStoreCookieReturn() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/generateFortuneCookie?client=Barney&company=SuperStore",
                String.class)).contains("SuperStore");
    }

}
