package pl.finsys.collectionsExample;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class School {

	private List<Kid> boys;
    private List<Kid> girls;
	private Map<String, String> classes;
	private Properties pros;

    public List<Kid> getBoys() {
        return boys;
    }

    public void setBoys(List<Kid> boys) {
        this.boys = boys;
    }

    public List<Kid> getGirls() {
        return girls;
    }

    public void setGirls(List<Kid> girls) {
        this.girls = girls;
    }

    public Map<String, String> getClasses() {
        return classes;
    }

    public void setClasses(Map<String, String> classes) {
        this.classes = classes;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    @Override
	public String toString() {
		return "School [boys=" + boys+ ", girls=" + girls+ ", classes=" + classes + ", pros=" + pros + "]";
	}

}