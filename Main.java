public class Main{
    public static void main(String[] args) {
        DanceController dc = new DanceController();
        GuitarController gc = new GuitarController();

        dc.Step(IDance.direction.LEFT);
        gc.PressFretButton(IGuitar.colors.GREEN);

        GuitarAdaptDance gad = new GuitarAdaptDance(dc);

        gad.PressFretButton(IGuitar.colors.GREEN);

        GuitarAdaptDance gad2 = new GuitarAdaptDance(gc);

        gad2.Step(IDance.direction.LEFT);
    }
}
