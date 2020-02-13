# Java
## my first java code
## java 環境建置
- [Java JDK 下載、安裝與環境變數設定教學-Windows 篇 \| KJie Notes](https://www.kjnotes.com/devtools/35)- 
- [Eclipse 下載安裝與使用教學 for Java \| MIS 腳印](https://footmark.info/software/ide/eclipse-download-and-use-for-java/)
- [Eclipse IDE 下載、設定與使用教學-Java 篇 \| KJie Notes](https://www.kjnotes.com/devtools/80)
- [Eclipse更換目前專案的JDK/JRE @ 松鼠的樹洞2.0](http://dontpkme.blogspot.com/2013/10/eclipsejre.html)

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

### main method String[] args get input from terminal
```java
public class HelloYou {
  public static void main(String[] args) {
    System.out.println("Hello " + args[0]);  
  }
}
```
When we run the file HelloYou in the terminal with an argument of "Laura":
```
java HelloYou Laura
```
We get the output:
```
Hello Laura 
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
  //The args parameter is another example of a String array.
  //In main method, the array args contains the arguments that we pass in from the terminal  when we run the class file. 
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

- .substrintg(int startIndex,int endIndex)
```java
//
String str="abcdefg";
System.out.println(str.substring(2));//print cdefg

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


- Math.pow()
```java
//a^b
Math.pow(double a,double b)
```

- switch
```java
double shippingCost;
	 	// declare switch statement here
    switch (shipping) {
      case "Regular": 
        shippingCost=0;
        break;//要加break
      case "Express":
        shippingCost=1.75;
        break;
      default:
        shippingCost=.5;
    }
    
    return shippingCost;
```


- ArrayList
```java
ArrayList<String> names = new ArrayList<String>();

names.add("Emily");//[0]
names.add("Bob");//[1]
names.add("Cindy");//[2]
names.size();//size 3
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
//Works for ArrayLists too:
ArrayList<BankAccount> accounts = ...;
double sum = 0;
for (BankAccount account : accounts)
{
  sum = sum + account.getBalance();
}
//Equivalent to the following ordinary forloop:
double sum = 0;
for (int i = 0; i < accounts.size(); i++)
{
  BankAccount account = accounts.get(i);
  sum = sum + account.getBalance();
}
```

- Random
```java
        Random random=new Random();
        int num=random.nextInt(6)+1;//6個數字(0~5)+1

        while(num!=5){
            System.out.println(num);
            Random newRandom=new Random();
            random=newRandom;
            num=random.nextInt(6)+1;
        }
```

- 例外處理 try...cathch...finally
（Exception）在 Java 中代表一個錯誤的實體物件
```java
try {
    // 陳述句
}
catch(例外型態 名稱) {
    // 例外處理
}
finally {
    // 一定會處理的區塊
}
```



***



## object method
- String 
  - [Java String類 - Java基礎教程](http://tw.gitbook.net/java/java_strings.html)



***


## java file 相對路徑讀取
- [Java相对路径读取文件_java-路径问题_beloveddarling的博客-CSDN博客](https://blog.csdn.net/beloveddarling/article/details/53694103)

```java
//demo.json and Main.class在同一個資料夾(src/com/company)相對路徑
        //File file = new File("src/com/company/demo.json");

        String path = Main.class.getResource("demo.json").getPath();
        File file = new File(path);

        try{
            if(file.exists()){
                System.out.println("works!");
            }

        }catch(Exception e){
            e.getMessage();
        }
```

***

## java no pointer => reference variable
- [C/C++ Pointers vs Java References - GeeksforGeeks](https://www.geeksforgeeks.org/is-there-any-concept-of-pointers-in-java/)

!!! hint
java 只有 call-by-value 
=> actual parameter(呼叫時) & formal parameter(函式) 可以相同
!!!

