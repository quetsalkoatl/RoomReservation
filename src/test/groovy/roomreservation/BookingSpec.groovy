package roomreservation

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BookingSpec extends Specification implements DomainUnitTest<Booking> {

    def "test"() {
        when:
        domain.slot = "bla"
        then:
        !domain.validate(["slot"])
    }
}
