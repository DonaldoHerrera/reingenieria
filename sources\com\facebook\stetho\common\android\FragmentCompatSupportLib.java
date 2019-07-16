package com.facebook.stetho.common.android;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

final class FragmentCompatSupportLib extends FragmentCompat<Fragment, C0361c, C0370l, FragmentActivity> {
    private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
    private static final FragmentAccessorSupportLib sFragmentAccessor = new FragmentAccessorSupportLib();
    private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor = new FragmentActivityAccessorSupportLib();
    private static final FragmentManagerAccessorViaReflection<C0370l, Fragment> sFragmentManagerAccessor = new FragmentManagerAccessorViaReflection<>();

    private static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<C0361c, Fragment, C0370l> {
        private DialogFragmentAccessorSupportLib() {
            super();
        }

        public Dialog getDialog(C0361c cVar) {
            return cVar.getDialog();
        }
    }

    private static class FragmentAccessorSupportLib implements FragmentAccessor<Fragment, C0370l> {
        private FragmentAccessorSupportLib() {
        }

        public C0370l getChildFragmentManager(Fragment fragment) {
            return fragment.getChildFragmentManager();
        }

        public C0370l getFragmentManager(Fragment fragment) {
            return fragment.getFragmentManager();
        }

        public int getId(Fragment fragment) {
            return fragment.getId();
        }

        public Resources getResources(Fragment fragment) {
            return fragment.getResources();
        }

        public String getTag(Fragment fragment) {
            return fragment.getTag();
        }

        public View getView(Fragment fragment) {
            return fragment.getView();
        }
    }

    private static class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<FragmentActivity, C0370l> {
        private FragmentActivityAccessorSupportLib() {
        }

        public C0370l getFragmentManager(FragmentActivity fragmentActivity) {
            return fragmentActivity.getSupportFragmentManager();
        }
    }

    FragmentCompatSupportLib() {
    }

    public FragmentManagerAccessor<C0370l, Fragment> forFragmentManager() {
        return sFragmentManagerAccessor;
    }

    public Class<C0361c> getDialogFragmentClass() {
        return C0361c.class;
    }

    public Class<FragmentActivity> getFragmentActivityClass() {
        return FragmentActivity.class;
    }

    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }

    public DialogFragmentAccessorSupportLib forDialogFragment() {
        return sDialogFragmentAccessor;
    }

    public FragmentAccessorSupportLib forFragment() {
        return sFragmentAccessor;
    }

    public FragmentActivityAccessorSupportLib forFragmentActivity() {
        return sFragmentActivityAccessor;
    }
}
