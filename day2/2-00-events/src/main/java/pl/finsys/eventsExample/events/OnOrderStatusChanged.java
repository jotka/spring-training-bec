package pl.finsys.eventsExample.events;

import org.springframework.context.ApplicationEvent;

import pl.finsys.eventsExample.Order;

public abstract class OnOrderStatusChanged extends ApplicationEvent {

    private final Order order;

    /**
     * nowe zdarzenie ApplicationEvent.
     *
     * @param source zrodlo zdarzenia
     */
    public OnOrderStatusChanged(Order source) {
        super(source);
        this.order = source;
        System.out.println(String.format("Order status changed to %s", source.getStatus()));
    }

    public Order getOrder() {
        return order;
    }
}
