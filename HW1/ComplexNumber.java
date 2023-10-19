public class ComplexNumber{
	private float a;
	private float b;

	public ComplexNumber(float a, float b){
		this.a = a;
		this.b = b;
	}

	public ComplexNumber add(ComplexNumber c){
		ComplexNumber newComplex;
		float newA = a +c.getA();
		float newB = b + c.getB();
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	}

	public ComplexNumber subtract(ComplexNumber c){
		ComplexNumber newComplex;
		float newA = a - c.getA();
		float newB = b - c.getB();
		newComplex = new ComplexNumber(newA, newB);
		return newComplex; 
	}

	public ComplexNumber multiply(ComplexNumber c){
		ComplexNumber newComplex;
		float newA = a * c.getA() - b * c.getB();
		float newB = b * c.getA() + a * c.getB();
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	}

	public ComplexNumber divide(ComplexNumber c){
		ComplexNumber newComplex;
		float mag = (float) Math.sqrt(c.getA() * c.getA() + c.getB() * c.getB());
		float newA = (a * c.getA() + b * c.getB()) / mag;
		float newB = (b * c.getA() - a * c.getB()) / mag;
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	}

	public float getA(){
		return a;
	}

	public float getB(){
		return b;
	}

	public boolean equals(Object i){
		if(this == i)
			return true;
		if(i == null || getClass() != i.getClass()) 
			return false;
		ComplexNumber that = (ComplexNumber) i;
		return Float.compare(that.a, a) == 0 && Float.compare(that.b, b) == 0;
	}

	public String toString(){
		if(b<0){
			return a + "-" + (-b) + "i";
		}
		else{
			return a + "+" + (b) + "i";
		}
	}
}