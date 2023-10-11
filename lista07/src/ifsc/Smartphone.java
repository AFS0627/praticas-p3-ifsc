package ifsc;

class Smartphone extends Produto {
    private String dimensoesTela;
    private String outraPropriedade;

    public String getDimensoesTela() {
        return dimensoesTela;
    }

    public void setDimensoesTela(String dimensoesTela) {
        this.dimensoesTela = dimensoesTela;
    }

    public String getOutraPropriedade() {
        return outraPropriedade;
    }

    public void setOutraPropriedade(String outraPropriedade) {
        this.outraPropriedade = outraPropriedade;
    }
}

