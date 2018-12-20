
public class Minion extends MinionTest {
	private String name; 
		private int eyes; 
		private String color; 
		private String master;
Minion(String name, int eyes, String color, String master){
this.name=name;
this.color=color;
this.eyes=eyes;
this.master=master;
}
public String getName() {
	return name;
}
public void setMaster(String newmaster) {
master=newmaster;

}
public String getMaster() {
	return master;
}
public int getEyes() {
	return eyes;
}
public String getColor() {
	return color;
}
}
