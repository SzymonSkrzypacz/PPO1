package Zoo.Animals;

public abstract class Penguins extends Animal {

	Penguins(String name)
	{
		super(name);
	}
	
	String[] getDiet() {
        return new String[]{"water", "fish", "shellfish"};
    }
}
