package DecLearn;

public class Circle {
    private double radius;

    public Circle(double radius){
        if (radius >0){
            this.radius=radius;
        }else if (radius<0){
            this.radius=0;
        }
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){

        double area = Math.pow(radius, 2) *Math.PI;
        return area;

    }

}


