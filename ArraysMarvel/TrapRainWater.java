public class TrapRainWater {

    public static int  trapRain(int num[] ) {

        int len=num.length;
        // left max

        int leftMax[]= new int[num.length];

        leftMax[0]=num[0];

        for(int i=1;i<num.length;i++){
            leftMax[i]=Math.max(num[i], leftMax[i-1]);
        }

        // right max

        int rightMax[]=new int[num.length];


        rightMax[num.length-1]=num[num.length-1];

        for(int i=len-2;i>=0;i--){
            rightMax[i]=Math.max(num[i], rightMax[i+1]);
        }




        // water level 
        int trapWater =0;


    for(int i=0;i<len;i++){

        int waterlevel=Math.min(leftMax[i],rightMax[i]);

        trapWater+=waterlevel-num[i];


    }

    return trapWater;
    
    }

    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,1};
       
        System.out.println( trapRain(num));
    }
    
}
