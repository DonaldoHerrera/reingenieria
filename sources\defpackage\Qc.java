package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: Qc reason: default package */
/* compiled from: CursorAdapter */
public abstract class Qc extends BaseAdapter implements Filterable, a {
    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context d;
    protected int e;
    protected a f;
    protected DataSetObserver g;
    protected Rc h;

    /* renamed from: Qc$a */
    /* compiled from: CursorAdapter */
    private class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Qc.this.b();
        }
    }

    /* renamed from: Qc$b */
    /* compiled from: CursorAdapter */
    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            Qc qc = Qc.this;
            qc.a = true;
            qc.notifyDataSetChanged();
        }

        public void onInvalidated() {
            Qc qc = Qc.this;
            qc.a = false;
            qc.notifyDataSetInvalidated();
        }
    }

    public Qc(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: 0000 */
    public void a(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.b = true;
        } else {
            this.b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.c = cursor;
        this.a = z;
        this.d = context;
        this.e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f = new a();
            this.g = new b();
        } else {
            this.f = null;
            this.g = null;
        }
        if (z) {
            a aVar = this.f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public Cursor b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.c = cursor;
        if (cursor != null) {
            a aVar2 = this.f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.e = cursor.getColumnIndexOrThrow("_id");
            this.a = true;
            notifyDataSetChanged();
        } else {
            this.e = -1;
            this.a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract CharSequence convertToString(Cursor cursor);

    public int getCount() {
        if (this.a) {
            Cursor cursor = this.c;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            view = a(this.d, this.c, viewGroup);
        }
        a(view, this.d, this.c);
        return view;
    }

    public Filter getFilter() {
        if (this.h == null) {
            this.h = new Rc(this);
        }
        return this.h;
    }

    public Object getItem(int i) {
        if (this.a) {
            Cursor cursor = this.c;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.c;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.a) {
            Cursor cursor = this.c;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.c.getLong(this.e);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.c.moveToPosition(i)) {
            if (view == null) {
                view = b(this.d, this.c, viewGroup);
            }
            a(view, this.d, this.c);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public Cursor a() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (this.b) {
            Cursor cursor = this.c;
            if (cursor != null && !cursor.isClosed()) {
                this.a = this.c.requery();
            }
        }
    }

    public void a(Cursor cursor) {
        Cursor b2 = b(cursor);
        if (b2 != null) {
            b2.close();
        }
    }
}
