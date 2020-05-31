package collectionsPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Obj implements Comparator<Obj>, Comparable<Obj> {
    public int value;
    public Obj(int v) {
        this.value = v;
    }

    @Override
    public int compare(Obj o1, Obj o2) {
        return o1.value - o2.value;
    }

    @Override
    public int compareTo(Obj o) {
        return this.value - o.value;
    }
}

public class Basic {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(4, "ssss");
        map.put(1, "s");
        map.put(5, "sssss");
        map.put(2, "ss");

        /*
        // Print all key/value pair
        for(Map.Entry<Integer, String > e:  map.entrySet()) {
            System.out.printf("key: %d, value: %s\n",e.getKey(), e.getValue());
        }
        //// Better way
        map.forEach((k, v) -> System.out.printf("key: %d, value: %s\n", k, v));

        ///Empty the map: map.clear();
        */

        // Shallow copy of map
        //// Map constructor()
        // HashMap<Integer, String> shallowCopy = new HashMap<>(map);

        //// map.clone()
        // HashMap<Integer, String> shallowCopy2 = map.clone();?? didn't work

        //// map.put with lambda expression
        // map.forEach((k, v) -> shallowCopy.put(k, v));

        //// map.putAll()
        // shallowCopy.putAll(map);

        // Deep copy
        //// Now, Java doesn't have any built-in deep copy implementations. So to make a deep copy, either we can
        //// override the clone() method or use a serialization-deserialization technique.

        /*
        // get set view of the mappings contained in a map??
        // get a set view of the keys contained in this map??
        Set keyset = map.keySet();
        Set entrySet = map.entrySet();
        */
    }

    public static void printObj(Obj o) {
        System.out.print(o.value + " ");
    }
}
        /////////////////////////////////////////
        ////////////////ArrayList///////////////
        ////////////////////////////////////////
        /*
        List<String> l = new ArrayList<>();
        String[] a = new String[]{"green", "blue", "red", "yellow"};
        l = Arrays.asList(a);
        */
        /*
        // sort
        Collections.sort(l);
        System.out.println();
        for (String str : l) System.out.print(str + " ");
        */

        /*
        // deep copy list1 to list2
        ArrayList<String> l_clone = new ArrayList<>(l);
        l.set(0, "new");
        System.out.println();
        for (String str : l) System.out.print(str + " ");

        System.out.println();
        for (String str : l_clone) System.out.print(str + " ");

        Obj o1 = new Obj(1);
        Obj o2 = new Obj(6);
        Obj o3 = new Obj(2);
        Obj o4 = new Obj(9);
        List<Obj> oL = new ArrayList<>();
        Obj[] o_arr = new Obj[]{o1, o2, o3, o4};
        oL = Arrays.asList(o_arr);
        System.out.println();
        for (Obj o : oL) printObj(o);
        ArrayList<Obj> o_clone = new ArrayList<>(oL);
        o_clone.set(0, new Obj(111));
        System.out.println();
        for (Obj o : o_clone) printObj(o);
        System.out.println();
        for (Obj o : oL) printObj(o);
        */

        // Collections object custom sort
        /*
        Obj o1 = new Obj(1);
        Obj o2 = new Obj(6);
        Obj o3 = new Obj(2);
        Obj o4 = new Obj(9);
        List<Obj> oL = new ArrayList<>();
        Obj[] o_arr = new Obj[]{o1, o2, o3, o4};
        oL = Arrays.asList(o_arr);
        ////// lambda expression custom sort

        Collections.sort(oL, (oo, ooo) -> oo.value - ooo.value);
        Collections.sort(oL, (oo, ooo) -> oo.compareTo(ooo));
        System.out.println();
        for (Obj o : oL) printObj(o);
        */

        ///// comparator sort
        /*
        Collections.sort(oL, new Comparator<Obj>() {
            @Override
            public int compare(Obj o1, Obj o2) {
                return o1.value - o2.value;
            }
        });
        System.out.println();
        */

        // Join two lists with Stream.concat()
        /*
        Obj o5 = new Obj(888);
        List<Obj> oLL = new ArrayList<>();
        oLL.add(o5);
        List<Obj> oAll = Stream.concat(oL.stream(), oLL.stream()).collect(Collectors.toList());
        */
