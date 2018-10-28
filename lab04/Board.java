package lab04;

import java.util.Vector;



public class Board {

	private int maxPosition;
	private Vector<Pawn>pawns = new Vector<Pawn>(10);
	private Dice dice;
	private Pawn winner;
	private int turnsCounter;
	private Boolean czywygrana=false;
	private int iloscscian;
	private int liczbagraczy;
	
	Board(int iloscscian, int liczbagraczy, int maxPosition){
		this.turnsCounter=0;
		this.dice=new Dice(iloscscian);
		this.liczbagraczy=liczbagraczy;
		this.maxPosition=maxPosition;
		dodajGraczy();
	}
	

	
	int getLiczbaGraczy() {
		return this.liczbagraczy;
	}
	
	void setLiczbaGraczy()
	{
		this.liczbagraczy=liczbagraczy;
	}
	
	int getMaxPosition()
	{
		return this.maxPosition;
	}
	
	void setMaxPosition() {
		this.maxPosition=maxPosition;
	}
	
	void dodajGraczy()
	{
		pawns.addElement(new Pawn("Gracz 1"));
		pawns.addElement(new Pawn("Gracz 2"));
		pawns.addElement(new Pawn("Gracz 3"));
		pawns.addElement(new Pawn("Gracz 4"));
		pawns.addElement(new Pawn("Gracz 5"));
		pawns.addElement(new Pawn("Gracz 6"));
		pawns.addElement(new Pawn("Gracz 7"));
		pawns.addElement(new Pawn("Gracz 8"));
		pawns.addElement(new Pawn("Gracz 9"));
		pawns.addElement(new Pawn("Gracz 10"));
		
	}
	
	Boolean getCzyWygrana() {
		return this.czywygrana;
	}
	
	void performTurn()
	{
		this.turnsCounter++;
		System.out.println("Tura: "+this.turnsCounter);
		Log.info("");
		
		for (int i=0; i<this.liczbagraczy;i++)
		{
			int rollResult = this.getDice().roll();
			Pawn pawn = this.pawns.elementAt(i);
			
			
			if (pawn.getPosition()%10==0)
			{
				System.out.println("Stoisz na polu, ktore jest wielokrotnoscia 10.");
				if (rollResult==this.dice.getiloscscian())
				{
					System.out.println("Wyrzuciles maksymalna liczbe oczek");
					int premia = this.dice.roll();
					rollResult+=premia;
				}
			}
			
			if (rollResult==1 && pawn.getPosition()%2==1)
			{
				System.out.println("Dodatkowy rzut karny");
				int karny = this.dice.roll();
				pawn.CofajPosition(karny);
				if (pawn.getPosition()<0)
					pawn.setPosition(0);
			}
			
			else
			{
			pawn.addPosition(rollResult);
			}
			
			System.out.println(pawn.getName() +" nowa pozycja: "+pawn.getPosition());
			Log.info("");
			
			if (pawn.getPosition() >=this.maxPosition)
			{
				this.winner=pawn;
				System.out.println(winner.getName()+" wygral");
				czywygrana=true;
				break;
				
			}
			
		}
	}

	Dice getDice() {
		return this.dice;
	}


	
}
