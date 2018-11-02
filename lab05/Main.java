package lab05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		Scanner skan = new Scanner(System.in);
		int choose;
		
		library.menu();
		
		
		do {
			
			choose =  skan.nextInt();
			
			switch(choose)
			{
			case 1:{
				library.dodajKsiazke(choose);
				break;
			}
			case 2:{
				library.dodajKsiazke(choose);
				break;
			}
			case 3:{
				library.dodajKsiazke(choose);
				break;
			}
			case 4:{
				library.wypiszNovels();
				break;
			}
			case 5:{
				library.wypiszKomiksy();
				break;
			}
			case 6:{
				library.wypiszPodreczniki();
				break;
			}
			case 7:{
				library.wypiszWszystkieKsiazki();
				break;
			}
			default: {
				break;
			}
			}
		}while(choose>=1 && choose<=7);
		skan.close();
	}
}