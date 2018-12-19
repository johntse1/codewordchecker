public class runner
{
    public static void main(String[] args)
    {
        CodeWordChecker newChecker = new CodeWordChecker(1,2,"carrot");
        CodeWordChecker newChecker2 = new CodeWordChecker("dio");
        String str1 = "carrotcake";
        String str2 = "cake";
        String str3 = "kono dio da";
        System.out.println(newChecker.isValid(str1));
        System.out.println(newChecker.isValid(str2));
        System.out.println(newChecker.isValid(str3));

        System.out.println(newChecker2.isValid("you expected true, but it is i, dio"));
        System.out.println(newChecker2.isValid("thanoscar"));
        System.out.println(newChecker2.isValid("verylongstringthatwillreturnfalsebecausedefaultmaxis20"));
    }
}
