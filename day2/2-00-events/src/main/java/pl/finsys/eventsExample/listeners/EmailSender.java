package pl.finsys.eventsExample.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;

import pl.finsys.eventsExample.events.OnOrderDelivered;

@Service
public class EmailSender implements ApplicationListener<OnOrderDelivered>, Ordered {

    @Override
    public void onApplicationEvent(OnOrderDelivered event) {
        System.out.println(String.format("Message sent for delivered order to:%s",event.getOrder().getCustomerInfo().getEmail()));
    }

    @Override
    public int getOrder() {
        return 100;
    }
}
