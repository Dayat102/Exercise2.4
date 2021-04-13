
public class Main {

public static void main(String[] args) {
		
		Motorcycle d = new Motorcycle();
		d.setBrand("Yamaha");
		d.setModel("Y15");
		d.setColor("Yellow");
		d.setEngine(1.5);
		d.setPrice(15000);
		d.setWeight(135);
		
		System.out.println("Brand: " + d.getBrand());
		System.out.println("Model: " + d.getModel());
		System.out.println("Color: " + d.getColor());
		System.out.println("Engine: " + d.getEngine()+ "L");
		System.out.println("Prize: RM " + d.getPrice());
		System.out.println("Weight: " + d.getWeight() + "Kg");
		d.Promotion();
		System.out.println();
		
		Motorcycle e = new Motorcycle();
		e.setBrand("Honda");
		e.setModel("A15");
		e.setColor("Red");
		e.setEngine(1.2);
		e.setPrice(10000);
		e.setWeight(115);
		
		System.out.println("Brand: " + e.getBrand());
		System.out.println("Model: " + e.getModel());
		System.out.println("Color: " + e.getColor());
		System.out.println("Engine: " + e.getEngine());
		System.out.println("Prize: RM " + e.getPrice());
		System.out.println("Weight: " + e.getWeight() + "Kg");
		e.Promotion();
		System.out.println();
	}
}
