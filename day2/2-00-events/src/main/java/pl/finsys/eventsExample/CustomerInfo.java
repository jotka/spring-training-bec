package pl.finsys.eventsExample;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class CustomerInfo {
    private final String phone;

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    private final String email;

    public CustomerInfo(String phone , String email) {
        this.phone = phone;
        this.email = email;
    }
}
