package org.acme;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class CollectionUtilsTest {

    @Test
    void testIsEmpty_WithNullCollection() {
        assertTrue(CollectionUtils.isEmpty(null));
    }

    @Test
    void testIsEmpty_WithEmptyCollection() {
        assertTrue(CollectionUtils.isEmpty(Collections.emptyList()));
    }

    @Test
    void testIsEmpty_WithNonEmptyCollection() {
        ArrayList<String> nonEmptyList = new ArrayList<>();
        nonEmptyList.add("elemento");
        assertFalse(CollectionUtils.isEmpty(nonEmptyList));
    }
}
