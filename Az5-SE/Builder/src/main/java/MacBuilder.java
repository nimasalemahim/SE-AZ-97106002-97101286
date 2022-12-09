public class MacBuilder implements Builder{

    private String type;
    private String cpu;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public MacLaptop getResult(){
        return new MacLaptop(type, cpu);
    }
}
