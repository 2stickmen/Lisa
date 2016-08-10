import java.util.Scanner;
public class Lisa {
	public static void main(String[] args) {	
		byte hasGreeted = 0;
		byte hasFarewell = 0;
		byte hasLoved = 0;
		byte hasLaughed = 0;
		byte hasCried = 0;
		byte hasWastedTime = 0;
		byte hasDied = 0; //on the inside = true
		byte wantsMurder = 0;
		byte hasKnife = 1;
		byte knowsName = 0;
		byte knowsFakeName = 0;
		byte askedFeeling = 0;
		
		System.out.println("WELCOME TO A CONVERSATION WITH LISA, WHAT IS YOUR NAME?");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("HELLO " + name + ", GOOD LUCK WITH LISA!");
		String start = "qwerty";
			while(start.equals("qwerty")) {
				String say = input.next();
				if(say.equalsIgnoreCase("ByteCheck")){
					System.out.println("Greeted = " + hasGreeted + ", Farwell = " + hasFarewell + ", Loved = " + hasLoved + ", Laughed = " + hasLaughed + ", Cried = " + hasCried + ", Wasted time = " + hasWastedTime + ", Dead = " + hasDied + ", Wants murder = " + wantsMurder + ", Has knife = " + hasKnife + ", Knows real name = " + knowsName + ", Knows Fake Name = " + knowsFakeName + ", Asked Feeling = " + askedFeeling);
				}
				if(say.equalsIgnoreCase("GREET") && hasGreeted == 0) {	
					System.out.println("<" + name + ">: Hello");
					System.out.println("<Lisa>: Hi!");
					hasGreeted = 1;
					start = "qwerty";
					say = input.nextLine();
				}
				if(say.equalsIgnoreCase("GREET") && hasGreeted == 1){
					System.out.println("<" + name + ">: Hello");
					System.out.println("<Lisa>: You've said that already.");
					hasWastedTime = 1;
					start = "qwerty";
					say = input.nextLine();
					}
				if(say.equalsIgnoreCase("ASKNAME") && hasGreeted == 1) {
					System.out.println("<" + name + ">: What's your name?");
					System.out.println("<Lisa>: I'm called Lisa, what's your name?");
					System.out.println("<" + name + ">: I'm " + name);
					System.out.println("<Lisa>: Hi " + name + "! I was told you'd show up! How are you?");
					knowsName = 1;
					askedFeeling = 1;
					start = "qwerty";
					say = input.nextLine();
				}
			}
		}
	}