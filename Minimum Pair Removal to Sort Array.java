class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int num : nums) {
            l1.add(num);
        }

        int operations = 0;

        while (!isSorted(l1)) {
            int minSum = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < l1.size() - 1; i++) {
                int sum = l1.get(i) + l1.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }
            l1.remove(index);
            l1.remove(index);
            l1.add(index, minSum);
            operations++;
        }
        return operations;

    }

    private boolean isSorted(List<Integer> l1) {
        for (int i = 0; i < l1.size() - 1; i++) {
            if (l1.get(i) > l1.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}