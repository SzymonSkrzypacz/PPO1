package Zoo.Animals;

public abstract class Primates extends Animal {

	Primates(String name)
	{
		super(name);
	}
	
	String[] getDiet() {
        return new String[]{"water", "meat", "milk", "fruits","leaves","seeds","flowers"};
    }
}
