package org.miu.cs.cs425;

import java.util.*;

public class ArrayFlattener {
    public static List<Object> flatten(List<List<Object>> nestedList) {
        if (nestedList == null)
            return null;
        List<Object> flatList = new ArrayList<>();
        for (List<Object> innerList : nestedList) {
            flatList.addAll(innerList);
        }
        return flatList;
    }
}
