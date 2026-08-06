package Collection_Framework.C_List_Interface.ArrayLists;
import java.util.*;
public class b_InputInNestedArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            System.out.println("Enter elements of row " + (i + 1));

            for (int j = 0; j < cols; j++) {
                row.add(sc.nextInt());
            }

            list.add(row);   // Add the completed row
        }

        System.out.println(list);
    }
}
