package org.fundacionjala.coding.norman.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by NORMAN on 2/7/2017.
 */
public class ChildrenTest {
    /**
     * Test to verify the amount if the rented days
     * for a Children movie is less than 3 e.g. 1
     */
    private Movie childrenInstance;

    /**
     * create children movie.
     */
    @Before
    public void before() {
        childrenInstance = new Children("Test");
    }

    /**
     * test days is less 13.
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsLessThanThree() {
        // given:

        // when:
        final double actualResult = childrenInstance.calculateAmount(1);

        // then
        final double expectedResult = 1.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the amount if the rented days
     * for a Children movie is greater than 3 e.g. 10
     */
    @Test
    public void testCalculateAmountWhenTheRentedDaysIsGreaterThanThree() {
        // given:

        // when:
        final double actualResult = childrenInstance.calculateAmount(10);

        // then:
        final double expectedResult = 10.5;
        assertEquals(0, expectedResult, actualResult);
    }

    /**
     * Test to verify the frequent renter points for a Children movie
     * is 1 for different rented days.
     */
    @Test
    public void testCalculateFrequentRenterPointsVerifyTheResultIsOne() {
        // given:

        // when:
        final int actualResultOne = childrenInstance.calculateFrequentRenterPoints(1);

        // then:
        final int expectedResultOne = 1;
        assertEquals(expectedResultOne, actualResultOne);

        // given: childrenInstance

        // when:
        final int actualResultTwo = childrenInstance.calculateFrequentRenterPoints(3);

        // then:
        final int expectedResultTwo = 1;
        assertEquals(expectedResultTwo, actualResultTwo);

        // give: childrenInstance

        // when:
        final int actualResultThree = childrenInstance.calculateFrequentRenterPoints(1000);

        // then:
        final int expectedResultThree = 1;
        assertEquals(actualResultThree, expectedResultThree);
    }

    /**
     * test getRental.
     */
    @Test
    public void getRental() {


        Movie movie = new Children("Rental");

        Rental movieRental = new Rental(movie, 12);
        int resultExpected = movieRental.getDaysRented();

        assertEquals(12, resultExpected);

    }
}