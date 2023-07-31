package day6;
//method overriding

class RBI{
	void bank() {
		System.out.println("RBI bank in vpm");
	}
}
class IOB extends RBI{
 
	void bank() {
		System.out.println("IOB bank in chennai");
	}
}
class SBI extends RBI{
	void bank(){
		System.out.println("SBI bank in ullunthurpet");
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		RBI r;
		SBI s;
		IOB i;
		
		r = new RBI();
	    r.bank();
	    
	    r = new IOB();
	    r.bank();
		 
	    s = new SBI();
	    r.bank();
        
	    r = new SBI();
	    r.bank();
	}

}
