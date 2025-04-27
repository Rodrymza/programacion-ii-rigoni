import java.util.ArrayList;

public class EquipoFutbol {
    private String nombre;
    private String pais;
    private Tecnico tecnico;
    private Portero portero;
    private Defensa[] defensas = new Defensa[4];
    private Mediocampo[] mediocampos = new Mediocampo[4];
    private Delantero[] delanteros = new Delantero[4];

    public EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public EquipoFutbol(String nombre, String pais, Tecnico tecnico, Portero portero, Defensa[] defensas, Mediocampo[] mediocampos, Delantero[] delanteros) {
        if (defensas.length > 4) {
            System.out.println("El equipo no puede tener más de 4 defensas.");
            return;
        }
        if (mediocampos.length > 4) {
            System.out.println("El equipo no puede tener más de 4 mediocampistas.");
            return;
        }
        if (delanteros.length > 2) {
            System.out.println("El equipo no puede tener más de 2 delanteros.");
            return;
            }
        this.nombre = nombre;
        this.pais = pais;
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensas = defensas;
        this.mediocampos = mediocampos;
        this.delanteros = delanteros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Portero getPortero() {
        return portero;
    }

    public void setPortero(Portero portero) {
        this.portero = portero;
    }

    public Defensa[] getDefensas() {
        return defensas;
    }

    public void setDefensas(Defensa[] defensas) {
        if (validarMaximo(4, defensas.length, "defensa")) {
            this.defensas = defensas;
        }
    }

    public Mediocampo[] getMediocampos() {
        return mediocampos;
    }

    public void setMediocampos(Mediocampo[] mediocampos) {
        if (validarMaximo(4, mediocampos.length, "mediocampo")) {
            this.mediocampos = mediocampos;
        }
    }

    public Delantero[] getDelanteros() {
        return delanteros;
    }

    public void setDelanteros(Delantero[] delanteros) {
        if (validarMaximo(2, delanteros.length, "delantero")) {
            this.delanteros = delanteros;
        }
    }

    private boolean validarMaximo(int maximo, int actual, String tipo) {
        if (actual > maximo) {
            System.out.println("El equipo no puede tener más de " + maximo + " " + tipo + "s.");
            return false;
        }
        return true;
    }
}
