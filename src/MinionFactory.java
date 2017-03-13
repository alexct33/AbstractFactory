/**
 * Created by Oriol on 10/03/2017.
 */
public class MinionFactory implements IFactory {
    public IFigure createFigure(){
        return (new Minion());
    }
    public IHouse createHouse(){
        return (new MinionHouse());
    }
    public IFood createFood(){
        return (new MinionFood());
    }
    public IFigure createSportFigure(){
        return (new MinionSportFigure());
    }
    public IFemale createFemale(){
        return (new MinionFemale());
    }
    public IGadget createGadget(){
        return (new MinionGadget());
    }
}
