package Relationships;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBankAppRun {

    @Test
    public void bankAccount() {
        BankingDetails B = new BankingDetails(100,"Barclays",1010101);
    }

    @Test
    public void testSetBankName(){
        BankingDetails B = new BankingDetails(100,"Barclays",1010101);
        B.setBank("Lloyds");
        assertEquals(B.getBank(), "Lloyds");
    }

    @Test
    public void testGetBankName(){
        BankingDetails B = new BankingDetails(100,"Barclays",1010101);
        assertEquals(B.getBank(), "Barclays");
    }

    @Test
    public void testGetBalance(){
        BankingDetails B = new BankingDetails(100,"Barclays",1010101);
        assertEquals(B.getBalance(), 100,0);

    }
    @Test
    public void testSetBalance(){
//        Has already been tested in testGetBalance

    }

}
