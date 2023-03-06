package gross_calculator;


import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        Set mySet = new HashSet();
        List<String> newList = new ArrayList<>();

//        can store any data type

//       unordered set with no duplicated
        mySet.add("Hello");
        mySet.add("My");
        mySet.add("Name");
        mySet.add("Is");
        mySet.add("Tania");

        //Enhanced for loop
        for(String name: newList) {
            System.out.println(name);
        }

        //creating an iterator(Method provided by Collection interface)
        var i = mySet.iterator();
//        while(i.hasNext())
//        {
//
////                System.out.println(i.next());
//
//        }


//        ordered list and can be duplicated
        newList.add("My");
        newList.add("Name");
        newList.add("Is");
        newList.add("Tania");


//        System.out.println(mySet);
//        System.out.println(newList);


        //Maps
        //HashMap, treeMap
        Map newMap = new HashMap();
        newMap.put(1, "apple");
        newMap.put(2, "apple");
        newMap.put(3, "apple");
        newMap.put(4, "apple");

//        System.out.println(newMap);

        Map newMap1 = Map.of("Apple", 1, "Bannana",2);
//        System.out.println(newMap1);

        newMap1.forEach((k, v) -> System.out.println(k + ":" + v));

        var maptToSet = newMap1.entrySet().iterator();
//        while(maptToSet.hasNext()){
//            Map.Entry entry = (Map.Entry) maptToSet.next();
////            System.out.println(entry);
////            System.out.println(entry.getKey());
////            System.out.println(entry.getValue());
//        }

    }
}
