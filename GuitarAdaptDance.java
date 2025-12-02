public class GuitarAdaptDance implements IGuitar{
    private DanceController dc;

    public GuitarAdaptDance(DanceController dc){
        this.dc = dc;
    }

    public void PressFretButton(colors button){
        if(button == colors.GREEN){
            dc.Step(IDance.direction.FORWARD);
        }else if(button == colors.RED){
            dc.Step(IDance.direction.LEFT);
        }else if(button == colors.YELLOW){
            dc.Step(IDance.direction.RIGHT);
        }else if(button == colors.BLUE){
            dc.Step(IDance.direction.BACK);
        }else if(button == colors.ORANGE){
            dc.Step(IDance.direction.MIDDLE);
        }
        PressPick();
    }
    public void PressPick(){
        System.out.println("PICK");
    }
    public void PressTremelo(){

    }
}