package entities;
import tools.*;
public class player{
    tools.tool t = new tool();
    //attributes
    private int lvl;
    private String name;
    private int hp;
    private int maxhp;
    private int strenght;
    private int dexterity;
    private int intelligence;
    private String wp;
    private String[] inv = {};
    private String[] equipped = {};

    //constructors
    public player() {
	lvl = 1;
    }

    //behaviour
    public void create(){        
	System.out.println("System: Please enter your character name.");
	this.name = t.nextLine();
	this.maxhp = 50;
	this.hp = 50;
	System.out.println("System: " + name + " has 50 HP. Now you will roll 3 dice and choose to wich stat assign\n        each of the results. Available stats are strenght dexterity and\n        intelligence. [press enter]");
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
						this.strenght = stat;
						System.out.println("System: Your strenght is now " + strenght);
						assigned = true;
					}
					else {
						System.out.println("System: You have already assigned a valuse to this stat!");
					}
					break;
				case "dexterity":
					if (dexterity == 0) {
						this.dexterity = stat;
						System.out.println("System: Your dexterity is now " + dexterity);
						assigned = true;
					}
					else {
						System.out.println("System: You have already assigned a valuse to this stat!");
					}
					break;
				case "intelligence":
					if (intelligence == 0) {
						this.intelligence = stat;
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
	System.out.println("        |" + this.name + "\'s stats|");
	System.out.println("        HP: " + this.hp + "/" + this.maxhp);
	System.out.println("        strenght: " + this.strenght);
	System.out.println("        dexterity: " + this.dexterity);
	System.out.println("        intelligence: " + this.intelligence);
    }
    
    //getters and setters
    public int getHp() {
	return this.hp;
    }
    public void setHp(int x) {
	this.hp = x;
    }
    public int getMaxhp() {
	return this.maxhp;
    }
    public void setMaxhp(int x) {
	this.maxhp = x;
    }
    public int getStrenght() {
	return this.strenght;
    }
    public void setStrenght(int x) {
	this.strenght = x;
    }
    public int getDexterity() {
	return this.dexterity;
    }
    public void setDexterity(int x) {
	this.dexterity = x;
    }
    public int getIntelligence() {
	return this.intelligence;
    }
    public void setIntelligence(int x) {
	this.intelligence = x;
    }
}