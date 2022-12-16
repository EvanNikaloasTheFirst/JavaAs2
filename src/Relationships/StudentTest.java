package Relationships;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

//    run
//    run with coverage for testing

//    Implication that what ever follows after '@Test' is a test case
//    All test methods are void
    @Test
    public void testStudent(){
        Student s = new Student();
        assertTrue(s.getAge() == 1);
    }

    @Test
    public void testStudentStringStringInt(){
        Student mys = new Student("Evangelos", "Empochon", 21);
        assertEquals(mys.getFirstname(),"Evangelos");
        mys.setFirstname("john");
        assertEquals(mys.getFirstname(),"Evangelos");
    }

    @Test
    public void testAddAccount(){

    }

    @Test
    public void testSetSurname(){
//        already tested in  public void testStudentStringStringInt
    }

    @Test
    public void testSetFirstname(){
//        already tested in  public void testStudentStringStringInt
    }



}
