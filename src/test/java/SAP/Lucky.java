package SAP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Classname Lucky
 * @Description TODO
 * @Date 2019/11/5 19:37
 * @Created by HeYu5
 */


/*5
9 8 3 5 7*/
public class Lucky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] sq = new int[n];
        int result = 0;
//        int[] sq = {9, 8, 3, 5, 7}; // 输入存到这里
        for (int i = 0; i < n ; i ++){
            sq[i] = input.nextInt();
        }
        int[][] max = new int[sq.length][sq.length];
        int[][] secMax = new int[sq.length][sq.length];

        for (int i = 0; i < sq.length; i++) {
            int maxTmp = 0;
            for (int j = i; j < sq.length; j++) {
                if (sq[j] > maxTmp) {
                    maxTmp = sq[j];
                }
                max[i][j] = maxTmp;
            }
        }

        for (int i = 0; i < sq.length; i++) {
            int secMaxTmp = 0;
            for (int j = i; j < sq.length; j++) {
                if (sq[j] < max[i][j] && sq[j] > secMaxTmp) {
                    secMaxTmp = sq[j];
                }
                secMax[i][j] = secMaxTmp;
            }
            secMax[i][i] = max[i][i];
        }

        for (int i = 0; i < sq.length; i++) {
            for (int j = 0; j < sq.length; j++) {
//                System.out.print(max[i][j]);
            }
//            System.out.println();
        }

//        System.out.println();

        for (int i = 0; i < sq.length; i++) {
            for (int j = 0; j < sq.length; j++) {
//                System.out.print(secMax[i][j]);
            }
//            System.out.println();
        }


        for (int i = 0; i < sq.length; i++) {
            for (int j = i; j < sq.length; j++) {
                if ((max[i][j] ^ secMax[i][j]) > result) {
                    result = max[i][j] ^ secMax[i][j];
                }
            }
        }

        System.out.println(result);
    }
}