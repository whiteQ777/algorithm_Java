package com.sort;

/**
 * @Classname QuickSort
 * @Description TODO
 * @Date 2019/10/18 20:45
 * @Created by HeYu5
 */
public class QuickSort {

    public static void quickSort(int[] s, int l, int r){
        if (l < r){
            int i = l, j = r, x = s[l];
            while (i < j){
                while (i < j && s[j] >= x){           //从后向前找比x小的数
                    j--;
                }
                if(i < j)
                    {s[i++] = s[j];}         //先把s[j]放入s[i]中， 然后i++

                while (i < j && s[i] < x){                 //从前向后找比x大的数
                    i++;
                }
                if (i < j)  {
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            quickSort(s, l, i-1);   //递归调用
            quickSort(s, i+1, r);
        }


    }


    public static void main(String[] args) {
        int[] s = new int[]{72,6,57,88,60,42,83,73,48,85};
        quickSort(s, 0 , 9);
        for(int i = 0 ; i < s.length; i++){
            System.out.print(s[i] + " ");
        }

    }

}