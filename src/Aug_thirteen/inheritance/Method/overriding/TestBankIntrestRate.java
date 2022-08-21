package Aug_thirteen.inheritance.Method.overriding;

public class TestBankIntrestRate {
    public static void main(String[] args) {

    SBI s=new SBI();
    ICIC i=new ICIC();
    AXIS a=new AXIS();

        System.out.println("Rate of Intrest Of Diffrent Banks");
        System.out.println("----------------------------------");
        System.out.println("SBI ROI  :"+ s.getRateOfIntrest());
        System.out.println("ICIC ROI :"+ i.getRateOfIntrest());
        System.out.println("AXIS ROI :"+ a.getRateOfIntrest());
    }
}
