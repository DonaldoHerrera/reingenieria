package bo.app;

import java.util.Set;

public class bn implements bp {
    private final Set<bo> a;

    public bn(Set<bo> set) {
        this.a = set;
    }

    public Set<bo> a() {
        return this.a;
    }

    public boolean b() {
        Set<bo> set = this.a;
        return set != null && set.isEmpty();
    }
}
