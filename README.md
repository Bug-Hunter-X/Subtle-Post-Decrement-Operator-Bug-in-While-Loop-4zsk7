# Java Post-Decrement Operator Bug

This repository demonstrates a subtle bug related to the post-decrement operator (`--`) in Java when used within a `while` loop condition. The code snippet exhibits unexpected behavior due to the post-decrement's order of operations.

## Bug Description
The main issue lies in the `while (i-->0)` loop. This loop's behavior isn't as intuitive as it might seem. The post-decrement operator (`i--`) decrements the variable `i` *after* it's used in the conditional expression. This can lead to the loop executing for values that are not expected, potentially causing off-by-one errors or even infinite loops in different contexts.

## Solution
The solution involves replacing the post-decrement operator with a pre-decrement operator (`--i`). The pre-decrement operator decrements the variable *before* its value is evaluated in the conditional expression, leading to the expected behavior.

This repository includes two Java files:

* `UncommonBug.java`: Demonstrates the bug with the problematic post-decrement loop.
* `UncommonBugSolution.java`: Provides the corrected code using the pre-decrement operator.

This example highlights the importance of carefully considering the order of operations when using increment/decrement operators, especially in conditional expressions.