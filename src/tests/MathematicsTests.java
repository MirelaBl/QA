package tests;

import classes.Mathematics;
import org.junit.*;

public class MathematicsTests {
    // declar obiectul global;
    Mathematics m ;

    //adnotare pentru executie met inainte fiecarui test/metoda
    @Before
    public void setup(){
        m = new Mathematics();
    }



    @Test
    @Ignore("Because I can")
    public void addNumbers_WhenAdd1Add2_ShouldReturn3_Test(){

        // Arrange
        // declare an object

        // Act
        int actualResult = Mathematics.addNumbers(1, 2);
        int expectedResult = 3;

        // Assert
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void findMax_WhenFirstArgumentIsGrater_ShouldReturnFirstArgument_Test(){

        // Arrange

        // Act
        int actualResult = m.findMax(2,1);
        // Assert
        Assert.assertEquals(2,actualResult);
    }

    @Test
    public void findMax_WhenSecondArgumentIsGrater_ShouldReturnSecondArgument_Test(){

        // Arrange

        // Act
        int actualResult = m.findMax(1,2);
        // Assert
        Assert.assertEquals(2,actualResult);
    }

    @Test
    public void findMax_WhenArgumentsAreEqual_ShouldReturnFirstArgument_Test(){

        // Arrange

        // Act
        int actualResult = m.findMax(2,2);
        // Assert
        Assert.assertEquals(2,actualResult);
    }

    @Test
    public void average(){
        Mathematics n = new Mathematics();

        double actualResult = n.average(1,2,3,4);

        Assert.assertEquals(2.5,actualResult,0);
    }

    @Test

    public void isEven_WhenArgumentsIs2_ShouldReturnTrue_Test(){
        boolean actualResult = m.isEven(2);
        Assert.assertTrue(m.isEven(2));
    }

    @Test
    public void isEven_WhenArgumentsIs3_ShouldReturnFalse_Test(){
        boolean actualResult = m.isEven(3);
        Assert.assertFalse(m.isEven(3));
    }

}
