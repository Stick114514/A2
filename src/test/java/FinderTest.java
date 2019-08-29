
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {

        @Test
        public void test_MaxArray() {
            Finder x = new Finder();
            int[] array1 = {81, 5, 9};
            int[] array2 = {1};
            int[] array3 = {8, 90, -10};

            assertEquals(new Integer(81), x.findMax(array1));
            assertEquals(new Integer(1), x.findMax(array2));
            assertEquals(new Integer(90), x.findMax(array3));
        }
        @Test
        public void test_MinArray() {
            Finder x = new Finder();
            int[] array1 = {-100, 0, 100};
            int[] array2 = {1};
            int[] array3 = {114, 514, 1919};

            assertEquals(new Integer(-100), x.findMin(array1));
            assertEquals(new Integer(1), x.findMin(array2));
            assertEquals(new Integer(114), x.findMin(array3));
        }
        @Test
        public void test_NullMaxArray() {
            Finder x = new Finder();
            assertNull(x.findMax(null));

            int[] emptyArray = {};
            assertNull(x.findMax(emptyArray));

        }
        @Test
        public void test_NullMinArray() {
            Finder x = new Finder();
            assertNull(x.findMin(null));

            int[] emptyArray = {};
            assertNull(x.findMin(emptyArray));
        }
}
