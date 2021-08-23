import java.util.List;

public class Branch extends Tree implements Leaves {

    @Override
    public void grow() {
        System.out.println("I am growing big for my tree to have many leaves");
    }

    public Branch(Trunk trunk, List<Leaves> leaves) {
        super(trunk,leaves);
    }
}

