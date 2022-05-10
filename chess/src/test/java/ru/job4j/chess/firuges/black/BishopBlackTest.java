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

    @Test
    public void testWayF8toC5() {
        Figure bishop = new BishopBlack(Cell.F8);
        Cell[] way = bishop.way(Cell.C5);
        Cell[] expected = {Cell.E7, Cell.D6, Cell.C5};
        assertThat(expected, is (way));
    }

    @Test
    public void testWayH3toC8() {
        Figure bishop = new BishopBlack(Cell.H3);
        Cell[] way = bishop.way(Cell.C8);
        Cell[] expected = {Cell.G4, Cell.F5, Cell.E6, Cell.D7, Cell.C8};
        assertThat(expected, is (way));
    }


}