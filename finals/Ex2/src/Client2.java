
public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElevatorFactory factory = null;
		String[] vendorNames = {"LG", "Samsung", "Hyundai"};
		for(int i=0;i<vendorNames.length;i++) {
			String vendorName = vendorNames[i];
			if(vendorName.equals("LG")) {
				factory = new LGElevatorFactory();
			}else if(vendorName.equals("Samsung")) {
				factory = new SamsungElevatorFactory();
			}else {
				factory = new HyundaiElevatorFactory();
			}
			Door door = factory.createDoor();
			Motor motor = factory.createMotor();
			motor.setDoor(door);
			door.open();
			motor.move(Direction.UP);
		}
		

	}

}
