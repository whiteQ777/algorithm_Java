import java.util.Arrays;

/**
 * @Classname OverrideHashcode
 * @Description TODO
 * @Date 2020/1/5 15:38
 * @Created by HeYu5
 */
public class OverrideHashcode {
    int a;
    int b;
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OverrideHashcode){
            return ((OverrideHashcode) obj).a == this.a && ((OverrideHashcode)obj).b == this.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return a+b;
    }

    public static void main(String[] args) {
        OverrideHashcode o = new OverrideHashcode();
        OverrideHashcode B = new OverrideHashcode();
        System.out.println(o.equals(B));
        System.out.println(o.hashCode());
        System.out.println(B.hashCode());

    }

}