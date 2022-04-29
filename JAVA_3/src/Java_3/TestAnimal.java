package Java_3;

abstract class Animal{
	public static String name;
	public static int age;
	public static float weight;
	
	public void showlnfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
	}
	public abstract int move();
	public abstract void eat();
	Animal(){}
}

class Fish extends Animal{
	static {
		name="Fish";
		age=1;
		weight=10;
	}

	public int move() {
		System.out.println("Fish moved!");
		return 0;
	}
	public void eat() {
		System.out.println("Fish eat!");
	}
	
}

class Bird extends Animal{
	static {
		name="Brid";
		age=2;
		weight=11;
	}
	public int move() {
		System.out.println("Brid moved!");
		return 0;
	}
	public void eat() {
		System.out.println("Bird eat!");
	}
	
}

class Mammal extends Animal{
	static {
		name="Mammal";
		age=3;
		weight=12;
	}

	public int move() {
		System.out.println("Mammal moved!");
		return 0;
	}
	public void eat() {
		System.out.println("Mammal eat!");
	}
}

public class TestAnimal {
	
	public static void main(String argc[]) {
		
		TestAnimal(new Fish());
		TestAnimal(new Bird());
		TestAnimal(new Mammal());
	}
	
	public static void TestAnimal(Animal act){
			act.showlnfo();
			act.move();
			act.eat();
	}
	
}
