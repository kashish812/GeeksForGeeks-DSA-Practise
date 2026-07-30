import java.util.*;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        // Step 1: Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Step 2: Two pointers
        int i = 0;
        int j = 0;

        // Step 3: Compare elements
        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {

                // Common element mila
                ans.add(a[i]);

                i++;
                j++;
            }

            else if (a[i] < b[j]) {

                // a ka element chhota hai
                // isliye i ko aage badhao
                i++;
            }

            else {

                // b ka element chhota hai
                // isliye j ko aage badhao
                j++;
            }
        }

        return ans;
    }
}
