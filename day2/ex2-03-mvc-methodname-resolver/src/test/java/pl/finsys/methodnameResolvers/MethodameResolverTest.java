package pl.finsys.methodnameResolvers;

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
public class MethodameResolverTest {

    private MockMvc mockMvc;

    @Autowired private WebApplicationContext wac;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
    }

	@Test
	public void annotated() throws Exception {
        this.mockMvc.perform(get("/annotated/add.htm"))
            .andExpect(model().attribute("msg", is("AnnotatedController")));
	}

    @Test
    public void internal() throws Exception {
        this.mockMvc.perform(get("/internal/add.htm"))
            .andExpect(model().attribute("msg", is("InternalPathMethodNameResolver")));
    }

    @Test
    public void properties() throws Exception {
        this.mockMvc.perform(get("/properties/add.htm"))
            .andExpect(model().attribute("msg", is("PropertiesMethodNameResolver")));
    }

}
