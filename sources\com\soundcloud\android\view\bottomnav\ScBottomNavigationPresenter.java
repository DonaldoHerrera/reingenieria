package com.soundcloud.android.view.bottomnav;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.appcompat.view.menu.D;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;

public class ScBottomNavigationPresenter implements v {
    private l a;
    private ScBottomNavigationMenuView b;
    private boolean c = false;
    private int d;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new d();
        int a;

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
        }
    }

    public void a(l lVar, boolean z) {
    }

    /* access modifiers changed from: 0000 */
    public void a(ScBottomNavigationMenuView scBottomNavigationMenuView) {
        this.b = scBottomNavigationMenuView;
    }

    public boolean a(D d2) {
        return false;
    }

    public boolean a(l lVar, p pVar) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        this.c = z;
    }

    public boolean b() {
        return false;
    }

    public boolean b(l lVar, p pVar) {
        return false;
    }

    public int getId() {
        return this.d;
    }

    public void a(Context context, l lVar) {
        this.b.a(this.a);
        this.a = lVar;
    }

    public void a(boolean z) {
        if (!this.c) {
            if (z) {
                this.b.a();
            } else {
                this.b.b();
            }
        }
    }

    public void a(int i) {
        this.d = i;
    }

    public Parcelable a() {
        SavedState savedState = new SavedState();
        savedState.a = this.b.getSelectedItemId();
        return savedState;
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.b.a(((SavedState) parcelable).a);
        }
    }
}
