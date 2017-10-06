import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// create an object(instance) of the Computer class
		VirtualPet cat1 = new VirtualPet("Kitty", 50, 50, 50, true);

		System.out.println("You just found a kitten!\nName your kitty:");
		cat1.setName(input.nextLine());
		System.out.println(cat1.getName() + " is the perfect name for this cat!\n");

		cat1.showPetStatus(cat1.getName());
		
//		System.out.println("Miaow");
//		System.out.println(cat1.getHunger());
//		System.out.println(cat1.getMischievousness());
//		System.out.println(cat1.getDrowsiness());
//		System.out.println(cat1.getIndoors());

		// System.out.println(comp1.getMake());
		// System.out.println(comp1.getModel());
		// System.out.println(comp1.getPrice());
		//
		// System.out.println(comp2.getMake());
		// System.out.println(comp2.getModel());
		// System.out.println(comp2.getPrice());
		//
		// comp1.setPrice(500.00);
		// System.out.println("The new price of comp1 is " + comp1.getPrice());
		//
		// comp1.setPrice(400.00);
		// System.out.println("The new price of comp1 is " + comp1.getPrice());
		//
		// comp1.setPrice(300.00);
		// System.out.println("The new price of comp2 is " + comp1.getPrice());
		//
		// System.out.println(comp1.download(false));

	}

}
