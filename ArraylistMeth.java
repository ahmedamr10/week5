import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class ArraylistMeth {



    public static int max( ArrayList<Integer> list){
        int x = list.size();
        int z=0;
        for (int i=0;i<=x-1;i++){
            if (z <= list.get(i))
               z=list.get(i);

        }
        return z;
    }
    public static void sort(ArrayList<Integer> list){
        int i =0;
        int min = list.get(i);
        for ( i = 0; i <= list.size();i++ ){


            for (int j = i + 1 ; j <=list.size() ; j++){
                if (min > list.get(j)) {
                    list.set(j,min);
                    list.set(i,list.get(j));
                    min = list.get(j);
                }

            }
        }




    }



}
