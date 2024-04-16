# Year-11-CS-Unit-8-2D-Arrays-Quiz-Magic-Square

Ensure that you read all instructions carefully. Do not include any additional methods that are not specified in this quiz description. Think carefully about your solution before writing any code. Use meaningful variable names and proper indentation - take pride in your work!

<b>Description</b>: A Latin square is an NxN arrangement of symbols such that each symbol appears exactly once in every row and every column.<br>
In this quiz, we will restrict our attention to Latin squares where the symbols consist of integers from 1 to N (where N is the row length), in which case computing checksums for each row and column is sufficient to determine uniqueness.

A **checksum** is a value calculated from a block of data to verify whether certain properties are met, usually for purposes of data integrity in transmission or storage. Checksum calculations should not require expensive computations or complex data structures. In this case, we are simply calculating sums and products.

<b>Task</b>: In the LatinSquare class you will implement <b>five</b> methods.
* `targetCheckSum1`: This method calculates a target checksum by taking the row size N and returning the sum of consecutive integers 1 + 2 + ... + N.
* `targetCheckSum2`: This method calculates a target checksum by taking the row size N and returning the product of consecutive integers 1 * 2 * ... * N.
* `isLatinRows`: This method takes a 2D array of integers and two checkSums and returns a boolean value depending on whether or not the sum of each row in array2d is equal to checkSum1 AND that the product of each row in array2d is equal to checkSum2.
* `isLatinColumns`: This method takes a 2D array of integers and a checkSum and returns a boolean value depending on whether or not the sum of each column in array2d is equal to checkSum1 AND that the product of each column in array2d is equal to checkSum2
* `isLatinSquare`: This method takes a 2D array of integers and returns a boolean value depending on whether the 2D array is a Latin square or not.

<br>Below is a reminder of the row, column indices of array elements.

| 0,0     | 0,1     | 0,2     | 0,3     |
|---------|---------|---------|---------|
| **1,0** | **1,1** | **1,2** | **1,3** |
| **2,0** | **2,1** | **2,2** | **2,3** |
| **3,0** | **3,1** | **3,2** | **3,3** |

Here is an example of a 4x4 Latin square:

| 1   | 3 | 4     | 2     |
|-----|---|-------|-------|
| **2** | **4** | **3** | **1** |
| **3** | **1** | **2** | **4** |
| **4** | **2** | **1** | **3** |

In each row and each column, the elements add up to a total of 10.<br>
In each row and each column, the elements multiply together to get a product of 24.<br>
NOTE: not all Latin squares are diagonal (i.e. the main diagonals each meet the requirement that all N symbols appear exactly once). For example, diagonal Latin squares do not exist for 2x2 or 3x3.


Row 1: [1,3,4,2] → 1 + 2 + 3 + 4 = 10, [1,3,4,2] → 1 * 2 * 3 * 4 = 24

Row 2: [2,4,3,1] → 2 + 4 + 3 + 1 = 10, [2,4,3,1] → 2 * 4 * 3 * 1 = 24

Row 3: [3,1,2,4] → 3 + 1 + 2 + 4 = 10, [3,1,2,4] → 3 * 1 * 2 * 4 = 24

Row 4: [4,2,1,3] → 4 + 2 + 1 + 3 = 10, [4,2,1,3] → 4 * 2 * 1 * 3 = 24

Column 1: [1,2,3,4] → 1 + 2 + 3 + 4 = 10, [1,2,3,4] → 1 * 2 * 3 * 4 = 24

Column 2: [3,4,1,2] → 3 + 4 + 1 + 2 = 10, [3,4,1,2] → 3 * 4 * 1 * 2 = 24

Column 3: [4,3,2,1] → 4 + 3 + 2 + 1 = 10, [4,3,2,1] → 4 * 3 * 2 * 1 = 24

Column 4: [2,1,4,3] → 2 + 4 + 1 + 3 = 10, [2,1,4,3] → 2 * 4 * 1 * 3 = 24

<br>

`int[][] array2d = { {1,3,4,2}, {2,4,3,1}, {3,1,2,4}, {4,2,1,3} };`

`targetCheckSum1(array2d);` → returns <b>10</b>

`targetCheckSum2(array2d);` → returns <b>24</b>

`isLatinRows(array2d);` → returns <b>true</b>

`isLatinColumns(array2d);` → returns <b>true</b>

`isLatinSquare(array2d);` → returns <b>true</b>

<br>

Note that your solution must work for a 2D array of any size N x N.

You can assume that the 2D array will be a square. That is, it will have the same number of rows as columns, and all rows will be of the same length.

<i>Good luck, have fun! </i> =)
