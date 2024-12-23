# README

## Overview

A sorting algorithm to sort in place, similar to a bubble sort since we are
repeatedly swapping adjacent elements if they are in the wrong order. A key difference 
is in how we choose which elements to swap. If a > b,
then a is swapped with b so that a < b. Afterwars however then we don't check whether
c < b; instead, we check whether c < d and swap them if necessary. 
 
## Example

Consider the set {64, 25, 12, 22, 11}. 

* We first consider elements with an even index. In the first comparison, 25 < 64, so we swap them. 
* Next we consider 12 with 22, but don't swap them since 12 < 22.
* Then we move onto the odd number of elements int the set and perform the same comparison and swaps as needed.

## Usage

```sh
gradle clean
gradle -i test
```

## Sample output

```sh
Starting sort for 64 25 12 22 11
Outer loop: 0
  In first inner loop.
    Comparing 64 with 25.
      Swapping 64 with 25.
    Comparing 12 with 22.
       No swap.
  After first inner loop: 25 64 12 22 11
  In second inner loop
    Comparing 64 with 12.
       Swapping 64 with 12.
    Comparing 22 with 11.
       Swapping 22 with 11.
  After second inner loop: 25 12 64 11 22

Outer loop: 1
  In first inner loop.
    Comparing 25 with 12.
      Swapping 25 with 12.
    Comparing 64 with 11.
      Swapping 64 with 11.
  After first inner loop: 12 25 11 64 22
  In second inner loop
    Comparing 25 with 11.
       Swapping 25 with 11.
    Comparing 64 with 22.
       Swapping 64 with 22.
  After second inner loop: 12 11 25 22 64

Outer loop: 2
  In first inner loop.
    Comparing 12 with 11.
      Swapping 12 with 11.
    Comparing 25 with 22.
      Swapping 25 with 22.
  After first inner loop: 11 12 22 25 64
  In second inner loop
    Comparing 12 with 22.
     No swap.
    Comparing 25 with 64.
     No swap.
  After second inner loop: 11 12 22 25 64

Outer loop: 3
  In first inner loop.
    Comparing 11 with 12.
       No swap.
    Comparing 22 with 25.
       No swap.
  After first inner loop: 11 12 22 25 64
  In second inner loop
    Comparing 12 with 22.
     No swap.
    Comparing 25 with 64.
     No swap.
  After second inner loop: 11 12 22 25 64

Total swaps: 9
Sorted array: 11 12 22 25 64
```

## Analysis

For each i from 0 to N - 1, there were 9 swaps and N - 1 - i compares, 
for a total of 9N ~ N^2 swaps and 
(N-1) + (N-2) +...+ 2 + 1 + 0 = N(N - 1)/2 ~ (N (N - 1)) / 2 ~ N^2/2 compares.

Big-O for the inner loop is O (n/2 + n/2) = O (2n/2) = O(n), 
and with the outer loop it is O(n^2), placing it in
the same category as other simple sorts.

In case both inner loops have no swaps, this implementaton shortcuts the program.

## License

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)