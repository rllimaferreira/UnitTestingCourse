package modulo01;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Assert.*;
import org.junit.Test;

public class PersonAgeTest {

	//Os testes devem olhar para o que está sendo testado propõe, nesse exemplo o método testado retorna um long com a idade, portanto devo testar coisas que têm a ver com isso

	//Testes não devem depender uns dos outros

	@Test
	public void deveRetornarTrueSeAIdadeForMaiorOuIgualADezoito(){
		long idade = PersonAge.getPersonAge(LocalDate.of(1987, 05, 21));

		boolean compara = idade >= 18;

		assertTrue(compara);
	}

	@Test
	public void deveRetornarZeroSeADataDeNascimentoForPosteriorADataAtual(){
		long idade = PersonAge.getPersonAge(LocalDate.of(2025, 05, 21));

		assertEquals(0, idade);
	}

}
