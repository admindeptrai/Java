/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getstudentId method, of class Student.
     */
    @Test
    public void testGetstudentId() {
        System.out.println("getstudentId");
        Student instance = null;
        String expResult = "";
        String result = instance.getstudentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthDate method, of class Student.
     */
    @Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        Student instance = null;
        String expResult = "";
        String result = instance.getBirthDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Student.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Student instance = null;
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMajor method, of class Student.
     */
    @Test
    public void testGetMajor() {
        System.out.println("getMajor");
        Student instance = null;
        String expResult = "";
        String result = instance.getMajor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGpa method, of class Student.
     */
    @Test
    public void testGetGpa() {
        System.out.println("getGpa");
        Student instance = null;
        double expResult = 0.0;
        double result = instance.getGpa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printAllAttributes method, of class Student.
     */
    @Test
    public void testPrintAllAttributes() {
        System.out.println("printAllAttributes");
        Student instance = null;
        instance.printAllAttributes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Student.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] arg = null;
        Student.main(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
