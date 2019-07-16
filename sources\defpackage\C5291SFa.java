package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.m;
import com.soundcloud.android.ia.p;

/* renamed from: SFa reason: default package and case insensitive filesystem */
/* compiled from: UserMenuRenderer */
class C5291SFa implements b {
    private C4954HFa a;
    private final a b;
    private C4772BJa c;

    /* renamed from: SFa$a */
    /* compiled from: UserMenuRenderer */
    interface a {
        void a(C4954HFa hFa);

        void a(Activity activity, C4954HFa hFa);

        void onDismiss();
    }

    public C5291SFa(a aVar, View view, defpackage.C4772BJa.a aVar2) {
        this.b = aVar;
        this.c = aVar2.a(view.getContext(), view);
        this.c.b(m.user_item_actions);
        this.c.b((b) this);
        this.c.a((b) this);
    }

    private void b(MenuItem menuItem, boolean z) {
        menuItem.setVisible(z);
    }

    /* access modifiers changed from: 0000 */
    public void a(C4954HFa hFa, boolean z) {
        this.a = hFa;
        a(hFa.e, z);
        this.c.b();
    }

    public void onDismiss() {
        this.c = null;
        this.b.onDismiss();
    }

    private void a(boolean z, boolean z2) {
        MenuItem a2 = this.c.a(i.toggle_follow);
        b(a2, z2);
        a(a2, z);
    }

    private void a(MenuItem menuItem, boolean z) {
        menuItem.setTitle(z ? p.btn_unfollow : p.btn_follow);
    }

    public boolean a(MenuItem menuItem, Context context) {
        int itemId = menuItem.getItemId();
        if (itemId == i.toggle_follow) {
            this.b.a(this.a);
            return true;
        } else if (itemId != i.open_station) {
            return false;
        } else {
            this.b.a(C6768kIa.a(context), this.a);
            return true;
        }
    }
}
