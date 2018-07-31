package oopCall;

public class DemoCall {

	public static void main(String[] args) {

		GSM lenovo = new GSM();
		lenovo.model = "Lenovo A6010";
		lenovo.hasSimCard = false;
		lenovo.outgoingCallsDuration = 62.10;

		GSM lg = new GSM();
		lg.model = "LG G2";
		lg.hasSimCard = true;
		lg.simMobileNumber = "0883456123";
		lg.outgoingCallsDuration = 120.3;

		lenovo.insertSimCard("0888123456");
		System.out.println("Does" + lenovo.model + " has sim card - " + lenovo.hasSimCard);

		lg.removeSimCard();

		lg.insertSimCard("0888987654");

		lenovo.call(12.40, lg);
		
		Call mm = new Call();
		mm.setPriceForMinute(0.55);
		lenovo.getSumForCalls(mm);
		
		Call tt = new Call();
		tt.setPriceForMinute(0.48);
		lg.getSumForCalls(tt);
		
		lenovo.printInfoForTheLastIncomingCall();
		lenovo.printInfoForTheLastOutgoingCall();
	}

}
