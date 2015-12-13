
public class CallGsmDemo {

	public static void main(String[] args) {
		
		GSM gosho = new GSM();
		GSM pesho = new GSM();
		
		gosho.insertSimCard("0812345678");
		pesho.insertSimCard("0812345679");
		
		gosho.call(pesho, 3);
		//pesho.call(gosho, 4);
		gosho.call(pesho, 7);
		
		System.out.println("Gosho e govoril: " + gosho.outgoingCallsDuration + " minuti");
		gosho.printInfoForTheLastOutgoingCall();
		gosho.printInfoForTheLastIncomingCall();
		System.out.println();
		System.out.println("Pesho e govoril: " + pesho.outgoingCallsDuration + " minuti");
		pesho.printInfoForTheLastOutgoingCall();
		pesho.printInfoForTheLastIncomingCall();
		

		pesho.getSumForCall();
		gosho.getSumForCall();
	}

}
