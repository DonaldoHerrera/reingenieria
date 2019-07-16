package com.soundcloud.android.main;

import androidx.fragment.app.Fragment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: NavigationModel */
public class Z {
    private final List<a> a;

    /* compiled from: NavigationModel */
    public interface a {
        Yca Ta();

        Fragment Ua();

        int getIcon();

        int getName();
    }

    public Z(a... aVarArr) {
        this.a = Arrays.asList(aVarArr);
    }

    public a a(int i) {
        return (a) this.a.get(i);
    }

    public List<a> b() {
        return Collections.unmodifiableList(this.a);
    }

    public int a() {
        return this.a.size();
    }

    public int a(Yca yca) {
        for (int i = 0; i < this.a.size(); i++) {
            if (((a) this.a.get(i)).Ta().equals(yca)) {
                return i;
            }
        }
        return -1;
    }
}
