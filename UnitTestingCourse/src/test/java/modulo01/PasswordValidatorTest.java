package modulo01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class PasswordValidatorTest {

    @Test
    public void shouldReturnTrueWhenPasswordWithNumbersIsPassed() {
        boolean result = PasswordValidator.passwordHasNumbers("234234");
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPasswordWithoutNumbersIsPassed() {
        boolean result = PasswordValidator.passwordHasNumbers("evandro");
        assertFalse(result);
    }

    @Test
    public void deveRetornarTrueQuandoForPassadaUmaSenhaComNumerosNoInicio() {
        boolean result = PasswordValidator.passwordHasNumbers("123123evandro");
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPasswordIsEqualBirthdate() {
        LocalDate birthdate = LocalDate.of(1997,07, 18);
        boolean result = PasswordValidator.passwordContainsBirthdate("18071997", birthdate);
        assertTrue(result);
    }
    @Test
    public void deveRetornarTrueQuandoForPassadaADataDeNascimentoNoFormatoIngles() {
        LocalDate birthdate = LocalDate.of(1997,07, 18);
        boolean result = PasswordValidator.passwordContainsBirthdate("19970718", birthdate);
        assertTrue(result);
    }
}
