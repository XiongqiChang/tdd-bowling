import com.twu.BowlingGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    private BowlingGame game;

    @BeforeEach
    void newBowlingClass(){
        game = new BowlingGame();
    }
    @Test
    void shot_zero_score(){
        for (int i = 0; i < 20; i ++){
            game.throwBowling(0);
        }
        assertEquals(0,game.score());
    }

    @Test
    void shot_miss_score(){
        game.throwBowling(2);
        game.throwBowling(1);
        for (int i = 0; i < 18; i ++){
            game.throwBowling(3);
        }
        assertEquals(57,game.score());
    }


    @Test
    void shot_strike_score(){
        for (int i = 0; i < 12; i ++){
            game.throwBowling(10);
        }
        assertEquals(300,game.score());
    }

    @Test
    void shot_spare_score(){
        game.throwBowling(3);
        game.throwBowling(7);
        for (int i = 0; i < 19; i ++){
            game.throwBowling(5);
        }
        assertEquals(150,game.score());
    }
}
