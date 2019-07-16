package bo.app;

public class gt {
    private final int a;
    private final int b;

    public gt(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(9);
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }

    public gt a(int i) {
        return new gt(this.a / i, this.b / i);
    }

    public gt a(float f) {
        return new gt((int) (((float) this.a) * f), (int) (((float) this.b) * f));
    }

    public gt(int i, int i2, int i3) {
        if (i3 % 180 == 0) {
            this.a = i;
            this.b = i2;
            return;
        }
        this.a = i2;
        this.b = i;
    }
}
