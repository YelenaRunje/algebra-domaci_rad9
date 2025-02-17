class Proizvod {
    private String naziv;
    private double cijena; // Promijenjeno iz int u double
    private int kolicina;

    public Proizvod(String naziv, double cijena, int kolicina) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kolicina = kolicina;
    }

    public String getInfo() {
        return naziv + " - cijena: " + cijena + " EUR, količina: " + kolicina;
    }
}
