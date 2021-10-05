package Test;


import java.util.Arrays;
import java.util.Scanner;

public class zombie22 {


        public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
            System.out.println("enter citys number");

            int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

            int days = 0;
            System.out.println("Day "+days +" " + Arrays.toString(inhabitants));
            do {int zeroCounter=0;
                for (int j = 0; j < inhabitants.length; j++) {
                    if(inhabitants[j]==0) {
                        zeroCounter++;
                        if(j==0){
                            inhabitants[j+1]=inhabitants[j+1]/2;
                        } else if(j>0&&j<inhabitants.length-1){
                            inhabitants[j - 1] = inhabitants[j - 1] / 2;
                            inhabitants[j + 1] = inhabitants[j + 1] / 2;
                        }else if(j==inhabitants.length-1){
                            inhabitants[j-1]=inhabitants[j-1]/2;
                        }
                    }
                }
                if(zeroCounter== inhabitants.length){
                    break;
                }
                days++;
                System.out.println("Day "+days+" " +Arrays.toString(inhabitants));

            } while(true);
            System.out.println("---- EXTINCT ----");

        }
    }



















