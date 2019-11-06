import java.util.ArrayList;
import java.lang.*;
import java.util.Collection;
import java.util.*;

public class TestList {
    private static Object TestList;

    public static void main(String[] args) {
       TestList B =new TestList();
        /*for(String m : tree){
            System.out.println(m);

        } */
       /* List<String> a = new ArrayList<>();
        a.add("i");
        a.add("l");
        a.add("o");
        a.add("v");
        a.add("e");
        a.add("y");
        a.add("o");
        a.add("u");
        a.remove(3);
        for(String b:a){
            System.out.println(b);
        }*/
      Set<String> tree = new HashSet<>();
       tree.add("A");
       tree.add("g");
       tree.add("C");
       tree.add("c");
       tree.add("a");

         int i = (int) (Math.random() * tree.size());
       // System.out.println(i);

       try{
           Iterator<String> it =tree.iterator();
        while(it.hasNext()) {
            String tst = (String) it.next();
            System.out.println(it.next());
        }


        }catch(Exception e){
           e.printStackTrace();

        }

        }











   /* void show(){
      /*  int i = 1 ;
        for(;i<=100;i++){
            System.out.println(i);
      int [] A = new int[100];
      for(int i = 1;i<A.length;i++){
          System.out.println(i);*/




 }









