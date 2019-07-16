package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.e;
import com.google.firebase.components.e.a;
import com.google.firebase.components.j;
import com.google.firebase.components.q;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar implements j {
    public List<e<?>> getComponents() {
        a a = e.a(a.class);
        a.a(q.b(Context.class));
        a.a(q.a(C2102JE.class));
        a.a(b.a);
        return Arrays.asList(new e[]{a.b(), C2383YE.a("fire-abt", "17.1.1")});
    }
}
