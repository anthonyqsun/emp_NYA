# emp_NYA - Anthony Sun + Corn, Nakib Abedin + Joker
---
## Results
- For an array of 500,000 values, BinSearch is ~500x faster than LinSearch
- For an array of 1,000,000 values, BinSearch is ~800x faster than LinSearch
- For an array of 2,000,000 values, BinSearch is ~1600x faster than LinSearch

## Conclusions
- It takes a LARGE value and a LARGE amount of patience to get significant values
- Time can be saved by doing a large number of iterations of a small problem than one iter. of a large problem.
- One error that may be present in our code is the frequent starting and stopping of the timer. Decimal millis may be discarded, which could accumulate to a larger number over time.
- Another error that may be present is the amount of variation for the times for LinSearch and BinSearch for an array of 2 million values. BinSearch can be as slow as 600x faster to as quick as 1800x faster. This may be because the length of the LinSearch could vary significantly based on where the targets are located.
- The statement “relative to the size of the dataset, binary search is faster than linear search" is true. However, this is only true in a general sense because there is always a chance that LinSeach will outperform BinSearch depending on the randomly generated targets.
