package eu.filip.java;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    private String name;
    public App(String name){
        this.name=name;
    }
    public String GetName(){
        return this.name;
    }
    public int maxValue(int a, int b){
        return a > b ? a : b;
    }
    public int pindala(int c, int d){
        return c * d;
    }
    public int[] returnList(){
        int[] array = {1,2,3};
        return array;
    }

}
