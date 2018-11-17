package pl.finsys.valueInjectionExample;

/**
 * @author jarek@finsys.pl
 */

public class PictureProvider {
    private String name;
    private String picture;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return String.format("name: %s, picture: %s", name, picture);
    }
}
