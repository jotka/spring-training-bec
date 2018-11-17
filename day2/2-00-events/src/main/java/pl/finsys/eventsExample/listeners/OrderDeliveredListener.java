package pl.finsys.eventsExample.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;

import pl.finsys.eventsExample.events.OnOrderDelivered;

@Service
public class OrderDeliveredListener implements ApplicationListener<OnOrderDelivered>,Ordered {
    @Override
    public void onApplicationEvent(OnOrderDelivered onOrderDelivered) {
        System.out.println(String.format("Order is posting for customer %s.",onOrderDelivered.getOrder().getCustomerInfo()));
    }

    @Override
    public int getOrder() {
        return 1000;
    }
}
