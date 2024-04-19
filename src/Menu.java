import Classes.*;
import Enums.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static PremiumList premiumList;
    public static BasicList basicList;
    Boolean exit = false;
    public static Scanner scanner;
    public static void main(String[] args) {
        //List<Song> songs = cargarArrayListCanciones();
        scanner = new Scanner(System.in);
        premiumList = new PremiumList("Shower Songs", cargarArrayListCanciones());
        basicList = new BasicList("!(Shower Songs)");

        Menu menu = new Menu();
        menu.showMenu();

    }

    public void showBanner() {
        System.out.println("\t==S==P==O==T==I==F==Y=====");
        System.out.println("\t===S==P==O==T==I==F==Y====");
        System.out.println("\t====S==P==O==T==I==F==Y===");
        System.out.println("\t=====S==P==O==T==I==F==Y==");
        System.out.print("\n");
    }

    public void showOptions() {
        System.out.println("1. Play song");
        System.out.println("2. Add song");
        System.out.println("3. Delete song");
        System.out.println("4. View playlist");
        System.out.println("0. Exit");
    }

    public void showMenu() {
        showBanner();
        while (!exit) {
            showOptions();
            selectOption(getImput(),true);
        }
    }

    public void selectOption(Integer option, Boolean premium) {
        switch (option) {
            case 0:
                exit = true;
                break;
            case 1:
                playOption(premium);
                break;
            case 2:
                addOption(premium);
                break;
            case 3:
                deleteOption(premium);
                break;
            case 4:
                viewOption(premium);
                break;
            default:
                System.out.println("The option you chose isn't available");
                break;
        }
    }

    public Integer getImput() {
        Integer option = -1;
        try {
            System.out.print(">>");
            option = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("An error has ocurred. Please try again");
        }
        return option;
    }

    void playOption(Boolean premium) {
        String pause;
       if (premium) {
           premiumList.play();
       } else {
           basicList.play();
       }
       System.out.println("\nPress 'p' to pause and go back to the menu");
        do {
            System.out.print(">>");
            pause = scanner.nextLine();
        } while (pause.compareToIgnoreCase("p")!=0);

    }

    void deleteOption(Boolean premium) {
        if (premium) {
            premiumList.deleteFromTheQueue();
        } else {
            basicList.deleteFromTheQueue();
        }
    }

    void addOption(Boolean premium) {
        if (premium) {
            premiumList.addToTheQueue(new Song("EENIE MEENIE", new SongLength(2, 50), Genre.KPOP, new Album(2024, "EENIE MEENIE", new Artist("Chung Ha", 28, "Corea del Sur")), new Artist("Hongjoong", 25, "Corea del Sur")));
        } else {
            basicList.addToTheQueue(new Song("Soñé", new SongLength(4, 16), Genre.ROCK, new Album(2023, "Soñé", new Artist("Groove Sensation", 2, "México")), null));
        }
    }

    void viewOption(Boolean premium) {
        System.out.println("\nPLAYLIST\n");
        if (premium) {
            premiumList.viewList();
        } else {
            basicList.viewList();
        }
    }

    public static List<Song> cargarArrayListCanciones() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Víctimas Del Cielo", new SongLength(4, 13), Genre.ROCK, new Album(2016, "Brindando por Nada", new Artist("Las Pelotas", 36, "Argentina")), null));
        songs.add(new Song("Nada Es Real", new SongLength(4, 13), Genre.ROCK, new Album(2016, "Brindando por Nada", new Artist("Las Pelotas", 36, "Argentina")), null));
        songs.add(new Song("Soñé", new SongLength(4, 16), Genre.ROCK, new Album(2023, "Soñé", new Artist("Groove Sensation", 2, "México")), null));
        songs.add(new Song("Django", new SongLength(3, 11), Genre.KPOP, new Album(2023, "THE WORLD EP.2: OUTLAW", new Artist("ATEEZ", 6, "Corea del Sur")), null));
        //songs.add(new Song("EENIE MEENIE", new SongLength(2, 50), Genre.KPOP, new Album(2024, "EENIE MEENIE", new Artist("Chung Ha", 28, "Corea del Sur")), new Artist("Hongjoong", 25, "Corea del Sur")));
        return songs;
    }
}