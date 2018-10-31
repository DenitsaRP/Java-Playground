package oop.oopCall;

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	String lastIncomingCall;
	String lastoutgoingCall;

	void insertSimCard(String newSimMobileNumber) {
		if (hasSimCard) {
			System.out.println(model + " has already have SIM card");
			System.out.println(model + " number is: " + simMobileNumber);
		} else {
			if (newSimMobileNumber.length() == 10) {
				if (newSimMobileNumber.charAt(0) == '0' && newSimMobileNumber.charAt(1) == '8') {
					simMobileNumber = newSimMobileNumber;
					hasSimCard = true;
					System.out.println(model + " mobile number is " + simMobileNumber);
				} else {
					System.out.println("First digits have to be \"08\"");
				}
			} else {
				System.out.println(
						"Your mobile number have to be with 10 digits! You entered " + newSimMobileNumber.length());
				System.out.println("Please try again!");
			}
		}
	}

	void removeSimCard() {
		if (!hasSimCard) {
			System.out.println("You have already removed your SIM card");
		} else {
			hasSimCard = false;
			simMobileNumber = null;
			System.out.println("Now, " + model + " don't have SIM card and mobile number");
		}
	}

	void call(double duration, GSM receiver) {

		if (duration < 0) {
			System.out.println("Your receivd duration is invalid!");
		} else {
			if (receiver.simMobileNumber.equals(simMobileNumber)) {
				System.out.println("The number of caller is the same as the number of receiver.");
			}
			if (!receiver.hasSimCard && hasSimCard) {
				System.out.println("Don't have SIM card!");
			} else {
				lastoutgoingCall = receiver.simMobileNumber;
				receiver.lastIncomingCall = simMobileNumber;
				outgoingCallsDuration += duration;
				System.out.println("Now " + model + " outgoing call duretion is " + outgoingCallsDuration);
			}
		}
	}

	void getSumForCalls(Call price) {
		double sum = outgoingCallsDuration * price.priceForMinute;
		System.out.println("The sum for " + model + " outgoing calss : " + sum + "lv.");
	}

	void printInfoForTheLastOutgoingCall() {
		System.out.println("The last outgoing call for " + model + " was :" + lastoutgoingCall);
	}

	void printInfoForTheLastIncomingCall() {
		System.out.println("The last incoming call for " + model + " was :" + lastIncomingCall);
	}
}
