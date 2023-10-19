import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

class CompareTester {

    @Test 
    public void test1(){
        assertEquals(-1,Compare.compare("Lion","Wolf",2));
    }

    @Test
    public void test2(){
        assertEquals(1,Compare.compare("Lion","Wolf",2));
    }

    @Test
    public void test3(){
        assertEquals(0,Compare.compare("Lion","Wolf",2));
    }

    @Test
    void findMinimum() {
        String[] i = new String[]{
                "Lion", "Wolf", "Turtle"
        };
        assertEquals(Compare.findMinimum(i, 3), "Wolf");
    }

    // HW4 Bonus would no upload so I made a new directory for it.
}