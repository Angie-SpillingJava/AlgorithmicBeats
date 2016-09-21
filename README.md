"# AlgorithmicBeats" 

Bubble Sort: 
This algorithm is based on the idea of repeatedly comparing pairs of adjacent elements and then switching their positions if they exist in the wrong order. 
 * The name itself describes the algorithm. The smaller elements gradually tend to move up into the correct order like bubbles rising to the surface in a soda glass.
 
 STABLE SORT : Bubble sort is stable sort as it preserves the input order of equal elements in the sorted output array.

Time Complexity: The complexity of bubble sort is O(n2) in the worst and average case because for every element we iterate over the the entire array each time.
As we can see that in first iteration, there are n-1 comparison, in second pass there are n-2 comparsion. Similarly, in last pass there is only 1 comparsion.
bubble sort algorithm, in which there is (n-1) iteration to sort the list and each iteration has (n-1), (n-2), .... 2, 1 comparison and swapping.
Hence time complexity can be calculated as f(n) = (n-1) + (n-2) + ..... + 2+1 = n(n-1)/2 = O(n2) 

Space complexity 
To interchange the value between two array elements we need one additional variable, hence the space complexity of bubble sort = O(1)

Algorithm	      Time Complexity	              Space Complexity
			      Best	      Average	     Worst        Worst
Bubble Sort	Ω(n)	     Θ(n^2)	       O(n^2)	       O(1)                 Stable Sort

SELECTION SORT
In each iteration selection sort looks for the smallest element in the list and replace it to its correct position. 
For example, in first iteration, it finds out the smallest element in the list and replace 
it to the first position of the list. In this way, the list is divided into sorted list(first element) and 
unsorted list(rest of elements). Now in selection sort we look for the smallest element in the unsorted list and 
replace it to the first position of the list. After (n-1) iteration, the list gets sorted. 

Stability
Selection sort is not stable sort as it does not preserve the input order of equal elements in the sorted output array.

Time Complexity
We can see in first iteration there are (N-1) comparison, similarly in second, third ... 
iterations there are (N-2), (N-3) .... 1 comparisons. Hence the run time complexity can be calculated as  
f(n) = N-1 + N-2 + .... + 2 + 1 = N(N-1)/2 = O(N2) 

Space Complexity 
To interchange the value between two array elements we need one additional variable, hence the space complexity 
of selection sort =O(1) 
