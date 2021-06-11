/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josafat
 */
public class SqlproductosTest {
    
    public SqlproductosTest() {
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
     * Test of esnumero method, of class Sqlproductos.
     */
    Sqlproductos productos=new Sqlproductos();
    @Test
    public void testEsnumero() {
        System.out.println("esnumero");
        String cadena = "5";
        Sqlproductos instance = new Sqlproductos();
        boolean expResult = true;
        boolean result = instance.esnumero(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of agregarventa method, of class Sqlproductos.
     */
    @Test
    public void testAgregarventa() {
        System.out.println("agregarventa");
        productos pr=new productos();
        pr.setId("12345678");
        Sqlproductos instance = new Sqlproductos();
        String[] expResult = new String[5];
        expResult[0]="12345678";expResult[1]="Hierbamina";expResult[2]="140";expResult[3]="1";expResult[4]="140";
        String[] result = instance.agregarventa(pr);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscar method, of class Sqlproductos.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        productos mod =new productos();
        mod.setId("12345678");
        mod.setNombre("Hierbamina");
        Sqlproductos pro=new Sqlproductos();
       String[] s=new String[5];
        s = pro.buscar(mod);
        String[] datos= new String[5];
                datos[0]="12345678";//id
                datos[1]="Hierbamina";//nombre                
                datos[2]="Herbicida";//descrip
                datos[3]="140";//pventa  
                datos[4]="161";//total
        System.out.println("Esperado");
        for(int as=0;as<=4;as++){
            System.out.println(datos[as]);
        }
        System.out.println("Actual");
        for(int as=0;as<=4;as++){
            System.out.println(s[as]); 
        }
        
        Assert.assertArrayEquals(datos, s);
    }

    /**
     * Test of busca_productos method, of class Sqlproductos.
     */
    @Test
    public void testBusca_productos() {
        System.out.println("busca_productos");
        String id = "12345678";
        Sqlproductos instance = new Sqlproductos();
        String[] expResult = {"12345678","Hierbamina","120","140","161","20"};
        String[] result = instance.busca_productos(id);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of eliminarproducto method, of class Sqlproductos.
     */
    @Test
    public void testEliminarproducto() {
        System.out.println("eliminarproducto");
        String codigo = "2711";
        Sqlproductos instance = new Sqlproductos();
        boolean expResult = true;
        boolean result = instance.eliminarproducto(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of agregalmacen method, of class Sqlproductos.
     */
    @Test
    public void testAgregalmacen() {
        System.out.println("agregalmacen");
        String codigo = "14";
        Sqlproductos instance = new Sqlproductos();
        boolean expResult = true;
        boolean result = instance.agregalmacen(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

      
    /**
     * Test of repetido method, of class Sqlproductos.
     */
    @Test
    public void testRepetido() {
        System.out.println("repetido");
        String c = "15";
        Sqlproductos instance = new Sqlproductos();
        boolean expResult = true;
        boolean result = instance.repetido(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
