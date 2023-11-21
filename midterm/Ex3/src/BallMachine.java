
public class BallMachine {

	final static int SOLD_OUT = 0; //매진 상태
	final static int NO_COIN = 1;  //동전 없음 상태
	final static int HAS_COIN = 2; //동전 있음 상태
	final static int SOLD = 3; //판매 중 상태
	
	int state = SOLD_OUT; //현재 상태를 표시하는 변수
	int count = 0; //볼의 갯수
	
	//초기 볼의 갯수를 인자로 받아들이는 생성자.
	
	public BallMachine(int count) {
		this.count = count;
		state = NO_COIN;
	}
	
	//동전이 투입되는 경우
	public void insertCoin() {
		state = HAS_COIN;
	}
	
	//동전을 반환하는 경우 
	public void ejectCoin() {
		state = NO_COIN;
		count++;
	}
	
	//손잡이를 돌리는 경우
	public void turnCrank() {
		state = NO_COIN;
		count--;
		
		if(count == 0)
				state = SOLD_OUT;
	}
	
	//볼 내보내기
	public void dispense() {
		state = NO_COIN;
	}

	@Override
	public String toString() {
		return "BallMachine [state=" + state + ", count=" + count + "]";
	}
	
		
}
