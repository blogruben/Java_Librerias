package org.ruben.java.testing;

import org.junit.Test;

public class TestsConLimiteDeTiempo {

    
    @Test(timeout = 1000)
    public void testPrintMessage() {	
       System.out.println("El test falla si se tarda mas de un segundo.");         
    }
 
}
