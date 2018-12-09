package Zoo.Animals;

public abstract class Proboscidean extends Animal {

	Proboscidean(String name)
	{
		super(name);
	}
	
	String[] getDiet() {
        return new String[]{"water","milk","grass","leaves","fruits"};
    }
}
