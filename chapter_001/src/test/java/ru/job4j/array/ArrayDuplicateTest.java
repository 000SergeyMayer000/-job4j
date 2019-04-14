package ru.job4j.array;

import org.junit.Test;


import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Liza", "Olga", "Liza", "Sveta", "Valeria"};
        String[] except = {"Liza", "Olga", "Sveta", "Valeria"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
    @Test
    public void WhenThereAreDuplicatesInArray() {
        String[] input = {"7", "8", "1", "2", "7"};
        String[] except = {"7", "8", "1", "2"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}