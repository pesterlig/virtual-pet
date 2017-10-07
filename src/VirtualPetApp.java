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
			cat1.ShowPetStatus(name);

			cat1.displayMenu(name);

			int choice = input.nextInt();

			cat1.makeChoice(choice, name);

		}
		System.out.println("Game Over");
		System.exit(0);

	}
}
