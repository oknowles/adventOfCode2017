package com.oliver.adventofcode

import spock.lang.Specification
import spock.lang.Unroll


class DayThreeTest extends Specification {

    private DayThree underTest

    def setup() {
        underTest = new DayThree()
    }

    def "run day three"() {
        given:
            int input = 325489

        when:
            int firstHalf = underTest.getManhattanDistance(input)
            int secondHalf = underTest.getNextMemoryValue(input)

        then:
            println "first half = $firstHalf"
            println "second half = $secondHalf"
    }

    @Unroll
    def "successfully return manhattan distance for input #input"() {
        when:
            int result = underTest.getManhattanDistance(input)

        then:
            result == expected

        where:
            input | expected
            1     | 0
            12    | 3
            23    | 2
            1024  | 31
    }

    @Unroll
    def "successfully compute square value for input #input"() {
        when:
            int result = underTest.getNextMemoryValue(input)

        then:
            result == expected

        where:
            input | expected
            1     | 2
            2     | 4
            3     | 4
            4     | 5
            5     | 10
            11    | 23
            307   | 330
            362   | 747
    }
}
