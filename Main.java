package Java;
class Animal{
	void sound() {
		System.out.println("Animal");
	}	
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat");
	}
}
public class Main {
	public static void main(String [] args) {
		Animal pet = new Dog();
		pet.sound();
		pet = new Cat();
		pet.sound();
		pet = new Animal();
		pet.sound();
	}
}
