package at.fhtw.bic.uptimecalculatorbic.controller;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DowntimeControllerTest {
    @Test //Happy-Path 1
    public void calculateDowntimeMinutes_when0_then0() {
        // A - Arrange
        DowntimeController controller = new DowntimeController();

        // A - Act
        double result = controller.calculateDowntimeMinutes(0.0);

        // A - Assert
        assertEquals(0.0, result);

    }

    @Test //Happy-Path 2
    public void calculateDowntimeMinutes_when100_thenValid() {
        // A - Arrange
        DowntimeController controller = new DowntimeController();

        // A - Act
        double result = controller.calculateDowntimeMinutes(100.0);

        // A - Assert
        assertEquals(30*24*60, result);

    }


    @Test
    public void calculateDowntimeMinutes_whenNegative_thenThrow() {
        // A - Arrange
        DowntimeController controller = new DowntimeController();
        // A - Assert
        assertThrows(InvalidParameterException.class, () -> {
            // A -  Act
            double result = controller.calculateDowntimeMinutes(-10);
        });
    }

    @Test
    public void calculateDowntimeMinutes_whenGreater100_thenThrow() {
        // A - Arrange
        DowntimeController controller = new DowntimeController();

        // A - Assert
        assertThrows(InvalidParameterException.class, () -> {
            // A -  Act
            double result = controller.calculateDowntimeMinutes(110);
        });
    }


}
