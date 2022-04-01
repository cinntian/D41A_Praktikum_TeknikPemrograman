package shape;

/**
 * @author Cintia
 */
public class Square extends Rectangle{
    
    public Square(){
        super();
    }

    public Square(Double side){
        super(side, side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + super.toString() + "which is a subclass \n";
    }
    
    public Double getSide() {
        return super.getWidth();
    }

    public void setSide(Double side){
        super.setWidth(side);
        super.setLength(side);
    }
}
