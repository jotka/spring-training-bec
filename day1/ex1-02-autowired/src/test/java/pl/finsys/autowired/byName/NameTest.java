package pl.finsys.autowired.byName;

import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author jarek@finsys.pl
 */
public class NameTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @org.junit.Test
    public void testName() throws Exception {

        // given
        ApplicationContext context = new ClassPathXmlApplicationContext("...");

        //when
        Hotel hotel = null;

        //then
        assertNotNull(hotel);

        assertNotNull(hotel.getAddress());

        assertEquals("Block A 888, CA", hotel.getAddress().getFulladdress());

    }
}
