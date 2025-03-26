package Actions;

import Interfaces.IActions;
import Stuff.EActions;

public abstract class Actions implements IActions {
    public abstract String executeAction();
    public abstract EActions getType();

    @Override
    public String toString() {
        return "Действие: " + executeAction();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Actions action = (Actions) obj;
        return this.executeAction() == action.executeAction() && this.getType() == action.getType();
    }

    @Override
    public int hashCode() {
        return this.executeAction().hashCode();
    }
}

