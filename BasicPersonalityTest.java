// This code blob was completely written by me(Pratik B) and its mostly a part of my practice.
// Adding Java Scanner Utility
import java.util.Scanner;
//Declaring class
public class BasicPersonalityTest {
    public static void main(String args[]) {
        //Creating new scanner instance
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, What Is Your Name ? ");
        String name = sc.next();
        System.out.println("How Old Are You ?  ");
        int age = sc.nextInt();
        // if loop for age catergorization
        if(age >= 18 && age <= 25){
            System.out.println("So, Your name is " + name + " and you're an Adult. ");
        } else if (age >= 10 && age <= 17){
            System.out.println("So, Your name is " + name + " and you're a Teenager. ");
        } else {
            System.out.println("So, Your name is " + name + " , dude you're really old. ");
        }
        
        System.out.println("\n Now lets talk about your personality.");
        System.out.println("\n Answer in true or false case-sensitive ");
        
        System.out.println("\n Are you optimistic ? ");
        boolean optimistic = sc.nextBoolean();
        System.out.println("\n Are you active ? ");
        boolean active = sc.nextBoolean();
        System.out.println("\n Are you a social animal ? ");
        boolean social = sc.nextBoolean();
        System.out.println("\n Are you short-tempered ? ");
        boolean sshorttempered = sc.nextBoolean();
        System.out.println("\n Are you fast ? ");
        boolean fast = sc.nextBoolean();
        System.out.println("\n Are you irritable ? ");
        boolean irritable = sc.nextBoolean();
        System.out.println("\n Are you analytical ? ");
        boolean analytical = sc.nextBoolean();
        System.out.println("\n Are you wise ? ");
        boolean wise = sc.nextBoolean();
        System.out.println("\n Are you a quiet person ? ");
        boolean qquiet = sc.nextBoolean();
        System.out.println("\n Are you relaxed ? ");
        boolean relaxed = sc.nextBoolean();
        System.out.println("\n Are you peaceful ? ");
        boolean peaceful = sc.nextBoolean();

        // if loop for personality Catergorization
        if(optimistic && active && social) {
            System.out.println("Your're a Sanguine type. \n Sanguines tend to be more extroverted and enjoy being a part of a crowd. \n Sanguine personality is typically described as highly talkative,enthusiatic,active and social . \n Individuals with this personality have a hard time doing nothing and engage in more risk seeking behaviour. ");
        }else if(sshorttempered && fast || irritable){
            System.out.println("You're a Choleric Type. \n Choleric individuals tend to be more extroverted. \n They are described as independent,decisive,goal oriend and ambitious. \n These combined with their dominant, result oriented outlook make them natural leaders. \n In Ancient history, they were thought to be violent,vengeful and short tempered ");
        }else if(analytical && wise && qquiet) {
            System.out.println("You're Melancholic type.\n Melancholic individuals tend to be analytical and detail-oriented, and they are deep thinkers and feelers. They are introverted and try to avoid being singled out in a crowd. \n A Melancholic personality leads to self-reliant individuals who are thoughtful,reserved, and often anxious because they strive for perfection.");
        }else if(relaxed && peaceful) {
            System.out.println("You're Phlegmatic type. \n Phlegmatic individuals tend to be relaxed,peaceful,quiet and easy-going. \n They are empathetic towards others, yet they try to hide their emotions. \n Phlegmatic individuals also are good at generalizing ideas or problems to the world and making compromises. ");
        }else {
            System.out.println(" Sorry I can't describe your personality. ");
        }
        
    }    
}