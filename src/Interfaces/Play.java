package Interfaces;

import Classes.*;

public interface Play {
    public void play();
    public void addToTheQueue(Song song);
    public void deleteFromTheQueue();
    public void viewList();
}
