public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        int penForStudents = totalPens/totalStudents;
        int remainingPens = totalPens%totalStudents;

        System.out.println("The pen per student is "+ penForStudents+" and the remaining pen not distributed is "+ remainingPens);
    }
}
