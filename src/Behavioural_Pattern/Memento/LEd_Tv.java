package Behavioural_Pattern.Memento;

public class LEd_Tv {

    private String name;
    private int size;
    private boolean usb;

    public LEd_Tv(String name,int size,boolean usb)
    {
        this.name=name;
        this.size=size;
        this.usb=usb;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;

    }

    public int getSize()
    {
        return size;
    }
    public void setSize(int size)
    {
        this.size=size;

    }
    public boolean getUsb()
    {
        return usb;
    }
    public void setUsb(boolean usb)
    {
        this.usb=usb;

    }


}
