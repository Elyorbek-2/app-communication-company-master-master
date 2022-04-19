package uz.pdp.appcommunicationcompany.entity;


import java.util.Random;

public class GenUsername {
    public static void main(String[] args) {


        Random generator = new Random();
        int randomNumber = generator.nextInt(9000) + 10;

        String first = "Javohir";
        String last = "Hikmatillayev";
        String username = (first.charAt(new Random().nextInt(first.length())) + "$").toUpperCase() + last.substring(0, last.length() - 2) + randomNumber;
        System.out.println(username);
    }
}
