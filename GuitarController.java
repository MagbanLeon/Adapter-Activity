public class GuitarController implements IGuitar{
    public void PressFretButton(colors button){
        if(button == colors.GREEN){
            System.out.println("GREEN");
        }else if(button == colors.RED){
            System.out.println("RED");
        }else if(button == colors.YELLOW){
            System.out.println("YELLOW");
        }else if(button == colors.BLUE){
            System.out.println("BLUE");
        }else if(button == colors.ORANGE){
            System.out.println("ORANGE");
        }
    }
    public void PressPick(){

    }
    public void PressTremelo(){

    }
}