import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testStatement() {
        
        Customer usuario = new Customer("Nickolas");
        
        Movie primeiro = new Movie("Toy Story",2);
        Movie segundo = new Movie("O senhor dos anéis",0);
        
        Rental aluguel_1 = new Rental(primeiro,5);
        Rental aluguel_2 = new Rental(segundo,7);
        
        usuario.addRental(aluguel_1);
        usuario.addRental(aluguel_2);
        
        String expResultado = "Rental Record for Nickolas\n\tToy Story\t4.5\n\tO senhor dos anéis\t9.5\nAmount owed is 14.0\nYou earned 2 frequent renter points";
        String resultado = usuario.statement();
        
        assertEquals(expResultado, resultado);
    }
    
}
