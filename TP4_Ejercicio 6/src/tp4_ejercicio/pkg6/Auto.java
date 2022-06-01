
package tp4_ejercicio.pkg6;


public abstract class Auto {
    private static double precioNafta;
    private static double precioDiesel;
    private static double precioGNC;
    private double combustible;
    private double km;

    public static double getPrecioNafta() {
        return precioNafta;
    }
    public static double getPrecioDiesel() {
        return precioDiesel;
    }
    public static double getPrecioGNC() {
        return precioGNC;
    }
    public double getCombustible() {
        return combustible;
    }
    public double getKm() {
        return km;
    }
    
    public static void setPrecioNafta(double aPrecioNafta) {
        precioNafta = aPrecioNafta;
    }
    public static void setPrecioDiesel(double aPrecioDiesel) {
        precioDiesel = aPrecioDiesel;
    }
    public static void setPrecioGNC(double aPrecioGNC) {
        precioGNC = aPrecioGNC;
    }
    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }    
    public void setKm(double km) {
        this.km = km;
    }
    
    
}
