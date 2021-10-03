package naba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String section;
        System.out.print("Enter section= ");
        section = input.nextLine();
        System.out.println("Section= " +section);

        Info info = new Info();
        System.out.println("Name= " +info.name +"\n" +"ID=" +info.id);

        Hobby hobby = new Hobby();
        System.out.println("Hobby= " +hobby.hobbyName);
    }
}

/*
    Name: Nabajyoti Sharma
    Id: 2012020071
    Section: B
    Email: sharmanaba9@gmail.com
           cse_2012020071@lus.ac.bd
    Date: 17,July,2021
 */