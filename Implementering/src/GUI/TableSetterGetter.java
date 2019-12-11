package GUI;

import java.awt.*;

public class TableSetterGetter {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Checkbox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(Checkbox checkBox) {
        this.checkBox = checkBox;
    }

    Checkbox checkBox;
}
