package volumetricshapes;

import base.BaseShape;

public abstract class VolumetricShape extends BaseShape {

    private double radius;

    public VolumetricShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public abstract double volume();





}
