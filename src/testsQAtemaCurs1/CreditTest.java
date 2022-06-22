package testsQAtemaCurs1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import temaClaseQAcurs1.Credit;

public class CreditTest {

    Credit c;

    @Before
    public void setup(){
         c = new Credit();
    }
    //

    @Test
    public void approveCredit_ShouldReturnDecline_Test(){
        String actualResult = c.approveCredit(400);
        Assert.assertEquals("Decline",actualResult);
    }
    @Test
    public void approveCredit_ShouldReturnMaybe_BoundryInferior_Test(){
        String actualResult = c.approveCredit(550);
        Assert.assertEquals("Maybe",actualResult);
    }
    @Test
    public void approveCredit_ShouldReturnMaybe_BoundrySuperior_Test(){
        String actualResult = c.approveCredit(675);
        Assert.assertEquals("Maybe",actualResult);
    }
    @Test
    public void approveCredit_ShouldReturnMaybe_NoBoundry_Test(){
        String actualResult = c.approveCredit(590);
        Assert.assertEquals("Maybe",actualResult);
    }
    @Test
    public void approveCredit_ShouldReturn_WeLookForward_Test(){
        String actualResult = c.approveCredit(790);
        Assert.assertEquals("We look forward to doing business with you!",actualResult);
    }

}
