import java.util.*;
public class player{
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
	Scanner scan = new Scanner(System.in);        
	System.out.println("System: Please enter your character name");
	name = scan.nextLine();
    }
}