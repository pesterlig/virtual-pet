import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// create an object(instance) of the VirtualPet class
		VirtualPet cat1 = new VirtualPet("Kitty", 50, 50, 50, 50);

		System.out.println("You just found a kitten!\nName your kitty:");
		cat1.setName(input.nextLine());
		String name = cat1.getName();
		System.out.println(name + " is the perfect name for this cat!\n");
		double contentment = cat1.getContentment();

		// Game Loop:
		while (contentment > 0) {
			cat1.tick();
			// System.out.println("Miaow!");

			if (contentment >= 75) {
				System.out.println(name + " is mostly content now ");
			} else if (contentment >= 50 && contentment < 75) {
				System.out.println(name + " could be happier...");
			} else if (contentment < 50 && contentment > 0) {
				System.out.println(name + "is discontent!");
			}

			System.out.println(name + " is\n" + cat1.getHunger() + "% hungry \n" + cat1.getHealth()
					+ "% fit & healthy\n" + cat1.getHappiness() + "% happy\n");

			cat1.displayMenu(name);

			int choice = input.nextInt();

			if (choice == 1) {
				cat1.feedSalmon();
				System.out.println("Miaow! Miaow! " + name + " loves salmon!");
				cat1.tick();
			}
		}
		System.out.println(name + " has run away!");
		System.out.println("Game Over");
		System.exit(0);
	}
}
