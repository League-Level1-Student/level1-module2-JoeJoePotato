
public class smurfRunner {
public static void main(String[] args) {
	Smurf a= new Smurf("Handy");
	a.eat();
	System.out.println(a.getName());
	Smurf b=new Smurf("Papa");
	System.out.println(b.getName());
	System.out.println(b.getHatColor());
	System.out.println(b.isGirlOrBoy());
	Smurf c=new Smurf("Smurfette");
	System.out.println(c.getName());
	System.out.println(c.getHatColor());
	System.out.println(c.isGirlOrBoy());


}
}
