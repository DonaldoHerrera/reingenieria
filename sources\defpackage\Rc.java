package defpackage;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: Rc reason: default package */
/* compiled from: CursorFilter */
class Rc extends Filter {
    a a;

    /* renamed from: Rc$a */
    /* compiled from: CursorFilter */
    interface a {
        Cursor a();

        Cursor a(CharSequence charSequence);

        void a(Cursor cursor);

        CharSequence convertToString(Cursor cursor);
    }

    Rc(a aVar) {
        this.a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.a.convertToString((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor a2 = this.a.a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a2 != null) {
            filterResults.count = a2.getCount();
            filterResults.values = a2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a2 = this.a.a();
        Object obj = filterResults.values;
        if (obj != null && obj != a2) {
            this.a.a((Cursor) obj);
        }
    }
}
