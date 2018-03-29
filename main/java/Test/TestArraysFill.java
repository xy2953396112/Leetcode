package Test;

import java.util.Arrays;

public class TestArraysFill {

    public static void main(String[] args){


        int size=6;
        boolean[] a=new boolean[size];
        Arrays.fill(a, true);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 1, 5, false);
        System.out.println(Arrays.toString(a));
    }

}
