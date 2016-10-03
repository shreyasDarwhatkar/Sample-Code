
public class ColorName {
	public int r, g, b;
    public String name,Mineral;

    public ColorName(String name, int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.name = name;
    }
    public ColorName(String name, int r, int g, int b,String Mname) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.name = name;
        this.Mineral=Mname;
    }

    public int computeMSE(int pixR, int pixG, int pixB) {
        return (int) (((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b)
                * (pixB - b)) / 3);
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public String getName() {
        return name;
    }
    public String getMineral() {
        return Mineral;    }
}

