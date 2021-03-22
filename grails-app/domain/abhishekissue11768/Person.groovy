package abhishekissue11768

class Person {
    String firstName
    static constraints = {
        firstName matches: /[A-Z].*/
    }
}
