package Collection_Framework.C_List_Interface.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class c_NestedPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while(true){
            ArrayList<Integer> row = new ArrayList<>();

            System.out.println("how many elements in a row? :");
            int n = sc.nextInt();

            System.out.println("Enter "+n+" elements:");
            for(int i=0;i<n;i++){
                row.add(sc.nextInt());
            }
            list.add(row);
            System.out.println("Add another row? (yes/no): ");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("no")){
                break;
            }
        }
        System.out.println(list);
    }
}
