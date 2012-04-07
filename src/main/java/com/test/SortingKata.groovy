package com.test

/**
 * Created by IntelliJ IDEA.
 * User: adriennekelly
 * Date: 04/04/2012
 * Time: 12:53
 * To change this template use File | Settings | File Templates.
 */
class SortingKata {


    def mergeAndSort(def arr1, def arr2) {

//        def arr1 = [1, 2, 3, 4, 5]
//        def arr2 = [2,3,4,5,6]

      def result = arr1 + arr2

      for (i in 0..< result.size()) {
          if (!ordered(result[i], result[i+1])) {
              swap(result, i, i + 1)
          }
      }

      result
    }

    def ordered(first, second) {
        first <= second;
    }

    def swap(result, first_index, second_index) {
        def first = result.get(first_index)
        def second = result.get(second_index)
        result.add(first_index, second)
        result.add(second_index, first)
    }


}
