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

## java 命名規則

!!! note
package name 都要小寫
!!!

### 宣告
- printf,string
```java
public class HelloYou {
  public static void main(String[] args) {
    String someName="Ian";
    System.out.println("Hello "+someName+"!");
    
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