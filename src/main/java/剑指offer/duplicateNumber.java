package 剑指offer;



/**
 * @Classname duplicateNumber
 * @Description TODO
 * @Date 2020/1/16 12:56
 * @Created by HeYu5
 */
public class duplicateNumber {
    public boolean duplicate(int[] array, int length, int[] duplication){
        Boolean flag = false;
        if (array == null){
            return false;
        }

        for (int i = 0; i < length; i ++){
            if (array[i] < 0 || array[i] > length - 1){
                return false;
            }
        }

        int[] hash = new int[length];
        for (int i = 0; i < length; i++){
            hash[array[i]] ++;
        }
        for(int i = 0; i < length; i++ ){
            if (hash[i] >1){
                duplication[0] = i;
                flag = true;
            }
        }
        return flag;
    }


}