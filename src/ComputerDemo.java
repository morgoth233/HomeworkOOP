
public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer pc1 = new Computer();
		pc1.hardDiskMemory = 220;
		pc1.isNotebook = false;
		pc1.operationSystem = new String("Windows XP");
		pc1.freeMemory = pc1.hardDiskMemory;
		pc1.price = 560;
		pc1.year = 2005;
		
		Computer pc2 = new Computer();
		pc2.hardDiskMemory = 1000;
		pc2.isNotebook = true;
		pc2.operationSystem = new String("Windows 10");
		pc2.freeMemory = pc2.hardDiskMemory;
		pc2.price = 660;
		pc2.year = 2015;
		
		pc1.useMemory(100);
		pc2.changeOperationSystem("Linux");
		
		System.out.println("pc1");
		System.out.println("OS: " + pc1.operationSystem);
		System.out.println("Year: " + pc1.year);
		System.out.println("HDD: " + pc1.hardDiskMemory);
		System.out.println("Free Memory: " + pc1.freeMemory);
		System.out.println("Price: " + pc1.price);
		System.out.println("Is notebook: " + pc1.isNotebook);
		System.out.println("pc2");
		System.out.println("OS: " + pc2.operationSystem);
		System.out.println("Year: " + pc2.year);
		System.out.println("HDD: " + pc2.hardDiskMemory);
		System.out.println("Free Memory: " + pc2.freeMemory);
		System.out.println("Price: " + pc2.price);
		System.out.println("Is notebook: " + pc2.isNotebook);
		
	}

}
