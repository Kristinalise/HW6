import java.util.ArrayList;

class ToyBox{
	
	private int count;
	private ArrayList<Toy> box; 

	public ToyBox(){
		count = 0;
		box = new ArrayList<Toy>();
	}

	public void addToy(Toy newToy){
		if(!box.contains(newToy)){
			box.add(newToy);
			count++;
			System.out.println("Toy successfully added!");
		}else{
			System.out.println("You already have that toy!");
		}
	}

	public int howMany(){
		return count;
	}

	public void setBox(ArrayList<Toy> newBox){
		box = newBox;
		count = newBox.size();
	}

	public ArrayList<Toy> getBox(){
		return box;
	}

	public int getCount(){
		return count;
	}

	public double getCost(){
		double cost = 0.0;
		for(Toy t : box){
			cost += t.getCost();
		}
		return cost;
	}
}