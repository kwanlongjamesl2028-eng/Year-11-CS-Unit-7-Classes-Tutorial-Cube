public class Cube {
    private int side;
    public int getSide(){
    return side;
        }
    public void setSide(int side){
    if(side < 1){
        throw new IllegalArgumentException("Side length must be positive.");   
    }
    this.side = side;
    }
    public int calculateSurfaceArea(){
        return 6*side*side;
    }
    public int calculateVolume(){
        return side*side*side;
    }
    public static void main(String[] args) {
       Cube c = new Cube();
       System.out.println(c.toString()); 
    }
    }
