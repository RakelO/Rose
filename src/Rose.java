public class Rose extends Bud {
	public Rose(int num, String c, int leafs, int thorns) {
		super(num, c);
		this.leafs = leafs;
		this.thorns = thorns;
	}

	private int leafs;
	private int thorns;

	public int getLeafs() {
		return leafs;
	}

	public void setLeafs(int leafs) {
		this.leafs = leafs;
	}

	public int getThorns() {
		return thorns;
	}

	public void setThorns(int thorns) {
		this.thorns = thorns;
	}

	public static Rose blossom(Bud roseBud, int l, int th) {
		return new Rose(roseBud.getRosePetals().length,
				roseBud.getRosePetals()[0].getColor(), l, th);
	}

	@Override
	public String toString() {
		return "This a rose. It's "+super.getRosePetals()[0].getColor()+". It has "+super.getRosePetals().length+" petals, "+leafs+" leafs and "+thorns+" thorns. It's very beautiful!";
	}
	
}
