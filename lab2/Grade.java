public class Grade {

    public static String gradeFromScore(int score) {
        if (score < 0 || score > 100) throw new IllegalArgumentException("score must be 0-100");
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    public static double average(int[] scores) {
        if (scores == null || scores.length == 0) return 0;
        double sum = 0;
        for (int s : scores) sum += s;
        return sum / scores.length;
    }

    public static String[] assignGrades(int[] scores) {
        String[] out = new String[scores.length];
        for (int i = 0; i < scores.length; i++) out[i] = gradeFromScore(scores[i]);
        return out;
    }
}
