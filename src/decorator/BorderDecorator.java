package decorator;

public class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        super.draw();

        System.out.println("Adding a border to the shape.");
    }
}
