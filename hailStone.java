import java.util.*;
public class hailStone{

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        hailStoneAlg(number);
    


    }



    public static void hailStoneAlg(int num){
        System.out.print(num + " ");
        if (num==1){

        }else if(num%2 ==0){
            hailStoneAlg(num/2);
        }else{
            hailStoneAlg((num*3)+1);
        }

    }


    

}