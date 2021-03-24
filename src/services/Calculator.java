package services;

import java.util.List;

public interface Calculator<T> {
	
	public T maxWeight(List<T> value);
	
	public T minWeight(List<T> value);
}
