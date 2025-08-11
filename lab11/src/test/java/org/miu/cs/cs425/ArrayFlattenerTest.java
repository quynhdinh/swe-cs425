package org.miu.cs.cs425;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class ArrayFlattenerTest {

    @Test
    @DisplayName("Test flattening a normal nested list")
    void testFlattenNormalNestedList() {
        List<List<Object>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList(1, 3));
        nestedList.add(Arrays.asList(0));
        nestedList.add(Arrays.asList(4, 5, 9));
        List<Object> result = ArrayFlattener.flatten(nestedList);
        
        List<Object> expected = Arrays.asList(1, 3, 0, 4, 5, 9);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test flattening a null nested list")
    void testFlattenNullNestedList() {
        List<List<Object>> nestedList = null;

        List<Object> result = ArrayFlattener.flatten(nestedList);
        assertNull(result);
    }
}
