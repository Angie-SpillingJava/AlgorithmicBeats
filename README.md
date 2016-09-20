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
