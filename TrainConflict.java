import java.util.*;

public class NoConfliction{
    int i=0;
    int[] arrival = {2,4,7,9,14,16,20,21};
    int[] departure = {5,6,11,13,17,18,22,24};
    public NoConfliction(int n){
        System.out.println("Selected trains where no conflict occured: ");
        System.out.print(i); //There wont be any conflict at train no 1
        for(int j=1; j<n; j++){
            if(arrival[j] >= departure[i]){
                System.out.print(", " + j);
                i=j;
            }
        }
    }
    
    public static void main(String[] args){
        NoConfliction obj = new NoConfliction(8);
    }
}
