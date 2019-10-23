package 剑指offer;

/**
 * @Classname T003
 * @Description TODO
 * @Date 2019/10/23 21:16
 * @Created by HeYu5
 */
public class T003 {
    /*
    *在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * 规律：首先选取数组中右上角的数字。如果该数字等于要查找的数字，查找过程结束：
     * 如果该数字大于要查找的数字，剔除这个数字所在的列：如果该数字小于要查找的数字，剔除这个数字所在的行。
     * 也就是说如果要查找的数字不在数组的右上角，则每－次都在数组的查找范围中剔除一行或者一列，这样每一步都可以缩小
     * 查找的范围，直到找到要查找的数字，或者查找范围为空。
     *
     * HHH: 数组是有序的 我们从右上角开始判断 如果目标值小于右上角的数，那么应该左移一列，如果目标值大于右上角的数，就该往下移动一行
    * */
    public static boolean find(int[][] array, int target) {

        if (array == null || array.length < 1 || array[0].length < 1){
            return false;
        }
        int row = 0;
        int rows = array.length;   //数组的行数
        int columns = array[0].length;  //数组行的列数
        int column = columns -1;

        while(row >= 0 && column >= 0 && row < rows && column < columns){
            if (target == array[row][column]){
                return true;
            } else if(target < array[row][column]){
                column --;
            } else {
                row ++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(matrix, 7));    // 要查找的数在数组中
        System.out.println(find(matrix, 5));    // 要查找的数不在数组中
        System.out.println(find(matrix, 1));    // 要查找的数是数组中最小的数字
        System.out.println(find(matrix, 15));   // 要查找的数是数组中最大的数字
        System.out.println(find(matrix, 0));    // 要查找的数比数组中最小的数字还小
        System.out.println(find(matrix, 16));   // 要查找的数比数组中最大的数字还大
        System.out.println(find(null, 16));     // 健壮性测试，输入空指针
    }

}