package pl.finsys.responsesEx;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
public class ResponsesTest {

    private MockMvc mockMvc;

    @Autowired private WebApplicationContext wac;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void testSimple() throws Exception {
        this.mockMvc.perform(get("/responses/string").header("Accept", "text/plain"))
            .andExpect(content().contentType("text/plain"))
            .andExpect(content().string("The String ResponseBody"));
    }

    @Test
    public void testJson() throws Exception {
        this.mockMvc.perform(get("/responses/json").header("Accept", "application/json"))
            .andExpect(content().contentType("application/json"))
            .andExpect(content().string("{\"name\":\"test show\",\"staffName\":[\"worker1\",\"worker2\"]}"));
    }

    @Test
    public void testXML() throws Exception {
        this.mockMvc.perform(get("/responses/xml").header("Accept", "application/xml"))
            .andExpect(content().contentType("application/xml"));
    }

    @Test
    public void testStatus() throws Exception {
        this.mockMvc.perform(get("/responses/status"))
            .andExpect(status().is(HttpStatus.FORBIDDEN.value()));
    }
}

