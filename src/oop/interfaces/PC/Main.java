package oop.interfaces.PC;

public class Main {
    public static void main(String[] args) {
        MSI msi = new MSI(8 ,"I7" , "RTX 3090" );
        msi.fanNumber();
        System.out.println(msi.toString());


        MSIWater msi1 = new MSIWater(64 ,"I9" , "RTX 4090");
        msi1.tubes(2);
        msi1.tankSize();
        msi1.RGBColor();

    }
}
