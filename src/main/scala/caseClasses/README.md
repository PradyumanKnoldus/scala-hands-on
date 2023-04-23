## Case Class
Case Classes are a type of class that provides a convenient and concise way of defining classes that are primarily used for immutable data storage and pattern matching.

>Immutable by default: All the fields of a case class are immutable by default, and their values cannot be changed once they have been initialized.

>Constructor arguments are public members: The constructor arguments of a case class are automatically made public, so they can be accessed from outside the class.

>Auto-generated methods: Several methods are automatically generated for case classes, such as a toString method, an equals method, a hashCode method, and a copy method, which makes it easy to create new instances of the class with modified field values.

>Pattern matching: Case classes are designed to work well with pattern matching, which is a powerful feature of Scala. Pattern matching allows you to match on the structure of a data type, and extract values from it.

Here's an example of a case class:

    case class Person(name: String, age: Int)

This defines a class called Person with two fields: name of type String and age of type Int. Because this is a case class, the fields are automatically made immutable, and several methods are generated automatically, including a toString method, an equals method, and a hashCode method.

You can create instances of the class like this:

    val john = Person("John", 30)
    val jane = Person("Jane", 25)

You can also use pattern matching with case classes. Here's an example:

    def describePerson(person: Person): String = person match {
    case Person(name, age) if age < 18 => s"$name is a minor"
    case Person(name, age) if age >= 18 && age <= 65 => s"$name is an adult"
    case Person(name, age) if age > 65 => s"$name is a senior citizen"
    }

### Roadmap to learn about Case Classes

>Start by reading the official Scala documentation on case classes. This will give you a basic understanding of what case classes are and how they are used in Scala.

>Next, experiment with creating some simple case classes in a Scala REPL (read-evaluate-print loop). This will give you hands-on experience with case classes and help solidify your understanding of their basic syntax and functionality.

>Learn about the differences between case classes and regular classes in Scala. Some key differences include automatic generation of methods like equals, hashCode, and toString, as well as the ability to pattern match on case classes.

>Explore how to use case classes for pattern matching. This is one of the most powerful features of case classes, and understanding how to use them in this context will greatly improve your ability to write concise and effective Scala code.

>Learn about the limitations of case classes. While they are extremely useful in many contexts, there are some scenarios where regular classes may be a better fit. Understanding these limitations will help you avoid common pitfalls when working with case classes.

>Finally, explore some advanced topics related to case classes, such as case objects, case class inheritance, and type erasure. These topics are more advanced, but understanding them will give you a more complete understanding of how case classes work in Scala.


