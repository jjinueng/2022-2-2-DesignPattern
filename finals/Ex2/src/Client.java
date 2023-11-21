
public class Client {
	public static void main(String[] args) {
	
		ElevatorFactory factory = null;
		String vendorName = "Hyundai";
		
		if(vendorName.equals("LG")) {
			factory = new LGElevatorFactory();
		}
		else {
			factory = new HyundaiElevatorFactory();
		}
		
		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);
		
		door.open();
		motor.move(Direction.UP);
		
	}


}
