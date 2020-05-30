package GB;

public final class Dog extends Animal {
    private final String color; //цвет вынесен в подкласс, чтобы отработать элементы конструкций
    private static int counterOfDogs = 0;

    public Dog(String name, String color){
        super(name);
        this.color = color;
        counterOfDogs++;
    }

    @Override
    public void run(int distance){
        if (distance <= getLimitRunDistance()){
            System.out.print(color + " пес по кличке ");
            super.run(distance);
        } else System.out.println(color + " пес по кличке " + name + " не может пробежать больше " + getLimitRunDistance() + " м.");
    }

    @Override
    public void swim(int distance){     //Оверрайд, чтобы использовать цвет при выводе
        if (distance <= getLimitSwimDistance()){
            System.out.print(color + " пес по кличке ");
            super.swim(distance);
        } else System.out.println(color + " пес по кличке " + name + " не может проплыть больше " + getLimitSwimDistance() + " м.");
    }

    public static void displayCountOfDogs(){
        System.out.println("Количество собак = " + counterOfDogs);
    }
}
