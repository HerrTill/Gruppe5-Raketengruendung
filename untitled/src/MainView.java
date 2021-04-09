public class MainView {
    public MainView(MainModel model){
        Start start = model.getStart();
        System.out.println(start.getHello_World());
        Rechtsformfinder finder = start.getFinder();
        System.out.println(finder.getName());

    }
}
