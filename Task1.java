import java.util.*;

public class ActivitySelection {

    int i = 0;
    int[] start = {1 ,2,4,1,5,8,9,11,13};
    int[] end = {3,5,7,8,9,10,11,14,16};

    public ActivitySelection(int n){

        System.out.println("Following activities are selected ");
        System.out.print(i);
        for(int j=1; j<n; j++){
            if(start[j]>=end[i]){
                System.out.print(", " + j);
                i = j;
            }
        }
    }

    public static void main(String[] args){

        ActivitySelection obj1 = new ActivitySelection(9);
    }
}
