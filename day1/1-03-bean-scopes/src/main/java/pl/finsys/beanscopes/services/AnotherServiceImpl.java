package pl.finsys.beanscopes.services;

public class AnotherServiceImpl implements AnotherService {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
