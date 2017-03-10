/**
 * Created by Oriol on 10/03/2017.
 */
public class Main {

    public Main(){
        GenericGame game = new GenericGame();
        IFactory factory = new SmurfFactory();
        game.run(factory);
    }
}
