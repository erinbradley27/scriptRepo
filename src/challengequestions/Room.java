
package challengequestions;


public class Room {
    private double length;
    private double width;
    private double height;
    
    public Room(double length, double width, double height)
    {
        try{
            if (length < 0 || width < 0 || height < 0)
                throw new CustomException();
            this.length = length;
            this.width = width;
            this.height = height;
        } catch (CustomException e) {
            System.out.println("You entered a value less than zero.");
            System.exit(1);
        }
    }
    
    public double squareFootage()
    {
        return length * width;
    }
    
    public double wallArea()
    {
        return height * width * 2 + height * length * 2;
    }
}
