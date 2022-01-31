public class Mage {
    String name;
    String type;
    int level;
    int damage;

    Mage(String name, int level, int damage, String type) {
        this.damage = damage;
        this.level = level;
        this.name = name;
        if ((type.equals("fire")) || (type.equals("ice")) || (type.equals("earth"))) {
            this.type = type;
            //System.out.println("GOOD Mag type");
        } else {
            //System.out.println("ERROR, unknown Mag type");
            return;
        }
    }
    public String getInfo() {
        String retString = new String(this.name + ", " + this.level + ", " +
                this.damage + ", " + this.type);
        return retString;
    }
    public String fight(Mage mage) {
        String retString = "";
        if (mage == null)
            return "error";

        switch (mage.type) {
            case "fire":
                if (this.type.equals("fire"))
                    retString = compareLevels(mage);
                else if (this.type.equals("ice"))
                    retString = mage.name;
                else
                    retString = this.name;
                break;
            case "ice":
                if (this.type.equals("fire"))
                    retString = this.name;
                else if (this.type.equals("ice"))
                    retString = compareLevels(mage);
                else
                    retString = mage.name;
                break;
            case "earth":
                if (this.type.equals("fire"))
                    retString = mage.name;
                else if (this.type.equals("ice"))
                    retString = this.name;
                else
                    retString = compareLevels(mage);
                break;
        }
        return retString;
    }

    private String compareLevels(Mage mag) {
        String retString = "";
        if (this.level > mag.level)
            retString = this.name;
        else if (this.level == mag.level) {
            if (this.damage < mag.damage)
                retString = mag.name;
            else if (this.damage == mag.damage)
                retString = "draw";
            else
                retString = this.name;
        } else
            retString = mag.name;

        return retString;
    }
}

