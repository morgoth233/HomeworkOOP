
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer(){
		isNotebook = false;
		operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	int comparePrices(Computer c) {
		if (c.price < this.price) {
			return -1;
		}
		if (c.price > this.price) {
			return 1;
		} else {
		return 0;
		}
	}
	
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
