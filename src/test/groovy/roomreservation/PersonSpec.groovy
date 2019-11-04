package roomreservation

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    def "test"() {
        when:
        domain.firstName = null
        then:
        !domain.validate(['firstName'])

        when:
        domain.firstName = "   "
        then:
        !domain.validate(['firstName'])
    }

}
