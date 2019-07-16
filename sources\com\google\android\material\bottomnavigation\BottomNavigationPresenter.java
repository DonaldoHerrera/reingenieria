package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.appcompat.view.menu.D;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;

public class BottomNavigationPresenter implements v {
    private l a;
    private BottomNavigationMenuView b;
    private boolean c = false;
    private int d;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new c();
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

    public void a(BottomNavigationMenuView bottomNavigationMenuView) {
        this.b = bottomNavigationMenuView;
    }

    public boolean a(D d2) {
        return false;
    }

    public boolean a(l lVar, p pVar) {
        return false;
    }

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
        this.a = lVar;
        this.b.a(this.a);
    }

    public void a(boolean z) {
        if (!this.c) {
            if (z) {
                this.b.a();
            } else {
                this.b.c();
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
            this.b.b(((SavedState) parcelable).a);
        }
    }
}
