import java.util.Arrays;

public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals) {
        // Sort the intervals array based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Check for any overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean canAttend = canAttendMeetings(intervals);
        System.out.println("Can attend all meetings? " + canAttend);
    }
}
