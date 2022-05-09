package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Figure bishop = new BishopBlack(Cell.E4);
        assertThat(Cell.E4, is (bishop.position()));
    }

    @Test
    public void testCopy() {
        Figure bishop = new BishopBlack(Cell.F1);
        Figure bishop2 = bishop.copy(Cell.C4);
        Cell expected = bishop2.position();
        assertThat(expected, is (Cell.C4));
    }
}