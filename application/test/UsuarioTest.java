import static org.junit.Assert.*;

import org.junit.Test;

import models.*;
import org.junit.*;
import static org.junit.Assert.*;
import play.test.Helpers;
import play.test.WithApplication;
import static play.test.Helpers.*;

public class UsuarioTest extends WithApplication {
    @Before
    public void setUp() {
        start(fakeApplication(Helpers.inMemoryDatabase()));
    }
    
    @Test
    public void criarEpegarUsuario() {
        Usuario user = new Usuario("bob@gmail.com", "secret");
        user.save();
        Usuario bob = Usuario.find.where().eq("email", "bob@gmail.com").findUnique();
        assertNotNull(bob);
        assertEquals("bob@gmail.com", bob.email);
    }
    
//    @Test
//    public void tryAuthenticateUsuario() {
//        new Usuario("bob@gmail.com", "secret").save();
//        
//        assertNotNull(Usuario.authenticate("bob@gmail.com", "secret"));
//        assertNull(Usuario.authenticate("bob@gmail.com", "badpassword"));
//        assertNull(Usuario.authenticate("tom@gmail.com", "secret"));
//    }
}
