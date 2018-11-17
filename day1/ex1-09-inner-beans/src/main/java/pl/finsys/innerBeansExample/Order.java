package pl.finsys.innerBeansExample;

public class Order {
    private Client client;

    public Order(Client client) {
        this.client = client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Customer [client=" + client + "]";
    }
}