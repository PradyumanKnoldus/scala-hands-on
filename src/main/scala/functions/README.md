## Functions

Scala is a programming language that supports various types of functions

>Anonymous functions

Anonymous functions are functions that do not have a name. They are also known as lambda functions or function literals. They are defined using the => symbol.

Example:

val add = (a: Int, b: Int) => a + b

>Higher-order functions

Higher-order functions are functions that take one or more functions as arguments or return a function as a result.

Example:

def applyFunction(f: Int => Int, x: Int): Int = f(x)

>Curried functions

Curried functions are functions that take multiple arguments one at a time. This means that a function that takes n arguments can be converted into n functions that take one argument each.

Example:

def add(a: Int)(b: Int): Int = a + b

>Partially applied functions

Partially applied functions are functions that are created by fixing some of the parameters of an existing function. This creates a new function that takes fewer arguments than the original function.

Example:

def add(a: Int, b: Int): Int = a + b
val add2 = add(2, _: Int)

>Infix functions

Infix functions are functions that can be called using infix notation, which means that they are placed between their arguments.

Example:

def add(a: Int, b: Int): Int = a + b
val result = 2 add 3

>Polymorphic functions

Polymorphic functions are functions that can operate on values of different types.

Example:

def identity[A](a: A): A = a

>Recursive functions

These are functions that call themselves. Recursive functions can be used to solve problems that can be broken down into smaller sub-problems.

Example:

def factorial(n: Int): Int = {
if (n == 0) 1 else n * factorial(n - 1)
}

val result = factorial(5)

>Partial functions

These are functions that are defined for only a subset of the input values. Partial functions are defined using the PartialFunction trait and can be composed with other functions.

Example:

val divide: PartialFunction[Int, Int] = {
case d if d != 0 => 42 / d
}

val result = divide.applyOrElse(0, (x: Int) => 0)



