package shape;

/**
 * @author Cintia
 */
public class main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[4];
	Circle c1 = new Circle(4.65);
	Circle c2 = new Circle(2.5, "Green", true);
	c1.setColor("Red");
	c1.setFilled(true);
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle(3, 3.5, "Green", true);
	r1.setWidth(4.25);
	r1.setLength(3);
	r1.setColor("Purple");
	r1.setFilled(true);
	arr[0] = c1;
	arr[1] = c2;
	arr[2] = r1;
	arr[3] = r2;

	for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
	}
    }
}

