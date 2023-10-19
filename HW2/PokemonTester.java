/**
 * @author Jumana Suleiman 
 * A tester for the Pokemon.java Class
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PokemonTester{
    Pokemon pikachu  =  new Pokemon("pikachu", 100, 67);
    Pokemon mewtwo = new Pokemon("mewtwo", 100, 89);

    @Before
    public void BeforeEach(){
        assertFalse(pikachu.isDead());
    }
    @Test
    public void Test(){
        assertTrue(pikachu.getName().equals("pikachu"));
        assertTrue(pikachu.getAttackPower()== 67);
        assertFalse(pikachu.isDead());
        pikachu.takeDamage(12, mewtwo);
        assertEquals(pikachu.getHealth(), 88);
        pikachu.attack(mewtwo);
        assertNotEquals(mewtwo.getHealth(), 100);
    }
}