import java.util.ArrayList;
import java.util.List;

public  class Kata {

    public static List<Object> filterList(final List<Object> list) {

        // Return the List with the Strings filtered out
        if(list.size()==0){
            return list;
        }

        Object listItem=list.remove(list.size()-1);
        if(listItem instanceof String){
            Kata.filterList(list);
            return list;
        }
        else{
            Kata.filterList(list);
            list.add(listItem);
            return list;

        }

    }
    public static void main(String arg[]){
        List<Object>lst=List.of("a","b",1,2,3,"123");

        System.out.println(lst.stream().filter(x->!(x instanceof String)).toList());
    }
}


