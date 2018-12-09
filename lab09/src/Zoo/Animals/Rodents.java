package Zoo.Animals;

public abstract class Rodents extends Animal {

	Rodents (String name)
	{
		super(name);
	}
	
	String[] getDiet() {
        return new String[]{"water", "milk", "fruits","flowers","stalks"};
    }
}

