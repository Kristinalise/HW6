import java.util.ArrayList;

class ToyDriver{
	
	public static void main(String[] args){

		Toy barbie = new Toy("Barbie", 15.50);
		Toy dollhouse = new Toy("Doll house", 99.99);
		Toy teaset = new Toy("Tea set", 49.99);
		Toy anotherBarbie = new Toy("Barbie", 15.50);

		ToyBox toybox = new ToyBox();
		toybox.addToy(barbie);
		toybox.addToy(dollhouse);
		toybox.addToy(teaset);
		// This is not supposed to work, because this child
		// is not allowed to have more than one of a toy.
		// And it won't work:
		toybox.addToy(anotherBarbie);

		System.out.println();
		System.out.println("Test #1:");
		ArrayList<Toy> tb2 = new ArrayList<>();
		tb2.add(barbie);
		tb2.add(dollhouse);
		tb2.add(teaset);
		// This is not supposed to work, but it will.
		// Why does it work?  Answer in a comment right here!
		// Then, change the ToyBox code so that it can't happen!
		tb2.add(anotherBarbie);
		toybox.setBox(tb2);
		for (Toy t : tb2){
			System.out.println(t);
		}


		System.out.println();
		System.out.println("Test #2:");
		// This is also not supposed to work, but it will.
		// Why does it work? Answer in a comment right here!
		// Then, change the ToyBox code so that it can't happen!
		ArrayList<Toy> tb3 = toybox.getBox();
		tb3.set(0, new Toy ("Barbie", 15.50));
		tb3.set(1, new Toy ("Barbie", 15.50));
		tb3.set(2, new Toy ("Barbie", 15.50));
		for (Toy t : tb3){
			System.out.println(t);
		}


	}



}