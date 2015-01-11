# DesignPatterns_chapter-2
Observer design pattern:
Defines a one-to-many dependency between objects so that when one object changes state,
all its dependents are notified and updated automatically.

Design principle
==================================================================================================
1. Identify the aspects of your application that vary and separate them from what stays the same.
==================================================================================================
The thing that varies in the observer pattern is the sate of the Subject and the number and types of Observers.
With this pattern, you can vary the objects that are dependent on the state of the Subject, without having to change that Subject.
That's called planning ahead ;)

==================================================================================================
2. Program to an interface, not an implementation
==================================================================================================
Both the Subject and Observer use interfaces.
The Subject keeps track of the objects implementing the Observer interface, while the observer register with, and get notified by the Subject interface.
As we have seen, this keeps things nice and loosely coupled.

==================================================================================================
3. Favor composition over inheritance
==================================================================================================
The Observer Pattern uses composition to compose any number of Observers with their Subjects.
These relationships aren't set up by some kind of inheritance hierarchy.
No, they are set up at runtime by composition. 
