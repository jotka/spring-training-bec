package pl.finsys.jms;

/**
 * Place description here.
 *
 * @author jarek@finsys.pl
 */

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;

public class MessageConsumerBean{

    private JmsTemplate jmsTemplate;
    private Destination destination;

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public EmailObject receiveMessage() {
        MapMessage message = (MapMessage) jmsTemplate.receive(destination);
        try {
            EmailObject messageObj = new EmailObject();
            messageObj.setFrom(message.getString("from"));
            messageObj.setMessage(message.getString("message"));
            return messageObj;
        } catch (JMSException e) {
            throw JmsUtils.convertJmsAccessException(e);
        }
    }
}