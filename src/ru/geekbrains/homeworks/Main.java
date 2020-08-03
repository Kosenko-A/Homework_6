package ru.geekbrains.homeworks;

public class Main {

    public static void main(String[] args) {
    	int run_length1 = 200;
    	int run_length2 = 500;
    	int swim_length = 10;
		int jump_length1 = 2;
		double jump_length2 = 0.5;

	Cat cat = new Cat("Кот","Барсик", "белый, ", 5);
	Cat kitten = new Cat ("Котенок", "Персик", "кремовый", 1);
	Dog dog = new Dog("Пес", "Коржик", "рыжий, ", 6);
	Dog puppy = new Dog ("Щенок", "Лесси", "черный", 1);

	cat.info();
	kitten.info();
	dog.info();
	puppy.info();

	System.out.println();

	System.out.print(String.format("Сможет ли кошка пробежать %d метров?  ", run_length1));
	System.out.println(cat.run(run_length1));

	System.out.print(String.format("Сможет ли кошка перепрыгнуть барьер в %d метра?  ", jump_length1));
	System.out.println(cat.jump(jump_length1));

	System.out.print(String.format("Сможет ли кошка проплыть %d метров?  ", swim_length));
	System.out.println(cat.swim(swim_length));

	System.out.println();

	System.out.print(String.format("Сможет ли собака пробежать %d метров?  ", run_length2));
	System.out.println(dog.run(run_length2));

	System.out.print(String.format("Сможет ли собака перепрыгнуть барьер в %f метра?  ", jump_length2));
	System.out.println(dog.jump(jump_length2));

	System.out.print(String.format("Сможет ли собака проплыть %d метров?  ", swim_length));
	System.out.println(dog.swim(swim_length));

	System.out.println();

	System.out.print(String.format("Сможет ли котенок пробежать %d метров?  ", run_length1));
	System.out.println(kitten.run(run_length1));

	System.out.print(String.format("Сможет ли котенок перепрыгнуть барьер в %d метра?  ", jump_length1));
	System.out.println(kitten.jump(jump_length1));

	System.out.print(String.format("Сможет ли котенок проплыть %d метров?  ", swim_length));
	System.out.println(kitten.swim(swim_length));

	System.out.println();

	System.out.print(String.format("Сможет ли щенок пробежать %d метров?  ", run_length2));
	System.out.println(puppy.run(run_length2));

	System.out.print(String.format("Сможет ли щенок перепрыгнуть барьер в %f метра?  ", jump_length2));
	System.out.println(puppy.jump(jump_length2));

	System.out.print(String.format("Сможет ли щенок проплыть %d метров?  ", swim_length));
	System.out.println(puppy.swim(swim_length));
    }
}
