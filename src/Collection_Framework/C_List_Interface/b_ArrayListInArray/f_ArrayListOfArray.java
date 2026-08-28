package Collection_Framework.C_List_Interface.b_ArrayListInArray;

import java.util.*;

public class f_ArrayListOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        ArrayList<int[]> list= ArrayListOfArray(arr);
        System.out.println(list);
    }
    public static ArrayList<int[]> ArrayListOfArray(int[][] arr){
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] ans:arr){
            list.add(ans);
        }
        return list;
    }
}
