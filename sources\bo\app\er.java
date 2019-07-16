package bo.app;

import java.util.List;

public final class er extends es implements eh {
    public er(List<eh> list) {
        super(list);
    }

    public boolean a(fb fbVar) {
        boolean z = false;
        for (eh a : this.a) {
            if (!a.a(fbVar)) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
