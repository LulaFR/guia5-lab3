package Classes;

import Interfaces.Play;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PremiumList implements Play {
    private String name;
    private List<Song> playlist;
    private Scanner scanner;

    public PremiumList(String name) {
        this.name = name;
        playlist = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    public PremiumList(String name, List<Song> playlist) {
        this.name = name;
        this.playlist = playlist;
        scanner = new Scanner(System.in);
    }

    @Override
    public void play() {
        if (!(playlist.isEmpty())) {
            viewList();
            try {
                System.out.print("Play >>");
                Integer num = Integer.parseInt(scanner.nextLine());
                System.out.println("\nPlaying: " + playlist.get(num-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("The option you chose isn't available");
            }
        } else {
            System.out.println("The playlist is empty");
        }

    }

    @Override
    public void addToTheQueue(Song song) {
        playlist.add(song);
        System.out.println("Added to queue");
    }

    @Override
    public void deleteFromTheQueue() {
        if (!(playlist.isEmpty())) {
            viewList();
            try {
                System.out.print("Delete >>");
                Integer num = Integer.parseInt(scanner.nextLine());
                playlist.remove(num-1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("The option you chose isn't available");
            }
        } else {
            System.out.println("The playlist is empty");
        }

    }

    @Override
    public void viewList() {
        if (!(playlist.isEmpty())) {
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println("#" + (i+1) + " " + playlist.get(i) + "\n");
            }
        } else {
            System.out.println("The playlist is empty");
        }

    }
}
