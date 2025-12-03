public class GuitarAdaptDance implements IGuitar, IDance{
    private DanceController dc;
    private GuitarController gc;

    public GuitarAdaptDance(DanceController dc){
        this.dc = dc;
    }
    public GuitarAdaptDance(GuitarController gc){
        this.gc = gc;
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
    }
    public void Step(direction dir){
        if(dir == direction.FORWARD){
            gc.PressFretButton(IGuitar.colors.GREEN);
        }else if(dir == direction.LEFT){
            gc.PressFretButton(IGuitar.colors.RED);
        }else if(dir == direction.RIGHT){
            gc.PressFretButton(IGuitar.colors.YELLOW);
        }else if(dir == direction.BACK){
            gc.PressFretButton(IGuitar.colors.BLUE);
        }else if(dir == direction.MIDDLE){
            gc.PressFretButton(IGuitar.colors.ORANGE);
        }
        PressPick();
    }
    public void PressPick(){
        System.out.println("PICK");
    }
    public void PressTremelo(){

    }
}