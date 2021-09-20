class Toy{
	
	private String name;
	private double cost;

	public Toy(String theName, double theCost) throws IllegalArgumentException{
		if(theCost < 0){
			throw new IllegalArgumentException("Cost of a toy cannot be negative.");
		}
		name = theName;
		cost = theCost;
	}

	public double getCost(){
		return cost;
	}

	public String getName(){
		return name;
	}

	public String toString(){
		return "This toy is a " + name + " and it cost $" + cost;
	}

	public boolean equals(Object other){
		boolean same = false;
        if (other != null && other instanceof Toy){
            same = this.name.equals(((Toy) other).name) && this.cost == (((Toy) other).cost);
        }
        return same;
	}




}