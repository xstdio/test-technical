##### Qestion 1
```
/**
 * Given a string of lowercase characters, write a method that will
 * return an array of characters in descending order of frequency.
 * If multiple characters have the same the number of occurrences, output
 * them in alphabetical order.
 *
 * For example, given:
 * S = dcbadcbadcbadde
 *
 * Result = {'d', 'a', 'b', 'c', 'e'}
 * 'd' occurs 5 times,
 * 'a', 'b', 'c' occurs 3 times, so they are ordered alphabetically,
 * 'e' occurs 1 time
 *
 * You may assume the following limits:
 * String S: 0 <= |S| <= 1000
 * For each c in S: 'a' <= c <= 'z'
 *
 * Time Limit: 2sec
 * Memory Limit: 256MB
 *
 * The method should be compilable on OpenJDK 1.8.0_92 without
 * any additional libraries.
 *
 * You are allowed to create additional methods to structure your code.
 * You may use the below method signature.
 *
 * You are advised not to spend more than 30 minutes on this question.
 *
 * public char[] charFrequency(String s) {
 *    return new char[0];
 * }
 */

```

##### Qestion 2
```
/**
 * A random number generator is governed by the following formula:
 * X(n+1) = (A * X(n) + B) % M
 *
 * Write a method that will return an integer array of
 * elements X(k) to X(k + i)
 *
 * For example, given:
 * X(1) = 5, A = 3, B = 2, M = 7, k = 3, i = 1
 *
 * X(2) = (3 * 5 + 2) % 7 = 3
 * X(3) = (3 * 3 + 2) % 7 = 4
 * X(4) = (3 * 4 + 2) % 7 = 0
 *
 * Result = {X(3), X(4)}
 *        = {4, 0}
 *
 * You may assume the following limits:
 * Integer A:  0 <= A <= M
 * Integer B:  0 <= B <= M
 * Integer X1: 0 <= X1 <= M
 * Integer M:  2 <= M <= 10^4
 * Integer k:  0 <= k <= 10^9
 * Integer i:  0 <= i <= 10
 *
 * Time Limit: 2sec
 * Memory Limit: 256MB
 *
 * The method should be compilable on OpenJDK 1.8.0_92 without
 * any additional libraries.
 *
 * You are allowed to create additional methods to structure your code.
 * You may use the below method signature.
 *
 * You are advised not to spend more than 30 minutes on this question.
 *
 * public int[] rng(int A, int B, int M, int X1, int k, int i) {
 *    return new int[0];
 * }
 */

```

##### Qestion 3
```
/**
 * You are given a non-empty integer array A, and a duplicated array B
 * with zero or more elements removed i.e. B is a subset of A.
 *
 * Your job is to determine the elements removed from B, and return the
 * results in an integer array. The order of elements in the returned
 * result is not important.
 *
 * For example, given:
 * A = [1, 1, -1, 4, 6, 10]
 * B = [6, 1, 10]
 * Result = [1, -1, 4]
 *
 * You may assume the following limits:
 * len(A):  0 < len(A) < 1024
 * len(B):  0 <= len(B) <= len(A)
 *
 * Time Limit: 2sec
 * Memory Limit: 256MB
 *
 * The method should be compilable on OpenJDK 1.8.0_92 without
 * any additional libraries.
 *
 * You are allowed to create additional methods to structure your code.
 * You may use the below method template.
 *
 * You are advised not to spend more than 20 minutes on this question.
 *
 * public int[] missingElements(int[] a, int[] b) {
 *    // WRITE YOUR CODE HERE
 *    return new int[0];
 * }
 */

```

##### Qestion 4
```
/**
 * You are given a dictionary of words and a (possibly infinite) buffered
 * stream of characters e.g. from a TCP socket.
 *
 * Your job is to write any matched words to a buffered writer. Characters 
 * can be reused between words. You may assume that all characters are
 * lowercase alphabet i.e. 'a' < char < 'z'. If multiple matches are found
 * simultaneously, the order of output is not important.
 *
 * For example, given:
 * dictionary = {at, bat, atm, man, batman, mans}
 * Input               Output
 * ..........x
 * .........xa
 * ........xat         at
 * .......xaty
 * <skip>
 * ..xatypqrsb
 * .xatypqrsba
 * xatypqrsbat         bat, at
 * atypqrsbatm         atm
 * typqrsbatma
 * ypqrsbatman         batman, man
 * pqrsbatmans         mans
 * qrsbatmansw
 * 
 * You may assume the following limits:
 * len(dict):  0 <= len(dict) < 1024
 * len(word):  0 < len(word) < 256
 *
 * Memory Limit: 256MB
 *
 * The method should be compilable on OpenJDK 1.8.0_92 without
 * any additional libraries.
 *
 * You are allowed to create additional methods to structure your code.
 * You may use the below method template.
 *
 * You are advised not to spend more than 60 minutes on this question.
 *
 * public void writeMatches(Set<String> dictionary, BufferedReader reader, BufferedWriter writer) throws IOException {
 *    char c;
 *    while ((c = (char) reader.read()) > 0) {
 *        // WRITE YOUR CODE HERE
 *    }
 *    writer.flush();
 * }
 */

```
