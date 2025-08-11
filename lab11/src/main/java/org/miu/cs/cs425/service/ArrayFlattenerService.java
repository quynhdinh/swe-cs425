package org.miu.cs.cs425.service;

import java.util.List;

import org.miu.cs.cs425.ArrayFlattener;

public class ArrayFlattenerService {
    public List<Object> flatten(List<List<Object>> nestedList) {
        return ArrayFlattener.flatten(nestedList);
    }
}
