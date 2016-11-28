package Abstract;

public class Chicken extends Animal {
	public Chicken(String name,int weight){
		setName(name);
		setWeight(weight);
	}
	@Override
	public void tellname() {
		System.out.println("鎴戞槸"+ getName());
	}
	@Override
	public void tellweight() {
		System.out.println("鎴戠殑閲嶉噺鏄�"+ getWeight());	}
	public void chickenSkill(){
		System.out.println("鎴戜細楦″彨");
	}
}
