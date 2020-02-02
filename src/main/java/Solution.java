import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//https://app.codility.com/cert/view/certHWPF48-4VJ4SV3SE6B4JZEW/

class Solution {
    public int[] solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> hashMap = new HashMap<>(M);
        HashSet<Integer> hashSet = new HashSet<>(M);
        for (int i = 0; i < K; i++) {
            A[i] += 1;
        }
        for (int i = 0; i < A.length; i++) {
            if (hashMap.containsKey(A[i])) {
                int count = hashMap.get(A[i]);
                count++;
                hashMap.put(A[i], count);
            } else {
                hashMap.put(A[i], 1);
            }
        }
        int remainder = findLeader(hashMap, A.length);
        if (remainder != 0) hashSet.add(remainder);
        for (int i = K; i < A.length; i++) {
            changeNumbers(hashMap, A, i - K, false);
            changeNumbers(hashMap, A, i, true);
            remainder = findLeader(hashMap, A.length);
            if (remainder != 0) hashSet.add(remainder);
        }
        int[] leaders = new int[hashSet.size()];
        int i = 0;
        for (int num : hashSet) {
            leaders[i] = num;
            i++;
        }
        Arrays.sort(leaders);
        return leaders;
    }

    private static void changeNumbers(HashMap<Integer, Integer> hashMap, int[] A, int index, boolean isPlus) {
        int remainder = (int) hashMap.get(A[index]);
        remainder--;
        hashMap.put(A[index], remainder);
        if (isPlus) {
            A[index] += 1;
        } else {
            A[index] -= 1;
        }
        if (hashMap.containsKey(A[index])) {
            remainder = hashMap.get(A[index]);
            remainder++;
            hashMap.put(A[index], remainder);
        } else {
            hashMap.put(A[index], 1);
        }
    }

    private static int findLeader(HashMap<Integer, Integer> hashMap, int size) {
        size = size / 2;
        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) > size) return key;
        }
        return 0;
    }
}