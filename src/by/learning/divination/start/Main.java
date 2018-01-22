package by.learning.divination.start;

import java.util.Scanner;

import by.learning.divination.bean.Flower;
import by.learning.divination.logic.FortuneTeller;

public class Main {

	public static void main(String[] args) {
        	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose what you would like to see: \n 1. for divination by love enter - Love;"
				+ " \n 2. for divination by way enter - Way \n 3. for divination by credit enter - Credit \n"
				+ " 4. for divination by exam enter - Exam \n 5. for divination by investments enter - Investments"
				+ " \n 6. for divination by car enter - Car \n 7. for divination by task enter - Task "
				+ "\n 8. for divination by appartement enter - Flat");
		System.out.println("Enter value:  ");
		String key = scanner.nextLine();
		
		Flower flower = new Flower("Cammomile");
		flower.bloom();
		
		FortuneTeller teller = new FortuneTeller();
		teller.turnOn();
		
		String resultTeller = teller.predict(flower, key);
		try {
			printPrediction(resultTeller);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void printPrediction(String prediction) throws InterruptedException {
		System.out.println("Expect...");
		Thread.sleep(1000);
		System.out.println("Expect.I'm guessing...");
		Thread.sleep(2000);
		System.out.println("Varioan of prediction: " + prediction);
	}
}
