package uebungen.kapitel8.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import uebungen.kapitel8.AutoSitz;
import uebungen.kapitel8.FalscheParameter;


public class AutoSitzTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createSeatSuccesfull() throws FalscheParameter {

        AutoSitz mySeat = new AutoSitz(false, "lila");


        Assert.assertNotNull(mySeat);
        Assert.assertEquals("lila", mySeat.getFarbe());
        Assert.assertEquals(false, mySeat.isLedersitz());
    }

    @Test
    public void tryToCreateSeatWithInvalidParameters(){

        AutoSitz mySeat = null;

        try {
            mySeat = new AutoSitz(true, "lila");

            Assert.fail("Sitz hätte nicht erstellt werden dürfen!");
        }catch(FalscheParameter e){
            //Assert.assertNotNull(e);
            Assert.assertEquals("Die Parameterkombination Ledersitze true und Farbe lila ist ungültig!", e.getMessage());
        }

        //Assert.assertNull(mySeat);

    }


    @Test (expected = FalscheParameter.class)
    public void tryToCreateSeatWithInvalidParameters2() throws FalscheParameter {

        AutoSitz mySeat = new AutoSitz(true, "lila");

    }

    @After
    public void tearDown() throws Exception {
    }
}