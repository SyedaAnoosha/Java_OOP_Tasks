package lab_3_tasks;//Diamond Pattern

public class DiamondPattern {
    public static void main(String[] args) {

        //First method
        for(int i=1;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");}
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3;i>=1;i--){
            for(int j=4;j>=i;j--){
                System.out.print(" ");}
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Second method
        int count=1;
        for (int i=1;i<=6-1;i++){
            for (int j=count;j<=3;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=count*2-1;k++){
                System.out.print("* ");
            }
            if(i<3){
                count++;
            }
            else{
                count--;
            }
            System.out.println("");
        }
    }
}
