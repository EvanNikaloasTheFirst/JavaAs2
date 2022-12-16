package Relationships;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {

    @Test
    public void testCar()
    {
        Car Ferrari = new Car("Ferrari",5,4.8);
        assertEquals(Ferrari.getModel(),"Ferrari");
    }

    @Test
    public void testSetModel(){
        Car c = new Car("Ferrari",5,5);
        c.setModel("Lambo");
        assertEquals(c.getModel(), "Lambo");
        assertEquals(c.getManfMPG(), 5,0.001);
    }

    @Test
    public void testGetModel(){

    }

    @Test
    public void testSetTankSize(){
//      Has already been tested in testCar()
    }

    @Test
    public void testGetTankSize(){
//      Has already been tested in testCar()
    }



    @Test
    public void testEstimateDistance(){
        Car Ferrari = new Car("Ferrari",50,4.8);
        assertEquals(Ferrari.estimateDistance(),52.8, 2.5);


    }

}
