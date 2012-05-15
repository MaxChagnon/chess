package gui.renderers;

import org.junit.Test;

import javax.swing.*;

import static builders.QueenBuilder.aQueen;
import static gui.renderers.PieceRenderer.PIECE_BLACK;
import static gui.renderers.PieceRenderer.PIECE_WHITE;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class QueenRendererTest {

    JButton button = new JButton();

    @Test public void
    buttonVisitSetsTextToQ() {
        button.setText( "some text" );
        new QueenRenderer( aQueen().build() ).visit( button );
        assertThat( button.getText(), equalTo( "Q") );
    }

    @Test public void
    buttonVisitSetsForegroundToWhiteForAWhiteQueen() {
        button.setForeground( PIECE_BLACK);
        new QueenRenderer( aQueen().white().build() ).visit( button );
        assertThat( button.getForeground(), equalTo( PIECE_WHITE ));
    }

    @Test public void
    buttonVisitSetsForegroundToBlackForABlackQueen() {
        button.setForeground( PIECE_WHITE);
        new QueenRenderer( aQueen().black().build() ).visit( button );
        assertThat( button.getForeground(), equalTo( PIECE_BLACK ));
    }

}