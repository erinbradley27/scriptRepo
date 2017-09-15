
package challengequestions;


public class Light {
    private String on;
    private String bulbType;
    private int power;
    
    public Light(String on, String bulbType, String power)
    {
        this.on = on;
        
        this.bulbType = bulbType;
        
        this.power = Integer.parseInt(power);
    }
    
    public boolean isOn()
    {
        if (on.equals("ON"))
            return true;
        else
            return false;
    }
    public String toString()
    {
        return "" + on + "," + bulbType + "," + power;
    }
}
