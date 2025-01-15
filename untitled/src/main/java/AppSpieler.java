import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppSpieler {
    static List<Spieler> spielers = new ArrayList<>();
    static List<Veriene> verienes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose what to do");
            System.out.println("player crud");
            System.out.println("veriene crud");
            System.out.println("filter ort");
            System.out.println("show spieler die an einem bestimmten verein spielen");
            System.out.println("sortiere spieler eines bestimmten verien nach price");

            int response = Integer.parseInt(scanner.nextLine());

            switch (response) {
                case 1:
                    playerCRUD();
                    break;
                case 2:
                    verieneCRUD();
                    break;
                case 3:
                    filterOrt();
                    break;
                case 4:
                    showSpielerVerein();
                    break;
                case 5:
                    sortPrice();
                    break;
                default:
                    System.out.println("not an option");
            }
        }

    }

    private static void filterOrt() {
        String ort = scanner.nextLine();
        for (Veriene veriene : verienes) {
            if (veriene.getName().equalsIgnoreCase(ort)) {
                System.out.println(veriene.getName());

            }
        }

    }

    private static void showSpielerVerein() {
        System.out.println("Enter verein name");
        String name = scanner.nextLine();
        for (Veriene veriene : verienes) {
            if (veriene.getName().equalsIgnoreCase(name)) {
                System.out.println(veriene.getSpielers());
            }
        }
    }

    private static void sortPrice() {
        System.out.println("absteigend/fallend");
        int response = Integer.parseInt(scanner.nextLine());

        switch (response) {
            case 1:
                absteigend();
                break;
            case 2:
                fallend();
                break;
        }

    }

    private static void fallend() {
        System.out.println("Enter id");
        final int id = Integer.parseInt(scanner.nextLine());
        List<Spieler> spielers1 = new ArrayList<>();
        int[] prices;

        for (Veriene veriene : verienes) {
            if (veriene.id == id) {
                spielers1 = veriene.getSpielers();
                spielers1.stream().sorted().forEach(spieler -> spieler.getPrice());

            }

        }
    }


    private static void absteigend() {
        System.out.println("Enter id");
        final int id = Integer.parseInt(scanner.nextLine());
        List<Spieler> spielers1 = new ArrayList<>();
        int[] prices;

        for (Veriene veriene : verienes) {
            if (veriene.id == id) {
                spielers1 = veriene.getSpielers();
                spielers1.stream().sorted();

            }

        }
    }

    private static void verieneCRUD() {
        while (true) {

            System.out.println("Choose what to do");
            System.out.println("create");
            System.out.println("read");
            System.out.println("update");
            System.out.println("delete");

            int response = Integer.parseInt(scanner.nextLine());

            switch (response) {
                case 1:
                    createVerein();
                    break;
                case 2:
                    readVerein();
                    break;
                case 3:
                    updateVerein();
                    break;
                case 4:
                    deleteVerein();
                default:
                    System.out.println("not an option");
            }
        }
    }

    private static void deleteVerein() {
        System.out.println("Enter id");
        final int id = Integer.parseInt(scanner.nextLine());
        for (Veriene veriene : verienes) {
            if (veriene.id == id) {
                // verienes.removeIf(veriene->veriene.getId()==id);
            }
        }
    }

    private static void updateVerein() {
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String stadt = scanner.nextLine();
        for (Veriene veriene : verienes) {
            if (veriene.id == id) {
                veriene.setName(name);
            }
            veriene.setStadt(stadt);
        }
    }

    private static void readVerein() {
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        for (Veriene veriene : verienes) {
            if (veriene.id == id) {
                System.out.println("Verein" + veriene.getName() + veriene.getStadt() + veriene.getId() + veriene.getSpielers());

            }
        }
    }

    private static void createVerein() {
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter stadt");
        String stadt = scanner.nextLine();


        Veriene veriene = new Veriene(id, name, stadt);
        verienes.add(veriene);
        System.out.println("Verein" + veriene.getName() + veriene.getStadt() + veriene.getId() + veriene.getSpielers());
    }

    private static void playerCRUD() {
        System.out.println("Choose what to do");
        System.out.println("create");
        System.out.println("read");
        System.out.println("update");
        System.out.println("delete");

        int response = Integer.parseInt(scanner.nextLine());

        switch (response) {
            case 1:
                createPlayer();
                break;
            case 2:
                readPlayer();
                break;
            case 3:
                updatePlayer();
                break;
            case 4:
                deletePlayer();
            default:
                System.out.println("not an option");

        }


    }

    private static void deletePlayer() {
        System.out.println("Enter name");
        final String name = scanner.nextLine();
        for (Spieler spieler : spielers) {
            if (spieler.getName().equalsIgnoreCase(name)) {
                //spielers.removeIf(spieler->spieler.getName().equalsIgnoreCase(name));
            }
        }
    }

    private static void updatePlayer() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Position");
        String position = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = Integer.parseInt(scanner.nextLine());

        for (Spieler spieler : spielers) {
            if (spieler.getName().equalsIgnoreCase(name)) {
                spieler.setAge(age);
                spieler.setPosition(position);
                spieler.setPrice(price);
                System.out.println(spieler.getPosition() + spieler.getAge() + spieler.getPrice());

            }
        }
    }

    private static void readPlayer() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        for (Spieler spieler : spielers) {
            if (spieler.getName().equalsIgnoreCase(name)) {
                System.out.println(spieler.getPosition() + spieler.getAge() + spieler.getPrice());
            }
        }
    }

    private static void createPlayer() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter position");
        String position = scanner.nextLine();

        System.out.println("Enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter price");
        int price = Integer.parseInt(scanner.nextLine());
        Spieler spieler = new Spieler(name, position, age, price);
        spielers.add(spieler);
        System.out.println("Spieler" + spieler.getName() + "" + spieler.getPosition() + "" + spieler.getAge() + "" + spieler.getPrice());

    }

}
