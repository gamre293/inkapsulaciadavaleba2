import java.util.ArrayList;
import java.util.List;

class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<>();
    }

    public void addChild(Child child) {
        childrenList.add(child);
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> niceChildren = new ArrayList<>();
        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) niceChildren.add(child);
        }
        return niceChildren;
    }

    public void deliverGifts() {
        List<Child> niceChildren = checkNaughtyOrNiceList();
        System.out.println("Santa is delivering gifts to: " + niceChildren);
    }

    public void spreadJoy() {
        System.out.println(getName() + " is spreading joy!");
    }

    public void singCarols() {
        System.out.println(getName() + " is singing carols!");
    }

    public void decorateTree() {
        System.out.println(getName() + " is decorating the Christmas tree!");
    }
}
