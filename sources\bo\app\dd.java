package bo.app;

import java.util.Collection;
import java.util.Collections;

public class dd implements dg {
    private static final String a = Hg.a(dd.class);
    private final dg b;
    private final ab c;

    public dd(dg dgVar, ab abVar) {
        this.b = dgVar;
        this.c = abVar;
    }

    public void a(bo boVar) {
        try {
            this.b.a(boVar);
        } catch (Exception e) {
            Hg.b(a, "Failed to insert event into storage.", e);
            a(this.c, e);
        }
    }

    public void b(bo boVar) {
        try {
            this.b.b(boVar);
        } catch (Exception e) {
            Hg.b(a, "Failed to delete event from storage.", e);
            a(this.c, e);
        }
    }

    public Collection<bo> a() {
        try {
            return this.b.a();
        } catch (Exception e) {
            Hg.b(a, "Failed to get all events from storage.", e);
            a(this.c, e);
            return Collections.emptyList();
        }
    }

    private void a(ab abVar, Throwable th) {
        try {
            abVar.a(new aq("A database exception has occurred. Please view the stack trace for more details.", th), aq.class);
        } catch (Exception e) {
            Hg.b(a, "Failed to log throwable.", e);
        }
    }
}
