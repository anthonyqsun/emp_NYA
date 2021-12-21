# emp_NYA - Anthony Sun + Corn, Nakib Abedin + Joker
---
## Results
- For an array of 500,000 values, BinSearch is ~508x faster than LinSearch
- For an array of 1,000,000 values, BinSearch is ~821x faster than LinSearch
- For an array of 2,000,000 values, BinSearch is ~567x faster than LinSearch

## Conclusions
- It takes a LARGE value and a LARGE amount of patience to get significant values
- Time can be saved by doing a large number of iterations of a small problem than one iter. of a large problem.
- One error that may be present in our code is the frequent starting and stopping of the timer. Decimal millis may be discarded, which could accumulate to a larger number over time.