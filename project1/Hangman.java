package Project_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by starhaotian on 09/10/2017.
 */
//step 1 select a secret word from a list
public class Hangman {


    //static int corret_n = 0;//the count of correct letter
    //static int wrong_m  = 0;//the count of wrong letter


    public static void main(String[] args){
        ArrayList<String> List = new ArrayList<>();
        List.add("nike");
        List.add("adidas");
        List.add("Lining");
        List.add("Jordan");
        // start play the game
        playGame(List);
    }


    //constructor
    public Hangman(ArrayList<String> words){
    }

    //choose the word randomly
    public static String chooseWord(ArrayList<String> words){
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(words.size());
        return words.get(index);
    }


    public static void handleGuess(String s, String s_null){
        int corret_n = 0;//the count of correct letter
        int wrong_m  = 0;//the count of wrong letter
        while (corret_n < s.length() && wrong_m < 8 ) {
            System.out.println("please guess the letter");
            Scanner scan = new Scanner(System.in);
            String user_in = scan.next();

            if (s.contains(user_in)) { // if the input letter exist
                corret_n++;
                s_null = displayWord(s,s_null, user_in);
                System.out.println(s_null);
                if (s_null.equals(s)) {
                    gameWin();
                }

            } else {
                wrong_m++;
                System.out.println("Sorry, you have made " + wrong_m + " mistakes");
                printHangman(wrong_m);
            }
        }



        if (wrong_m == 8) {
            gameOver();
        }

    }

    public static void gameWin(){
        System.out.println("Congratulations! you win the game!");
        System.exit(-1);
    }


    public static void gameOver(){
        System.out.println("Sorry");
        System.out.println("Game Over");
        clearScreen();
        System.exit(-1);

    }





    public static void playGame(ArrayList<String> List){
        System.out.println("Welcome to the game");
        //int n = List.size();
        // decide which word to be secret
        String word_end = chooseWord(List); // word is the word that was chosen by user
        System.out.println(word_end);
        String s_null = "";
        for(int i = 0; i< word_end.length(); i++){
            s_null = s_null + "-";
        }
        System.out.print("s_null now is   ");
        System.out.println(s_null);
        handleGuess(word_end, s_null);
    }



    public static String displayWord(String s,String s_null,String ch){//s is current,ch is new char
        char[] s_arr = s.toCharArray();
        char[] s_null_arr = s_null.toCharArray();
        char c = ch.charAt(0);
        for(int i = 0; i < s_arr.length;i++){
            if(s_arr[i] == c){
                s_null_arr[i] = c;
            }
        }

        /*for(int i = 0; i < s_null_arr.length;i++){
            System.out.print(s_null_arr[i]);
        }
        */

        System.out.println("");
        return (String.valueOf(s_null_arr));

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void printHangman(int num){

        if(num ==0 ){
            return;
        }

        if (num == 1){
            System.out.println("-----------");
            System.out.print("|");
            if(num >0) {System.out.println("         |");}
            System.out.print("|");
            if(num >0) {System.out.println("         O");}
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("-----------------");
        }


        if (num == 2){
            System.out.println("-----------");
            System.out.print("|");
            if(num >0) {System.out.println("         |");}
            System.out.print("|");
            if(num >0) {System.out.println("         O");}
            System.out.print("|");
            System.out.println("         |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("-----------------");
        }


        if(num == 3){
            System.out.println("-----------");
            System.out.print("|");
            if(num >0) {System.out.println("         |");}
            System.out.print("|");
            if(num >0) {System.out.println("         O");}
            System.out.print("|");
            System.out.println("         |");
            System.out.print("|");
            System.out.println("      ---");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("-----------------");
        }

        if(num == 4){
            System.out.println("-----------");
            System.out.print("|");
            if(num >0) {System.out.println("         |");}
            System.out.print("|");
            if(num >0) {System.out.println("         O");}
            System.out.print("|");
            System.out.println("         |");
            System.out.print("|");
            System.out.print("      ---");
            System.out.println(" ---");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("-----------------");
        }

        if (num ==5){
            System.out.println("-----------");
            System.out.print("|");
            if(num >0) {System.out.println("         |");}
            System.out.print("|");
            if(num >0) {System.out.println("         O");}
            System.out.print("|");
            System.out.println("         |");
            System.out.print("|");
            System.out.print("      ---");
            System.out.println(" ---");
            System.out.print("|");
            System.out.println("        /");
            System.out.print("|");
            System.out.println("       /");
            System.out.println("|");
            System.out.println("-----------------");
        }

        if(num == 6){
            System.out.println("-----------");
            System.out.print("|");
            if(num >0) {System.out.println("         |");}
            System.out.print("|");
            if(num >0) {System.out.println("         O");}
            System.out.print("|");
            System.out.println("         |");
            System.out.print("|");
            System.out.print("      ---");
            System.out.println(" ---");
            System.out.print("|");
            System.out.print("        /");
            System.out.println(" \\");
            System.out.print("|");
            System.out.print("       /");
            System.out.println("   \\");
            System.out.println("|");
            System.out.println("-----------------");
        }

        if(num == 7){
            System.out.println("-----------");
            System.out.print("|");
            if(num >0) {System.out.println("         |");}
            System.out.print("|");
            if(num >0) {System.out.println("         O");}
            System.out.print("|");
            System.out.println("         |");
            System.out.print("|");
            System.out.print("      ---");
            System.out.println(" ---");
            System.out.print("|");
            System.out.print("        /");
            System.out.println(" \\");
            System.out.print("|");
            System.out.print("       /");
            System.out.println("   \\");
            System.out.print("|");
            System.out.println("     --");
            System.out.println("-----------------");
        }

        if(num == 8){
            System.out.println("-----------");
            System.out.print("|");
            if(num >0) {System.out.println("         |");}
            System.out.print("|");
            if(num >0) {System.out.println("         O");}
            System.out.print("|");
            System.out.println("         |");
            System.out.print("|");
            System.out.print("      ---");
            System.out.println(" ---");
            System.out.print("|");
            System.out.print("        /");
            System.out.println(" \\");
            System.out.print("|");
            System.out.print("       /");
            System.out.println("   \\");
            System.out.print("|");
            System.out.print("     --");
            System.out.println("     --");
            System.out.println("-----------------");
        }




    }
}
