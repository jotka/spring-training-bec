package pl.finsys.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Place description here.
 *
 * @author jarek@finsys.pl
 */

public class MessageConsumerRunnable implements Runnable {
    private final static Logger logger = LoggerFactory.getLogger(MessageConsumerRunnable.class);

    private final MessageConsumerBean messageConsumerBean;

    public MessageConsumerRunnable(MessageConsumerBean consumerBean) {
        this.messageConsumerBean = consumerBean;
    }

    @Override
    public void run() {
        logger.info("Wątek odbiorcy wystartowany.");

        while(true) {

            EmailObject messageObj = messageConsumerBean.receiveMessage();
            logger.info("Poczta od " + messageObj.getFrom() + " odebrana!");
        }
    }
}
