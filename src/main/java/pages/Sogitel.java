package pages;

public class Sogitel {

   private Sogitel drugayaPolovinka;
   private String name;

	public Sogitel(String name) {
		this.name = name;
	}

	public void setDrugayaPolovinka(Sogitel drugayaPolovinka) {
		this.drugayaPolovinka = drugayaPolovinka;
	}

	public String getName() {
		return name;
	}

	public Sogitel getDrugayaPolovinka() {
		return drugayaPolovinka;
	}

	public void punchInDeFace(){
		System.out.println(this.getName() + " dal po morde "+drugayaPolovinka.getName());
	}
	public void punchInDeFace( Sogitel that){
		that.name = "popizghenii "+ that.name;
		that.getInDaFace(this);
		System.out.println(this.getName()+": ha=ha=ha");
	}
	private void getInDaFace(Sogitel that){
		System.out.println(this.getName()+" poluchil po morde ot "+that.getName());
	}

}
