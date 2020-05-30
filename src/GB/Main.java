package GB;

public class Main {

    public static void main(String[] args) {

        Cat catVasya = new Cat("Вася", "Рыжий");
        Cat catKuzya = new Cat("Кузя", "Серый");
        Cat catTima = new Cat("Тима", "Коричневый");
        Dog dogPolkan = new Dog("Полкан", "Белый");
        Dog dogFilya = new Dog("Филька", "Черный");

        Animal.displayCountOfAnimals();     //вывод инфы о количестве животных
        Cat.displayCountOfCats();
        Dog.displayCountOfDogs();
        System.out.println();

        Animal[] animals = {catVasya, catKuzya, catTima, dogPolkan, dogFilya};

        System.out.println("Соревнования по бегу:");
        for (Animal animal : animals) {
            animal.run(500);
        }
        System.out.println("\nСоревнования по плаванию:");
        for (Animal animal : animals) {
            animal.swim(10);
        }
        System.out.println("\nСоревнования по прыжкам:");
        for (Animal animal : animals) {
            animal.jump(100);
        }
        /*
            System.out.println("\nСоревнования по бегу(2):");
            catKuzya.run(140);
            catVasya.run(450);
            dogFilya.run(350);
            dogPolkan.run(700);

            System.out.println("\nСоревнования по плаванию(2):");
            catKuzya.swim(15);
            catVasya.swim(3);
            dogFilya.swim(9);
            dogPolkan.swim(20);

            System.out.println("\nСоревнования по прыжкам(2):");
            catKuzya.jump(150);
            catVasya.jump(30);
            dogFilya.jump(90);
            dogPolkan.jump(200);
        */
    }
}
