package org.miu.cs.cs425;

import java.util.List;

public class ArrayFlattenerServiceImpl implements ArrayFlattenerService {
    @Override
    public List<Object> flatten(List<List<Object>> nestedList) {
        return ArrayFlattener.flatten(nestedList);
    }
}
