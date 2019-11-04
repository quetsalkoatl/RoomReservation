package roomreservation

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class RoomSpec extends Specification implements DomainUnitTest<Room> {

    def "test"() {
        when:
        domain.name = "  "
        domain.max = 0
        then:
        !domain.validate(["max"])
        !domain.validate(["name"])
    }
}
