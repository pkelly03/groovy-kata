//
// Generated from archetype; please customize.
//

package com.kata

/**
 * Example Groovy class.
 */
class Example
{
    def show() {
        println 'Hello World'
    }

    boolean isStringUnique(String value) {
        def characters = value.toCharArray();
        def charMap = [:];
        for (Character character : characters) {
            if(charMap.containsKey(character)) {
               return false;
            }

            charMap.put(character, 1);
        }
        return true;
    }

    String removeDupChars(String value) {
        def noDuplicateList = []

        for (int i=0;i<value.length();i++) {
            if (!noDuplicateList.contains(value.charAt(i))) {
                noDuplicateList.add(value.charAt(i))
            }

        }
        def result = ''

        noDuplicateList.each {result+=it}

        return result
    }
}
