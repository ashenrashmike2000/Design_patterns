package decorator;


public class Main {

    public static void main(String[] args) {

      //for more than one decorate
        Shape shape = new Rectangle();
        Shape rectangleWithBorder = new BorderDecorator(shape);
        Shape rectangleWithBorderAndColor = new ColorDecorator(rectangleWithBorder, "Green");
        rectangleWithBorderAndColor.draw();

      //for one decorate
//        Shape circle = new Circle();
//        Shape circleWithBorder = new BorderDecorator(circle);
//        circleWithBorder.draw();
    }
}
