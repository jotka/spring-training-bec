package pl.finsys.eventsExample;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pl.finsys.eventsExample.events.OnOrderDelivered;
import pl.finsys.eventsExample.events.OnOrderPostponed;

@Component
@Scope("prototype")
public class Order implements ApplicationEventPublisherAware {

    private CustomerInfo customerInfo;
    private ApplicationEventPublisher eventPublisher;
    private Status status;

    public void setupCustomer(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
        status = Status.MODIFIABLE;
    }

    public void checkOut() {
        if (status == Status.DELIVERED) {
            throw new IllegalStateException(String.format("Order is already delivered"));
        }
        this.status = Status.CHECKED_OUT;
    }

    public void deliver() {
        if (this.status != Status.CHECKED_OUT && this.status != Status.POSTPONED) {
            throw new IllegalStateException(
                String.format("Order status should be CHECKED OUT for delivery to be called. but is : %s", status));
        }

        this.status = Status.DELIVERED;
        this.eventPublisher.publishEvent(new OnOrderDelivered(this));
    }

    public void postponeDelivery() {
        if (status != Status.CHECKED_OUT && status != Status.POSTPONED) {
            throw new IllegalStateException(String.format("Can not postpone delivery in this state: %s", status));
        }
        this.status = Status.POSTPONED;
        this.eventPublisher.publishEvent(new OnOrderPostponed(this));
    }

    public Status getStatus() {
        return status;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }

    public static enum Status {
        MODIFIABLE,
        CHECKED_OUT,
        POSTPONED,
        DELIVERED
    }
}
