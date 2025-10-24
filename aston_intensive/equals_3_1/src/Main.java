public class Man {

    private String noseSize;
    private String eyesColor;
    private String haircut;
    private boolean scars;
    private int dnaCode;

    public Man(String noseSize, String eyesColor, String haircut, boolean scars, int dnaCode) {
        this.noseSize = noseSize;
        this.eyesColor = eyesColor;
        this.haircut = haircut;
        this.scars = scars;
        this.dnaCode = dnaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == 0) return true;
        if (getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return dnaCode == man.dnaCode;
    }
}