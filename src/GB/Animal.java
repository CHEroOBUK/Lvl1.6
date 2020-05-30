package GB;

import java.util.Random;

public class Animal {
    static Random random = new Random();
    protected String name;
    private static int counterOfAnimals = 0;
    protected int limitRunDistance = random.nextInt(800) + 200;
    protected int limitSwimDistance = random.nextInt(19) + 2;
    protected int limitJumpHeight = random.nextInt(180) + 20;

    public Animal(String name){         //без использования перегрузки, как следствие без сеттеров
        this.name = name;
        counterOfAnimals++;
    }

    public int getLimitRunDistance(){
        return limitRunDistance;
    }

    public int getLimitSwimDistance(){
        return limitSwimDistance;
    }

    public void run(int distance){
        System.out.println(name + " пробежал " + distance + "м.");
    }

    public void swim(int distance){
        System.out.println(name + " проплыл " + distance + "м.");
    }

    public void jump(int height){       //на примере конструкции jump можно было использовать swim и run
        if (height <= limitJumpHeight) {
            System.out.println("Животное по кличке " + name + " прыгнуло на высоту " + height + "см.");
        } else System.out.println("Животное по кличке " + name + " не может прыгнуть выше " + limitJumpHeight + "см.");
    }

    public static void displayCountOfAnimals(){
        System.out.println("Количество животных = " + counterOfAnimals);
    }

}
