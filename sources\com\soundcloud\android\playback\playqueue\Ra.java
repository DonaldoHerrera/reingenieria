package com.soundcloud.android.playback.playqueue;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.G.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.view.Q;

/* compiled from: PlayQueueSwipeToRemoveCallback */
class Ra extends d {
    private final Paint f;
    private final Paint g;
    private final Rect h;
    private final Q i;
    private final Pa j;
    private int k = -1;
    private int l = -1;

    public Ra(Context context, Pa pa) {
        super(3, 8);
        this.j = pa;
        this.i = Q.a(context);
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
        viewHolder.itemView.setBackgroundResource(h.queue_item_background);
    }

    public boolean b(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2) {
        if (!this.j.a(viewHolder2.getAdapterPosition())) {
            return false;
        }
        this.l = viewHolder2.getAdapterPosition();
        this.j.b(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        return true;
    }

    public int c(RecyclerView recyclerView, ViewHolder viewHolder) {
        if (this.j.a(viewHolder.getAdapterPosition())) {
            return super.c(recyclerView, viewHolder);
        }
        return 0;
    }

    public boolean c() {
        return false;
    }

    public void a(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        a(canvas, f2, viewHolder.itemView);
        a(canvas, f2, f3, viewHolder.itemView);
        super.a(canvas, recyclerView, viewHolder, f2, f3, i2, z);
    }

    public void b(ViewHolder viewHolder, int i2) {
        this.j.b(viewHolder.getAdapterPosition());
    }

    private void a(Canvas canvas, float f2, float f3, View view) {
        C4928GKa<String> gKa = this.i.c;
        if (gKa.c()) {
            canvas.drawText((String) gKa.b(), ((((float) view.getLeft()) + f2) - ((float) this.h.width())) - this.i.e, (((float) view.getBottom()) + f3) - ((float) ((view.getHeight() - this.h.height()) / 2)), this.f);
        }
    }

    private void a(Canvas canvas, float f2, View view) {
        this.g.setAlpha(a(f2, view));
        canvas.drawRect(0.0f, (float) view.getTop(), f2, (float) view.getBottom(), this.g);
    }

    private int a(float f2, View view) {
        return (int) ((f2 * 255.0f) / ((float) view.getWidth()));
    }

    public void a(ViewHolder viewHolder, int i2) {
        super.a(viewHolder, i2);
        if (i2 == 2) {
            this.k = viewHolder.getAdapterPosition();
            viewHolder.itemView.setBackgroundResource(f.play_queue_higlighted_background);
        } else if (i2 == 0) {
            int i3 = this.k;
            if (i3 != -1) {
                int i4 = this.l;
                if (i4 != -1) {
                    this.j.a(i3, i4);
                    this.k = -1;
                    this.l = -1;
                }
            }
        }
    }
}
