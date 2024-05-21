package com.lab;

class Animal {
	public void move() {
		System.out.println("Animal moves");
	}

	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Bird extends Animal {
	@Override
	
	public void move() {
		super.move();
		super.makeSound();
		System.out.println("Bird flies");
	}

	@Override
	public void makeSound() {
		System.out.println("Bird chirps");
	}
}

class Panthera extends Animal {
	@Override
	public void move() {
		System.out.println("Panthera walks");
	}

	@Override
	public void makeSound() {
		System.out.println("Panthera roars");
	}
}

public class Problem2 {

	public static void main(String[] args) {
		Animal bird = new Bird();
		Animal panthera = new Panthera();
		
		bird.move();
		bird.makeSound();
		panthera.move();
		panthera.makeSound();
	}
}
