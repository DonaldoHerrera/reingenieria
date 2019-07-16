package com.soundcloud.android.comments;

import com.soundcloud.android.comments.C2921y.a;
import com.soundcloud.android.comments.C2921y.b;

/* renamed from: com.soundcloud.android.comments.z reason: case insensitive filesystem */
/* compiled from: CommentViewModel.kt */
public final class C2923z {
    public static final boolean a(C2921y yVar, C2921y yVar2) {
        C7471uYa.b(yVar, "$this$hasIdentityEqual");
        C7471uYa.b(yVar2, "secondViewModel");
        if (yVar.a() != yVar2.a() || yVar.a() != b.COMMENT) {
            return false;
        }
        String str = " not of type ";
        String str2 = "Input ";
        if (yVar instanceof a) {
            C3508cda h = ((a) yVar).h();
            if (yVar2 instanceof a) {
                return C7471uYa.a((Object) h, (Object) ((a) yVar2).h());
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(yVar2);
            sb.append(str);
            sb.append(a.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(yVar);
        sb2.append(str);
        sb2.append(a.class.getSimpleName());
        throw new IllegalArgumentException(sb2.toString());
    }
}
