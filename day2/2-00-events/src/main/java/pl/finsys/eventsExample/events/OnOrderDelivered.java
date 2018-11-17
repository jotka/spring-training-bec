package pl.finsys.eventsExample.events;

import pl.finsys.eventsExample.Order;

public class OnOrderDelivered extends OnOrderStatusChanged {
    public OnOrderDelivered(Order order) {
        super(order);
    }
}
