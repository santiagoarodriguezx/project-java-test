public class StringDemo {
    public static void main(String[] args) {

        String greeting = "Hello";
        String name = "Alice";
        
        // String concatenation
        String message = greeting + ", " + name + "!";
        System.out.println(message);
        
        // String length
        System.out.println("The length of the message is: " + message.length());
        
        // Accessing characters in a string
        System.out.println("The first character is: " + message.charAt(0));
        
        // Converting to uppercase
        System.out.println("Uppercase message: " + message.toUpperCase());
        
        // Substring
        System.out.println("First five characters: " + message.substring(0, 5));
    }
}