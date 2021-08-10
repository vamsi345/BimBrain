package com.tc.BimBrain.Domain.UseCase;

import com.tc.BimBrain.Repository.IRectangleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateRectangleUseCase {
    @Autowired
    private final IRectangleRepository _rectangleRepository;

    public CreateRectangleUseCase(IRectangleRepository rectangleRepository) {
        _rectangleRepository = rectangleRepository;
    }
}
