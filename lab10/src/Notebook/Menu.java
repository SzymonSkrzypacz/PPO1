package Notebook;

import Notebook.Entries.DrankBeer;
import Notebook.Entries.DroveCar;
import Notebook.Entries.ReadBook;
import Notebook.Entries.VisitedPlace;
import Notebook.Entries.WatchedMovie;
import Notebook.Interfaces.NotebookEntry;

import java.util.Scanner;

final public class Menu {

    private Notebook notebook;

    public Menu(Notebook notebook) {

        this.notebook = notebook;
    }

    public void run() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while(running) {
            displayMenu();

            write("Wybierz opcjê: ");
            switch(scanner.nextLine()) {
                case "1": {
                    write();
                    comment("zanotowano:");
                    for(NotebookEntry item : notebook.getAll()) {
                        write(item.getSlug());
                    }
                    break;
                }
                case "2": {
                    write("Podaj tytu³ filmu: ");
                    String title = scanner.nextLine();
                    WatchedMovie movie = new WatchedMovie(title);
                    notebook.save(movie);
                    break;
                }
                case "3": {
                    write("Podaj nazwe piwa: ");
                    String name = scanner.nextLine();
                    write("Podaj nazwe browaru: ");
                    String brewery = scanner.nextLine();
                    DrankBeer beer = new DrankBeer(name, brewery);
                    notebook.save(beer);
                    break;
                }
                
                case "4": {
                    write("Podaj marke samochodu: ");
                    String brand = scanner.nextLine();
                    write("Podaj nazwe modelu: ");
                    String model = scanner.nextLine();
                    write("Podaj pojemnosc silnika");
                    float engine_capacity = scanner.nextFloat();
                    DroveCar car = new DroveCar(brand, model, engine_capacity);
                    notebook.save(car);
                    break;
                }
                
                
                case "5": {
                    write("Podaj tytul ksiazki: ");
                    String title = scanner.nextLine();
                    write("Podaj autora ksiazki: ");
                    String author = scanner.nextLine();
                    ReadBook book = new ReadBook(title, author);
                    notebook.save(book);
                    break;
                }
                
                case "6" :
                {
                	  write("Podaj kraj: ");
                      String country = scanner.nextLine();
                      write("Podaj miejscowosc: ");
                      String town = scanner.nextLine();
                      VisitedPlace place = new 	VisitedPlace(country, town);
                      notebook.save(place);
                      break;
                }
                
                case "x": {
                    running = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    private void displayMenu() {
        write();
        comment("notatek: " + notebook.countEntries());
        write("[1] wypisz notatki");
        write("[2] zanotuj obejrzany film");
        write("[3] zanotuj wypite piwo");
        write("[4] zanotuj samochod, ktory prowadziles" );
        write("[5] zanotuj przeczytana ksiazke");
        write("[6] zanotuj odwiedzone miejsce");
        write("[x] wyjdz");
    }

    private void write() {
        System.out.println();
    }

    private void write(String line) {
        System.out.println(line);
    }
    

    private void comment(String line) {
        write(line);
    }

}
