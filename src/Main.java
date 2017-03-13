/**
 * Created by Oriol on 10/03/2017.
 */
public class Main {

    public static void main(){
        GenericGame game = new GenericGame();
        IFactory factory = new SmurfFactory();
        game.run(factory);
    }
}
