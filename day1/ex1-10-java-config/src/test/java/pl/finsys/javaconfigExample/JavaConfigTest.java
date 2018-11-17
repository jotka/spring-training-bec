package pl.finsys.javaconfigExample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 *
 * @author jarek@finsys.pl
 */
public class JavaConfigTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testJavaConfig() throws Exception {

        // given
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // when
        Computer obj = (Computer) context.getBean("computerBean");

        //then
        assertNotNull(obj);

        assertEquals("executing: %s", obj.execute("program"));

    }
}
