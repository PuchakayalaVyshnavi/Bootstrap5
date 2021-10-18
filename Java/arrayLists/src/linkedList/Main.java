package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//when we use the arraylist, if we want to add something in b/w or remove,then we need to move all the elements
//using linkedlist as all the elements are uses links, without moving we can insert and remove directly.
public class Main {
public static void main(String[] args) {
	//
//	Customer customer = new Customer("Tim",100.43);
//	Customer anotherCustomer;
//	anotherCustomer=customer;
//	anotherCustomer.setBalance(200);
//	System.out.println("name" +customer.getName()+"balance" +customer.getBalance());//2nd class effect 1st class


LinkedList<String> placesToVisit= new LinkedList<String>();
addInOrder(placesToVisit,"India");
addInOrder(placesToVisit,"US");
addInOrder(placesToVisit,"UK");
addInOrder(placesToVisit,"Bankok");
addInOrder(placesToVisit,"China");
addInOrder(placesToVisit,"Denmark");
//placesToVisit.add("India");
//placesToVisit.add("US");
//placesToVisit.add("UK");
//placesToVisit.add("London");
//placesToVisit.add("Austrila");
//placesToVisit.add("China");
//placesToVisit.add("Japan");
printList(placesToVisit);

//placesToVisit.add(1,"Alice");
addInOrder(placesToVisit,"Alice");
addInOrder(placesToVisit,"Denmark");// checking not to print repeat country
printList(placesToVisit);
//
//placesToVisit.remove(4);
//printList(placesToVisit);

visit(placesToVisit);
}

private static void printList(LinkedList<String> linkedList) {
 Iterator<String> itr= linkedList.iterator(); //iterator() is part of linkedList
 while(itr.hasNext()) {
	 System.out.println("Now visting "+itr.next());
 }
	System.out.println("*******************");
}
private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
	ListIterator<String> stringListIterator = linkedList.listIterator();
	while(stringListIterator.hasNext()) {
		int comparison = stringListIterator.next().compareTo(newCity);
		if(comparison==0) {
			//equal no add
			System.out.println(newCity +"already in list");
			return false;
		}
		else if(comparison>0) {
			//newcity should appear before
			// banglore ->america
			stringListIterator.previous();// listiterator is used bcz it provides pevious() , Iterator do not.
			stringListIterator.add(newCity);
			return true;
		}
		else if(comparison<0) {
			//move on next city
		}
	}
	stringListIterator.add(newCity);
	return true;
	
}
private static void visit(LinkedList cities) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;
    ListIterator<String> listIterator = cities.listIterator();

    if(cities.isEmpty()) {
        System.out.println("No cities in the itenerary");
        return;
    } else {
        System.out.println("Now visiting " + listIterator.next());
        printMenu();
    }
    while (!quit) {
        int action = scanner.nextInt();
        scanner.nextLine();
        switch(action) {
            case 0:
                System.out.println("Holiday (Vacation) over");
                quit = true;
                break;

            case 1:
                if(!goingForward) {
                    if(listIterator.hasNext()) {
                        listIterator.next();
                    }
                    goingForward = true;
                }
                if(listIterator.hasNext()) {
                    System.out.println("Now visiting " + listIterator.next());
                } else {
                    System.out.println("Reached the end of the list");
                    goingForward = false;
                }
                break;

            case 2:
                if(goingForward) {
                    if(listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    goingForward = false;
                }
                if(listIterator.hasPrevious()) {
                    System.out.println("Now visiting " + listIterator.previous());
                } else {
                    System.out.println("We are at the start of the list");
                    goingForward = true;
                }
                break;

            case 3:
                printMenu();
                break;

        }

    }
}

private static void printMenu() {
    System.out.println("Available actions:\npress ");
    System.out.println("0 - to quit\n" +
            "1 - go to next city\n" +
            "2 - go to previous city\n" +
            "3 - print menu options");
}
}