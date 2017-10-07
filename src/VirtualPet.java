import java.util.Random;

public class VirtualPet {

	Random generator = new Random();
	int randNum = generator.nextInt(4) + 1;

	// instance data for creating instance variable
	private String name;
	private int hunger;
	private int health;
	private int happiness;
	private double contentment;

	// Constructor
	public VirtualPet(String name, int hunger, int health, int happiness, double contentment) {
		this.name = name;
		this.hunger = hunger;
		this.health = health;
		this.happiness = happiness;
		this.contentment = contentment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public double getContentment() {
		return contentment;
	}

	public void setContentment(double contentment) {
		this.contentment = contentment;
	}

	public void tick() {
		contentment = ((100 - hunger) * health * happiness) / 3;
		hunger += 5;
		if (hunger > 100) {
			hunger = 100;
		} else if (hunger < 0) {
			hunger = 0;
		}
		health -= 5;
		if (health > 100) {
			health = 100;
		} else if (health < 0) {
			health = 0;
		}
		happiness -= 5;
		if (happiness > 100) {
			happiness = 100;
		} else if (happiness < 0) {
			happiness = 0;
		}
	}

	public void displayMenu(String name) {
		System.out.println("What would you like to do? (Input number of choice)");
		System.out.println(" 1 = Feed " + name + " expensive canned salmon");
		System.out.println(" 2 = Feed " + name + " dry food");
		System.out.println(" 3 = Hug " + name);
		System.out.println(" 4 = Drag a ribbon around for " + name + " to play with");
		System.out.println(" 5 = Ignore " + name);
	}

	// public void makeChoice(int choice, String name) {
	// if (choice == 1) {
	// System.out.println("Miaow! Miaow! " + name + " loves salmon!");
	// hunger += (20 * (randNum));
	// } else if (choice == 2) {
	// System.out.println("Miaow! " + name + " munches the dry food.");
	// hunger += (10 * (randNum));
	// } else if (choice == 3) {
	// System.out.println("Purr... " + name + " enjoys* the cat-hug!");
	// happiness -= (10 * (randNum));
	// } else if (choice == 4) {
	// System.out.println(name + " chases the string around the catio - life is
	// good!");
	// health += (20 * (randNum));
	// } else if (choice == 5) {
	// System.out.println("How can you ignore a kitten???");
	// // (call tick?)
	// }
	// }

	public int feedSalmon() {
		hunger -= (20 * (randNum));
		// if (hunger > 100) {
		// hunger = 100;
		// } else if (hunger < 0) {
		// hunger = 0;
		// }
		return hunger;
	}

	public int feedDryFood() {
		hunger -= (10 * (randNum));
		// if (hunger > 100) {
		// hunger = 100;
		// } else if (hunger < 0) {
		// hunger = 0;
		// }
		return hunger;
	}

	public int hugCat() {
		happiness -= (5 * randNum);
		// if (happiness > 100) {
		// happiness = 100;
		// } else if (happiness < 0) {
		// happiness = 0;
		// }
		return happiness;
	}

	public int dragRibbon() {
		health += (20 * (randNum));
		// if (health > 100) {
		// health = 100;
		// } else if (health < 0) {
		// health = 0;
		// }
		return health;
	}

	public int ignoreCat() {
		happiness += (3 * (randNum));
		// if (happiness > 100) {
		// happiness = 100;
		// } else if (happiness < 0) {
		// happiness = 0;
		// }
		return happiness;
	}

}
