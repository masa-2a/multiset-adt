public class TreeMultiSet extends MultiSet {

//Created a Tree object for this class.
    private Tree tree;
    public TreeMultiSet() {
        tree = new Tree(null, null);
    }

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        tree.insert(item);
    }
    // write the rest of the implementation for this class so that it uses its private Tree
    // object to provide the MultiSet functionality.

    void remove(Integer item) {

        tree.delete_item(item);
    }
}
