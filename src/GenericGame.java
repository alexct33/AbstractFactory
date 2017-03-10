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
            figure.jump();
            //.......
            IHouse house = f.createHouse();
            //.......
            IFemale female = f.createFemale();
            //.......
            IFood food = f.createFood();
            //.......
            IFigure sport = f.createSportFigure();
            //.......
            IGadget gadget = f.createGadget();
            //.......
        }
    }
}
