import extra.taco;

public class tacoRunner {
	public static void main(String[] args) {
	taco t=new taco();
		t.getMeat();
t.getSauce();
	t.setMeat("carne asada");
	t.setSauce("extremely spice");
	System.out.println(t.getMeat());
	System.out.println(t.getSauce()); 
	} 
}
