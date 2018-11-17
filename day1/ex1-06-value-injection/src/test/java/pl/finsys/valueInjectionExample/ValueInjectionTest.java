package pl.finsys.valueInjectionExample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author jarek@finsys.pl
 */
public class ValueInjectionTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testValueInjection() throws Exception {

        // given
        ConfigurableApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext-valueInjection-ex.xml");

        // when
        PictureProvider pictureProvider1 = (PictureProvider)context.getBean("...");
        PictureProvider pictureProvider2 = (PictureProvider)context.getBean("...");
        PictureProvider pictureProvider3 = (PictureProvider)context.getBean("...");

        //then
        assertNotNull(pictureProvider1);
        assertEquals("picture1", pictureProvider1.getPicture());

        assertNotNull(pictureProvider2);
        assertEquals("picture2", pictureProvider2.getPicture());

        assertNotNull(pictureProvider3);
        assertEquals("picture3", pictureProvider3.getPicture());
    }
}
