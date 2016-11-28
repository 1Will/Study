package Abstract;

public class Monkey extends Animal{
	public Monkey(String name,int weight){
		setName(name);
		setWeight(weight);
	}
	public void monkeySkill(){
	System.out.println("鎴戞槸鐚村瓙鐖剁被锛屾垜浼氳璇�,鎴戝効瀛愬彨" + getName());
	}
	@Override
	public void tellname() {
		System.out.println("鎴戞槸"+ getName());
	}

	@Override
	public void tellweight() {
		System.out.println("鎴戠殑閲嶉噺鏄�"+ getWeight());
	}

}
