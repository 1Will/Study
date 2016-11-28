package Collection;

public class Animal implements Comparable<Animal>{
	private String name;
	private float weight;

	public Animal(String name,float weight) {
		this.name = name;
		this.weight = weight;
	}
	@Override
	public int compareTo(Animal o) {
		if(this.weight==o.weight){
			return this.name.compareTo(o.name);
		}
		if(this.weight>o.weight){
			return -1;
		}else{
			return 1;
			}
	}
	public String toString(){
		return "name="+name +"  "+"weight=" + weight +";";
	}
}
