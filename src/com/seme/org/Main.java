package com.seme.org;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create a menu 1. Sign up 2. Log in
        Scanner input = new Scanner(System.in);
        System.out.println("Choose what you want to do: \n1. Sign Up \n2.Login");
        int choice= input.nextInt();
        switch (choice){
            case 1:
                // create a new user and assign
                User user = new User();
                System.out.println("Enter the id :");
                long id = input.nextLong();
                user.setId(id);
                System.out.println("Enter userName:  ");
                String userName= input.nextLine();
                user.setUsername(userName);
                System.out.println("enter password");
                String pass = input.nextLine();
                user.setPassword(pass);

                // adding a role to the user
                System.out.println("Choose the role you want to add \n1. Admin \n2.Editor \n3.Contributor \n4.other  ");
                int chooseRole = input.nextInt();
                if(chooseRole==1){
                    user.setRole("");


                }


        }
    }
}
