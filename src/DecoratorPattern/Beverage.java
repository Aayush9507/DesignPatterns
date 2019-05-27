package DecoratorPattern;

public abstract class Beverage {

    String desc = "Unknown Beverage";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    Size size = Size.TALL;
    public enum Size { TALL, GRANDE, VENTI };

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double cost();



}
