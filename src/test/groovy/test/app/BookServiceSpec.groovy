package test.app

import grails.gorm.transactions.Transactional
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
@Transactional
class BookServiceSpec extends Specification {

    @Inject
    BookService bookService

    def "Test getAllBooks"() {
        given:
        new Book(title: "Something").save()

        expect:
        bookService.getAllBooks().size() == 1
    }

}
