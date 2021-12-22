# emp_NYA - Anthony Sun + Corn, Nakib Abedin + Joker
---
## Tests Performed
- We tested arrays of three different lengths: 500,000; 1,000,000; and 2,000,000
- We came up with these numbers through trial and error. These lengths are long enough to yield significant results but they are short enough for our code to execute in a reasonable amount of time. 
- For each array, we populated another array of 1,000 randomly generated targets and then had LinSearch and BinSearch find each target in the initial array (the ones with lengths of 500,000; 1,000,000; and 2,000,000).
- We carried out the step above 70 times in order to yield more usable data.
- We added up the cumalative time elapsed with LinSearch and cumlative time elapsed with BinSearch and printed BinSearch's speed relative to LinSearch's speed.
---
## Results
- For an array of 500,000 values, BinSearch is ~500x faster than LinSearch
- For an array of 1,000,000 values, BinSearch is ~800x faster than LinSearch
- For an array of 2,000,000 values, BinSearch is ~1600x faster than LinSearch
---
## Conclusions
- It takes a LARGE value and a LARGE amount of patience to get significant values
- Time can be saved by doing a large number of iterations of a small problem than one iter. of a large problem.
- One error that may be present in our code is the frequent starting and stopping of the timer. Decimal millis may be discarded, which could accumulate to a larger number over time.
- Another error that may be present is the amount of variation for the times for LinSearch and BinSearch for an array of 2 million values. BinSearch can be as slow as 600x faster to as quick as 1800x faster. This may be because the length of the LinSearch could vary significantly based on where the targets are located.
- The larger the length of the sorted collection, the better BinSearch performs relative to LinSearch
- The statement “relative to the size of the dataset, binary search is faster than linear search" is true. 
