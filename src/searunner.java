
public class searunner {
public static void main(String[] args) {
	SeaCreature a=new SeaCreature("spongebob");
	a.eat();
	a.laugh();
	SeaCreature b=new SeaCreature("patrick");
	System.out.println(b.getName());
	b.eat();
	b.laugh();
	SeaCreature c=new SeaCreature("squidward");
	System.out.println(c.getName());
	c.eat();
	c.laugh();
}
}
