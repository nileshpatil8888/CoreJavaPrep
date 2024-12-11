Abstraction :
        It hides the implementation details and shows only essential features that's known as abstraction.
        Abstraction is achieved by interfaces and abstract classes of java.
        Abstract classes are declared by 'abstract' keyword and interface also declared with 'interface' keyword.
        With the help of abstraction we can secure our data and improve security for features.

        interface :
            Interface is fully abstract class it is used to define the behaviour of the class.
            used to achieve abstraction.
            with the help of interface we can support to multiple inheritance.

        abstract classes :
            Abstract classes defined by abstract keyword.
            Abstract classes have abstract and non-abstract methods.
            it cannot be instantiated by itself.
            it requires subclass by another class to use its properties.
            we can define static methods in an abstract class.

        difference between abstract and interface.
        abstract                         | interface
        __________________________________________________________________________________________
        declare by abstract keyword      | declare by interface keyword
        __________________________________________________________________________________________
        provide partial abstraction      | provides full abstraction
        _________________________________________________________________________________________
        can have a both abstract and non | before java8: only abstract methods
        -abstract methods.               |   from java8 : can have default and static
                                         |   from java9 : can have private methods.
        __________________________________________________________________________________________
        methods can have public, private | All methods are public by default.
        protected.
        ______________________________________________________________________________________________