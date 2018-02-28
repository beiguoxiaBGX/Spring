package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception{
        HomeController controller = new HomeController();
        MockMvc mockMvc =                                  /*搭建mockmvc*/
                standaloneSetup(controller).build();
        mockMvc.perform(get("/"))              /*对“/”执行get请求*/
                .andExpect(view().name("home"));
    }

    @org.junit.Test
    public void home() {
        HomeController controller = new HomeController();
        assertEquals("home",controller.home());
    }
}