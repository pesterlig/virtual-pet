
public class VirtualPet {
	// instance data for creating instance variable
	private String name;
	private int hunger;
	private int mischievousness;
	private int drowsiness;
	private boolean indoors;

	// Constructor
	public VirtualPet(String name, int hunger, int mischievousness, int drowsiness, boolean indoors) {
		this.name = name;
		this.hunger = hunger;
		this.mischievousness = mischievousness;
		this.drowsiness = drowsiness;
		this.indoors = indoors;
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

	public int getMischievousness() {
		return mischievousness;
	}

	public void setMischievousness(int mischievousness) {
		this.mischievousness = mischievousness;
	}

	public int getDrowsiness() {
		return drowsiness;
	}

	public void setDrowsiness(int drowsiness) {
		this.drowsiness = drowsiness;
	}

	public boolean getIndoors() {
		return indoors;
	}

	public void setIndoors(boolean indoors) {
		this.indoors = indoors;
	}

	public void showPetStatus(String name) {
		System.out.println("Miaow!");
		System.out.println(name + " is\n" + hunger + "% hungry\n" + mischievousness + "% mischievous\n" + drowsiness
				+ "% drowsy\n and");
		if (indoors) {
			System.out.println(name + " is indoors...");
		} else {
			System.out.println(name + " is outside, roaming the town!");
		}
	}
}