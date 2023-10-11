package ifsc;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        ArrayList<Desktop> desktops = new ArrayList<>();
        ArrayList<Smartphone> smartphones = new ArrayList<>();
        Desktop desktop1 = new Desktop();
        desktop1.setFabricante("Dell");
        desktop1.setCodBarras(123456789L);
        desktop1.setGamer(true);
        desktop1.getPecas().add("i5");
        desktops.add(desktop1);

        Desktop desktop2 = new Desktop();
        desktop2.setFabricante("Positivo");
        desktop2.setCodBarras(987654321L);
        desktop2.setGamer(false);
        desktop2.getPecas().add("celeron");
        desktops.add(desktop2);

        Desktop desktop3 = new Desktop();
        desktop3.setFabricante("acer");
        desktop3.setCodBarras(111222333L);
        desktop3.setGamer(true);
        desktop3.getPecas().add("I7");
        desktops.add(desktop3);

        Smartphone smartphone1 = new Smartphone();
        smartphone1.setFabricante("Samsung");
        smartphone1.setCodBarras(333222111L);
        smartphone1.setDimensoesTela("6.2 polegadas");
        smartphone1.setOutraPropriedade("256GB");
        smartphones.add(smartphone1);

        Smartphone smartphone2 = new Smartphone();
        smartphone2.setFabricante("Apple");
        smartphone2.setCodBarras(555444333L);
        smartphone2.setDimensoesTela("5.8 polegadas");
        smartphone2.setOutraPropriedade("1TB");
        smartphones.add(smartphone2);

        Smartphone smartphone3 = new Smartphone();
        smartphone3.setFabricante("Xiomi");
        smartphone3.setCodBarras(777666555L);
        smartphone3.setDimensoesTela("6.0 polegadas");
        smartphone3.setOutraPropriedade("128GB");
        smartphones.add(smartphone3);
        System.out.println("Lista de Desktops:");
        for (Desktop desktop : desktops) {
            System.out.println("Fabricante: " + desktop.getFabricante());
            System.out.println("Código de Barras: " + desktop.getCodBarras());
            System.out.println("É Gamer? " + desktop.isGamer());
            System.out.println("Peças: " + desktop.getPecas()+"\n");
        }
        System.out.println("Lista de Smartphones:");
        for (Smartphone smartphone : smartphones) {
            System.out.println("Fabricante: " + smartphone.getFabricante());
            System.out.println("Código de Barras: " + smartphone.getCodBarras());
            System.out.println("Dimensões da Tela: " + smartphone.getDimensoesTela());
            System.out.println("Outra Propriedade: " + smartphone.getOutraPropriedade()+"\n");
            ;
        }
    }
}
