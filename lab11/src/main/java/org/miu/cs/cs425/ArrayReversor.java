package org.miu.cs.cs425;
import java.util.*;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;
    
    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }
    
    List<Object> reverse(List<Object> list) {
        if (list == null) {
            return null;
        }
        List<Object> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
    
    List<Object> reverseFlattened(List<List<Object>> nestedList) {
        if (nestedList == null) {
            return null;
        }
        List<Object> flattenedList = arrayFlattenerService.flatten(nestedList);
        return reverse(flattenedList);
    }
}
