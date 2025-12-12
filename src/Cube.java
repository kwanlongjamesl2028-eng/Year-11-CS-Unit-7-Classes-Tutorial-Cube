public class Cube {
    private int side;
    public Cube(){
        this.side = 1;
    }
    public Cube(int side){
        if(side < 1){
            throw new IllegalArgumentException("Side length must be positive.");   
        }
        this.side = side;
    }
    public int getSide(){
        return this.side;
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
    }
    }
