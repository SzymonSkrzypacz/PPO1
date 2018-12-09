package Zoo.Animals;

public abstract class Predator extends Animal{

	Predator(String name)
	{
		super(name);
	}
	
	String[] getDiet() {
        return new String[]{"water", "meat", "milk"};
    }
}
