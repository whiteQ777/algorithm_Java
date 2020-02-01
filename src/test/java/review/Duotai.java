package review;

/**
 * @Classname duotai
 * @Description TODO
 * @Date 2020/2/1 22:59
 * @Created by HeYu5
 */
public class Duotai {

    public static void main(String[] args) {
        Animal c = new Cat();
        c.eat();
        
        c.sleep();
    }

}


class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat eats....");
    }
    
    public void sleep() {
        System.out.println("cat sleep...");
    }
}

class Animal {
    public void eat(){
        System.out.println("eat...");
    }

    public void sleep() {
        System.out.println("sleep...");
    }
}