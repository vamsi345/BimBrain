package com.tc.BimBrain.Repository;

import com.tc.BimBrain.Domain.Model.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RectangleRepository {

    public Rectangle createRectangle(){
        Rectangle rectangle=new Rectangle();
        rectangle.setId(1L);
        rectangle.setLength(9.125);
        rectangle.setWidth(8.50);

        return rectangle;

    }

}
