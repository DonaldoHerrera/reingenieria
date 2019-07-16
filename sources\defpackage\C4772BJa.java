package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.O;

/* renamed from: BJa reason: default package and case insensitive filesystem */
/* compiled from: PopupMenuWrapper */
public class C4772BJa {
    private final O a;
    private final Context b;

    /* renamed from: BJa$a */
    /* compiled from: PopupMenuWrapper */
    public static class a {
        public C4772BJa a(Context context, View view) {
            return new C4772BJa(new O(context, view), context);
        }
    }

    /* renamed from: BJa$b */
    /* compiled from: PopupMenuWrapper */
    public interface b {
        boolean a(MenuItem menuItem, Context context);

        void onDismiss();
    }

    public C4772BJa(O o, Context context) {
        this.a = o;
        this.b = context;
    }

    public MenuItem a(int i) {
        return this.a.b().findItem(i);
    }

    public void b(int i) {
        this.a.a(i);
    }

    public /* synthetic */ boolean a(b bVar, MenuItem menuItem) {
        return bVar.a(menuItem, this.b);
    }

    public void b(b bVar) {
        this.a.a((androidx.appcompat.widget.O.b) new C4741AJa(this, bVar));
    }

    public void b() {
        C5232QGa.a(this.b, this.a);
    }

    public void a(b bVar) {
        this.a.a((androidx.appcompat.widget.O.a) new C7801zJa(bVar));
    }

    public void b(int i, boolean z) {
        this.a.b().findItem(i).setVisible(z);
    }

    public void a(int i, boolean z) {
        this.a.b().findItem(i).setEnabled(z);
    }

    public void a(int i, CharSequence charSequence) {
        this.a.b().findItem(i).setTitle(charSequence);
    }

    public void a() {
        this.a.a();
    }
}
