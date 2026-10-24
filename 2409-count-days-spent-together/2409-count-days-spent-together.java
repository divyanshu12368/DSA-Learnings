class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int start = Math.max(
            toDays(arriveAlice),
            toDays(arriveBob)
        );

        int end = Math.min(
            toDays(leaveAlice),
            toDays(leaveBob)
        );

        return Math.max(0, end - start + 1);
    }

    private int toDays(String date) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        for (int i = 0; i < month - 1; i++) {
            day += daysInMonth[i];
        }

        return day;
    }
}
