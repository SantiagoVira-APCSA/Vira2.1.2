public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot bob = new ChatBot("Bob", 25);
        bob.greeting("Santiago");
        bob.weather();
        bob.favoriteNumber(25);
        int heightInInches = 71;
        System.out.println("You are more than " + bob.convertFeetToMeters(heightInInches / 12) + " meters tall!");
        System.out.println("Your favorite number plus 10 plus -2 is " + bob.addNumbers(25, 10, -2));
        System.out.println("Your favorite number plus my favorite number is " + bob.ourNumbers(25));
        bob.compliment();
        System.out.println(bob.goodbye());
    }
}
