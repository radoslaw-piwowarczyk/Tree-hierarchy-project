
import java.util.List;

public class LeafyTree extends Tree implements Leaves {

    @Override
    public void grow() {
        System.out.println("Lets grow to be a big leafy tree");
    }

    public LeafyTree(Trunk trunk, List<Branch> branchList, List<Leaves> leaves) {
        super(trunk.getTrunk(), branchList, leaves);
    }
}

