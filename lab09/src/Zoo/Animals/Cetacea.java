package Zoo.Animals;

public abstract class Cetacea extends Animal{
	
	Cetacea(String name)
	{
		super(name);
	}

	String[] getDiet() {
        return new String[]{"fish", "shellfish", "squid"};
    }
}
