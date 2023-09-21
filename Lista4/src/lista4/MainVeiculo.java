package lista4;

import java.util.ArrayList;

public class MainVeiculo {
	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setNome("Duster");
        veiculo1.setAno(2021);
        veiculo1.setNumeroDeRodas(4);
        veiculo1.setFabricante("Renault");
        veiculo1.setCor("Prata");
        veiculos.add(veiculo1);
        
        Veiculo veiculo2 = new Veiculo();
        veiculo2.setNome("Polo");
        veiculo2.setAno(2023);
        veiculo2.setNumeroDeRodas(4);
        veiculo2.setFabricante("Volkswagen");
        veiculo2.setCor("Branco");
        veiculos.add(veiculo2);
        
        Veiculo veiculo3 = new Veiculo();
        veiculo3.setNome("up");
        veiculo3.setAno(2017);
        veiculo3.setNumeroDeRodas(4);
        veiculo3.setFabricante("Volkswagen");
        veiculo3.setCor("Branco");
        veiculos.add(veiculo3);
        
     

 
        for (Veiculo veiculo : veiculos) {
            System.out.println("Nome: " + veiculo.getNome());
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Número de Rodas: " + veiculo.getNumeroDeRodas());
            System.out.println("Fabricante: " + veiculo.getFabricante());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("\n");
            
        }
    }
	}

