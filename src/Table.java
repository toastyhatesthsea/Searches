import java.util.Objects;

public class Table <K, E>
{

    private int amountOfItems;
    private Object[] keys;
    private Object[] data;
    private boolean[] hasBeenUsed;

    public Table(int sizeOfTable)
    {
        if (sizeOfTable <= 0)
        {
            throw new IllegalArgumentException("Capacity is too small");
        }

        keys = new Object[sizeOfTable];
        data = new Object[sizeOfTable];
        hasBeenUsed = new boolean[sizeOfTable];
    }


}
