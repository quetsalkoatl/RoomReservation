package roomreservation

class BookingController {

    static scaffold = Booking

    def all() {
        def bookings = Booking.findAll()
        respond bookings
    }

    def forDierk() {
        Person.findByEmail("dierk.koenig@fhnw.ch")
        respond Booking.findAllByBooker()
    }

    def byEmail(String email) {
        respond Booking.findAllByBooker(Person.findByEmail(email))
    }

}
