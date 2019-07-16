package androidx.preference;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* compiled from: SeekBarPreference */
class K implements OnSeekBarChangeListener {
    final /* synthetic */ SeekBarPreference a;

    K(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.a;
            if (!seekBarPreference.S) {
                seekBarPreference.a(seekBar);
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.a.S = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        this.a.S = false;
        int progress = seekBar.getProgress();
        SeekBarPreference seekBarPreference = this.a;
        if (progress + seekBarPreference.P != seekBarPreference.O) {
            seekBarPreference.a(seekBar);
        }
    }
}
