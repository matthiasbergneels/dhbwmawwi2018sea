package uebungen.kapitel8.tests;

import org.junit.Assert;
import org.junit.Test;
import uebungen.kapitel8.FalscheParameter;

import static org.junit.Assert.*;

public class FalscheParameterTest {


    @Test
    public void createFalscheParameterException(){
        FalscheParameter e = new FalscheParameter(true, "lila");

        Assert.assertEquals("Die Parameterkombination Ledersitze true und Farbe lila ist ungültig!", e.getMessage());
    }
}