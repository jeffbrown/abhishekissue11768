package abhishekissue11768

import grails.gorm.transactions.Transactional

@Transactional
class PersonService {

    Person savePerson(String name) {
        new Person(firstName: name).save(failOnError: true)
    }
}
