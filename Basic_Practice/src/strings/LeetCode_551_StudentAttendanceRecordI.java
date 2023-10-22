package strings;

public class LeetCode_551_StudentAttendanceRecordI {
	public static boolean checkRecord(String s) {
		char[] ch = s.toCharArray();
		int absentCount = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A') {
				absentCount++;
			} else if (i >= 2 && ch[i] == 'L' && ch[i - 1] == 'L' && ch[i - 2] == 'L') {
				return false;
			}

		}
		if (absentCount < 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "PPALLL";
		System.out.println(checkRecord(s));
	}
}
