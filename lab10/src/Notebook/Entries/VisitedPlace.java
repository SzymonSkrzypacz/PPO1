package Notebook.Entries;


import Notebook.Interfaces.NotebookEntry;
import Notebook.Traits.Slugger;

public class  VisitedPlace implements NotebookEntry, Slugger {

    private String country;
    private String town;

    public VisitedPlace(String country, String town) {
        this.country = country;
        this.town = town;
    }

    @Override
    public String getSlug() {
        return getSlug(country + " " + town);
    }

}
