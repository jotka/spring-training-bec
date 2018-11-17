package pl.finsys.mvcRest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:mvc-dispatcher-servlet.xml"})
public class RestControllerTest {

    private MockMvc mockMvc;

    @Autowired private WebApplicationContext wac;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
    }

    @Test
    public void testXML() throws Exception {
        this.mockMvc.perform(get("/book/Spring").header("Accept", "application/xml"))
            .andExpect(content().contentType("application/xml"));
    }

    @Test
    public void testJson() throws Exception {
        this.mockMvc.perform(get("/book/Spring").header("Accept", "application/json"))
            .andExpect(content().contentType("application/json"));
    }

}
