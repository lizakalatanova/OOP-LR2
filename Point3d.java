import java.util.Objects;
public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0.0, 0.0,0.0);
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    public void setZ ( double val) {
        zCoord = val;
    }
    @Override
    public boolean equals(Object obj) {
        if(getClass()!=obj.getClass())
            return false;
        Point3d p3 = (Point3d) obj;
        if((Objects.equals(this.getX(), p3.getX()))||(Objects.equals(this.getY(), p3.getY())) ||(Objects.equals(this.getZ(), p3.getZ()))){
            return true;
        }
        return false;
    }
    public double distanceTo(Point3d obj) {
        double res=Math.round((Math.sqrt(Math.pow(obj.getX()-this.getX(),2)+Math.pow(obj.getY()-this.getY(),2)+Math.pow(obj.getZ()-this.getZ(),2)))*100.0)/100.0;
        return(res);
    }
}
