/**
 * 
 */
package Controladores;

import java.util.ArrayList;

import Modelo.Exercicio;
import Modelo.TipoDeGrupamento;

/**
 * @author kauap
 *
 */
public class ControladorExercicio {

	public void cadastrarExercicio(String nome, int tipo, String descricao) {

		System.out.println(pegarTipo(tipo + 1));
		Exercicio exercicio = new Exercicio(nome, pegarTipo(tipo + 1), descricao);
		BancoDeDados.exercicios.add(exercicio);
		System.out.println("Exercicio Cadastrado");
	}

	public void cadastrarExercicioeSerie(String nome, int tipo, String descricao, int nRepeticao, int nSerie) {

		Exercicio exercicio = new Exercicio(nome, pegarTipo(tipo + 1), descricao, nRepeticao, nSerie);
		BancoDeDados.exercicios.add(exercicio);
		System.out.println("Exercicio com series e repetições cadastrado");

	}

	public static ArrayList<TipoDeGrupamento> pegarTipo(int valor) {

		ArrayList<TipoDeGrupamento> grupos = new ArrayList();

		for (TipoDeGrupamento tipo : TipoDeGrupamento.values()) {
			if (tipo.getId() == valor) {
				grupos.add(tipo);
				return grupos;
			}
		}
		return null;
	}

}
