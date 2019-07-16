package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C0425t.b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.g reason: case insensitive filesystem */
/* compiled from: AsyncListDiffer */
public class C0413g<T> {
    private static final Executor a = new a();
    private final O b;
    final C0409c<T> c;
    final Executor d;
    private List<T> e;
    private List<T> f = Collections.emptyList();
    int g;

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* compiled from: AsyncListDiffer */
    private static class a implements Executor {
        final Handler a = new Handler(Looper.getMainLooper());

        a() {
        }

        public void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    public C0413g(O o, C0409c<T> cVar) {
        this.b = o;
        this.c = cVar;
        if (cVar.c() != null) {
            this.d = cVar.c();
        } else {
            this.d = a;
        }
    }

    public List<T> a() {
        return this.f;
    }

    public void a(List<T> list) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list != list2) {
            if (list == null) {
                int size = list2.size();
                this.e = null;
                this.f = Collections.emptyList();
                this.b.b(0, size);
            } else if (list2 == null) {
                this.e = list;
                this.f = Collections.unmodifiableList(list);
                this.b.a(0, list.size());
            } else {
                this.c.a().execute(new C0412f(this, list2, list, i));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(List<T> list, b bVar) {
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        bVar.a(this.b);
    }
}
