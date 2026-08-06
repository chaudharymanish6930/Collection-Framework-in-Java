package Collection_Framework.C_List_Interface.a_ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class a_InputFromUserArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
