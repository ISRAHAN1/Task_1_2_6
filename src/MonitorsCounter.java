
public class MonitorsCounter {
    public static void main(String[] args) {
        int monitors = 70;
        int programmers = 30;
        int rez = drawIsMonitorsCounter(monitors, programmers);


        System.out.println("monitor=" + rez);
    }

    public static int drawIsMonitorsCounter(int monitors, int programmers) {
        int kol = monitors % programmers;

        return kol;
    }
}