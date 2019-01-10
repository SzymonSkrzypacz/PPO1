package Notebook;

import Notebook.Interfaces.NotebookEntry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

final public class Notebook {

    private ArrayList<NotebookEntry> entries = new ArrayList<>();

    Notebook save(NotebookEntry entry) {
    	if (!entries.contains(entry)){
    	     entries.add(entry);
    	} else {
    		int freq=Collections.frequency(entries,entry);
    			write(freq);
    		 entries.add(entry);
    	}

        return this;
    }

   public int countEntries() {
        return entries.size();
    }

    Iterable<NotebookEntry> getAll() {
    	Collections.sort(entries, new Comparator<NotebookEntry>(){
    	    public int compare(NotebookEntry s1, NotebookEntry s2) {
    	        return s1.getSlug().compareToIgnoreCase(s2.getSlug());
    	    }
    	});
        return entries;
    }

    private void write(int line) {
        System.out.println(line);
    }

}
