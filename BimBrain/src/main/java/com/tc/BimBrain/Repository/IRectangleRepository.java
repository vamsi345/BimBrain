package com.tc.BimBrain.Repository;

import com.tc.BimBrain.Domain.Model.Rectangle;


public interface IRectangleRepository {

    public Rectangle createRectangle(float length, float width);
}
