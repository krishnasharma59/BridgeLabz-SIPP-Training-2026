import java.util.ArrayList;
import java.util.List;

class Solution {

    private final List<String> list = new ArrayList<>();
    private final byte[] data = new byte[10];
    private int maxOn;

    private void backtrack(int index, int onCount) {

        if (onCount > maxOn)
            return;
        if (onCount + (data.length - index) < maxOn)
            return;

        if (onCount == maxOn) {

            int hours = data[0] * 8 + data[1] * 4 + data[2] * 2 + data[3];
            int minutes = data[4] * 32 + data[5] * 16 + data[6] * 8
                    + data[7] * 4 + data[8] * 2 + data[9];

            if (hours <= 11 && minutes <= 59) {
                StringBuilder sb = new StringBuilder(5);
                sb.append(hours).append(':');

                if (minutes < 10)
                    sb.append('0');

                sb.append(minutes);
                list.add(sb.toString());
            }
            return;
        }

        if (index == data.length)
            return;

        data[index] = 1;
        backtrack(index + 1, onCount + 1);

        data[index] = 0;
        backtrack(index + 1, onCount);
    }

    public List<String> readBinaryWatch(int turnedOn) {
        maxOn = turnedOn;
        backtrack(0, 0);
        return list;
    }
}