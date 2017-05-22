
public class RectangleClient {

	public static void main(String[] args) {
		Rectangle R1= new Rectangle(5, 12, 4, 8);
		System.out.println("x-coordinate: "+ R1.getX());
		System.out.println("y-coordinate: "+ R1.getY());
		System.out.println("width: "+ R1.getWidth());
		System.out.println("Height: "+ R1.getHeight());
		System.out.println(R1.toString());
		System.out.println("Area after the size is changed: "+ R1.changeSize(3,10));
	}

}
