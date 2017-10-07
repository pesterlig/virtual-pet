import java.util.Random;

public class VirtualPet {

	Random generator = new Random();
	int randNum = generator.nextInt(4) + 1;

	// instance data for creating instance variable
	private String name;
	private double fullOFood;
	private double fit;
	private double beloved;
	private double contentment;

	// Constructor
	public VirtualPet(String name, double fullOFood, double fit, double beloved, double contentment) {
		this.name = name;
		this.fullOFood = fullOFood;
		this.fit = fit;
		this.beloved = beloved;
		this.contentment = contentment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFullOFood() {
		return fullOFood;
	}

	public void setFullOFood(double fullOFood) {
		this.fullOFood = fullOFood;
	}

	public double getFit() {
		return fit;
	}

	public void setFit(double fit) {
		this.fit = fit;
	}

	public double getBeloved() {
		return beloved;
	}

	public void setBeloved(double beloved) {
		this.beloved = beloved;
	}

	public double getContentment() {
		return contentment;
	}

	public void setContentment(double contentment) {
		this.contentment = contentment;
	}

	public void ShowPetStatus(String name) {
		contentment = (fullOFood * fit * beloved) / 3;
		System.out.println("Miaow!");
		System.out.println(name + " is\n" + fullOFood + "% full of food\n" + fit + "% fit\n" + beloved + "% beloved\n");
		if (contentment >= 75) {
			System.out.println(name + " is content now ");
		} else if (contentment >= 50 && contentment < 75) {
			System.out.println(name + " could be happier...");
		} else if (contentment < 50 && contentment > 0) {
			System.out.println(name + "is discontent!");
		} else {
			System.out.println(name + " has run away!");

		}
	}

	public void displayMenu(String name) {
		System.out.println("What would you like to do? (Input number of choice)");
		System.out.println(" 1 = Feed " + name + " expensive canned salmon");
		System.out.println(" 2 = Feed " + name + " dry food");
		System.out.println(" 3 = Cathug* " + name);
		System.out.println(" 4 =  Drag a string around the floor for " + name + " to play with");
		System.out.println(" 5 = Ignore " + name);
	}

	public void makeChoice(int choice, String name) {
		if (choice == 1) {
			System.out.println("Miaow! Miaow! " + name + " loves salmon!");
			fullOFood += (20 * (randNum));
		} else if (choice == 2) {
			System.out.println("Miaow! " + name + " munches the dry food.");
			fullOFood += (10 * (randNum));
		} else if (choice == 3) {
			System.out.println("Purr... " + name + " enjoys* the cathug!");
			beloved += (20 * (randNum));
		} else if (choice == 4) {
			System.out.println(name + " chases the string around the catio - life is good!");
			fit += (10 * (randNum));
		} else if (choice == 5) {
			System.out.println("How can you ignore a kitten???");
			// (call tick?)
		}
	}
}
