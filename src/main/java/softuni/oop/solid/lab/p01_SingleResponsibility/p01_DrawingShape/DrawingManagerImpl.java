package softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape;

import softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Renderer;
import softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;


public class DrawingManagerImpl implements DrawingManager {

    private final Renderer renderer;

    public DrawingManagerImpl(Renderer renderer) {
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        renderer.render(shape);
    }
}
