import com.twu.BowlingGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {


    @Test
    void shot_zero_number(){
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i ++){
            game.roll(0);
        }
        assertEquals(0,game.score());
    }


    @Test
    void shot_score_20_number(){
        BowlingGame game = new BowlingGame();
        game.roll(2);
        game.roll(1);
        for (int i = 0; i < 18; i ++){
            game.roll(3);
        }
        assertEquals(57,game.score());
    }


    @Test
    void shot_all_number(){
        BowlingGame game = new BowlingGame();

        for (int i = 0; i < 12; i ++){
            game.roll(10);
        }
        assertEquals(300,game.score());
    }


}
