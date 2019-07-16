package bo.app;

public class de implements dh {
    private static final String a = Hg.a(de.class);
    private final dh b;
    private final ab c;

    public de(dh dhVar, ab abVar) {
        this.b = dhVar;
        this.c = abVar;
    }

    public void a(bt btVar) {
        try {
            this.b.a(btVar);
        } catch (Exception e) {
            Hg.b(a, "Failed to upsert active session in the storage.", e);
            a(this.c, e);
        }
    }

    public void b(bt btVar) {
        try {
            this.b.b(btVar);
        } catch (Exception e) {
            Hg.b(a, "Failed to delete the sealed session from the storage.", e);
            a(this.c, e);
        }
    }

    public bt a() {
        try {
            return this.b.a();
        } catch (Exception e) {
            Hg.b(a, "Failed to get the active session from the storage.", e);
            a(this.c, e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ab abVar, Throwable th) {
        try {
            abVar.a(new aq("A database exception has occurred. Please view the stack trace for more details.", th), aq.class);
        } catch (Exception e) {
            Hg.b(a, "Failed to log throwable.", e);
        }
    }
}
