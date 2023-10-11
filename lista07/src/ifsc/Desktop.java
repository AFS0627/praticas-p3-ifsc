package ifsc;

import java.util.ArrayList;

class Desktop extends Produto {
    private boolean gamer;
    private ArrayList<String> pecas = new ArrayList<>();

    public boolean isGamer() {
        return gamer;
    }

    public void setGamer(boolean gamer) {
        this.gamer = gamer;
    }

    public ArrayList<String> getPecas() {
        return pecas;
    }

    public void setPecas(ArrayList<String> pecas) {
        this.pecas = pecas;
    }
}
