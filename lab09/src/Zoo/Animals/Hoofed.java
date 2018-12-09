package Zoo.Animals;

public abstract class Hoofed extends Animal {

	Hoofed(String name)
	{
		super(name);
	}
	
	String[] getDiet() {
        return new String[]{"water", "leaves", "milk", "grass","fruits"};
    }
}
