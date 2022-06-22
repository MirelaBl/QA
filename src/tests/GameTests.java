package tests;

import classes.Game;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTests {

    Game game;

    @Before
    public void setup(){
        game = new Game();

    }

    @Test
    public void playFizzBuzzWhenArgumentIs6ShouldReturnFizzTest(){

        String actualResult = game.playFizzBuzz(6);

        Assert.assertEquals( "Fizz",actualResult);
    }
    @Test
    public void playFizzBuzzWhenArgumentIs10ShouldReturnBuzzTest(){

        String actualResult = game.playFizzBuzz(10);

        Assert.assertEquals( "Buzz",actualResult);
    }

    @Test
    public void playFizzBuzzWhenArgumentIs15ShouldReturnFizzBuzzTest(){

        String actualResult = game.playFizzBuzz(15);

        Assert.assertEquals( "FizzBuzz",actualResult);
    }
    @Test
    public void playFizzBuzzWhenArgumentIs2ShouldReturnStringOf2Test(){

        String actualResult = game.playFizzBuzz(2);

        Assert.assertEquals( "2",actualResult);
    }




}
