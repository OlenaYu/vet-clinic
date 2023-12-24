package serenitylabs.tutorials.vetclinic.playingball.model;

public class Child {

    public void goPlay(Game game) {
        Player gameToPlay = PlayerForGame.called(game);//PlayerForGame is a factory class that chooses what implementation
        //of the game to provide
        gameToPlay.play();
    }
}
