package com.visionet.course01;

import com.visionet.course01.controller.StartController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Course01ApplicationTests {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new StartController()).build();
    }

    @Test
    public void contextLoads() {
//        mockMvc.perform(MockMvcRequestBuilders.get("/start/springboot").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//        .andExpect(）;
    }

    @Test
    /*测试接口返回的内容与预期是否一致*/
    public void hello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/start/springboot").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("Welcome to the world of Spring Boot!"));
    }

}
