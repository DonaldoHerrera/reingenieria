package com.soundcloud.android.profile;

/* compiled from: ProfileModule */
public abstract class La {
    static ProfileScrollHelper a(C5836qa qaVar, C4806CMa<ProfileScrollHelper> cMa, C4806CMa<BannerProfileScrollHelper> cMa2) {
        if (qaVar.a()) {
            return (ProfileScrollHelper) cMa2.get();
        }
        return (ProfileScrollHelper) cMa.get();
    }
}
