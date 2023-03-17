package dev.ifrs;

public class No_to_km {
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

    public double converte_No_to_km(double no)
        {
            final double milha = 1.852;
            double no_km;

            no_km = no * milha;
            
            return no_km;
                }
}
