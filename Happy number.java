class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> a1 = new HashSet<>();
        while (n != 1) {
            if (a1.contains(n)) {
                return false;
            } else {
                a1.add(n);
                n = sumofsquares(n);
            }

        }
        return true;

    }

    private int sumofsquares(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

}

// Time Compleity O()