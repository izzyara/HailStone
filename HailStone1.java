
public class HailStone1{

    public static void main (String[]args){


        for(int x=1; x<=200; x++){
            hailStoneAlg(x);
        }
    
    
        }


    public static void hailStoneAlg(int num){
        System.out.print(num + " ");
        if (num==1){
            System.out.print("\n");
        }else if(num%2 ==0){
            hailStoneAlg(num/2);
        }else{
            hailStoneAlg((num*3)+1);
        }

    }



    

}