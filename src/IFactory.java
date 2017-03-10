
/**
 * Created by Oriol on 10/03/2017.
 */
public interface IFactory {
    IFigure createFigure();
    IHouse createHouse();
    IFood createFood();
    IFigure createSportFigure();
    IFemale createFemale();
    IGadget createGadget();
}