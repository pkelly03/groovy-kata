package com.test

import org.junit.Test
import static org.hamcrest.CoreMatchers.equalTo
import static org.hamcrest.MatcherAssert.assertThat

class SortingTest {

    @Test
    public void testShouldMergeAndSortArrays() {
        def arr1 = [1, 2, 3, 4, 5]
        def arr2 = [2,3,4,5,6]

        SortingKata sorter = new SortingKata();
         assertThat(sorter.mergeAndSort(arr1, arr2), equalTo([1,2,2,3,3,4,4,5,5,6]))
       // assert sorter.mergeAndSort(arr1, arr2) == [1, 2, 2,3, 3, 4, 4, 5, 5, 6]
    }

}
