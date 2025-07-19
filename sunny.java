package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Sunny", "2025"); // change it as you need
        remindName();
        guessAge();
        count();
        test(); // ...
        
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int three = scanner.nextInt(); // diff var names
        int five = scanner.nextInt();
        int seven = scanner.nextInt();
        int age = (three * 70 + five * 21 + seven * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        int i = 0;
        while (i<=number){ // no for loop, printf
            System.out.println(i + "!");
            i++;
        }

    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the correct way to create an ArrayList of Strings?");
        System.out.println("1. ArrayList<String> list = new ArrayList<String>();");
        System.out.println("2. ArrayList list = new ArrayList();");
        System.out.println("3. String[] list = new ArrayList();");
        System.out.println("4. List<String> = ArrayList<String>();");
        System.out.println("5. ArrayList<String> list = new ArrayList<>();");
        int answer = scanner.nextInt();
        
        while (true){
            if (answer!=5){
                System.out.println("Please, try again.");
                answer = scanner.nextInt();
            } else {
                break;
            }          
        } 
        end();
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}

