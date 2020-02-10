package PC_parts;

public class PC {

	public static void main(String[] args) {
		Dimensions dimobj = new Dimensions(20,20,5);
		Case caseobj=new Case("220b","dell","240",dimobj);
		Monitor monobj = new Monitor("27 inch beast","Acer",27,new Resolution(2540,1440));
		Motherboard mothobj=new Motherboard("bj-200","asus",4,6,"v2.44");
		PC pcObj=new PC(caseobj,monobj,mothobj);
		pcObj.powerUp();
	}
	 private Case CaseInst;
	 private Monitor MonitorInst;
	 private Motherboard MotherboardInst;
	 
	public PC(Case caseInst, Monitor monitorInst, Motherboard motherboardInst) {
		CaseInst = caseInst;
		MonitorInst = monitorInst;
		MotherboardInst = motherboardInst;
	}
	 public void drawLogo() {
		 MonitorInst.drawPixelAt(1200,50,"yellow");
	 }
	 public void powerUp() {
		 CaseInst.pressPowerButton();
		 drawLogo();
	 }
}
