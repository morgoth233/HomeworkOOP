
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}
	
	void useMemory(double memory) {
		if (freeMemory - memory < 0) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}
	}
	
}
