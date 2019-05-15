package test

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    def testing() {
        return [
                key1: true,
                key2: 'Some text',
                key3: 123
        ]
    }
}
