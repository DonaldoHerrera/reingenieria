package androidx.appcompat.app;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.appcompat.app.AlertController.a;

/* renamed from: androidx.appcompat.app.i reason: case insensitive filesystem */
/* compiled from: AlertController */
class C0322i extends CursorAdapter {
    private final int a;
    private final int b;
    final /* synthetic */ RecycleListView c;
    final /* synthetic */ AlertController d;
    final /* synthetic */ a e;

    C0322i(a aVar, Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
        this.e = aVar;
        this.c = recycleListView;
        this.d = alertController;
        super(context, cursor, z);
        Cursor cursor2 = getCursor();
        this.a = cursor2.getColumnIndexOrThrow(this.e.L);
        this.b = cursor2.getColumnIndexOrThrow(this.e.M);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.a));
        RecycleListView recycleListView = this.c;
        int position = cursor.getPosition();
        boolean z = true;
        if (cursor.getInt(this.b) != 1) {
            z = false;
        }
        recycleListView.setItemChecked(position, z);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.e.b.inflate(this.d.M, viewGroup, false);
    }
}
