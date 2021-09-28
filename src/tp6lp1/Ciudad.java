package tp6lp1;

import java.util.Set;

public class Ciudad {

    private String ciudad;

    public Ciudad(String ciudad) {
        this.ciudad = ciudad;

    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;

    }

    @Override
    public String toString() {
        return ciudad;
    }

    public boolean equals(Object obj) {

        Ciudad viene = (Ciudad) obj;
        if (viene == null || !(viene instanceof Ciudad)) {
            return false;
        } else {
            return this.ciudad.toString().equals(viene.toString());
        }
    }

    public int hashCode() {
        return this.ciudad.toString().hashCode();
    }
}
