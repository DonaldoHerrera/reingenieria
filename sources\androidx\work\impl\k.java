package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.utils.g;

/* compiled from: WorkDatabaseMigrations */
public class k {
    public static Kd a = new h(1, 2);
    public static Kd b = new i(3, 4);
    public static Kd c = new j(4, 5);

    /* compiled from: WorkDatabaseMigrations */
    public static class a extends Kd {
        final Context c;

        public a(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        public void a(Ud ud) {
            new g(this.c).a(true);
        }
    }
}
