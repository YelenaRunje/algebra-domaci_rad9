class Proizvod {
    private String naziv;
    private double cijena;
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
