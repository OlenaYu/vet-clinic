package serenitylabs.tutorials.vetclinic.playingball;

import org.junit.Before;
import org.junit.Test;
import serenitylabs.tutorials.vetclinic.playingball.model.Child;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static serenitylabs.tutorials.vetclinic.playingball.model.Game.*;
/*
Step 1

Review the tests in the WhenToldToPlayBall class, and ensure they all run correctly. Now refactor the implementation
lines in the goPlay() method of the Child class into separate classes (PlayFootball, PlayTennis, etc).

Step 2

Make each of these classes implement the Player interface, which has only one method: play().
Then refactor the goPlay() method to use this interface, and delegate the choice of the Player
 implementation to another method.
 */

public class WhenToldToPlayBall {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setOutput() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void child_should_play_cricket_if_asked() {

        Child bill = new Child();

        bill.goPlay(Cricket);

        assertThat(output.toString(), equalTo("Hit the wicket"));
    }

    @Test
    public void child_should_play_tennis_if_asked() {

        Child bill = new Child();

        bill.goPlay(Tennis);

        assertThat(output.toString(), equalTo("Serve the ball"));
    }

    @Test
    public void child_should_play_football_if_asked() {

        Child bill = new Child();

        bill.goPlay(Football);

        assertThat(output.toString(), equalTo("Kick the ball"));
    }

    @Test
    public void child_should_play_handball_if_asked() {

        Child bill = new Child();

        bill.goPlay(Handball);

        assertThat(output.toString(), equalTo("Throw the ball"));
    }

    @Test
    public void child_should_play_hockey_if_asked() {

        Child bill = new Child();

        bill.goPlay(Hockey);

        assertThat(output.toString(), equalTo("Hit the ball with the stick"));
    }
}
