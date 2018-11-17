package pl.finsys.collectionsExample;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CollectionsTest {
    @Test
    public void testCollections() throws Exception {
		//given
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-collections-ex.xml");

        //when
		School school = (School) context.getBean("naszaSzkola");

        //then
        assertNotNull(school);

        assertNotNull(school.getBoys());

        assertNotNull(school.getGirls());

        assertEquals(2, school.getBoys().size());

        assertEquals(2, school.getGirls().size());

        assertEquals(3, school.getClasses().size());

        assertEquals(3, school.getPros().size());


        assertTrue(school.getBoys().get(1) instanceof Kid);

        assertEquals("Malgosia", school.getGirls().get(0).getName());

        assertEquals("Jezyk polski", school.getClasses().get("pol"));
    }
}