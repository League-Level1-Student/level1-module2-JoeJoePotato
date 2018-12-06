
public class taco {
	String meat="carnitas";	
	String sauce="Mild taco sauce";
	public static void main(String[] args) {
	taco t=new taco();
		t.getMeat();
t.getSauce();
	t.setMeat("carne asada");
	t.setSauce("exytremely spice");
	t.getMeat();
	t.getSauce();
	} 

	public String getMeat() {
		return meat;
	}
	public String getSauce() {
		return sauce;
	}
	public String setMeat(String m){
	return	meat=m;
	}
	public String setSauce(String s){
		return	sauce=s;
		}
}
