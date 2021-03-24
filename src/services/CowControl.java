package services;

import java.util.List;

import entities.Cow;

public class CowControl implements Calculator<Cow> {

	@Override
	public Cow maxWeight(List<Cow> list) {
		
		Cow cow = list.get(0);
		for(Cow c : list) {
			if(c.getWeight() > cow.getWeight()) {
				cow = c;
			}
		}
		return cow;		
	}

	@Override
	public Cow minWeight(List<Cow> list) {
		
		Cow cow = list.get(0);
		for(Cow c : list) {
			if(c.getWeight() < cow.getWeight()) {
				cow = c;
			}
		}
		return cow;
	}

}
