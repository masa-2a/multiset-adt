import java.util.List;

public class Tree {

    private Integer root;
    private List<Tree> subtrees;

    public Tree(Integer root, List<Tree> subtrees) {
        this.root = root;
        if (subtrees == null) {
            this.subtrees = null;
        }
        else {
            this.subtrees = subtrees;
        }

    }
    //implemented is_empty
    public boolean isEmpty() {
        return this.root == null;
    }

    //impleted Length
    public int length(){
        if (this.isEmpty()) {
            return 0;
        }
        else{
            int size = 1;
            for( Tree subtree : subtrees ) {
                size += subtree.length();
            }
            return size;
        }
    }

    //implemented count()
    public int count(int number){
        if (this.isEmpty()) {
            return 0;
        }
        else{
            int num = 0;
            if(this.root == number){
                num++;
            }
            for (Tree subtree : subtrees) {
                num += subtree.count(number);
            }
            return num;
        }
    }

    //TODO implement toString method using private str_indented method



}
