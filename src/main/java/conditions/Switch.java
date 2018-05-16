package conditions;

public class Switch {
    public int simpleSwitch(int intOne) {
        switch (intOne) {
            case 0:
                return 3;
            case 1:
                return 2;
            case 4:
                return 1;
            default:
                return -1;
        }
    }
}
