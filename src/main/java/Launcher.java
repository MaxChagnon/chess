import gui.GameFrame;

import static builders.PawnBuilder.aPawn;
import static builders.QueenBuilder.aQueen;

public class Launcher {


    public static void main(String... arg) {
        GameFrame game = new GameFrame();
        game.setVisible( true );

        game.display(
                aPawn().white().on( "a2" ).build(),
                aPawn().white().on( "b2" ).build(),
                aPawn().white().on( "c2" ).build(),
                aPawn().white().on( "d2" ).build(),
                aPawn().white().on( "e2" ).build(),
                aPawn().white().on( "F2" ).build(),
                aPawn().white().on( "g2" ).build(),
                aPawn().white().on( "h2" ).build(),

                aPawn().black().on( "a7" ).build(),
                aPawn().black().on( "b7" ).build(),
                aPawn().black().on( "c7" ).build(),
                aPawn().black().on( "d7" ).build(),
                aPawn().black().on( "e7" ).build(),
                aPawn().black().on( "F7" ).build(),
                aPawn().black().on( "g7" ).build(),
                aPawn().black().on( "h7" ).build(),

                aQueen().white().on( "d1" ).build(),
                aQueen().black().on( "d8" ).build()
        );
    }
}
