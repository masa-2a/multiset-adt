public class Main {
    public static void main(String[] args) {
        // TODO complete this psvm main method to replicate the timing experiment from adts.py.
        //      Note: this will be client code of the various other classes needing to be written.

        MultiSet[] multisets = new MultiSet[] {new TreeMultiSet(), new TreeMultiSet()};
        List<Integer> nums=Arrays.asList(500, 1000, 2000, 4000);

        for (MultiSet multiset : multisets) {
            for (int num: nums){
                profileMultiSet(multiset, num);
            }
        }
    }
}
