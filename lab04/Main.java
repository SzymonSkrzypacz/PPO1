package lab04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int iloscscian=0;
		int liczbagraczy=0;
		int maxPosition=0;
		
		
		do {
			System.out.println("Podaj ilosc scian, tak aby byla parzysta i wieksza od 3");
			iloscscian=scan.nextInt();
			
		}while(iloscscian<4 || iloscscian%2==1);
		
		do {
			System.out.println("Podaj ilosc graczy, od 3 do 10");
			liczbagraczy=scan.nextInt();
			
		}while(liczbagraczy<3 || liczbagraczy>10);
		
		
		do {
			System.out.println("Podaj ilosc pol od 250 do 4000");
			maxPosition=scan.nextInt();
			
		}while(maxPosition<250 || maxPosition>4000);
		
		
		Board board=new Board(iloscscian,liczbagraczy,maxPosition);
		
		
		do 
		{
			board.performTurn();
			
			
		}while (board.getCzyWygrana()==false);
		
		
	}

}
