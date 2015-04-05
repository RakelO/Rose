
public class Main {
public static void main(String[] args) {
	Bud rose=new Bud(15, "red");
	System.out.println(rose);
	Rose redRose=Rose.blossom(rose, 5, 16);
	System.out.println(redRose.toString());
}
}
