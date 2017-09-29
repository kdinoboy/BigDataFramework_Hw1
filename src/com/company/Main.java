package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*exo1*/
        for (i = args.length - 1; i = 0; i--) {
            System.out.println(args[i] + " ");
        }
        dicho();
    }

    /*exo2*/
    public static void dicho()
        {
            int quit=0;
            int max = 100;
            int guessed = -1;

            Random rn = new Random();
            int toFind = rn.nextInt(max+1);
            System.out.println("un nombre entre 0 et "+max+" a ete généré, trouvez le !");

            while(quit ==0)
            {
                System.out.println("\n\n Rentrez un nombre entier au clavier");
                Scanner sc = new Scanner(System.in);
                guessed = sc.nextInt();
                if(guessed == toFind)
                {
                    quit = 0;
                    System.out.println("Felicitation !");
                }
                else if(guessed < toFind)
                {
                    System.out.println("Réessayez, le nombre est plus grand ! ");
                }

                else
                {
                    System.out.println("Réessayez, cest plus petit ! ");
                    quit = 1;
                }
            }


        }
}
