package Test;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int id = 1;
        if(a[1] != a[2])
            a[id++] = a[1];

        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(id);




    }
}
