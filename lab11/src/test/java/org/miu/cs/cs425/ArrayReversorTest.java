package org.miu.cs.cs425;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.util.*;

@ExtendWith(MockitoExtension.class)
class ArrayReversorTest {

    @Mock
    private ArrayFlattenerService mockArrayFlattenerService;

    @InjectMocks
    private ArrayReversor arrayReversor;

    @Test
    @DisplayName("Test reverse method with normal list")
    void testReverse() {
        List<List<Object>> nestedList = Arrays.asList(
            Arrays.asList(1, 3),
            Arrays.asList(0),
            Arrays.asList(4, 5, 9)
        );
        
        // Mock the flatten behavior to return the expected flattened list
        List<Object> flattenedList = Arrays.asList(1, 3, 0, 4, 5, 9);
        when(mockArrayFlattenerService.flatten(nestedList)).thenReturn(flattenedList);
        
        List<Object> result = arrayReversor.reverseFlattened(nestedList);
        
        List<Object> expected = Arrays.asList(9, 5, 4, 0, 3, 1);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test reverse method with null input")
    void testReverseWithNull() {
        // Act
        List<Object> result = arrayReversor.reverseFlattened(null);
        
        // Assert
        assertNull(result);
    }
}
