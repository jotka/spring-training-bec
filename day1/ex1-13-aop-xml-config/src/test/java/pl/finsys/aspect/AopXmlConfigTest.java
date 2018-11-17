package pl.finsys.aspect;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author jarek@finsys.pl
 */
public class AopXmlConfigTest {

    @BeforeClass()
    public static void runBeforeClass() throws Exception {
    }

    @Before()
    public void runBeforeTest() throws Exception {
    }

    @Test
    public void testAopXmlConfig() throws Exception {

        //given
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext-aop-xml-config-ex.xml");

        Hacker hacker = (Hacker) appContext.getBean("badHacker");
        assertNotNull(hacker);

        Auditor auditor = (Auditor) appContext.getBean("greatAuditor");
        assertNotNull(auditor);

        //when
        hacker.login();
        hacker.getIPAddress();
        hacker.damage("PIN database");

        try {
            hacker.capture();
        } catch (Exception e) {
            System.out.println("hacker capture try: " + e.getMessage());
        }

        //then
        assertEquals(5, auditor.getAudit().size());

        assertEquals("hacker starts logging in!", auditor.getAudit().get(0));
        assertEquals("hacker is logged in!", auditor.getAudit().get(1));
        assertEquals("hacker IP address is 10.10.22.11", auditor.getAudit().get(2));
        assertEquals("hacker is damaging database [PIN database]", auditor.getAudit().get(3));
        assertEquals("hacker is captured!", auditor.getAudit().get(4));

    }
}
