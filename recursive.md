# recursive

## n!
~~~java
    public static int factorial(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }
~~~

## e^x
1 + x + x^2/2! + x^3/3! + ... + x^n/n!

## permutation
```java
public static void permutation(String str,int s,int e){
        if(s==e){
            System.out.println(str);
        }else{
            for (int i=s;i<=e;i++){
                str=swap(str,s,i);
                permutation(str,s+1,e);
                str=swap(str,s,i);
            }
        }
    }

    public static String swap(String s,int a,int b){
        char temp;
        char[] charArray=s.toCharArray();
        temp=charArray[a];
        charArray[a]=charArray[b];
        charArray[b]=temp;

        return String.valueOf(charArray);
    }
    
```


## pow(x,y)
```java
public static double pow(double x, int n) {
        if (n<0){
            if (n==0){
                return 1;
            }else{
                return (1/x)*myPow(x,++n);
            }
        }else{
            if (n==0){
                return 1;
            }else{
//            n=n-1;
                return x*myPow(x,--n);
            }
        }
    }

```







