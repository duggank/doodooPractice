public class superpractice
{
    public static String getSentence1()
    {
        return "Java is Awesome! ";
    }
    public static String getSentence2()
    {
        return "This is my project. And yes, I am copying what we just did lol";
    }
    public static String getQuestion()
    {
        return "GOT A PROBLEM WITH THAT?!";
    }
    public static void main(String[] args)
    {
        String s1 = getSentence1();
        String s2 = getSentence2();
        String q = getQuestion();

        System.out.println(s1);
        System.out.println(s2);
        System.out.print(q);
    }
}