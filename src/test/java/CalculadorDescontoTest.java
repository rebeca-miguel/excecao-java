import org.example.atividadeMeuPrimeiroTDDComJUnit5.CalculadorDesconto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadorDescontoTest {

        @Test
        void deveManterValorParaClienteComum() {

            CalculadorDesconto calculadora = new CalculadorDesconto();
            double valorCompra = 50.0;

            double resultado =
                    calculadora.aplicarDesconto(valorCompra, false);

            assertEquals(50.0, resultado);
        }

        @Test
        void deveAplicarDescontoParaClienteVip() {

            CalculadorDesconto calculadora = new CalculadorDesconto();

            double resultado =
                    calculadora.aplicarDesconto(200.0, true);

            assertEquals(180.0, resultado);
        }

        @Test
        void deveLancarExcecaoParaValorNegativo() {

            CalculadorDesconto calculadora = new CalculadorDesconto();
            
            assertThrows(
                    IllegalArgumentException.class,
                    () -> calculadora.aplicarDesconto(-10.0, false)
            );
        }
}


