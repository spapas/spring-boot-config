package gr.serafeim;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootConfigApplication.class)
@ActiveProfiles("test")
public class SpringBootConfigApplicationTests {

    @Value("${config.value}")
    private String value;
    
    @Value("${spring.profiles.active}")
    private String profile;

	@Test
	public void contextLoads() {
        assertThat(value, is("Hello test!"));
        assertThat(profile, is("test"));
	}
}
