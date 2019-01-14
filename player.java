public class player{
    tool t = new tool();
    //attributes
    String name;
    int hp;
    int maxhp;
    int strenght;
    int dexterity;
    int intelligence;
    String wp;
    String[] inv = {};
    String[] equipped = {};

    //behaviour
    public void create(){        
	System.out.println("System: Please enter your character name.");
	name = t.nextLine();
	maxhp = 50;
	hp = 50;
	System.out.println("System: " + name + " has 50 HP. Now you will roll 3 dice and chose to wich stat assign\n        each of the results. Available stats are strenght dexterity and\n        intelligence. [press enter]");
	//the following input is just to stop the script until the player press enter
	String a = t.nextLine();
	for (int i=0; i<3; i++) {
		int stat = t.randint(6) + 1;
		System.out.println("System: you rolled a " + stat + ", type what stat you want to assign it to.");
		boolean assigned = false;
		while (assigned == false) {
			String chosenstat = t.nextLine();
			switch (chosenstat) {
				case "strenght":
					if (strenght == 0) {
						strenght = stat;
						System.out.println("System: Your strenght is now " + strenght);
						assigned = true;
					}
					else {
						System.out.println("System: You have already assigned a valuse to this stat!");
					}
					break;
				case "dexterity":
					if (dexterity == 0) {
						dexterity = stat;
						System.out.println("System: Your dexterity is now " + dexterity);
						assigned = true;
					}
					else {
						System.out.println("System: You have already assigned a valuse to this stat!");
					}
					break;
				case "intelligence":
					if (intelligence == 0) {
						intelligence = stat;
						System.out.println("System: Your intelligence is now " + intelligence);
						assigned = true;
					}
					else {
						System.out.println("System: You have already assigned a valuse to this stat!");
					}
					break;
				default:
					System.out.println("System: There isn\'t a stat with that name!");
			}
		}
	}
    }

    public void stats() {
	System.out.println("System:");
	System.out.println("        |" + name + "\'s stats|");
	System.out.println("        HP: " + hp + "/" + maxhp);
	System.out.println("        strenght: " + strenght);
	System.out.println("        dexterity: " + dexterity);
	System.out.println("        intelligence: " + intelligence);
    }
}