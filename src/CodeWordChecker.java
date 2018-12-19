public class CodeWordChecker implements StringChecker
{
    private int min;
    private int max;
    private String str;
    public CodeWordChecker(int min, int max, String str)
    {
        this.min = min;
        this.max = max;
        this.str = str;
    }
    public CodeWordChecker(String str)
    {
        this.str = str;
    }
    public boolean isValid(String str1)
    {
        if((str1.length()>= min)&&(str1.length()<= max)&&(str1.contains(str)==false))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
