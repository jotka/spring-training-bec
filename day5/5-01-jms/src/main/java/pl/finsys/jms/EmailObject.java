package pl.finsys.jms;

/**
 * Place description here.
 *
 * @author jarek@finsys.pl
 */

public class EmailObject {
    private String from;
    private String message;

    public EmailObject() {
    }

    public EmailObject(String from, String message) {
        super();
        this.from = from;
        this.message = message;
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
