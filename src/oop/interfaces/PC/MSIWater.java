package oop.interfaces.PC;

public class MSIWater extends PC implements WaterCooler , RGB{
    public MSIWater() {
    }

    public MSIWater(int ram, String CPU, String GPU) {
        super(ram, CPU, GPU);
    }

    @Override
    public void tankSize() {
        System.out.println(240+ "ML");
    }

    @Override
    public void tubes(int length) {
        System.out.println(length);
    }

    @Override
    public void RGBColor() {
        System.out.println("Blue , RED");
    }
}
