package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Sc reason: default package */
/* compiled from: ResourceCursorAdapter */
public abstract class Sc extends Qc {
    private int i;
    private int j;
    private LayoutInflater k;

    @Deprecated
    public Sc(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.j = i2;
        this.i = i2;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.j, viewGroup, false);
    }

    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.i, viewGroup, false);
    }
}
