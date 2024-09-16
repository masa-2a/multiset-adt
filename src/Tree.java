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

}
