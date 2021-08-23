import java.util.List;

public class ConiferTree extends Tree implements Leaves {

    @Override
    public void grow() {
        System.out.println("Lets grow to be a big christmas tree");
    }

    public ConiferTree(Trunk trunk, List<Branch> branchList, List<Leaves> leaves) {
        super(trunk, branchList, leaves);
    }
}
