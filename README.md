# IOCBasic.xmlWay

Comments Regarding autowire Branch 
String literals - Setter injection and Constructor Injection

   	->Using Spring.xml

Object Injection -For class default value is null, same as String

	->Three ways to tell spring to create object

      ->XML,Annotation,Java

Spring Helps us to Create Light Weight Application - So don’t Create Unnecessary Object/Reuse the Same Object.

Interface Helps to achieve Loose Coupling in Java

@AutoWire
  ->Automatically wire in the dependency 



byName- Propery Name inside the class and the bean id name should match when doing this
byType- inner class path name class should be same with the outer class
Constructor-Same as above use constructor injection inside bean class
   ->Replacement for above constructor  is remove auto wire from bean.xml and use auto wire above the constructor
     ->Now it won’t create object because spring is looking for default constructor
   ->Now add the Default constructor inside the class
       ->Now object is Created for Human but the heart is not injected because we need to activate the auto wire by adding auto context to the bean.xml

Note:Autowiring is not possible for String and Primitive it is only for object because. How Spring Know the data I want to enter eg:Roll NO,Name

