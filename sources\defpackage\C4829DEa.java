package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.a;

/* renamed from: DEa reason: default package and case insensitive filesystem */
/* compiled from: EmptyAdapter.kt */
public final class C4829DEa<ErrorType> extends a<ViewHolder> {
    private final C4922GEa<ErrorType> c;
    private C4891FEa d = d.b;
    private final int e;

    public C4829DEa(c<ErrorType> cVar, boolean z, int i) {
        C7471uYa.b(cVar, "emptyStateProvider");
        this.e = i;
        this.c = new C4922GEa<>(cVar, z);
    }

    public final void a(C4891FEa fEa) {
        C7471uYa.b(fEa, "emptyStatus");
        if (this.d != fEa) {
            this.d = fEa;
            c(0);
        }
    }

    public int b() {
        return 1;
    }

    public ViewHolder b(ViewGroup viewGroup, int i) {
        C7471uYa.b(viewGroup, "parent");
        return new C4798CEa(this, viewGroup, a(viewGroup));
    }

    public void b(ViewHolder viewHolder, int i) {
        C7471uYa.b(viewHolder, "holder");
        View view = viewHolder.itemView;
        String str = "holder.itemView";
        C7471uYa.a((Object) view, str);
        String str2 = " not of type ";
        String str3 = "Input ";
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            C4891FEa fEa = this.d;
            View view2 = viewHolder.itemView;
            C7471uYa.a((Object) view2, str);
            if (view2 instanceof ViewGroup) {
                C4860EEa.a(viewGroup, a(fEa, (ViewGroup) view2));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(view2);
            sb.append(str2);
            sb.append(ViewGroup.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(view);
        sb2.append(str2);
        sb2.append(ViewGroup.class.getSimpleName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public final View a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.e, viewGroup, false);
        inflate.setLayoutParams(b(this.d));
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…mptyStatus)\n            }");
        return inflate;
    }

    private final View a(C4891FEa fEa, ViewGroup viewGroup) {
        if (fEa instanceof d) {
            return this.c.b(viewGroup);
        }
        if (fEa instanceof b) {
            return this.c.a(viewGroup, ((b) fEa).a());
        }
        if (fEa instanceof c) {
            return this.c.a(viewGroup);
        }
        throw new FVa();
    }

    private final LayoutParams b(C4891FEa fEa) {
        if (fEa instanceof d) {
            return new LayoutParams(-1, -1);
        }
        if ((fEa instanceof b) || (fEa instanceof c)) {
            return new LayoutParams(-1, -2);
        }
        throw new FVa();
    }
}
