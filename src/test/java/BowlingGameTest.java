import com.twu.BowlingGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {


    @Test
    void shot_zero_number(){
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i ++){
            game.roll(i);
        }
        assertEquals(0,game.score());
    }


    @Test
    void shot_score_number(){
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 10; i ++){
            game.roll(i);
        }
        assertEquals(0,game.score());
    }




}
