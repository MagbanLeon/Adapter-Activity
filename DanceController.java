public class DanceController implements IDance{
    public void Step(direction dir){
        if(dir == direction.FORWARD){
            System.out.println("FORWARD");
        }else if(dir == direction.LEFT){
            System.out.println("LEFT");
        }else if(dir == direction.RIGHT){
            System.out.println("RIGHT");
        }else if(dir == direction.BACK){
            System.out.println("BACK");
        }else if(dir == direction.MIDDLE){
            System.out.println("MIDDLE");
        }
    }
}