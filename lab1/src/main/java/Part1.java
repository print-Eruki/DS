public class Part1 {
	
	private static class Arithmetic{
		//private fields
		
		private int a;
		private int b;
		
		//constructor
		
		public Arithmetic(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
		
		//setters
		
		public void setA(int a) {this.a = a;}
		public void setB(int b) {this.b=b;}
		
		//getters
		
		public int getA() {return this.a;}
		public int getB() {return this.b;}
		
		//member methods
		
		public int add() {return a + b;}
		
		public int subtract() {return a- b;}
		
		public int multiply() {return a * b;}
		
		public double divide() {return a/ b;}
		
		
	}
	
	public static class Calculator  extends Arithmetic {

		public Calculator(int a, int b) {
			super(a,b);
		}
	}
	
}

