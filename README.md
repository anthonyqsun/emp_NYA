# emp_NYA - Anthony Sun + Corn, Nakib Abedin + Joker
---
## Results
- For an array of 500,000 values, BinSearch is ~500x faster than LinSearch
- For an array of 1,000,000 values, BinSearch is ~800x faster than LinSearch
- For an array of 2,000,000 values, BinSearch is ~600x faster than LinSearch

## Conclusions
- It takes a LARGE value and a LARGE amount of patience to get significant values
- Time can be saved by doing a large number of iterations of a small problem than one iter. of a large problem.
- One error that may be present in our code is the frequent starting and stopping of the timer. Decimal millis may be discarded, which could accumulate to a larger number over time.
- Another error that may be present is the slowdown of the computer's calculation, as there might be some cache being used up - Binsearch is slower for 2 million values than for 1 million values, which shouldn't be true.