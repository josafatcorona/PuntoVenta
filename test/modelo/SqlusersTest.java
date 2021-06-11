
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josafat
 */
public class SqlusersTest {
    
    public SqlusersTest() {
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

    /**
     * Test of registrar method, of class Sqlusers.
     */
    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        users mod = new  users();
         mod.setUser("jcc1996");
         mod.setA_nac("1996");
         mod.setAp_m("Cervantes");
         mod.setAp_p("Corona");
         mod.setPass("dajoc00");
         mod.setNombre("Josafat");
        Sqlusers instance = new Sqlusers();
        boolean expResult = false;
        boolean result = instance.registrar(mod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of acceder method, of class Sqlusers.
     */
    @Test
    //Esta prueba es la que indica si el usuario existe para poder iniciar sesión
    public void testAcceder() {
        System.out.println("acceder");
        users usr = new users();
        Sqlusers instance = new Sqlusers();
        boolean expResult = true;
        usr.setUser("dcc1996");
        usr.setPass("dajoc96");
        boolean result = instance.acceder(usr);
        assertEquals(expResult, result);      
    }

 
    /**
     * Test of repetido method, of class Sqlusers.
     */
    @Test
    public void testRepetido() {
        System.out.println("repetido");
        users usr = new users();
        Sqlusers instance = new Sqlusers();
        boolean expResult = true;
        usr.setUser("dcc1996");
        boolean result = instance.repetido(usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
