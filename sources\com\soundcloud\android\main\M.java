package com.soundcloud.android.main;

import android.os.Bundle;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.ia.i;
import java.util.List;

/* compiled from: FragNavControllerFactory.kt */
public class M {
    public C3030hI a(C0370l lVar, Bundle bundle, d dVar, C3106lI lIVar, List<? extends Fragment> list) {
        C7471uYa.b(lVar, "fragmentManager");
        C7471uYa.b(dVar, "transactionListener");
        C7471uYa.b(lIVar, "transactionOptions");
        C7471uYa.b(list, "fragments");
        a a = C3030hI.a(bundle, lVar, i.main_container);
        a.a(dVar);
        a.a(lIVar);
        a.a(list);
        C3030hI a2 = a.a();
        C7471uYa.a((Object) a2, "FragNavController.newBui…                 .build()");
        return a2;
    }
}
