package controller;

import model.Model;

public class RandomController extends AbstractController {

    /**
     * Must have a default constructor with no arguments
     */
    public RandomController(){
        super();
    }

    public RandomController(Model model){
        super();
        setModel(model);
    }

    @Override
    void move(){
        double random = Math.random();

        if (random < 0.25){
            model.left();
        } else if (random < 0.5){
            model.right();
        } else if (random < 0.75){
            model.up();
        } else {
            model.down();
        }
    }
}
