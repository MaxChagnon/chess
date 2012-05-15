package gui;

import chess.Pawn;
import chess.Queen;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static builders.PawnBuilder.aPawn;
import static builders.QueenBuilder.aQueen;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GameFrameTest {

    GameFrame frame;

    @Before
    public void
    showGame() {
        frame = new GameFrame();
    }

    @Test public void
    gridLayout() {
        assertThat( frame.getContentPane().getLayout(), instanceOf( GridLayout.class ) );
    }
    
    @Test public void
    allComponentsMustBeOpaque() {
        Component[] all = frame.getContentPane().getComponents();
        for( Component component : all) {
            assertTrue( component.getName() + " should be opaque", component.isOpaque() );
        }
    }

    @Test public void
    allCellsMustHaveAnEmptyContentByDefault() {
        Component[] all = frame.getContentPane().getComponents();
        for( Component component : all) {
            assertThat( ((JButton) component).getText(), equalTo( "" ) );
        }
    }

    @Test public void
    createTheALetterFromIntValue97() {
        assertThat( new Character( (char) 97 ).toString(), equalTo( "a" ));
    }
    
    @Test public void
    recordPiecesPosition() {
        Queen queen = aQueen().white().on( "d1" ).build();
        Pawn pawn = aPawn().white().on( "d2" ).build();
        frame.display( queen, pawn );
        assertThat( (Queen) frame.getPieceByPosition( "d1" ), equalTo( queen ) );
        assertThat( (Pawn) frame.getPieceByPosition( "d2" ), equalTo( pawn ) );
    }
    
}