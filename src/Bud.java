import java.util.Arrays;


public class Bud {
public Bud(int num, String c) {
		rosePetals = new Petal[num];
		Arrays.fill(rosePetals, new Petal(c));
	}

public Petal[] getRosePetals() {
	return rosePetals;
}

public void setRosePetals(Petal[] rosePetals) {
	this.rosePetals = rosePetals;
}

private Petal[] rosePetals;

@Override
public String toString() {
	return "This is a flower bud. It is "+rosePetals[0].getColor()+". It has "+rosePetals.length+" petals.";
}

}
