package com.tc.BimBrain.Application.Controller;

import com.tc.BimBrain.Domain.Model.Rectangle;
import com.tc.BimBrain.Repository.IRectangleRepository;
import com.tc.BimBrain.Repository.RectangleRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rectangle")
public class RectangleController {
    @Autowired
    private RectangleRepository _repository;

    @Autowired
    KieContainer kieContainer;

    @GetMapping
    @RequestMapping("{l}/{w}")
    public Rectangle get(@PathVariable float l, @PathVariable float w)
    {
        Rectangle rectangle = _repository.createRectangle();
        rectangle.setWidth(w);
        rectangle.setLength(l);


        KieSession kieSession= kieContainer.newKieSession("rulesSession");
        kieSession.insert(rectangle);
        kieSession.fireAllRules();
        kieSession.dispose();
        return  rectangle;
    }
}
