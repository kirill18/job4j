package ru.job4j.arrayduplicate;


import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;


public class ArrayDuplicateTest {



        @Test
        public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
            ArrayDuplicate array = new ArrayDuplicate();
       String[] input = {"Lis", "Lis", "Olg", "Olg", "Dmit", "Dmit", "Ant", "Alex"};
       String[] expect = {"Lis", "Olg", "Dmit", "Ant", "Alex"};
       String[] result = array.removeDuplicates(input);
            assertThat(result, arrayContainingInAnyOrder(expect));
        }
    }

