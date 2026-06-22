public class TrapRainWater {

    public static void trapRain(int num[] ) {

        int len=num.length;
        int totalWater=0;
        int rightBoundry=0;
        int leftBoundry=0;
        int level=0;

        for(int i=0;i<len;i++){

            leftBoundry=0
            
            for(int j=i+1;j<len;j++){


                if(num[i]<num[j] ){
                    rightBoundry=num[i];
                    leftBoundry=num[j];
                    level=
                    totalWater=totalWater+(level-num[j]);

                   


                }
                 
                
                
            }
        }
        System.out.println(totalWater);
        
    }

    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        trapRain(num);
    }
    
}
