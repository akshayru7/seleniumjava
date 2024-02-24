package JavaA7Test;

public class Vehical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheeler bike = new TwoWheeler();
		
		System.out.println(bike.Manufacture);
		bike.changethegear();
		
		Gear Oil = new Gear();
		System.out.println(Oil.Manufacture);
		System.out.println(Oil.Speed);
		Oil.Gearoil();
	}
	
	String Manufacture = "Tata";
	String Manufacturedatetime = "12/05/2023, 12:34:50";
	String colour = "Black";
	String Speed = "120km/h";
	
	public void running () {
		System.out.println("Car runs at 100km/h");
	}
}

class TwoWheeler extends Vehical {
	
	public void changethegear() {
		System.out.println("Change the gear for enhance speed");
	}
}

class Gear extends TwoWheeler {
	
	public void Gearoil () {
		System.out.println("Changing Gear oil");
	}
}