### Question 1
Which of the following is the correct code to create and run a thread in java?


a.
```java
class Test extends Thread{
    public void start(){
        System.out.println("Thread running!");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.run();
    }
}
```


**b.**
```java
class Test extends Thread{
    public void run(){
        System.out.println("Thread running!");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
```


c.
```java
class Test extends Thread{
    public void run(){
        System.out.println("Thread running!");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.run();
    }
}
```


d.
```java
class Test extends Thread{
    public void start(){
        System.out.println("Thread running!");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
```

### Question 2
Which of the following is correct about the join function? (Select all the correct answers.)


a. Thread codes will not work if join method is not used.


**b. Join method throws InterruptedException**


c. Join method makes sure that one function is not accessed from multiple threads at the same time. 


**d. Join method allows one thread to wait until another thread completes its execution**


### Question 3
Create a Java FX GUI application that takes the data (Name, Id and CGPA) of 3 students as input and shows the following:  
* Name, Id and CGPAs of all the students (whose data was entered).
* Name and Id of the student with the highest CGPA.

Your GUI should contain the following components:

TextFields for input (Names, IDs, CGPAs).
- 1 Button for showing the outputs (see below).
- 1 label (or TextArea) for showing the  Name, Id and CGPA of all the students
- 1 Label for showing the name and id of the student with the highest CGPA. 
