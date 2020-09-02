import java.util.Objects;

import static java.util.Objects.hash;

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

    public boolean containsKey(K key)
    {
        int answer = findIndex(key);

        return answer != -1;
    }

    private int findIndex(K key)
    {
        int count = 0;
        int i = hash(key);

        while ((count < data.length) && (hasBeenUsed[i]))
        {
            if (key.equals(keys[i]))
            {
                return i;
            }
            count++;
            i = nextIndex(i);
        }

        return -1;
    }

    private int hash(Object key)
    {
        return Math.abs(key.hashCode()) % data.length;
    }

    /**
     * Just circles back to the beginning of the array when index reaches the end
     * @param i int
     * @return int
     */
    private int nextIndex(int i)
    {
        if (i + 1 == data.length)
        {
            return 0;
        }
        else
        {
            return i + 1;
        }
    }

}

class TableTester
{
    public static void main(String[] sdfsdfsdfa)
    {
        int sizeOfTable = 50;
        Table<String, String> thing = new Table<>(50);

        String aString = "I love it";

        int total = Math.abs(aString.hashCode()) % sizeOfTable;

        total = 101 % sizeOfTable;
    }
}
