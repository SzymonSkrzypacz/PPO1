package lab05;

import java.util.Vector;
import java.util.Scanner;

public class Library {

	
		private Vector <Novel> novels = new Vector<Novel>();
		
		public Library addNovel(Novel novel) {
			this.novels.addElement(novel);
			return this;
		}
		
		public Vector<Novel> getNovels() {
			return novels;
		}
	
		
		public void wypiszNovels()
		{
			for(int i = 0; i < novels.size(); i++) {
				Novel novel = getNovels().elementAt(i);
				System.out.println(novel.getType() + " || tytu³:  " + novel.getTitle()+" || autor: "+novel.getAuthor()+" || liczba stron: "+novel.getPages()+" || liczba rozdzia³ów: "+novel.getNumberOfchapters());
			}
		}
		
		
			
		
		private Vector <Komiks> komiksy = new Vector<Komiks>();
		
		public Library addKomiks(Komiks komiks) {
			this.komiksy.addElement(komiks);
			return this;
		}
		
		public Vector<Komiks> getKomiksy() {
			return komiksy;
		}
		
		public void wypiszKomiksy()
		{
			for(int i = 0; i < komiksy.size(); i++) {
				Komiks komiks = getKomiksy().elementAt(i);
				System.out.println(komiks.getType() + " || tytu³: " + komiks.getTitle()+" || autor: "+komiks.getAuthor()+" || liczba stron: "+komiks.getPages()+" || autor rysunków: "+komiks.getDrawingAuthor());
			}
		}

		
		
		
		
		private Vector <Podrecznik> podreczniki = new Vector<Podrecznik>();
		
		public Library addPodrecznik(Podrecznik podrecznik) {
			this.podreczniki.addElement(podrecznik);
			return this;
		}
		
		public Vector<Podrecznik> getPodreczniki() {
			return podreczniki;
		}
		
		public void wypiszPodreczniki()
		{
			
			for(int i = 0; i < podreczniki.size(); i++) {
				Podrecznik podrecznik = getPodreczniki().elementAt(i);
				System.out.println(podrecznik.getType() + " || tytu³: " + podrecznik.getTitle()+" || autor: "+podrecznik.getAuthor()+" || liczba stron: "+podrecznik.getPages()+" || funkcja: "+podrecznik.getFunction());
			}
		}
			
		
		public void wypiszWszystkieKsiazki() {
			
			wypiszNovels();
			wypiszKomiksy();
			wypiszPodreczniki();	
		}	
		
		
void dodajKsiazke(int choose)
		
		{
			Scanner skan = new Scanner(System.in);
		
			String title;
			String author;
			int pages;
			String drawingAuthor;
			int numberOfchapters;
			String function;
		
			System.out.println("Podaj tytu³: ");
			title = skan.nextLine();
			System.out.println("Podaj autora: ");
			author = skan.nextLine();
			System.out.println("Podaj liczbê stron: ");
			pages = skan.nextInt();
			skan.nextLine();
			
			if(choose==1)
			{
				System.out.println("Podaj liczbê rozdzia³ów: ");
				numberOfchapters = skan.nextInt();
				skan.nextLine();
				addNovel(new Novel(title,author,pages,numberOfchapters));
			}
			else if(choose==2)
			{
				System.out.println("Podaj autora rysunków: ");
				drawingAuthor = skan.nextLine();
				addKomiks(new Komiks(title,author,pages,drawingAuthor));
			}
			else if(choose==3)
			{
				System.out.println("Podaj funkcjê podrêcznika: ");
				function = skan.nextLine();
				addPodrecznik(new Podrecznik(title,author,pages,function));
			}
			skan.close();
			
		}

void menu() {

	System.out.println("1 - dodaj Powieœæ;");
	System.out.println("2 - dodaj Komiks;");
	System.out.println("3 - dodaj Podrêcznik;");
	System.out.println("4 - wyœwietl tylko powieœci;");
	System.out.println("5 - wyœwietl tylko komiksy;");
	System.out.println("6 - wyœwietl tylko podrêczniki;");
	System.out.println("7 - wyœwietl ca³¹ kolekcjê biblioteki;");
	System.out.println("8 - zakoñcz program;");

}

		
}
