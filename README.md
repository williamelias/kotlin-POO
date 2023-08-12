# kotlin-POO
This repository is designed to implement OO concepts with Kotlin language

## OO concepts

### Inheritance and Interface

The Inheritance ocurrs when one class extends behaviors and states of another class, one 
example of this is class Animal that is extended|inherited by class Dog or Cat, all Cat and Dog objects are Animal and have their methods and attributes.

<hr>

The Interface class is an agreement of behaviors, all classes that implements an interface x must 
have all methods of Interface x
<hr>

[Example of inheritance and interface]('main/kotlin/InheritanceAndInterface')

### Dependency

A dependency between two or more classes means that one uses the other, an example is one
that has (uses) a Period class to validate the start and end, after that it does not use a period anymore.
The use of the Period class is temporary

obs: The dependency is weak compared with others and it may be possible to use the dependency with abstract class or interface to get more stronger dependency

<hr>


Association between two or more classes means that one receives another class by parameter and after saving it has class attribute, different from Dependency which uses another class and then no longer accesses it.

[Example of Dependency and Association]('main/kotlin/DependencyAndAssociation')

### Aggregation and Composition

<hr>

