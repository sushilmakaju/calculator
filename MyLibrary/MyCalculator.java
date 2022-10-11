package MyLibrary;



public class MyCalculator {
	
	public calculator add (calculator c1) {
		c1.setNum3(c1.getNum1()+c1.getNum2());
		return c1;
	}
	
	public calculator sub (calculator c) {
		c.setNum3(c.getNum1()-c.getNum2());
		return c;
	}
	
	public calculator div (calculator c) {
		c.setNum3(c.getNum1()/c.getNum2());
		return c;
	}
	
	//prd
	public calculator prd (calculator c) {
		c.setNum3(c.getNum1()*c.getNum2());
		return c;
	}
	
	//rem
	public calculator rem (calculator c) {
		c.setNum3(c.getNum1()%c.getNum2());
		return c;
	}
	//pow
	public calculator pow (calculator c) {
		c.setNum3((int) Math.pow(c.getNum1(), c.getNum2()));
		return c;
	}

}
