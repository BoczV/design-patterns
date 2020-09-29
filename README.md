# Design patterns

## Introduction

My design-patterns project is a free pet project, which collects the most important and well-known patterns I heard of before.
In my point of view, these patterns could be essentials seeing the fact that they can solve daily and common problems in programming.
I plan to implement other design patterns as well in the future.

## Patterns

### Adapter
Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern 
combines the capability of two independent interfaces.
This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces.

### Builder
Builder pattern builds a complex object using simple objects and using a step by step approach. 
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
A Builder class builds the final object step by step. This builder is independent of other objects.

### Factory
Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides 
one of the best ways to create an object.
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

### Observer
Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to 
be notified automatically. Observer pattern falls under behavioral pattern category.

### Singleton
Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides 
one of the best ways to create an object.
This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. 
This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

### State
In State pattern a class behavior changes based on its state. This type of design pattern comes under behavior pattern.
In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.

### Strategy
In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.
In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. 
The strategy object changes the executing algorithm of the context object.
