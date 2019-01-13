public class game{
    public static void main(String[] args) {
	tool t = new tool();
	System.out.println("System: Hello dear player, and welcome to text-adveture!\n        To start playing just type a command!");
        while (true) {
            String cmd = t.nextLine();
            switch (cmd) {
		case "new character":
		    player plyr = new player();
		    plyr.create();
		    break;
		case "quit":
		    System.exit(0);
                default:
                    System.out.println("System: Unknown command!");
            }
        }
    }
}
