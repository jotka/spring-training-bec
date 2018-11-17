package pl.finsys.urlMappingEx;

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
public class UrlMappingTest {

    private MockMvc mockMvc;

    @Autowired private WebApplicationContext wac;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
    }

	@Test
	public void byPath() throws Exception {
        this.mockMvc.perform(get("/mapping/path"))
            .andExpect(content().string("Mapped by path!"));
	}

    @Test
    public void byPathEx() throws Exception {
        this.mockMvc.perform(get("/mapping/path/test"))
            .andExpect(content().string("Mapped by path pattern ('/mapping/path/test')"));
    }

    @Test
    public void byParameter() throws Exception {
        this.mockMvc.perform(get("/mapping/parameter?foo=FOO"))
            .andExpect(content().string("Mapped presence of query parameter!"));
    }

    @Test
    public void byHeader() throws Exception {
        this.mockMvc.perform(get("/mapping/header").header("FooHeader", "foo"))
            .andExpect(content().string("Mapped by path + method + presence of header!"));
    }

    @Test
    public void byPathVariable() throws Exception {
        this.mockMvc.perform(get("/mapping/pathVariable/aaa"))
            .andExpect(content().string("Mapped by path variable!"));
    }
}
