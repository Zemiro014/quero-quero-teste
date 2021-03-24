package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Cow;
import services.Calculator;
import services.CowControl;

public class Program {

	public static void main(String[] args) {
		
		List<Cow> list = new ArrayList<>();
		
		Cow c1 = new Cow("bibi", 550.0);
		Cow c2 = new Cow("titi", 450.0);
		Cow c3 = new Cow("didi", 500.0);
		Cow c4 = new Cow("riri", 430.0);
		Cow c5 = new Cow("lili", 660.0);
		
		list.addAll(Arrays.asList(c1, c2, c3, c4, c5));
		
		System.out.println("LIST OF ALL COWS \n");
		for(Cow cow : list)
		{
			System.out.println(cow);
		}
		
		Calculator<Cow> c = new CowControl();
		
		System.out.println("\n");
		System.out.println("SHOWING THE HEAVIEST AND LIGHTEST COW\n");
		
		System.out.println("The heaviest is:  "+ c.maxWeight(list));		
		System.out.println("The lightest is:  "+ c.minWeight(list));
	}
}
