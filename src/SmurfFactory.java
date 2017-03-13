/**
 * Created by Oriol on 10/03/2017.
 */
public class SmurfFactory implements IFactory{
    public IFigure createFigure(){
        return (new Smurf());
    }
    public IHouse createHouse(){
        return (new SmurfHouse());
    }
    public IFood createFood(){
        return (new SmurfFood());
    }
    public IFigure createSportFigure(){
        return (new SmurfSportFigure());
    }
    public IFemale createFemale(){
        return (new SmurfFemale());
    }
    public IGadget createGadget(){
        return (new SmurfGadget());
    }
}
