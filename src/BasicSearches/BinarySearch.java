package BasicSearches;

public class BinarySearch
{


    public static <T extends Comparable> int search(T[] a, int first, int size, int target)
    {
        int middle;

        if (size <= 0)
        {
            return -1;
        }
        else
        {
            middle = first + size / 2;
            if (a[middle].compareTo(target) == 0)
            {
                return middle;
            } else if (a[middle].compareTo(target) < 0)
            {
                return search(a, first, size / 2, target);
            }
            else
            {
                return search(a, middle + 1, (size - 1) / 2, target);
            }
        }
    }

    public static <T extends Comparable> int searchWithLast(T[] a, int first, int last, int target)
    {
        int middle;

        if (last <= 0 || last < first)
        {
            return -1;
        }
        else
        {
            middle = first + last / 2;
            if (a[middle].compareTo(target) == 0)
            {
                return middle;
            } else if (a[middle].compareTo(target) < 0)
            {
                return searchWithLast(a, first, last / 2, target);
            }
            else
            {
                return searchWithLast(a, middle + 1, (last - 1) / 2, target);
            }
        }
    }


}
