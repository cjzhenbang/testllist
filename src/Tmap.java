import java.util.*;

import java.lang.*;


public class Tmap<E> {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("125","cj");
        map.put("126","wxy");
      //
        Emp a = new Emp("124","hhw");
        Emp c = new Emp("127","hht");
        Emp v = new Emp("129","hhl");
        Emp d = new Emp("121","hhj");

        map.put(a.getId(),a.getName());
        map.put(c.getId(),c.getName());
        map.put(v.getId(),v.getName());
        map.put(d.getId(),d.getName());
        Set<String> set = map.keySet();
        map.remove(3);
       Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String str =(String)it.next();
            String na = (String)map.get(str);
            System.out.println(str+"   "+na);

        }
     /* for(int j = 0;j<map.size();j++){
          System.out.println(map.get(j));
      }*/
    }





    }

 class Emp{
    private String id ;
   private String name;

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Emp(String id, String name){
        this.id = id;
        this.name = name;

    }

}