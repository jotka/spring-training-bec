package pl.finsys.handlerTypes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:mvc-dispatcher-servlet.xml"})
public class HandlerTypesTest {

    private MockMvc mockMvc;

    @Autowired private WebApplicationContext wac;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
    }

	@Test
	public void testBeanNameUrlHandler() throws Exception {
        this.mockMvc.perform(get("/first.htm"))
            .andExpect(model().attribute("msg", is("first")));
	}

    @Test
    public void testControllerClassNameHandler() throws Exception {
        this.mockMvc.perform(get("/second.htm"))
            .andExpect(model().attribute("msg", is("second")));
    }

    @Test
    public void testSimpleUrlHandler() throws Exception {
        this.mockMvc.perform(get("/third.htm"))
            .andExpect(model().attribute("msg", is("third")));
    }

}
