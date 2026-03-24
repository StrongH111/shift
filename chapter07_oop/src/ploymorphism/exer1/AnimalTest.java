package ploymorphism.exer1;

public class AnimalTest {
    public void adapt(Animal animal) {
        animal.eat();
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.play();//
        }else if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.lookDoor();
        }else if(animal instanceof Sheep){
            Sheep sheep  =(Sheep) animal;
            sheep.run();
        }
    }

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        Animal a  = new Dog();//多态，父类的引用指向子类的对象，多态的必要条件：有继承关系，有重写方法
        //编译看左，运行看右，此时的a并不能访问子类的属性和方法，所以只能访问父类的属性和方法，
        // 有重写的方法，则运行时调用子类的方法
        test.adapt(new Cat());
        test.adapt(a);
        test.adapt(new Sheep());
    }


}

class Animal {
    protected void eat() {
        System.out.println("animal eat food");
    }
}

class Cat extends Animal {
    protected void eat() {
        System.out.println("cat eat fish");
    }

    public void play() {
        System.out.println("cat play with ball");
    }

}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat bone");
    }

    public void lookDoor() {
        System.out.println("dog look door");
    }
}

class Sheep extends Animal {
    public void eat() {
        System.out.println("Sheep eat grass");
    }

    public void run() {
        System.out.println("sheep run");
    }
}

