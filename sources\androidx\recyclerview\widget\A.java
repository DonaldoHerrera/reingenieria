package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.l;

/* compiled from: ItemTouchHelper */
class A implements l {
    final /* synthetic */ G a;

    A(G g) {
        this.a = g;
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.z.a(motionEvent);
        VelocityTracker velocityTracker = this.a.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.a.l != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(this.a.l);
            if (findPointerIndex >= 0) {
                this.a.a(actionMasked, motionEvent, findPointerIndex);
            }
            G g = this.a;
            ViewHolder viewHolder = g.c;
            if (viewHolder != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = g.t;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.a.l) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.a.l = motionEvent.getPointerId(i);
                                G g2 = this.a;
                                g2.a(motionEvent, g2.o, actionIndex);
                            }
                        }
                    } else if (findPointerIndex >= 0) {
                        g.a(motionEvent, g.o, findPointerIndex);
                        this.a.a(viewHolder);
                        G g3 = this.a;
                        g3.r.removeCallbacks(g3.s);
                        this.a.s.run();
                        this.a.r.invalidate();
                    }
                }
                this.a.a((ViewHolder) null, 0);
                this.a.l = -1;
            }
        }
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.z.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.l = motionEvent.getPointerId(0);
            this.a.d = motionEvent.getX();
            this.a.e = motionEvent.getY();
            this.a.b();
            G g = this.a;
            if (g.c == null) {
                c a2 = g.a(motionEvent);
                if (a2 != null) {
                    G g2 = this.a;
                    g2.d -= a2.j;
                    g2.e -= a2.k;
                    g2.a(a2.e, true);
                    if (this.a.a.remove(a2.e.itemView)) {
                        G g3 = this.a;
                        g3.m.a(g3.r, a2.e);
                    }
                    this.a.a(a2.e, a2.f);
                    G g4 = this.a;
                    g4.a(motionEvent, g4.o, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            G g5 = this.a;
            g5.l = -1;
            g5.a((ViewHolder) null, 0);
        } else {
            int i = this.a.l;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                if (findPointerIndex >= 0) {
                    this.a.a(actionMasked, motionEvent, findPointerIndex);
                }
            }
        }
        VelocityTracker velocityTracker = this.a.t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.a.c != null) {
            return true;
        }
        return false;
    }

    public void a(boolean z) {
        if (z) {
            this.a.a((ViewHolder) null, 0);
        }
    }
}
