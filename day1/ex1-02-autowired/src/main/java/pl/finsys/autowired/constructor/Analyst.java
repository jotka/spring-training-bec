package pl.finsys.autowired.constructor;

public class Analyst {
	private Language language;

	public Analyst(Language language) {
		this.language = language;
	}

    public Language getLanguage() {
        return language;
    }

    @Override
	public String toString() {
		return "Analyst [language=" + language + "]";
	}

}