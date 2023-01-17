public class Horse
{
    private String name;
    private int weight;

    public Horse(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    /** @return the horse's name */
    public String getName()
    {
        return name;
    }

    /** @return the horse's weight */
    public int getWeight()
    {
        return weight;
    }

    /** @return a printable String of the Horse */
    public String toString()
    {
        return "name: " + name + ", weight: " + weight;
    }

}