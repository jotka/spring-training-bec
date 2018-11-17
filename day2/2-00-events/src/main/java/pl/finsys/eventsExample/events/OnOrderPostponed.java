package pl.finsys.eventsExample.events;

import pl.finsys.eventsExample.Order;

public class OnOrderPostponed extends OnOrderStatusChanged {
    public OnOrderPostponed(Order order) {
        super(order);
    }
}
