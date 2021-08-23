import lombok.Getter;

import java.util.List;

@Getter
public abstract class Tree implements Plant {

    Trunk trunk;
    List<Branch> branchList;
    List<Leaves> leaves;

    public Tree(Trunk trunk, List<Branch> branchList, List<Leaves> leaves) {
        this.trunk = trunk;
        this.branchList = branchList;
        this.leaves = leaves;
    }

    public Tree(Trunk trunk, List<Leaves> leaves) {
        this.trunk = trunk;
        this.leaves = leaves;
    }

    public Tree(List<Branch> branchList, List<Leaves> leaves) {
        this.branchList = branchList;
        this.leaves = leaves;
    }

    public Tree() {
    }

    abstract void grow();
}
