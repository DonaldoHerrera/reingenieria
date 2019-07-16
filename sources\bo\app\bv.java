package bo.app;

import java.util.UUID;

public final class bv implements C1294fg<String> {
    private final UUID a;
    private final String b;

    public bv(UUID uuid) {
        this.a = uuid;
        this.b = uuid.toString();
    }

    public static bv a() {
        return new bv(UUID.randomUUID());
    }

    /* renamed from: b */
    public String forJsonPut() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bv.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bv) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.b;
    }

    public static bv a(String str) {
        return new bv(UUID.fromString(str));
    }
}
