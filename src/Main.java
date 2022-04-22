import java.util.ArrayList;
import java.util.Scanner;

class ToDoList{
    public
    Scanner scan = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    ToDoList(){
        int choice;

        do {

            System.out.println();
            System.out.println("1. Display List");
            System.out.println("2. Add an Item");
            System.out.println("3. Remove an Item");
            System.out.println("4. Remove all Items");
            System.out.println("5. Exit");

            System.out.print("Enter a Choice: ");
            choice = scan.nextInt();
            System.out.println();

            switch (choice){
                case 1 : display(); break;
                case 2 : addItem(); break;
                case 3 : removeItem(); break;
                case 4 : removeAllItem(); break;
            }

        }while(choice != 5);

        System.out.println("\nBye Now!!!");
    }

    void display(){

        if(list.size() == 0)
            System.out.println("\nNo Elements in the List!!!");
        else{
            for(int i = 0; i < list.size(); i++){
                System.out.println(i + ": " + list.get(i));
            }
        }
    }
    void addItem(){
        String item;

        scan.nextLine();
        System.out.print("\nEnter Item for Adding: ");
        item = scan.nextLine();

        System.out.println(item + " has been Added!!");
        list.add(item);
    }
    void removeItem(){
        String item;
        display();

        scan.nextLine();
        System.out.print("\nEnter Item for Removing: ");
        item = scan.nextLine();

        if(list.contains(item)){
            System.out.println(item + " has been Removed!!");
            list.remove(item);
        }else{
            System.out.println("\nThe Item " + item + " is not Found in the List!!!");
        }
    }
    void removeAllItem(){

        if(list.size() == 0){

            System.out.println("\nThe List is Already Empty!!!");

        }else{
            System.out.println("Before Removing : " + list);
            list.clear();
            System.out.println("After Removing : " + list);
        }
    }
}

class Main{
    public static void main(String[] args){

        new ToDoList();

    }
}