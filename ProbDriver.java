public class ProbDriver
{
    public static void main(String[] args)
    {
        Probability p1 = new Probability(50,100);
        Probability p2 = new Probability(6,12);
        System.out.println(p1.probabilityOR(p2, 0.1));
    }

}
