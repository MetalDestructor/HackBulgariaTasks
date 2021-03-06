# week3 -> main source file :)

# Generic Problems

## 1.Generic backpack

You need a digital backback. Make a simple class that takes a single object of any type. The class should use generics. Make getters and setters for the field.

## 2.Pair

In Java you are limited to return only one object from a method. In same cases this could be an inconvenience. One workaround is to make a class that holds two objects, so you can have multiple returned objects.

Make the class pair from the last week generic. It should hold two objects from arbitrary type. Make getters and setters.

## 3.Triple

Well, you may also need to return 3 objects from a function. Make a class named Triple that holds ... well three object of arbitrary type. Make getters and setters.

## 4.Sumation function

Make function that sums two numbers. It should be able to sum every type of number Byte, Int, Long, Float, Double, BigInt.

Hint: there may be something in common in all this classes, actually you should already know if you have read the prereadings. :)

## 5.Subtraction function

Make function that subtracts two numbers. It should be able to subtract every type of number Byte, Int, Long, Float, Double, BigInt.

## 6.Multiplication function

The same as the previous, but it should multiplicate two numbers.

## 7.Division function

It should multiply two numbers.

## 8.Power function

It should rise a number to a given power. Let the exponent (the power number) be a whole positive number.

Bonus: you can try to make it with negative and floating exponent.

## 9.Factorial function

Once again the lovely factorial, this time make it work for any type of number.

## 10.Make it more generic

* Remember the stack from the last week? Make it generic.
* Remember the palindrom functions from the first week? Make a generic one. Think if you can define a universal palindrome function.
* A long long time ago in a galaxy far away (Mladost 3, Resen str, 16.11.2015) you have implemented a function that finds the minimum element of an array. Guess what... you should make it generic. Let the force be with you.

The force: Think on which classes we can find the minimum.

## 11. Yet another vector.

Implement the vector Abstract Data type. It should be resize-able and have all neccessary methods. Hey It should be generic.

# Collecitons Problems

## 1.Check if an expression of brackets is correct

Such expression is a string like `"()()())))((())("` - it has multiple brackets, your job is to check whether the expression is correct.
Such expression is correct if:
- it starts with a `'('`
- it ends with a `')'`
- the number of opening brackets equals exactly the number of closing brackets
- at no point in the string the number of closing brackets is higher than the number of opening brackets. E.g. `())(()` is not a valid one, because at index 2 there is a second closing bracket with only one opening bracket.


## 2.Reverse a generic collection
Declare a method, expecting a Collection and reverse it in your method. Return the same collection given, do not return a new collection!.

```java
static <T> void  reverse (Collection<T> collection)`
```

*Do not try to use* Collections.reverse. It works only for a List, and not for collections : )


## 3.Implement an on/off collection
Implement a Collection, in which, if you add an element twice, the element gets removed from your collection.

*Hint and edge case spoiler:* How would you handle null objects? :)
*Fun fact:*: As logical idea behind a collection is an abstraction of a... well, bunch of elements, allowing null sometimes makes no sense.


## 4.Rotate the elements of a collection
Make a void *utility* method that rotates the contents of a collection.

You are given a collection containing `[one, two, three, four, five, six, seven]`
"Rotating" it once means the collection becoming `[seven, one, two, three, four, five, six]`

```java
void rotate(Collection<T> collection, int rotateStep )
```

`rotateStep` can be negative - meaning you are rotating to the left, and not to the right.


## 5.Given a list contaning some duplicate values, find the first unique element
Make a *utility* method, which returns the first unique element in a given argument of type `Collection<T>`.
Example:

```java
Collection<T> ints = Arrays.asList(1,2,3,4,5,5,4,3,1);
System.out.println(yourMethod(ints)) //2;
```


## 6.Given several sets, find the duplicating elements
Write a *utility* method, that takes several sets, and returns a set that contains the duplicating elements of all the other sets.

```
A = {1,2,3,4,5}
B = {4,5,6}
C = {5,6,7,8}
```

`yourMethd(A,B,C) => D{5}`

## 7.Give me the median, quick!
Make an interface `Statistics`, which has these operations:

```
-getMean();
-getMedian();
-getMode();
-getRange();
```

If you don't know what Mean,Median, Mode and Range are, see http://www.purplemath.com/modules/meanmode.htm

Make an implementation of this interface, with an additional operation `add(int number)` (Work with integers only).

So, as a client of your code, I will be adding some integers(just like in a list), and would want you to give me the mean, median, mode and range.

*Bonus/Challenge*
Every method from `Statistics` interface should complete in O(1) time.
This is a little bit on the algorithm side, and you might need some interesting data structures : )
Come back to this when you are done with all the tasks.


## 8.Make a utility method that converts a hashMap into a very human-readable string###
Make a *utility* method that takes a `HashMap<? extends Object, ? extends Object>`
and *returns a String*, representing the HashMap.

I want you to make a utility method that does this, *do not* override `toString()` in hashMap.

Example:

```java
String result = YourUtilsClass.yourUtilMethod(map);
System.out.println(result) // { key1:value1, key2:value2, key3:value3 }
```

## 9.Count occurences of words in text
Make a *utility* method that takes a `String text`  and returns a map, which on every word in `text` maps the number of times this word has been used.

See Example:

```java
Map<String, Integer> result = YourUtilsClass.yourSecondUtilMethod("Ninjas are all over the place! We are all going to die!");
System.out.println(YourUtilsClass.yourFirstUtilMethod(result));
```

Outputs:

```
// { Ninjas:1, are:2, all:2, over:1, the:1, place!:1, We:1, going:1, to:1, die!:1 }
```

Retain the ordering of the elements!

##Epic bonus!##
###Cryptoanalysis fun###
There is an old technique for encrypting messages - shuffling the letters. For instance, if we take the string `Godzilla`, one crypted version of it 
is `Mrezotti`.
The cipher here is
```
G=m
o=r
d=e
i=o
l=t
z=z
```

Your task here is to decrypth the following text:
```
Ajb vnf guj luqv akjvojufq  . Sk qkkj egvfs Rkhfwu Lumemu'q akhhfjvq kj vnf ohifjbojc essoxew kg Dofck Ckqve , nfsf'q Ffsjejbk Tkssfq vk qnkr vnf ohifvukuq zkujc dkz nkr ov'q bkjf    Iv'q vnf qehf fxfsz quhhfs . Nk-kjf neq fxfs coxfj hf ejzvnojc kj e iwevf . Tnfz hebf hf akhifvf gks hz iweaf vnf xfsz hkhfjv I ckv ojvk vnf gosqv vfeh; vnev'q rnev vnfz veucnv hf ejb ov'ww df vnev rez ujvow I wfexf . Tnf nocnfs puewovz iwezfsq vnev akhf - ejb Dofck Ckqve oq puewovz - vnf csfevfs vnf akhifvovokj roww df ejb vnf dfvvfs ov'ww df gks vnf vfeh .Ajb gfes jkv ( ks , ewvfsjevoxfwz , bkj'v cfv vkk ftaovfb)  , Tkssfq neq jk iwejq vk vuam veow ejb suj ejb wfexf noq iezanfamq dfnojb .    I bkj'v nexf ejz iwejq vk hkxf erez socnv jkr .    Ig rf woqvfjfb vk eww vnf suhkusq rf'b nexf 50 iwezfsq . Nkr'q jkv vnf socnv vohf vk df vnojmojc edkuv Cnfwqfe . I'h qusf vnf awud oq rksmojc vk ohiskxf vnf vfeh , duv eww vnev hevvfsq socnv jkr oq vnf Wkswb Cui .Om , vnev dov edkuv vnf 50 iwezfsq hebf hf anuamwf .  Noaf kjf , Ffsjejbk .Nkr , oj ej obfew rkswb , rf rkuwb ifsneiq cfv vnfqf rksbq gskh Lumemu , rnkh rf'b womf vk dfakhf wfcfjbesz ev Cnfwqfe .  Buv rf bkj'v woxf oj ej obfew rkswb , ejb ojqvfeb rf cfv vnfqf rksbq gskh Tkssfq , rnkh rf'b womf vk dfakhf e wkjc-gksckvvfj hfhksz ev Cnfwqfe .  Aweq .Tnev dfojc qeob , qojaf ov'q deqoaewwz ej ohikqqodwf vk veqm vk sob kusqfwxfq kg vnf ?100h gwki , ev wfeqv nf'q ckv vnf socnv evvovubf .  Hussez?
```

Once more, your task is not to make a program that *deciphers every possible text on the planet*, you just have to decipher *this text*. And by decipher, I mean extract the meaning of it - let's not care about missed dots, commas, word casing and such stuff.

####Instructions and hints####

A usually good counter-attacking technique is to simply make a histogram of the usage of letters in the *given* text and comapre it to the histogram of letters *in the language*. 
For example, in the english language, the letter 'e' is the most frequently used, in a total of 13% of all letters. So there is a good chance the most commonly used letter in the given text  is 'e'.  

You can see some frequencies and letter distribution facts here:  
http://en.wikipedia.org/wiki/Letter_frequency  
http://www.cryptograms.org/letter-frequencies.php  


Some hints:
- Ignore one-letter words. They are likely dots or hyphens or commas, you will add them later.
- Trim spaces on words after you parse them. Make sure you are not analysing empty spaces.
- Watch out for letter casing! Make sure you analyze uppercase 'T' the same as downcase 't'.
- Make a method `String applyCipher(Map<Character, Character> cipher)`. You will likely find a good use for it. Of course, it is not mandatory.
- As this problem requires some visual examination, do *not try* to solve in TDD at first. In fact, in general, apply *TDD* only when you have something to test for.
- If frequency attack turns out to be not good enough, check [the list of 5000 most used words in English](https://docs.google.com/spreadsheets/d/1LuHWIlshSqwfr3AKwvqIoXAGZrNmsPUopwfhc3DhtS4/edit#gid=0). There is a good chance some of those will be from the first words you unveil! 

# More Problems with Collections

##1.Given a list of Students, sort them by grade

Lets say you have a `List<Student>`, where a Student is a class, containing two fields: `name` and `grade`.

Sort them by their grades first. Their grades actually are integers => 2,3,4,5,6. If two students happen to have the same grades, sort those two by their names.

##2.Implement a class ToDoList

Imagine you have a world of stuff to do.
Homeworks, courseworks, exams, even preparing for HackBulgaria!
Unfortunately you do not have much time - you need to eat, you need to sleep, you need to have a good time.

Now, you need to sort your priorities right! Make a class `ToDoList`, which supports the following operations:
`void add(Task t)`
`void markFinished(Task t)`
`void markCancelled(Task t)`
`Task getTop()`
`boolean canFinish()`
`int getRemainigTime()` //calculates the time remaining after you've done all of your tasks.

... where `Task` is a class which represents something you have to do. What data/methods should it have? What is common for all the tasks you need to get done?
A `Task` should at the very least have a priority and a time required in order to finish.
You should take an integer in your constructor - the ammount of hours available for each task.

Example usage of your class:

```java
ToDoList todo = new ToDoList(11); //11 hours remaining!
todo.addTask(new StudyForAlgebraTask(10)); //maximum priority!
todo.addTask(new LearnGeometryTask()); //default priority, smaller than 10
todo.addTask(new GoOutTask(1.5f));  //default priority, smaller than 10
todo.addTask(new SleepTask()); //straight 8 hours, of course!

if (todo.canFinish()){
    System.out.println("Woohoo!");
} else {
    System.out.println("I am ...screwed :(");
}

System.out.println(todo.top()) //StudyForAlgebraTask
System.out.println(todo.getTimeNeeded()) //sum of the time needed for every task added in todo list
```

*Hints*
See Comparable and Comparator classes in Java. Check out the PriorityQueue class.
http://javarevisited.blogspot.com/2011/06/comparator-and-comparable-in-java.html

##3.Implement your own HashMap.

It's up to choose how to resolve colisions.
Use this link to see the most common approaches:
https://en.wikipedia.org/wiki/Hash_table

Make it iterative - one step at time.

First make the basic functionality.
You should be able to put, get and check if a given key is already in the map.

Then make it resizable.
You can choose 0.75 for load factor.

When it is resizable and you can try to make it a bit generic.

Finally your class can implement the Map interface.