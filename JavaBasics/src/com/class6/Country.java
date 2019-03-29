package com.class6;

import java.util.Scanner;

public class Country {

    public static void main(String[] args) {
        //Ask user to enter their country and capture it. Once values are captured print which language user speaks.
        Scanner scan;
        String country,lang;  
        scan=new Scanner(System.in);
        System.out.println("Please enter which country you are from");
        country=scan.nextLine();
        switch (country) {
        case "USA":
            lang="English or maybe Spanish";
            break;
        case "Switzerland":
        	lang="Italian, Deutsch, French, Retroman";
            break;
        case "Russia":
        	lang="Russian or Tatar, Bashkir, Komi, Chechen and so on";
            break;
        case "Tunisia":
        	lang="Arabic or French";
            break;
        case "Turkey":
        	lang="Turkish";
            break;
        case "Belgium":
        	lang="French or Dutch";
            break;
        case "Kazakhstan":
        	lang="Kazakh or Russian";
            break;
        case "Belarus":
        	lang="Belarusian or Russian";
            break;
        default:
        	lang="Unknown";
        }
        System.out.println("You can speak "+lang);
    }
}