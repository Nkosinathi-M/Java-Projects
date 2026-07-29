public class Divide implements Operator 
{
    @Override
    public Double getResult(Double... numbers) 
    {
        Double divide = numbers[0];

        for (int i = 1; i < numbers.length; i++) 
        {
            divide /= numbers[i];
        }
        return divide;
    }
}
