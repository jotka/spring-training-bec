package pl.finsys.beanscopes.services;

/**
 * @author jarek@finsys.pl
 */
public class ServiceOneImpl implements ServiceOne {
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
