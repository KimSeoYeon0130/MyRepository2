package gitHubTest;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		r1.setX(5);
		r1.setY(3);
		r1.setWidth(10);
		r1.setHeight(20);
		
		r2.setX(8);
		r2.setY(9);
		r2.setWidth(10);
		r2.setHeight(20);
		
		r3.setX(10);
		r3.setY(10);
		r3.setWidth(20);
		r3.setHeight(10);
		
		r1.print();
		r1.draw();
		r2.print();
		r2.draw();
		r3.print();
		r3.draw();
	}

}
