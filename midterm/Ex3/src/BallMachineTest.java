
public class BallMachineTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//볼을 5개 가지고 있는 BallMachine을 생성 
		BallMachine ballMachine = new BallMachine(5);
		
		System.out.println(ballMachine.toString());
		
		ballMachine.insertCoin();
		ballMachine.turnCrank();
		
		System.out.println(ballMachine.toString());
		
		ballMachine.insertCoin();
		ballMachine.ejectCoin();
		ballMachine.turnCrank();
		
		System.out.println(ballMachine.toString());
		ballMachine.insertCoin();
		ballMachine.turnCrank();
		ballMachine.insertCoin();
		ballMachine.turnCrank();
		ballMachine.ejectCoin();
		
		System.out.println(ballMachine.toString());
		
		ballMachine.insertCoin();
		ballMachine.insertCoin();
		ballMachine.turnCrank();
		ballMachine.insertCoin();
		ballMachine.turnCrank();
		ballMachine.insertCoin();
		ballMachine.turnCrank();
		
		System.out.println(ballMachine.toString());
		
	}

}
