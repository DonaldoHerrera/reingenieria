package defpackage;

/* renamed from: Ff reason: default package */
public enum Ff {
    NOTIFICATION_EXPANDED_IMAGE(478, 256),
    NOTIFICATION_LARGE_ICON(64, 64),
    IN_APP_MESSAGE_MODAL(580, 580),
    IN_APP_MESSAGE_SLIDEUP(100, 100),
    NO_BOUNDS(0, 0);
    
    final int g;
    final int h;

    private Ff(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    public int a() {
        return this.h;
    }

    public int b() {
        return this.g;
    }
}
