package testsQAtemaCurs1;

import org.junit.Assert;
import org.junit.Test;
import temaClaseQAcurs1.Clase;

import java.util.Scanner;

import static temaClaseQAcurs1.Clase.*;

public class TestClase {
    //1

    @Test
    public void sayHelloReturnHelloTest() {
        String actualResult = sayHello();
        String expectedResult="Hello, World!";
        Assert.assertEquals(expectedResult,actualResult);
    }

    //2
    @Test
    public void findMaxTest() {
        double actualResult = findMax(6.7);
        double expectedResult=6.7;
        double delta = 0.0;
        Assert.assertEquals(expectedResult,actualResult,delta);
    }
    //3
    @Test
    public void makeCubeTest() {
        long actualResult = makeCube(2);
        long expectedResult=2L;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //4.

    //public static void main(String[] args) {
    //reverseWord("ana");}

    @Test
    public void reverseWordTest() {

        String actualResult = reverseWord("124");
        String expectedResult= "421";

        Assert.assertEquals(expectedResult,actualResult);
    }





}
