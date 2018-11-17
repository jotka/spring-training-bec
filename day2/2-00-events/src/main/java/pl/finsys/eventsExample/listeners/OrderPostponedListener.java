package pl.finsys.eventsExample.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

import pl.finsys.eventsExample.events.OnOrderPostponed;

@Service
public class OrderPostponedListener implements ApplicationListener<OnOrderPostponed> {

    @Override
    public void onApplicationEvent(OnOrderPostponed event) {
        System.out.println(String.format("Message sent for postponed order to:%s", event.getOrder().getCustomerInfo().getEmail()));
    }
}
