public class Rectangle {
    public double length = 1;
    public double width = 1;

    public double perimetroRetangulo(double length, double width){
        double p = 2 * (length + width);
        return p;
    }
    public double areaRetangulo(double length, double width){
        double a;
        return a = width * length;
    }
    public void setLength(double length) throws ArgumentException {
        if (length < 0.0 || length > 20.0){
            throw new ArgumentException();
        }
        else this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width) throws ArgumentException{
        if (width < 0.0 || width > 20.0){
            throw new ArgumentException();
        }
        else this.width = width;
    }
    public double getWidth(){
        return width;
    }
}
