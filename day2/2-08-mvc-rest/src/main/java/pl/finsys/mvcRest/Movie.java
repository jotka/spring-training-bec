package pl.finsys.mvcRest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author jarek@finsys.pl
 */

@XmlRootElement
public class Movie {

    public Movie() {
    }

    private int year;
    private String title;
    private String description;

    public Movie(int year, String title, String description) {
        this.year = year;
        this.title = title;
        this.description = description;
    }

    @XmlAttribute
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @XmlAttribute
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlAttribute
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
