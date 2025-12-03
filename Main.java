public class Main{
    public static void main(String[] args) {
        DanceController dc = new DanceController();
        GuitarController gc = new GuitarController();

        dc.Step(IDance.direction.LEFT);
        gc.PressFretButton(IGuitar.colors.GREEN);

        IDance gad = new GuitarAdaptDance(gc);
        gad.Step(IDance.direction.LEFT);

        IGuitar gad2 = new GuitarAdaptDance(dc);
        gad2.PressFretButton(IGuitar.colors.GREEN);
    }
}

// IDance dc = new GuitarDanceAdapt(gc);
// (Interact) => (Do)