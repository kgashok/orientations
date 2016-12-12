#JAVA Glossary
##A
1.	abstract class 
A class with the abstract reserved word in its header. Abstract classes are distinguished by the fact that you may not directly construct objects from them using the new operator. An abstract class may have zero or more abstract methods. 
2.	abstract method
A method with the abstract reserved word in its header. An abstract method has no method body. Methods defined in an interface are always abstract. The body of an abstract method must be defined in a sub class of an abstract class, or the body of a class implementing an interface. 
3.	application programming interface (API)
A set of definitions that you can make use of in writing programs. In the context of Java, these are the packages, classes, and interfaces that can be used to build complex applications without having to create everything from scratch. 
4.	array
A fixed-size object that can hold zero or more items of the array's declared type. 
int[] pair = { 4, 2, }; 
5.	attribute	
A particular usage of an instance variable. The set of attribute values held in a particular instance of a class define the current state of that instance. A class definition may impose particular constraints on the valid states of its instances by requiring that a particular attribute, or set of attributes, do not take on particular values. For instance, attributes holding coursework marks for a class should not hold negative values.. 
##B
6.	behavior
The methods of a class implement its behavior. A particular object's behavior is a combination of the method definitions of its class and the current state of the object. 
7.	byte
In general computing, this refers to eight bits of data. In Java it is also the name of one of the primitive data types, who size is eight bits. 
8.	bytecode
Java source files are translated by a compiler into bytecodes - the instruction set of the Java Virtual Machine (JVM). Bytecodes are stored in .class files. 
##C
9.	catch clause
The part of a try statement responsible for handling a caught exception. 
10.	class
A programming language concept that allows data and methods to be grouped together. The class concept is fundamental to the notion of an object-oriented programming language. 
11.	classpath
The path searched by the compiler and interpreter for class definitions. The class path may be set by a command-line argument to either, or via an environment variable. 
12.	class scope
Private variables defined outside the methods within a class have class scope. They are accessible from all methods within the class, regardless of the order in which they are defined. 
13.	command-line argument
Arguments passed to a program when it is run. A Java program receives these in the single formal argument to its main method  public static void main(String[] args. The arguments are stored as individual strings. 
14.	comment
A piece of text intended for the human reader of a program. Compilers ignore their contents. 
15.	compilation
The process of translating a programming language. This often involves translating a high level programming language into a low level programming language, or the binary form of a particular instruction set. The translation is performed by a program called a compiler. A Java compiler translates programs into bytecodes. 
16.	compiler
A program which performs a process of compilation on a program written in a high level programming language. 
17.	concurrency
A feature of parallel programming. Parts of a program whose executions overlap in time are said to execute concurrently. Java's thread feature support concurrency. 
18.	constant
A variable whose value may not be changed. In Java, these are implemented by final variables. 
19.	coupling
Coupling arises when classes are aware of each of other because their instances must interact. Linkage between two classes that may be either strong or weak. Stronger coupling arises when one class has a detailed knowledge of the internal implementation of another, and is written to take advantage of that knowledge. Interfaces are one way to reduce to reduce coupling - because you interact with a class via an abstract definition, rather than a concrete implementation. 
##D
20.	daemon thread
Daemon threads are non-user threads. They are typically used to carry out low-priority tasks that should not take priority over the main task of the program. The garbage collector is one example of a daemon thread. 
##E
21.	exception
An object representing the occurrence of an exceptional circumstance - typically, something that has gone wrong in the smooth running of a program. 
22.	exception handler
The try statement acts as an exception handler - a place where exception objects are caught and dealt with. 
23.	extends
	Defines the parent of a class. Used with inheritance.
##F
24.	final class
A class with the final reserved word in its header. A final class may not be extended by another class. 
25.	finally clause
Part of a try statement that is always executed, either following of handling a caught exception, or normal termination of the protected statements. 
26.	final method
A method with the final reserved word in its header. A final method may not be overridden by a method defined in a sub class. 
27.	final variable
A variable with the final reserved word in its declaration. A final may not assigned to once it has been initialized. 
##G
28.	garbage collector
A daemon thread that recycles objects to which there are no references within a program. 
29.	Graphical User Interface
A Graphical User Interface (GUI) is part of a program that allows user interaction via graphical components, such as menus, buttons, text areas, etc. Interaction often involves use of a mouse. 
##H
30.	hash code
A value returned by a hash function. A hash code can be used as an index into a random-access data structure, providing an efficient mapping between an object and its location. Used by classes such as HashMap. 
31.	hash function
A function used to produce a hash code from the arbitrary contents of an object. Classes can override the hashValue method, inherited from the Object class, to define their own hash function. 
32.	hostname
The name of a host system.  Host system is a computer system on which a process is run. 
33.	HyperText Markup Language
The HyperText Markup Language (HTML) is a simple presentation language used to markup the content of Web pages. 
34.	HyperText Transfer Protocol
The HyperText Transfer Protocol (HTTP) is a set of rules defined to enable a Web client (browser) to interact with a Web server. 
##I
35.	implements clause
That part of a class header that indicates which interfaces are implemented by the class. A class may implement more than one interface. 
36.	import statement
A statement that makes the names of one or more classes or interfaces available in a different package from the one in which they are defined. 
37.	inheritance
A feature of object-oriented programming languages in which a sub type inherits methods and variables from its super type. 
38.	instance
A synonym for object. Objects of a class are instantiated when a class constructor is invoked via the new operator. 
39.	interpreter
A program which executes a translated version of a source program by implementing a virtual machine. Interpreters typically simulate the actions of an idealized Central Processing Unit. An interpreter for Java must implement the Java Virtual Machine (JVM) and executes the bytecodes produced by a Java compiler. The advantage of using an interpreter for Java is that it make the language more portable than if it were a fully compiled language. The bytecode version of a program produced by a Java compiler may be run on any interpreter implementing the JVM. 
40.	IP address
An Internet Protocol (IP) address for a networked computer. Currently, IP addresses consist of four byte values, written in dotted decimal notation, such as 129.12.0.1. 
41.	iteration
Repetition of a set of statements, usually using a looping control structure, such as a while loop, for loop or do loop. 
42.	iterator pattern
A common pattern in which the contents of a collection are iterated over in order. The Iterator pattern frees a client of the data from needing details of the how the data is stored. This pattern is supported by the Iterator and ListIterator interfaces. 
##J
43.	Java Archive file
A Java Archive (JAR) file makes it possible to store multiple bytecode files in a single file. 
44.	Java 2 SDK
A particular implementation of the abstract functionality described in Sun's specification of the Java 2 Platform. 
45.	Java Virtual Machine (JVM)
An idealized machine whose instruction set consists of bytecodes. A Java program is compiled to an equivalent bytecode form and executed on an interpreter which implements the JVM. 
##L
46.	local variable
A variable defined inside a method body. 
M
47.	main method
The starting point for program execution 
public static void main(String[] args)
48.	member
The members of a class are fields, methods and nested classes. 
49.	message passing
We characterize object interactions as message passing. A client object sends a message to a server object by invoking a method from the server's class. Arguments may be passed with the message, and a result returned by the server. 
50.	method
The part of a class definition that implements some of the behavior of objects of the class. The body of the method contains declarations of local variables and statements to implement the behavior. A method receives input via its arguments, if any, and may return a result if it has not been declared as void. 
51.	method overloading
Two or more methods with the same name defined within a class are said to be overloaded. This applies to both constructors and other methods. 


52.	method overriding
A method defined in a super class may be overridden by a method of the same name defined in a sub class. The two methods must have the same name and number and types of formal arguments. 
53.	model-view pattern
A pattern in which the representation of data (the model) is kept separate from its visualization (the view). Such decoupling makes it easier to change the underlying data representation, or provide multiple views, for instance. 
54.	multiple inheritance
The ability of a class or interface to extend more than one class or interface. In Java, multiple inheritance is only available in the following circumstances 
•	An interface may extend more than one interface. 
•	A class may implement more than one interface. 
##N
55.	native method
A method written in a language other than Java, but accessible to a Java program. 
56.	null character
The \u0000 character. Care should be taken not to confuse this with the null reference. 
57.	null reference
A value used to mean, `no object'. Used when an object reference variable is not referring to an object. 
##O
58.	object
An instance of a particular class. In general, any number of objects may be constructed from a class definition (see singleton, however). The class to which an object belongs defines the general characteristics of all instances of that class. Within those characteristics, an object will behave according to the current state of its attributes and environment. 
59.	object serialization
The writing of an object's contents in such a way that its state can be restored, either at a later time, or within a different process. This can be used to store objects between runs of a program, or to transfer objects across a network, for instance. 
60.	out of scope
A variable is in scope as long as the program's flow of control is within the variable's defining block. Otherwise, it is out of scope. 
##P
61.	package
A named grouping of classes and interfaces that provides a package namespace. This must be the first item in a source file, preceding any import statements. For instance, package java.lang;
62.	polymorphism
The ability of an object reference to be used as if it referred to an object with different forms. Polymorphism in Java results from both class inheritance and interface inheritance. Eg. class Rectangle extends Polygon implements Comparable
63.	port
A number used by a process to communicate with another process across a network, using the Transmission Control Protocol (TCP) or User Datagram Protocol (UDP), for instance. See TCP endpoint {Transmission Control Protocol (TCP)!endpoint}. 
64.	process
An individual thread-of-control to which an execution timeslice is allocated by an operating system. 
65.	protected access
Protected access is available to a class member prefixed with the protected access modifier. Such a member is accessible to all classes defined within the enclosing package, and any sub classes extending the enclosing class. 
66.	protocol
A set of rules for interaction between two processes. A protocol is usually specified in a Uniform Resource Locator (URL) to indicate how a particular resource should be transferred from a Web server to the requesting client. 
67.	public interface
The members of a class prefixed with the public access modifier. All such members are visible to every class within a program. 


##R
68.	return statement
A statement used to terminate the execution of a method. A method with void return type may only have return statements of the following form 
69.	runtime error
An error that causes a program to terminate when it is being run. 
##S
70.	scheduler
The part of the Java Virtual Machine (JVM) that is responsible for managing threads. 
71.	server
Something that provides a service. A Web server delivers resources to its clients, for instance. When the server is an object, it is the recipient of messages from its object clients. 
72.	single inheritance
In Java, a class may not extend more than one class. This means that Java has a single inheritance model for class inheritance. 
73.	single line comment
A comment in the form // This line will be ignored by the compiler.
74.	singleton pattern
A pattern that allows us to ensure that only a single instance of a particular class exists at any one time. Such an instance is called a singleton. The pattern can also be used when instances would have no unique state and would behave identically. 
75.	software reuse
The ability to reuse software components in different contexts. 
76.	static method
A static method (also known as a class method) is one with the static reserved word in its header. Static methods differ from all other methods in that they are not associated with any particular instance of the class to which they belong. 
77.	static variable
A static variable defined inside a class body. Such a variable belongs to the class as a whole, and is, therefore, shared by all objects of the class. 
78.	stream class
An input stream class is one that delivers data from its source (often the file system as a sequence of bytes. Similarly, an output stream class will write byte-level data. Stream classes should be contrasted with the operation of reader and writer classes. 
79.	string
An instance of the String class. A literal string is written between a pair of string delimiters ("), as in "hello, world"
80.	super class
A class that is extended by one or more sub classes. All Java classes have the Object class as a super class. See super type. 
##T
81.	this
	It is used as a reference to the current object, typically in order to pass a reference to another object.      
82.	thread
A lightweight process that is managed by the Java Virtual Machine (JVM). Support for threads is provided by the Thread class in the java.lang package. 
83.	throws clause
A clause in a method header indicating that one or more exceptions will be propagated from this method. For instance 
public int find(String s) throws NotFoundException
84.	throw statement
A statement used to throw an exception. For instance - throw new IndexOutOfBoundsException(i+" is too large.");
85.	try statement
The try statement acts as an exception handler - a place where exception objects are caught and dealt with. In its most general form, it consists of a try clause, one or more catch clauses and a finally clause. 
86.	typecast 
To demote a variable from a larger capacity data type to a smaller one. or to re-establish the class of an object. The cast associates itself with the expression to its immediate right.




