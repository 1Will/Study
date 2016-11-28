package Abstract;

public abstract class Animal{
	private String name;
	private int weight;
	public void Tell1() {
		System.out.println("璋冪敤浜嗕娇鐢ㄧ埛绫�");
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public int getWeight(){
		return this.weight;
	}
	public abstract void tellname();
	public abstract void tellweight();
}
