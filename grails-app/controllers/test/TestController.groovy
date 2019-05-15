package test

import grails.converters.JSON

class TestController {
    TestService testService

    def index() {
        render testService.testing() as JSON
    }
}
