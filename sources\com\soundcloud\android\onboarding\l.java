package com.soundcloud.android.onboarding;

import com.soundcloud.android.ia.p;

/* compiled from: GenderOption.kt */
public enum l {
    FEMALE(p.onboarding_gender_option_female, "female"),
    MALE(p.onboarding_gender_option_male, "male"),
    CUSTOM(p.onboarding_gender_option_custom, null),
    NO_PREF(p.onboarding_gender_option_nopref, null);
    
    private final int f;
    private final String g;

    private l(int i, String str) {
        this.f = i;
        this.g = str;
    }

    public final int a() {
        return this.f;
    }

    public final String a(String str) {
        return this == CUSTOM ? str : this.g;
    }
}
