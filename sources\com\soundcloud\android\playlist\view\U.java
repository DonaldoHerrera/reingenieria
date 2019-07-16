package com.soundcloud.android.playlist.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.G.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.view.Q;

/* compiled from: PlaylistEditionItemTouchCallback */
class U extends d {
    private final Paint f;
    private final Paint g;
    private final Rect h;
    private final Q i;
    private final PlaylistDetailFragment j;
    private boolean k = false;

    U(Context context, PlaylistDetailFragment playlistDetailFragment) {
        super(3, 12);
        this.i = Q.a(context);
        this.j = playlistDetailFragment;
        this.g = new Paint();
        this.g.setColor(this.i.d);
        this.f = new Paint();
        this.f.setTextSize(this.i.b);
        this.f.setColor(this.i.a);
        this.f.setTypeface(this.i.f);
        this.h = new Rect();
        if (this.i.c.c()) {
            String str = (String) this.i.c.b();
            this.f.getTextBounds(str, 0, str.length(), this.h);
        }
    }

    public void a(RecyclerView recyclerView, ViewHolder viewHolder) {
        super.a(recyclerView, viewHolder);
        viewHolder.itemView.setBackgroundResource(f.white);
    }

    public boolean b(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2) {
        this.k = true;
        this.j.a(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        return true;
    }

    public boolean c() {
        return false;
    }

    private float b(float f2, View view) {
        if (f2 < 0.0f) {
            return ((float) view.getRight()) + f2 + this.i.e;
        }
        return ((((float) view.getLeft()) + f2) - ((float) this.h.width())) - this.i.e;
    }

    public void a(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        a(canvas, f2, viewHolder.itemView);
        a(canvas, f2, f3, viewHolder.itemView);
        super.a(canvas, recyclerView, viewHolder, f2, f3, i2, z);
    }

    public void b(ViewHolder viewHolder, int i2) {
        this.j.c(viewHolder.getAdapterPosition());
    }

    private void a(Canvas canvas, float f2, float f3, View view) {
        C4928GKa<String> gKa = this.i.c;
        if (gKa.c()) {
            canvas.drawText((String) gKa.b(), b(f2, view), (((float) view.getBottom()) + f3) - ((float) ((view.getHeight() - this.h.height()) / 2)), this.f);
        }
    }

    private void a(Canvas canvas, float f2, View view) {
        this.g.setAlpha(a(Math.abs(f2), view));
        if (f2 < 0.0f) {
            float right = (float) view.getRight();
            canvas.drawRect(right + f2, (float) view.getTop(), right, (float) view.getBottom(), this.g);
            return;
        }
        canvas.drawRect(0.0f, (float) view.getTop(), f2, (float) view.getBottom(), this.g);
    }

    private int a(float f2, View view) {
        return (int) ((f2 * 255.0f) / ((float) view.getWidth()));
    }

    public void a(ViewHolder viewHolder, int i2) {
        super.a(viewHolder, i2);
        if (i2 == 2) {
            this.j.Xb();
        } else if (i2 == 0 && this.k) {
            this.k = false;
            this.j.Yb();
        }
    }
}
