package pl.finsys.jms;

/**
 * Place description here.
 *
 * @author jarek@finsys.pl
 */

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class MessageProducerBean {

    private JmsTemplate jmsTemplate;

    private Destination destination;

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void sendMessage(final EmailObject messageObj) {
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                MapMessage message = session.createMapMessage();
                message.setString("from", messageObj.getFrom());
                message.setString("message", messageObj.getMessage());
                return message;
            }
        });
    }
}

