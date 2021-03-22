package abhishekissue11768

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import grails.validation.ValidationException
import spock.lang.Specification


class PersonServiceSpec extends Specification implements ServiceUnitTest<PersonService>, DataTest {

    Class<?>[] getDomainClassesToMock() {
        [Person]
    }

    void "test a valid name"() {
        when:
        service.savePerson 'Jeff'

        then:
        noExceptionThrown()
    }

    void "test an invalid name"() {
        when:
        service.savePerson 'jeff'

        then:
        thrown(ValidationException)
    }
}
