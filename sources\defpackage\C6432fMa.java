package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fMa reason: default package and case insensitive filesystem */
/* compiled from: QueryToListOperator */
final class C6432fMa<T> implements DPa<List<T>, c> {
    private final C7118pQa<Cursor, T> a;

    /* renamed from: fMa$a */
    /* compiled from: QueryToListOperator */
    static final class a<T> extends OUa<c> {
        private final GPa<? super List<T>> b;
        private final C7118pQa<Cursor, T> c;

        a(GPa<? super List<T>> gPa, C7118pQa<Cursor, T> pqa) {
            this.b = gPa;
            this.c = pqa;
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.b.a((VPa) this);
        }

        public void onComplete() {
            if (!a()) {
                this.b.onComplete();
            }
        }

        public void a(c cVar) {
            Cursor a;
            try {
                a = cVar.a();
                if (a != null) {
                    if (!a()) {
                        ArrayList arrayList = new ArrayList(a.getCount());
                        while (a.moveToNext()) {
                            arrayList.add(this.c.apply(a));
                        }
                        a.close();
                        if (!a()) {
                            this.b.a(arrayList);
                        }
                    }
                }
            } catch (Throwable th) {
                _Pa.b(th);
                a(th);
            }
        }

        public void a(Throwable th) {
            if (a()) {
                WUa.b(th);
            } else {
                this.b.a(th);
            }
        }
    }

    C6432fMa(C7118pQa<Cursor, T> pqa) {
        this.a = pqa;
    }

    public GPa<? super c> a(GPa<? super List<T>> gPa) {
        return new a(gPa, this.a);
    }
}
