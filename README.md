# Java
## my first java code
## java 環境建置
- [Java JDK 下載、安裝與環境變數設定教學-Windows 篇 \| KJie Notes](https://www.kjnotes.com/devtools/35)- 
- [Eclipse 下載安裝與使用教學 for Java \| MIS 腳印](https://footmark.info/software/ide/eclipse-download-and-use-for-java/)
- [Eclipse IDE 下載、設定與使用教學-Java 篇 \| KJie Notes](https://www.kjnotes.com/devtools/80)

## compile java
For example, with a file called Plankton.java, we could compile it with the terminal command:
```
javac Plankton.java
```
A successful compilation produces a .class file: **Plankton.class**, that we execute with the terminal command:
```
java Plankton
```

***

## java 命名規則

!!! note
package name 都要小寫
!!!

### 宣告
- int,double,char,String,boolean,printf
```java
public class HelloYou {
  public static void main(String[] args) {
    String name="Ian";
    int age=24;
    double desiredSalary=1000000;
    char gender='m';
    char c='!';
    boolean lookingForJob=false;
    
    System.out.println("Hello "+name+c);
    System.out.println("my lucky number is"+(3+4));//7
    
    
    //Sun Microsystems announced the release of Java in 1995
    //註解
    /*
		James Gosling is a Canadian engineer who 
		created Java while working at Sun Microsystems. 
		His favorite number is the square root of 2!
    */
  }
}
```

- .equals()
```java
String person1 = "Paul";
String person2 = "John";
String person3 = "Paul";

System.out.println(person1.equals(person2));
//prints false, since "Paul" is not "John"

System.out.println(person1.equals(person3));
//prints true, since "Paul" is "Paul"
```

- ArrayList
```java
ArrayList<String> names = new ArrayList<String>();

names.add("Emily");//[0]
names.add("Bob");//[1]
names.add("Cindy");//[2]
names.set(2, "Carolyn");
//replace index 2 with element 
names.add(1, "Ann");
// add element at index 1, others moved backward
names.remove(1);
//remove element from index 1, others moved forward
```

- for-each loop
```java
//Traverses all elements of a collection:
double[] values = ...;
double sum = 0;
for (double element : values)
{
  sum = sum + element;
}
//Read the loop as “for each element in values”
//Traditional alternative:
double[] values = ...;
double sum = 0;
for (int i = 0; i < values.length; i++)
{
  double element = values[i];
  sum = sum + element;
}
```
```java
//Works for ArrayListstoo:
ArrayList<BankAccount> accounts = ...;
double sum = 0;
for (BankAccount account : accounts)
{
  sum = sum + aaccount.getBalance();
}
//Equivalent to the following ordinary forloop:
double sum = 0;
for (int i = 0; i < accounts.size(); i++)
{
  BankAccount account = accounts.get(i);
  sum = sum + account.getBalance();
}
```

***

## eclipse library import
- [昭佑.天翔: Eclipse 中載入 User Library 或 Java Component 元件](https://tomkuo139.blogspot.com/2010/08/eclipse-user-library-java-component.html)

### Junit
- [Assert (JUnit API)](http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html)
  - assertEquals()

