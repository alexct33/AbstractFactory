/**
 * Created by Oriol on 10/03/2017.
 */
public class GenericGame {
    private boolean GameOver;
    public GenericGame(){
        GameOver = false;
    }

    public void run(IFactory f){
        while (GameOver == false){
            IFigure figure = f.createFigure();
            figure.walk();
            //.......
            IHouse house = f.createHouse();
            house.build();
            //.......
            IFemale female = f.createFemale();
            female.brushHair();
            //.......
            IFood food = f.createFood();
            food.cook();
            //.......
            IFigure sport = f.createSportFigure();
            sport.jump();
            //.......
            IGadget gadget = f.createGadget();
            gadget.createGadget();
            //.......
        }
    }
}
