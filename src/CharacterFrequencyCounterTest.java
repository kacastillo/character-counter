import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {

    @Test
    void testCharacterShowsUpMultipleTimesGivesCorrectFrequency() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        // Act
        int actual = counter.getFrequency('l'); // what i want to check

        // Assert
        assertEquals(2, actual); //expected response, vs actual response
    }

    @Test
    void testGetRelativeFrequencyReturns0ForMissingCharacter() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");

        // Act
        double actual = counter.getRelativePercentage('x'); // what i want to check

        // Assert
        assertEquals(0.0, actual, 0.0001); //expected response, vs actual response
    }
    
}