package java20190511;

class ParentClass{

	private String mother;
	private String father;

	public ParentClass() {
		this.mother = "2";
		this.father = "1";
	}
	
	public ParentClass(String mother, String father) {
		this.mother=mother;
		this.father=father;
	}
	
	public String toString() {
		return this.father + "/"+this.mother;
	}
	
}

