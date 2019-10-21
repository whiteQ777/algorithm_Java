package 数据结构;

import java.util.BitSet;

/**
 * @Classname BitSetDemo
 * @Description TODO
 * 保存位值的数组
 * BitSet数组大小会随需要增加
 * @Date 2019/10/21 16:52
 * @Created by HeYu5
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

//        set some bits
        for (int i = 0; i < 16; i++){
            if ((i % 2) == 0) bits1.set(i);  //讲指定索引处的位置设为true
            if ((i % 5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("Initial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        //OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        //XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 xor bits1");
        System.out.println(bits2);
    }
}
