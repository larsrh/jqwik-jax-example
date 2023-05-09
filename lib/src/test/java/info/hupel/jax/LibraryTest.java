package info.hupel.jax;

import net.jqwik.api.*;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Property void testSorted(@ForAll int[] array) {
        int[] sorted = Library.sort(array);
        assertTrue(Library.isSorted(sorted));
    }

}
