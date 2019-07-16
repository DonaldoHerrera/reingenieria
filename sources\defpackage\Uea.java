package defpackage;

import java.util.Locale;

/* renamed from: Uea reason: default package */
/* compiled from: DatabaseMigrationEvent */
public class Uea {
    private final C3816lea a;

    /* renamed from: Uea$a */
    /* compiled from: DatabaseMigrationEvent */
    enum a {
        SUCCESS("success"),
        FAILURE("failed");
        
        private final String d;

        private a(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    private Uea(C3816lea lea) {
        this.a = lea;
    }

    public static Uea a(long j) {
        return new Uea(C3816lea.a("core_db_migrations_report", C3808kea.a("migration_status", a.SUCCESS.a()), C3808kea.a("success_duration", (Number) Long.valueOf(j))));
    }

    public static Uea a(int i, int i2, long j, String str) {
        return new Uea(C3816lea.a("core_db_migrations_report", C3808kea.a("migration_status", a.FAILURE.a()), C3808kea.a("fail_reason", str), C3808kea.a("fail_versions", a(i, i2)), C3808kea.a("fail_duration", (Number) Long.valueOf(j))));
    }

    private static String a(int i, int i2) {
        return String.format(Locale.getDefault(), "%1$d to %2$d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    public C3816lea a() {
        return this.a;
    }
}
