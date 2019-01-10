package Notebook.Entries;


import Notebook.Interfaces.NotebookEntry;
import Notebook.Traits.Slugger;

public class  ReadBook implements NotebookEntry, Slugger {

    private String title;
    private String author;

    public ReadBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getSlug() {
        return getSlug(title + " " + author);
    }

}
