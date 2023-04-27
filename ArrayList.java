import java.util.*;

class Main{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        //add method
                a.add(10);
                a.add(110);
                a.add(120);

        //get method
        System.out.println(a.get(1));

//        //clear method clears all the element present in arraylist
//        a.clear();
//        System.out.println(a);

        //adding element in between
        a.add(1,300);
        System.out.println(a);

        //set method use to set(update) the element at given position
        a.set(2,202);
        System.out.println(a);

        //remove element use to delete element
        a.remove(2);

        //to get the size of arraylist
        System.out.println(a.size());


        //to sort the arraylist we can use  collections
        Collections.sort(a);
    }
}
