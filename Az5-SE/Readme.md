# گزارش

## توضیح Abstract Factory

در این بخش ابتدا تست ها را طراحی کرده و سپس به کمک آن ها مدل را پیاده سازی میکنیم.
همانطور که در ویدیو گفته شده بود هدف ساخت دو نوع درخت و گل ایرنی و ژاپنی است برای این کار دو نوع Garden Creator ایجاد کرده و به کمک آن ها مدل را میسازیم. تست ها همگی به درستی قبول شده اند.

<img width="1330" alt="Screenshot 2022-12-09 at 1 10 50 PM" src="https://user-images.githubusercontent.com/45598863/206701321-21a0efc7-d7f5-4ffd-8f64-77a994a4e544.png">
<img width="1435" alt="Screenshot 2022-12-09 at 1 39 47 PM" src="https://user-images.githubusercontent.com/45598863/206701352-94d49204-9c21-4aa2-be3d-b3396dbc8dc6.png">


## توضیح Prototype

در این بخش طراحی یک روش برای ایجاد یک clone برای یک شی است برا این کار کافیست کلاس مورد نظر را از واسط Clonable ارث بری کرده و تابع clone را پیاده سازی کنیم. برای طراحی این بخش نیز از روش TDD استفاده شده است . شی مورد نظر اینجا یه دایره است.
<img width="1299" alt="Screenshot 2022-12-09 at 2 18 34 PM" src="https://user-images.githubusercontent.com/45598863/206701816-5b419c1b-137f-4b7e-8388-093dfefde3b9.png">
<img width="1201" alt="Screenshot 2022-12-09 at 3 54 10 PM" src="https://user-images.githubusercontent.com/45598863/206701888-0d27f881-a3a6-49d5-b67a-bc62099be855.png">

## توضیح Builder

در این بخش هدف طراحی یک برنامه به کمک پترن Builder است. در این بخش سعی شده به کمک این پترن یک لپتاپ را ایجاد کرد. دو نوع لپتاپ داریم Asus و MacLaptop که ابتدا برای هر دوی آن ها Builder را طراحی کرده و به کمک تابع های construct در Director ویژگی های هر یک را میسازیم. در این بخش نیز از روش TDD استفاده شده است.
<img width="1341" alt="Screenshot 2022-12-09 at 3 27 20 PM" src="https://user-images.githubusercontent.com/45598863/206702568-b9680196-932d-43cc-b43f-ccf3245d1356.png">
<img width="1396" alt="Screenshot 2022-12-09 at 3 39 35 PM" src="https://user-images.githubusercontent.com/45598863/206702619-3756d929-0965-40a2-857a-6760f89be1c7.png">


# سوالات

## 1
GoF is the short name for the ironic computer science book, Gang of Four. It's official name is "Design Patterns: Elements of Reusable Object-Oriented Software"
The three design patterns are described below:

### Creational Design Patterns
Abstract Factory: Allows the creation of objects without specifying their concrete type.
Builder: Uses to create complex objects.
Factory Method: reates objects without specifying the exact class to create.
Prototype: eates a new object from an existing object.
Singleton: sures only one instance of an object is created.

### Structural Design Patterns
Adapter:Allows for two incompatible classes to work together by wrapping an interface around one of the existing classes.
Bridge: ecouples an abstraction so two classes can vary independently.
Composite: akes a group of objects into a single object.
Decorator:Allows for an object’s behavior to be extended dynamically at run time.
Facade: Pvides a simple interface to a more complex underlying object.
Flyweight: educes the cost of complex object models.
Proxy: rovides a placeholder interface to an underlying object to control access, reduce cost, or reduce complexity.

### Behavior Design Patterns
Chain of Responsibility: elegates commands to a chain of processing objects.
Command: Creates objects which encapsulate actions and parameters.
Interpreter: Implements a specialized language.
Iterator: Accesses the elements of an object sequentially without exposing its underlying representation.
Mediator: Allows loose coupling between classes by being the only class that has detailed knowledge of their methods.
Memento: Provides the ability to restore an object to its previous state.
Observer: Is a publish/subscribe pattern which allows a number of observer objects to see an event.
State: Allows an object to alter its behavior when its internal state changes.
Strategy: Allows one of a family of algorithms to be selected on-the-fly at run-time.
Template Method: Defines the skeleton of an algorithm as an abstract class, allowing its sub-classes to provide concrete behavior.
Visitor: Separates an algorithm from an object structure by moving the hierarchy of methods into one object.


## 2

### Creational Patterns
These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.

## 3

The short answer is this:
Principles apply to all of programming. You should have a very good reason any time you choose not to follow principles.
Patterns apply to specific, common problems. You should have a very good reason any time you choose to implement a pattern.

Design principles provide high-level guidelines to design better software applications. They do not provide implementation guidelines and are not bound to any programming language. The SOLID (SRP, OCP, LSP, ISP, DIP) principles are one of the most popular sets of design principles. For example, the Single Responsibility Principle (SRP) suggests that a class should have only one reason to change. This is a high-level statement that we can keep in mind while designing or creating classes for our application. SRP does not provide specific implementation steps but it's up to you how you implement SRP in your application.

## 4

Singleton design pattern violates the Single Responsibility Principle since the objects control how they are created and manage their life-cycle. This clearly contradicts the Single Responsibility Principle which states that a class should have one and only one reason for change. In order to limit the ability of creating instances of a class, a better alternative is in leveraging the factory or builder design patterns and then encapsulating the object creation logic. Another problem with the Singleton design pattern is that you can't extend them easily. You would want to take advantage of the Decorator design pattern to change the behavior.

Note: Some people think that Singleton design pattern breaks the Open/Close principle. But it is not exactly true. It is a common misconception that the Singleton design pattern prohibits inheritance. Singleton does not inherently break the OCP. It just happens to be most commonly implemented in violation of the OCP by developers who have not read the GoF book. 

