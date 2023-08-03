import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<City> destinations = new LinkedList<>();

        destinations.add(destination("Sydney"));
        destinations.add(destination("Adelaide"));
        destinations.add(destination("Alice Springs"));
        destinations.add(destination("Brisbane"));
        destinations.add(destination("Darwin"));
        destinations.add(destination("Melbourne"));
        destinations.add(destination("Perth"));
//        System.out.println(destinations);
        destinations.sort(Comparator.comparingInt(City -> City.getDistance()));
//        System.out.println(destinations);

        var destinationIterator = destinations.listIterator();
        boolean flag = true;
        while (flag) {
            menu();
            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim().toUpperCase();
            switch (input) {
                case "F","FORWARD" -> {
                    System.out.println(destinationIterator.next());
                }
                case "B","BACKWARD" -> {
                    System.out.println(destinationIterator.previous());
                }
                case "L","LISTPLACES","LIST PLACES" -> {
                    System.out.println(destinations);
                }
                case "M","MENU" -> {
                    menu();
                }
                case "Q","QUIT" -> {
                    System.out.println("Program stopped");
                    flag = false;
                }
            }
            }
    }

    private static City destination(String name) {
        switch (name) {
            case "Sydney" -> {
                return new City("Sydney", 0);
            }
            case "Adelaide" -> {
                return new City("Adelaide", 1374);
            }
            case "Alice Springs" -> {
                return new City("Alice Springs", 2771);
            }
            case "Brisbane" -> {
                return new City("Brisbane", 917);
            }
            case "Darwin" -> {
                return new City("Darwin", 3972);
            }
            case "Melbourne" -> {
                return new City("Melbourne", 877);
            }
            case "Perth" -> {
                return new City("Perth", 3923);
            }
        }
        return null;
    }

    private static void itinerary(LinkedList<City> destinations) {
        for (int i = 0; i < destinations.size(); i++) {
            System.out.println("Places to visit " + destinations);
        }
    }

    private static void menu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

}
