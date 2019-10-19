package review;

/**
 * @Classname review001
 * @Description TODO
 * @Date 2019/10/19 20:14
 * @Created by HeYu5
 */
public class review001 {
    public static void quickSort(int[] s, int l, int r){
        if(l < r){
            int i = l, j = r, x = s[l];
            while (i < j){
                while ( i < j && s[j] >= x ){
                    j--;
                }
                if(i <j ){
                    s[i++] = s[j];
                }

                while(i < j && s[i] < x){
                    i++;
                }
                if (i < j){
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            quickSort(s, l, i-1);
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