# [Class 03 - Data Structures - Arrays](https://redi-school.github.io/intermediate-java/03-ds-1-arrays/)

## Print Reversed Array

Define a method called `printReversedArray` that will print Array of Integer reversed.
```
Example:
With Input: [1, 3, 5, 2, 4]
It Prints: [4, 2, 5, 3, 1]
```

1. The method should be static, receive an Array as parameter and return void
2. The method should work with Arrays of any size

## Merge Two Arrays

Define a method called `mergeArrays` that will merge two Arrays of Integers and return a new Array as a result.
```
Example:
With Inputs: [2, 5, 9] and [1, 4, 0] 
It Returns: [2, 1, 5, 4, 9, 0]
```

1. The method should be static, receive two Arrays as parameters and return a new Array
2. The order of elements should follow the order inside the arrays:
    1. The first element from the first array
    2. Then, the first element from the second array
    3. Next, the second element from the first array
    4. Then, the second element from the second array
    5. And so on...
3. The method should work with Arrays of different sizes
4. The method should work with empty Arrays

## Find an Element

Define a method called `findFirstInArray` that receives an Array of Strings, and a String to search. The method should return the position (index) of the String, or, `-1` if the String is not found.

```
Example:
With Inputs: ["Apple", "Orange", "Grape", "Lemon", "Grape"], and "grape" 
It Returns: 2
```

1. The method should be static, receive an Array of Strings and a String to search
2. The method should return an integer number, which represents the position (if found)
3. If the String is not found, the method should return `-1`
4. The method should work with Arrays of any size, and should not differentiate upper and lower cased letters
5. In the same way, implement a method called `findLastInArray`

## Second Smallest

Define a method called `secondSmallest` that returns the second-smallest number from an Array of Integers

```
Examples:

With Input: [0, 1, 2, 3] 
It Returns: 1

With Input: [1, 3, 4, 1, 1, 4, 2] 
It Returns: 2

With Input: [2] 
It Returns: 2
```

1. The method should be static and receive an Array of Integers
2. The method should not change the elements of the input Array of Integers
3. The method should return an Integer, which is the second-smallest number (if found)
4. If the Array is empty, the method should return `-1`
