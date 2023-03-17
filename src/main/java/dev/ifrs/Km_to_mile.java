package dev.ifrs;

public class Km_to_mile {
    private Long id;
    private int km;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public float getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }

    public double converte_Km_to_mile(double km)
        {
            final double milha = 0.621371;
            double km_to_mile;

            km_to_mile = km * milha;
            
            return km_to_mile;
                }
}
