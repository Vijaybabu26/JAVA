class Shape{
	public Shape() {
		System.out.println("Shape");
	}

}
class traingle extends Shape{
	public 	void Traingle() {
		System.out.println("Shape traingle");
	}
}
public class shape{
	public static void main(String []args) {
		traingle t = (traingle) new Shape();
		if(t instanceof Shape) {
			System.out.println("t instance of Shape");
		}else {
			System.out.println("t instance not shape");
		}
	}
}