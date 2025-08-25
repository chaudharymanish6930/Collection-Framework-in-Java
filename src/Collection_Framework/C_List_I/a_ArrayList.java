package Collection_Framework.C_List_I;

import java.util.ArrayList;

public class a_ArrayList {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Red");
        al.addFirst("Yellow");
        al.add(2,"green");
        System.out.println(al);
    }
}
