class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            String x = operations[i];

            if (x.equals("C")) {
                arr.remove(arr.size() - 1);
            } 
            else if (x.equals("D")) {
                arr.add(2 * arr.get(arr.size() - 1));
            } 
            else if (x.equals("+")) {
                int last = arr.get(arr.size() - 1);
                int secondLast = arr.get(arr.size() - 2);
                arr.add(last + secondLast);
            } 
            else {
                arr.add(Integer.parseInt(x));
            }
        }

        int sum = 0;
        for (int score : arr) {
            sum += score;
        }

        return sum;
    }
}
