package Classes;

import Interfaces.Play;

import java.util.List;
import java.util.Stack;

public class BasicList implements Play {
    private String name;
    private List<Song> playlist;

    public BasicList(String name) {
        this.name = name;
        playlist = new Stack<>();
    }

    public BasicList(String name, List<Song> playlist) {
        this.name = name;
        this.playlist = playlist;
    }

    @Override
    public void play() {
        if (!(playlist.isEmpty())) {
            System.out.println("Playing: " + this.playlist.getFirst());
            this.playlist.addLast(this.playlist.removeFirst());
        } else {
            System.out.println("The playlist is empty");
        }

    }

    @Override
    public void addToTheQueue(Song song) {
        this.playlist.addLast(song);
        System.out.println("Added to queue");
    }

    @Override
    public void deleteFromTheQueue() {
        System.out.println("To get access  to this option, get the PREMIUM PACK");
    }

    @Override
    public void viewList() {
        if (!(playlist.isEmpty())) {
            for (Song s : playlist) {
                System.out.println(s + "\n");
            }
        } else {
            System.out.println("The playlist is empty");
        }
    }
}
