package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Arrays;
import java.util.List;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/startup/migrations/MigrationEngine;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "migrationsToApply", "", "Lcom/soundcloud/android/startup/migrations/Migration;", "(Landroid/content/SharedPreferences;[Lcom/soundcloud/android/startup/migrations/Migration;)V", "migrations", "", "isNotFreshInstall", "", "previousVersionCode", "", "migrate", "", "updateVersionIndex", "pastMigrations", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: Kxa reason: default package and case insensitive filesystem */
/* compiled from: MigrationEngine.kt */
public final class C5071Kxa {
    private static final String a = a;
    private static final String b = b;
    public static final a c = new a(null);
    private final List<C5040Jxa> d;
    private final SharedPreferences e;

    /* renamed from: Kxa$a */
    /* compiled from: MigrationEngine.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C5071Kxa(SharedPreferences sharedPreferences, C5040Jxa... jxaArr) {
        C7471uYa.b(sharedPreferences, "sharedPreferences");
        C7471uYa.b(jxaArr, "migrationsToApply");
        this.e = sharedPreferences;
        this.d = C6918mWa.b((Object[]) (C5040Jxa[]) Arrays.copyOf(jxaArr, jxaArr.length));
    }

    private final void b(int i) {
        Editor edit = this.e.edit();
        edit.putInt(a, i);
        edit.apply();
    }

    public final void a() {
        int i = this.e.getInt(a, -1);
        if (a(i) && i < this.d.size()) {
            for (C5040Jxa a2 : this.d.subList(Math.max(i, 0), this.d.size())) {
                a2.a();
            }
        }
        b(this.d.size());
    }

    private final boolean a(int i) {
        return i != -1 || this.e.contains(b);
    }
}
