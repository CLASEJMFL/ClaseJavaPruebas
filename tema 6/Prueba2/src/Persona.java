class Persona2 {
    final int id ;
    final String nombreUsuario;
    String biografia;
    int seguidores;


    public Persona2(int id, String nombreUsuario, String biografia, int seguidores) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.biografia = biografia;
        this.seguidores = seguidores;
    }

    public void mostrarDatos() {
        System.out.println("        ID: " + id);
        System.out.println("    Nombre: " + nombreUsuario);
        System.out.println(" Biografia: " + biografia);
        System.out.println("Seguidores: " + seguidores);
    }
    
}
