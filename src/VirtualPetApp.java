import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// create an object(instance) of the VirtualPet class
		VirtualPet cat1 = new VirtualPet("Kitty", 50, 50, 50, 50);

		System.out.println("You just found a kitten!\n");
		cat1.displayAsciiKitten();
		System.out.println("Name your kitty:");
		cat1.setName(input.nextLine());
		String name = cat1.getName();
		System.out.println(name + " is the perfect name for this cat!\n");
		double contentment = cat1.getContentment();

		// Game Loop:
		while (cat1.getContentment() > 0) {
			cat1.tick();
			// System.out.println("Miaow!");

			if (cat1.getContentment() >= 75) {
				System.out.println(name + " is mostly content now ");
			} else if (cat1.getContentment() >= 50 && cat1.getContentment() < 75) {
				System.out.println(name + " could be happier...");
			} else if (cat1.getContentment() < 50 && cat1.getContentment() > 0) {
				System.out.println(name + " is discontent!");
			}

			System.out.println(name + " is\n" + cat1.getHunger() + "% hungry \n" + cat1.getHealth()
					+ "% fit & healthy\n" + cat1.getHappiness() + "% happy\n");

			cat1.displayMenu(name);

			int choice = input.nextInt();

			if (choice == 1) {
				cat1.feedSalmon();
				System.out.println("Miaow! Miaow! " + name + " loves salmon!\n");
			} else if (choice == 2) {
				cat1.feedDryFood();
				System.out.println("Miaow! " + name + " munches the dry food.\n");
			} else if (choice == 3) {
				cat1.hugCat();
				System.out.println("Purr... " + name + " endures the cat-hug\n.");
			} else if (choice == 4) {
				cat1.dragRibbon();
				System.out.println(name + " chases the ribbon around the catio - life is good!\n");
			} else if (choice == 5) {
				cat1.ignoreCat();
				System.out.println(name + " has been properly ignored.  He snubs you back by \n"
						+ "walking across your keyboard and waving his tail under your nose.\n");
			} else if (choice == 6) {
				System.out.println("You: Aaaaw!  Miaow, Miaow!  Who is a pwetty kitty? \n " + name
						+ " is a pwetty kitty! \n" + name + " is bemused, but this does nothing for him...\n");
			}
			cat1.tick();
		}

		System.out.println(name + " has run away!");
		System.out.println("Game Over");
		System.exit(0);
	}
}
