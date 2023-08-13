package oop.interfaces.PC;

public class MSI extends PC implements AirColler{
    public MSI() {
    }

    public MSI(int ram, String CPU, String GPU) {
        super(ram, CPU, GPU);
    }

    @Override
    public void fanNumber() {
        System.out.println("8");
    }
}
