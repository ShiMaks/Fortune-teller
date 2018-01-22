package by.learning.divination.logic;

import java.util.HashMap;
import java.util.Map;

import by.learning.divination.bean.Flower;

public class FortuneTeller {
	
	public static final int MIN_PREDICTIONS = 8;
	private Map<String,String[]> predictionsDictionary;
	
	public FortuneTeller() {
		super();
		predictionsDictionary = new HashMap<>();
	}
	
	public Map<String, String[]> getPredictionsDictionary() {
		return predictionsDictionary;
	}

	public void setPredictionsDictionary(Map<String, String[]> predictionsDictionary) {
		this.predictionsDictionary = predictionsDictionary;
	}
	
	public void turnOn() {
		predictionsDictionary.put("Car", new String[] {"Opel", "BMW", "Tayota", "Geely"});
		predictionsDictionary.put("Flat", new String[] {"1", "2", "3", "4"});
		predictionsDictionary.put("Task", new String[] {"Good", "Bad", "Average", "Very bad"});
		predictionsDictionary.put("Love", new String[] {"Love", "Doesn't Love"});
		predictionsDictionary.put("Way", new String[] {"Left", "Right", "Straight"});
		predictionsDictionary.put("Credit", new String[] {"Take", "Don't Take", "Come to your senses"});
		predictionsDictionary.put("Exam", new String[] {"Pass", "Not Pass", "Freebies will come"});
		predictionsDictionary.put("Investments", new String[] {"Appartement", "Securities", "Bitcoin"});
	}

	public String predict(Flower flower, String predictType) {
		int leaves = flower.getNumberOfLeaves();
		String[] values = predictionsDictionary.get(predictType);
		int iterCount = leaves%values.length;
		return values[iterCount];
	}
}
