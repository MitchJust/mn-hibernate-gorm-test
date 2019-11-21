package test.app

import grails.gorm.transactions.Transactional

import javax.inject.Singleton

@Singleton
@Transactional
class BookService {

    List<Book> getAllBooks() {
        Book.list()
    }

}
