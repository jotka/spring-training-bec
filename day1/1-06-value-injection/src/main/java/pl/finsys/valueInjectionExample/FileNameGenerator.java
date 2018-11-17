package pl.finsys.valueInjectionExample;

/**
 * Place description here.
 *
 * @author q1wk@nykredit.dk
 */

public class FileNameGenerator {
    private String name;
    private String type;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String generate() {
        return String.format("name: %s, type: %s", name, type);
    }
}
