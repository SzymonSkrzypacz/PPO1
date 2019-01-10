package Notebook.Entries;

import Notebook.Interfaces.NotebookEntry;
import Notebook.Traits.Slugger;

public class DroveCar implements NotebookEntry, Slugger {

    private String brand;
    private String model;
    private float engine_capacity;

    public DroveCar(String brand, String model, float engine_capacity) {
        this.brand = brand;
        this.model = model;
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String getSlug() {
        return getSlug(brand + " " + model + " " + engine_capacity);
    }

}
