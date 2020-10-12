package spock_framework

import spock.lang.Specification
import spock.lang.Unroll

class SpockTest extends  Specification{

    int sum

    def setup() {
        sum = 5
        println("Sum je 5")
    }

    def 'Method one'() {
        expect:
        1 + 3 == 2
    }

    def secondMethod() {

        given: 'Set sum to be 6'
            int a = 1
            int b = -1

        when:
            int c = a + b + sum

        then:
            c == sum

    }

    @Unroll
    def 'Stepen broja'() {
        expect:
            Math.pow(a, b) == c

        where:
            a | b | c
            1 | 2 | 1
            2 | 2 | 4
            3 | 2 | 9

    }




    def cleanup() {

    }


}