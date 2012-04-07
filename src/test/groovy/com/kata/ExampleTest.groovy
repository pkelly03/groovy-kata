//
// Generated from archetype; please customize.
//

package com.kata

/**
 * Tests for the {@link Example} class.
 */
class ExampleTest
    extends GroovyTestCase {


    public void testShouldDetermineIfStringHasAllUniqueCharacters() {
        def example = new Example()
        assertEquals(example.isStringUnique("abcd"), true);
    }

    public void testShouldReturnFailsIfStringDoesntHaveUniqueCharacters() {
        def example = new Example();
        assertFalse(example.isStringUnique("aab"));
    }

    public void testShouldRemoveDuplicateCharsFromString() {
        def example = new Example();
        assertEquals(example.removeDupChars("aabb"), "ab");
    }

    public void testRemoveDuplicateCharsFromString() {
        def example = new Example();
        assertNotSame(example.removeDupChars("aabba"), "aba");
    }
}