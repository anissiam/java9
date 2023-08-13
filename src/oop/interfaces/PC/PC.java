package oop.interfaces.PC;

public class PC {
    private int ram ;
    private String CPU;
    private String GPU;

    public PC() {
    }

    public PC(int ram, String CPU, String GPU) {
        this.ram = ram;
        this.CPU = CPU;
        this.GPU = GPU;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram=" + ram +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }
}
