public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public Point copy(){
    return new Point(x, y);
  }

  public String toString(){
    return "(" +x+ "," +y+ ")";
  }

  public double distTo(Point p){
    return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
  }
}
