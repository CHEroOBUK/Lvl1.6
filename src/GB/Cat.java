package GB;

public final class Cat extends Animal{
    private final String color; //цвет вынесен в подкласс, чтобы отработать элементы конструкций
    private static int counterOfCats = 0;

    public Cat(String name, String color){
        super(name);
        this.color = color;
        counterOfCats ++;
    }
    //дальнейшие конструции с Override, для практики в вариациях использования get, super
    @Override
    public void run(int distance){
        if (distance <= getLimitRunDistance()){
            System.out.print(color + " кот по кличке ");
            super.run(distance);    //выполняем метод суперкласса
        } else System.out.println(color + " кот по кличке " + name + " не может пробежать больше " + getLimitRunDistance() + " м.");
    }

    @Override
    public void swim(int distance){
        System.out.println(color + " кот по кличке " + name + " не умеет плавать");
    }

    public static void displayCountOfCats(){
        System.out.println("Количество котеек = " + counterOfCats);
    }
}
