package pl.finsys.mvcHelloWorld;

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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:mvc-dispatcher-servlet.xml"})
public class MyViewControllerTest {

    private MockMvc mockMvc;

    @Autowired private WebApplicationContext wac;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
    }

	@Test
	public void view1() throws Exception {
        this.mockMvc.perform(get("/xml.htm"))
            .andExpect(view().name(is("welcomePageXml")));
	}

    @Test
    public void view2() throws Exception {
        this.mockMvc.perform(get("/props.htm"))
            .andExpect(view().name(is("welcomePageProperties")));
    }

    @Test
    public void view3() throws Exception {
        this.mockMvc.perform(get("/internal.htm"))
            .andExpect(view().name(is("welcomePageInternal")));
    }

}
