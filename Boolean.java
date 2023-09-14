public class Boolean {
    public static void main(String[] argument) {
        boolean hasGoodGPA = false;
        boolean programmingSkills = true;
        boolean criminalrecord = true;

        boolean isAccepted = (hasGoodGPA || programmingSkills) && !criminalrecord;

        System.out.println(isAccepted);
    }
}
