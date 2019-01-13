public class player{
    tool t = new tool();
    //attributes
    String name;
    int hp;
    int strenght;
    int dexterity;
    int intelligence;
    String wp;
    String[] inv = {};
    String[] equipped = {};

    //behaviour
    public void create(){        
	System.out.println("System: Please enter your character name");
	name = t.nextLine();
	int stat = t.randint(7) + t.randint(7) + t.randint(7);
	System.out.println("System: you rolled a " + stat + ", type what stat you want to assign it to.");
	String chosenstat = t.nextLine();
	switch (chosenstat) {
		case "hp":
			hp = stat;
			System.out.println("System: Your HP are now " + hp);
			break;
		default:
			System.out.println("System: There isn\'t a stat with that name!");
	}
    }
}