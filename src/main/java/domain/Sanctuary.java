package domain;
class Sanctuary {
	private String name;
	private int extraDefense;


	public Sanctuary(String name, int extraDefense) {
		this.name = name;
		this.extraDefense = extraDefense;
	}

	public int getDefense() {
		return this.extraDefense;
	}
}