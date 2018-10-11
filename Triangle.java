public class Triangle{

  private double x0,y0,x1,y1,x2,y2;
  private Point p0,p1,p2;

  public Triangle(Point A, Point B, Point C) {
    A = p0;
    B = p1;
    C = p2;
  }

  public Triangle(double X0, double Y0, double X1, double Y1, double X2, double Y2) {
    x0 = X0;
    y0 = Y0;
    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
  }

  public double getPerimeter() {
    return p0.distanceTo(p1) + p1.distanceTo(p2) + p2.distanceTo(p0);
  }

  public String toString(){
    return ("Triangle: A" +p0+ " B" +p1+ " C" +p2);
  }

  public Point getVertex(int index) {
    Point newPoint;
    if (index == 0) {
      newPoint = new Point (p0.getX(), p0.getY());
    }
    if (index == 1) {
      newPoint = new Point (p1.getX(), p1.getY());
    }
    else {
      newPoint = new Point (p2.getX(), p2.getY());
    }
    return newPoint;
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      p0 = newP;
    }
    if (index == 1) {
      p1 = newP;
    }
    else {
      p2 = newP;
    }
  }

}
