# Instructions

Write the below programs in the same repository. Each program should be contained in one commit. Don't use `ChatGPT` or other LLM for solutions. These exercises are meant to teach you the concepts of `Kotlin`.


## Basic Syntax

- Write a program that prints "Hello, World!" to the console.

## Variables and Data Types

- Write a program to swap two variables without using a third variable.

## Control Flow

- Write a program that checks if a number is positive, negative, or zero.
- Write a program that uses a `when` expression to print the name of the day based on a given number (1-7).

## Functions

- Write a function that takes two integers and returns their sum.
- Write a higher-order function that takes a list of integers and a function, then applies the function to each element of the list.

## Null Safety

- Write a program that safely handles nullable variables and prints a default value if the variable is null.

## Classes and Objects

- Define a class `Person` with properties `name` and `age`, and create a method to print the details of the person.
- Create a data class `Book` with properties `title`, `author`, and `year`. Write a program to create a list of books and print their details.

## Collections

- Write a program to find the largest element in a list of integers.
- Write a program to filter out even numbers from a list and print the remaining odd numbers.

## Loops

- Write a program that prints the first 10 Fibonacci numbers.
- Write a program that prints the multiplication table of a given number.

## String Manipulation

- Write a program to check if a string is a palindrome.
- Write a program to count the number of vowels in a given string.

## Exception Handling

- Write a program that takes two numbers as input and divides them, handling any potential division by zero exceptions.

## Extension Functions

- Write an extension function for the `String` class that reverses the string.

## Lambda Expressions

- Write a program that uses a lambda expression to filter out strings shorter than 5 characters from a list.

## Generics

- Write a generic function that returns the maximum of two comparable values.

## Coroutines

- Write a simple coroutine that prints numbers from 1 to 5 with a delay of 1 second between each number.

## Inheritance

- Create a base class `Shape` with a method `area()`. Derive two classes `Circle` and `Rectangle` that override the `area()` method.

## Interfaces

- Define an interface `Drivable` with a method `drive()`. Implement this interface in classes `Car` and `Bike`.

## Delegation

- Use the delegation pattern to delegate the properties of a class `Student` to another class `Person`.

## Sealed Classes

- Write a program that uses a sealed class to represent different types of responses (`Success`, `Error`, `Loading`).

## Type Aliases

- Define a type alias for a function that takes an integer and returns a boolean. Use this alias in a program.

## Destructuring Declarations

- Write a program that uses destructuring declarations to unpack the properties of a data class `User`.

## LiveData

1. Create a `LiveData` that holds a list of integers. Observe changes to the `LiveData` and update the UI accordingly.

2. Implement a `ViewModel` that uses `LiveData` to manage UI-related data in a lifecycle-conscious way.

## Flow

1. Use Kotlin Flow to handle a stream of data. Create a Flow that emits a list of integers with a delay between each emission.

2. Collect the Flow in a coroutine and update the console with the emitted values.

## JSON API Requests

1. Write a function to make an API request and parse the JSON response into a data class using Retrofit.

2. Create a `ViewModel` that makes an API request using Retrofit and exposes the result as `LiveData`.



# Notes

* This repository will be the single source of truth for learning Kotlin. However, I will add a bonus application that you can finish alongside these exercises.

The application will be about creating an activity that views your name. You need to center your name in the middle using both XML files and Jetpack Compose functions. You can use LLM for this project but not for writing code, just for clarifying concepts and understanding new syntax. You can write this project at any part of this project's lifecycle (you don't have to finish the whole Kotlin exercises to write it, but it's better if you do).
