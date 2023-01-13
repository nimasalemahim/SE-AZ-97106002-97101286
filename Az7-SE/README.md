آز مهندسی نرم افزار

آزمایش 7

-------

نیما سالم

علیرضا ایلامی


## مینی جاوا چیست؟
Mini-Java is a subset of Java. MiniJava compiler implement a compiler for the Mini-java
programming language.

## قوانین
```
Goal --> Source EOF
Source --> ClassDeclarations MainClass
MainClass --> class Identifier { public static void main() { VarDeclarations Statements}}
ClassDeclarations --> ClassDeclaration ClassDeclarations | lambda
ClassDeclaration --> class Identifier Extension { FieldDeclarations MethodDeclarations }
Extension --> extends Identifier | lambda
FieldDeclarations --> FieldDeclaration FieldDeclarations | lambda
FieldDeclaration --> static Type Identifier ;
VarDeclarations --> VarDeclaration VarDeclarations | lambda
VarDeclaration --> Type Identifier ;
MethodDeclarations --> MethodDeclaration MethodDeclarations | lambda
MethodDeclaration --> public static Type Identifier ( Parameters ) { VarDeclarations Statements return GenExpression ; }
Parameters --> Type Identifier Parameter | lambda
Parameter --> , Type Identifier Parameter | lambda
Type --> boolean | int
Statements --> Statements Statement | lambda
Statement --> { Statements } | if ( GenExpression ) Statement else Statement | while ( GenExpression ) Statement | System.out.println ( GenExpression ) ; | Identifier = GenExpression ;
GenExpression --> Expression | RelExpression
Expression --> Expression + Term | Expression - Term | Term
Term --> Term * Factor | Factor
Factor --> ( Expression ) | Identifier | Identifier . Identifier | Identifier . Identifier ( Arguments ) | true | false | Integer
RelExpression --> RelExpression && RelTerm | RelTerm
RelTerm --> Expression == Expression | Expression < Expression
Arguments --> GenExpression Argument | lambda
Argument --> , GenExpression Argument | lambda
Identifier --> <IDENTIFIER_LITERAL>
Integer --> <INTEGER_LITERAL>
```

شرح آزمایش:
## Separate query from modifier
Memory -> getTemp()
این تابع دو وظیفه مجزا داشت که آنها را از هم جدا کردیم و در دو تابع مختلف که متوالیا صدا زده میشوند، پیاده سازی کردیم.

## Self Encapsulated Field
3AddressCode class
all fields were public. Now they are changed to private, with adding the getter functions.

## Self Encapsulated Field
Memory class
all fields now have getter and setter. this will encapsulate these fields.

## Self Encapsulated Field
class Action
Like 3AddressCode, this class had many fields which were public. Now they are changed to private, and also final. Because they are going to be fixed and constant.

## State or Strategy
class GrammarSymbol
Added class "GrammarSymbolType" which is inherited by two other classes. So that GrammarSymbol has only one variable from "GrammarSymbolType" type.


------------------------------------------------------------------------

# پرسش ها
## سوال اول
### کد تمیز:
کد تمیز یا CleanCode کدی است که ما بتوانیم به سادگی کد را متوجه شویم و در عین سادگی بتوانیم آن را تغییر دهیم.
کدنویسی تمیز درواقع یک سری قالب بندی و قوانین مشخص برای برنامه نویسان است که به خواننده ی کد کمک میکند راحتتر کد را بفهمد و ادیت کند. این استانداردها کاملا مشخص و تعریف شده هستند و برای هر برنامه نویس حرفه ای و سنیور، اعمال آنها در پیاده سازی نرم افزار اجباری است.

به کدی که این استانداردها را رعایت نکرده باشد کد کثبف یا Dirty Code گفته میشود.

### بدهی فنی
Technical Debt
یک اصطلاح رایج است که به معنای این است که هزینه ضمنی دوباره کاری اضافی است که به دلیل انتخاب یک راه حل آسانتر و انتخاب نکردن راه حل طولانی تر ولی بهتر و کاملتر، ایجاد میشود. مشابه بدهی پولی، بدهی فنی هم اگر بازپرداخت نشود، چیزی شبیه بهره را ایجاد میکند و باعث میشود در مراحل بعدی ایجاد تغییرات هزینه بسیار بیشتری داشته باشد.

### بوی بد
bad Smell
بوی بد اصطلاحی است که برای کدنویسی نامرتب یا کثیف استفاده شده است، این اصطلاح می گوید بخشی از کد وجود دارد که در آینده باید تمیز باشد. بطور معمول بوی بد ناشی از عدم رعایت استانداردهای لازم در برنامه نویسی ایجاد میشود.


## سوال دوم
Bloaters
Bloaters are code, methods and classes that have increased to such gargantuan proportions that they are hard to work with. Usually these smells do not crop up right away, rather they accumulate over time as the program evolves (and especially when nobody makes an effort to eradicate them).


Object-Orientation Abusers
All these smells are incomplete or incorrect application of object-oriented programming principles.

Change Preventers
These smells mean that if you need to change something in one place in your code, you have to make many changes in other places too. Program development becomes much more complicated and expensive as a result.


Dispensables
A dispensable is something pointless and unneeded whose absence would make the code cleaner, more efficient and easier to understand.

Couplers
All the smells in this group contribute to excessive coupling between classes or show what happens if coupling is replaced by excessive delegation.

## سوال سوم
جواب Dispensables است.
Signs and Symptoms
Understanding and maintaining classes always costs time and money. So if a class doesn’t do enough to earn your attention, it should be deleted.

Reasons for the Problem
Perhaps a class was designed to be fully functional but after some of the refactoring it has become ridiculously small. Or perhaps it was designed to support future development work that never got done.

Treatment
Components that are near-useless should be given the Inline Class treatment.
For subclasses with few functions, try Collapse Hierarchy.

Payoff:
    1. Reduced code size.
    2. Easier maintenance.

When to Ignore
Sometimes a Lazy Class is created in order to delineate intentions for future development, In this case, try to maintain a balance between clarity and simplicity in your code.