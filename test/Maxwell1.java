

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import maxwell.Maxwell;

public class Maxwell1 {
    
    public Maxwell1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test  
    public void testFindMax(){  
        assertEquals(11,Maxwell.findMax(new int[]{2,4,8,10,11}));  
        assertEquals(-2,Maxwell.findMax(new int[]{-9,-3,-2,-7,-5}));  
    }  
   
}
