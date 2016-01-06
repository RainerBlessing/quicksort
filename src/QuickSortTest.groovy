import junit.framework.TestCase

class QuickSortTest extends TestCase {
    public void testSort(){
        def sort = new QuickSort(4,5,1,3,2)
        def sorted = sort.sort()

        println(sorted)
        assert sorted == [1,2,3,4,5]
    }

    public void testPartition(){
        def sort = new QuickSort()
        def l = []
        def r = [9,1,4,6,7,3,2,8]

        def partition = sort.partition(l,r,5)

        assert partition.lower == [1,4,3,2]
        assert partition.higher == [9,6,7,8]
    }
}
