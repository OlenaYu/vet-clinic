package serenitylabs.tutorials.vetclinic.playingball.model;

/*
Step 2

Make each of these classes implement the Player interface, which has only one method: play().
Then refactor the goPlay() method to use this interface, and delegate the choice of the Player
 implementation to another method.
 */
public interface Player {
    void play();
}
